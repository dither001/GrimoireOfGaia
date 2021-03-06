package gaia.items;

import java.util.List;

import gaia.GaiaConfig;
import gaia.helpers.ModelLoaderHelper;
import gaia.init.GaiaItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class ItemShard extends ItemBase {

	public ItemShard() {
		super("shard");
		setHasSubtypes(true);
	}

	/**
	 * Drops a nugget in the world. Will drop Gaia nuggets if no other nuggets are present.
	 * 
	 * @param entity
	 * @param i      0 = Iron, 1 = Gold, 2 = Diamond, 3 = Emerald, 4 = Copper, 5 = Silver
	 */
	public static void dropNugget(Entity entity, int i) {
		ItemStack stack = new ItemStack(GaiaItems.SHARD, 1, i);

		if (GaiaConfig.DEBUG.oreUnity) {
			if (i == 0) {
				stack = oreCheck(stack, "nuggetIron");
			}
			if (i == 1) {
				stack = oreCheck(stack, "nuggetGold");
			}
			if (i == 2) {
				stack = oreCheck(stack, "nuggetDiamond");
			}
			if (i == 3) {
				stack = oreCheck(stack, "nuggetEmerald");
			}
			if (i == 4) {
				stack = oreCheck(stack, "nuggetCopper");
			}
			if (i == 5) {
				stack = oreCheck(stack, "nuggetSilver");
			}
		}

		entity.entityDropItem(stack, 0.0F);
	}

	/**
	 * Checks ore dictionary if there is already a registered nugget. Then attempts to use that instead
	 */
	private static ItemStack oreCheck(ItemStack stack, String s) {
		List<ItemStack> oreEquivalents = OreDictionary.getOres(s);
		int size = oreEquivalents.size();

		if (!oreEquivalents.get(0).isEmpty()) {
			ItemStack unity = oreEquivalents.get(0);
			Item item = unity.getItem();
			int meta = unity.getItemDamage();

			// if it grabbed a gaia ore try the next in the list
			if (item == GaiaItems.SHARD && size > 1 && !oreEquivalents.get(1).isEmpty()) {
				unity = oreEquivalents.get(1);
				item = unity.getItem();
				meta = unity.getItemDamage();
			}

			return new ItemStack(item, 1, meta);
		}
		return stack;
	}

	/* SUBITEMS */
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (!isInCreativeTab(tab)) {
			return;
		}

		for (int i = 0; i < 6; i++) {
			items.add(new ItemStack(this, 1, i));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerClient() {
		ModelLoaderHelper.registerItem(this, 
				"variant=iron", 
				"variant=gold", 
				"variant=diamond", 
				"variant=emerald", 
				"variant=copper", 
				"variant=silver"
				);
	}
	/* SUBITEMS */
}
