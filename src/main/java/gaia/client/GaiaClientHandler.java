package gaia.client;

import gaia.client.renderer.monster.GaiaAntRangerRenderer;
import gaia.client.renderer.monster.GaiaAntRenderer;
import gaia.client.renderer.monster.GaiaAnubisRenderer;
import gaia.client.renderer.monster.GaiaArachneRenderer;
import gaia.client.renderer.monster.GaiaBansheeRenderer;
import gaia.client.renderer.monster.GaiaBaphometRenderer;
import gaia.client.renderer.monster.GaiaBeeRenderer;
import gaia.client.renderer.monster.GaiaBoneKnightRenderer;
import gaia.client.renderer.monster.GaiaCecaeliaRenderer;
import gaia.client.renderer.monster.GaiaCentaurRenderer;
import gaia.client.renderer.monster.GaiaCobbleGolemRenderer;
import gaia.client.renderer.monster.GaiaCobblestoneGolemRenderer;
import gaia.client.renderer.monster.GaiaCreepRenderer;
import gaia.client.renderer.monster.GaiaCyclopsRenderer;
import gaia.client.renderer.monster.GaiaDeathwordRenderer;
import gaia.client.renderer.monster.GaiaDhampirRenderer;
import gaia.client.renderer.monster.GaiaDryadRenderer;
import gaia.client.renderer.monster.GaiaDullahanRenderer;
import gaia.client.renderer.monster.GaiaDwarfRenderer;
import gaia.client.renderer.monster.GaiaMandragoraRenderer;
import gaia.client.renderer.monster.GaiaMimicRenderer;
import gaia.client.renderer.monster.GaiaSphinxRenderer;
import gaia.client.renderer.prop.GaiaPropCampfireRenderer;
import gaia.client.renderer.prop.GaiaPropChestMimicRenderer;
import gaia.client.renderer.prop.GaiaPropFlowerCyanRenderer;
import gaia.client.renderer.prop.GaiaPropVaseNetherRenderer;
import gaia.client.renderer.prop.GaiaPropVaseRenderer;
import gaia.entity.assist.GaiaBeeEntity;
import gaia.entity.assist.GaiaCentaurEntity;
import gaia.entity.assist.GaiaCobbleGolemEntity;
import gaia.entity.assist.GaiaCyclopsEntity;
import gaia.entity.assist.GaiaDryadEntity;
import gaia.entity.assist.GaiaDwarfEntity;
import gaia.entity.hostile.GaiaAntEntity;
import gaia.entity.hostile.GaiaAntRangerEntity;
import gaia.entity.hostile.GaiaAnubisEntity;
import gaia.entity.hostile.GaiaArachneEntity;
import gaia.entity.hostile.GaiaBansheeEntity;
import gaia.entity.hostile.GaiaBaphometEntity;
import gaia.entity.hostile.GaiaBoneKnightEntity;
import gaia.entity.hostile.GaiaCecaeliaEntity;
import gaia.entity.hostile.GaiaCobblestoneGolemEntity;
import gaia.entity.hostile.GaiaCreepEntity;
import gaia.entity.hostile.GaiaDeathwordEntity;
import gaia.entity.hostile.GaiaDhampirEntity;
import gaia.entity.hostile.GaiaDullahanEntity;
import gaia.entity.hostile.GaiaMandragoraEntity;
import gaia.entity.hostile.GaiaMimicEntity;
import gaia.entity.hostile.GaiaSphinxEntity;
import gaia.entity.projectile.GaiaProjectileBombEntity;
import gaia.entity.projectile.GaiaProjectileBubbleEntity;
import gaia.entity.projectile.GaiaProjectileMagicEntity;
import gaia.entity.projectile.GaiaProjectilePoisonEntity;
import gaia.entity.projectile.GaiaProjectileWebEntity;
import gaia.entity.prop.GaiaPropCampfireEntity;
import gaia.entity.prop.GaiaPropChestMimicEntity;
import gaia.entity.prop.GaiaPropFlowerCyanEntity;
import gaia.entity.prop.GaiaPropVaseEntity;
import gaia.entity.prop.GaiaPropVaseNetherEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class GaiaClientHandler {
    private static final float tiny = 0.25F;
    private static final float small = 0.4F;
    private static final float med = 0.5F;
    private static final float large = 0.7F;

    public static void registerRenders() {
        //Props
        RenderingRegistry.registerEntityRenderingHandler(GaiaPropCampfireEntity.class, renderManager -> new GaiaPropCampfireRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(GaiaPropChestMimicEntity.class, renderManager -> new GaiaPropChestMimicRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(GaiaPropFlowerCyanEntity.class, renderManager -> new GaiaPropFlowerCyanRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(GaiaPropVaseEntity.class, renderManager -> new GaiaPropVaseRenderer(renderManager));
        RenderingRegistry.registerEntityRenderingHandler(GaiaPropVaseNetherEntity.class, renderManager -> new GaiaPropVaseNetherRenderer(renderManager));

        //Projectiles
        ItemRenderer itemRenderer = Minecraft.getInstance().getItemRenderer();
        RenderingRegistry.registerEntityRenderingHandler(GaiaProjectileBombEntity.class, renderManager -> new SpriteRenderer<>(renderManager, itemRenderer, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(GaiaProjectileBubbleEntity.class, renderManager -> new SpriteRenderer(renderManager, itemRenderer, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(GaiaProjectileMagicEntity.class, renderManager -> new SpriteRenderer(renderManager, itemRenderer, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(GaiaProjectilePoisonEntity.class, renderManager -> new SpriteRenderer(renderManager, itemRenderer, 2.0F));
        RenderingRegistry.registerEntityRenderingHandler(GaiaProjectileWebEntity.class, renderManager -> new SpriteRenderer(renderManager, itemRenderer, 2.0F));

        //Mobs
        RenderingRegistry.registerEntityRenderingHandler(GaiaAntEntity.class, renderManager -> new GaiaAntRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaAntRangerEntity.class, renderManager -> new GaiaAntRangerRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaAnubisEntity.class, renderManager -> new GaiaAnubisRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaArachneEntity.class, renderManager -> new GaiaArachneRenderer(renderManager, large));
        RenderingRegistry.registerEntityRenderingHandler(GaiaBansheeEntity.class, renderManager -> new GaiaBansheeRenderer(renderManager, med));
        RenderingRegistry.registerEntityRenderingHandler(GaiaBaphometEntity.class, renderManager -> new GaiaBaphometRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaBeeEntity.class, renderManager -> new GaiaBeeRenderer(renderManager, med));
        RenderingRegistry.registerEntityRenderingHandler(GaiaBoneKnightEntity.class, renderManager -> new GaiaBoneKnightRenderer(renderManager, med));
        RenderingRegistry.registerEntityRenderingHandler(GaiaCecaeliaEntity.class, renderManager -> new GaiaCecaeliaRenderer(renderManager, med));
        RenderingRegistry.registerEntityRenderingHandler(GaiaCentaurEntity.class, renderManager -> new GaiaCentaurRenderer(renderManager, med));
        RenderingRegistry.registerEntityRenderingHandler(GaiaCobbleGolemEntity.class, renderManager -> new GaiaCobbleGolemRenderer(renderManager, large));
        RenderingRegistry.registerEntityRenderingHandler(GaiaCobblestoneGolemEntity.class, renderManager -> new GaiaCobblestoneGolemRenderer(renderManager, large));
        RenderingRegistry.registerEntityRenderingHandler(GaiaCreepEntity.class, renderManager -> new GaiaCreepRenderer(renderManager, med));
        RenderingRegistry.registerEntityRenderingHandler(GaiaCyclopsEntity.class, renderManager -> new GaiaCyclopsRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaDeathwordEntity.class, renderManager -> new GaiaDeathwordRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaDhampirEntity.class, renderManager -> new GaiaDhampirRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaDryadEntity.class, renderManager -> new GaiaDryadRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaDullahanEntity.class, renderManager -> new GaiaDullahanRenderer(renderManager, small));
        RenderingRegistry.registerEntityRenderingHandler(GaiaDwarfEntity.class, renderManager -> new GaiaDwarfRenderer(renderManager, large));

        RenderingRegistry.registerEntityRenderingHandler(GaiaMandragoraEntity.class, renderManager -> new GaiaMandragoraRenderer(renderManager, tiny));
        RenderingRegistry.registerEntityRenderingHandler(GaiaMimicEntity.class, renderManager -> new GaiaMimicRenderer(renderManager, med));

        RenderingRegistry.registerEntityRenderingHandler(GaiaSphinxEntity.class, renderManager -> new GaiaSphinxRenderer(renderManager, large));
    }
}