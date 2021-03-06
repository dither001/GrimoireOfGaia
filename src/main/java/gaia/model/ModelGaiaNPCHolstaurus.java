package gaia.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaNPCHolstaurus extends ModelGaia {
	private ModelRenderer head;
	private ModelRenderer headeyes;
	private ModelRenderer headaccessory;
	private ModelRenderer neck;
	private ModelRenderer bodytop;
	private ModelRenderer bodymiddle;
	private ModelRenderer bodymiddlebutton;
	private ModelRenderer bodybottom;
	private ModelRenderer rightchest;
	private ModelRenderer leftchest;
	private ModelRenderer rightarm;
	private ModelRenderer leftarm;
	private ModelRenderer rightleg;
	private ModelRenderer leftleg;
	private ModelRenderer bell;
	private ModelRenderer waistupper;
	private ModelRenderer tail;

	public ModelGaiaNPCHolstaurus() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-3F, -6F, -3F, 6, 6, 6);
		head.setRotationPoint(0F, 1F, 0F);
		setRotation(head, 0F, 0F, 0F);
		headeyes = new ModelRenderer(this, 24, 0);
		headeyes.addBox(-3F, -6F, -3.1F, 6, 6, 0);
		headeyes.setRotationPoint(0F, 1F, 0F);
		setRotation(headeyes, 0F, 0F, 0F);
		headaccessory = new ModelRenderer(this, 36, 0);
		headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
		headaccessory.setRotationPoint(0F, 1F, 0F);
		setRotation(headaccessory, 0F, 0F, 0F);
		neck = new ModelRenderer(this, 0, 12);
		neck.addBox(-1F, -1F, -1F, 2, 2, 2);
		neck.setRotationPoint(0F, 1F, 0F);
		setRotation(neck, 0F, 0F, 0F);
		bodytop = new ModelRenderer(this, 0, 16);
		bodytop.addBox(-2.5F, 0F, -1.5F, 5, 6, 3);
		bodytop.setRotationPoint(0F, 1F, 0F);
		setRotation(bodytop, -0.0872665F, 0F, 0F);
		bodymiddle = new ModelRenderer(this, 0, 25);
		bodymiddle.addBox(-2F, 5.5F, -1.5F, 4, 3, 2);
		bodymiddle.setRotationPoint(0F, 1F, 0F);
		setRotation(bodymiddle, 0F, 0F, 0F);
		bodymiddlebutton = new ModelRenderer(this, 0, 25);
		bodymiddlebutton.addBox(-0.5F, 6F, -1.6F, 1, 2, 0);
		bodymiddlebutton.setRotationPoint(0F, 1F, 0F);
		setRotation(bodymiddlebutton, 0F, 0F, 0F);
		bodybottom = new ModelRenderer(this, 0, 30);
		bodybottom.addBox(-3F, 8F, -2.5F, 6, 3, 3);
		bodybottom.setRotationPoint(0F, 1F, 0F);
		setRotation(bodybottom, 0.0872665F, 0F, 0F);
		rightchest = new ModelRenderer(this, 0, 36);
		rightchest.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		rightchest.setRotationPoint(-1.5F, 3.5F, -2F);
		setRotation(rightchest, 0.7853982F, 0.3490659F, 0.0872665F);
		leftchest = new ModelRenderer(this, 0, 36);
		leftchest.mirror = true;
		leftchest.addBox(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		leftchest.setRotationPoint(1.5F, 3.5F, -2F);
		setRotation(leftchest, 0.7853982F, -0.3490659F, -0.0872665F);
		rightarm = new ModelRenderer(this, 16, 12);
		rightarm.addBox(-2F, -1F, -1F, 2, 12, 2);
		rightarm.setRotationPoint(-2.5F, 2.5F, 0F);
		setRotation(rightarm, 0F, 0F, 0.1745329F);
		leftarm = new ModelRenderer(this, 16, 12);
		leftarm.addBox(0F, -1F, -1F, 2, 12, 2);
		leftarm.setRotationPoint(2.5F, 2.5F, 0F);
		setRotation(leftarm, 0F, 0F, -0.1745329F);
		rightleg = new ModelRenderer(this, 24, 12);
		rightleg.addBox(-1.5F, -1F, -1F, 3, 7, 3);
		rightleg.setRotationPoint(-2F, 11F, -0.5F);
		setRotation(rightleg, -0.1745329F, -0.1745329F, 0F);
		leftleg = new ModelRenderer(this, 24, 22);
		leftleg.addBox(-1.5F, -1F, -1F, 3, 7, 3);
		leftleg.setRotationPoint(2F, 11F, -0.5F);
		setRotation(leftleg, -0.1745329F, 0.1745329F, 0F);
		ModelRenderer hair1 = new ModelRenderer(this, 36, 14);
		hair1.addBox(-4F, -6F, 1F, 8, 4, 3);
		hair1.setRotationPoint(0F, 1F, 0F);
		setRotation(hair1, 0F, 0F, 0F);
		ModelRenderer hair2 = new ModelRenderer(this, 36, 21);
		hair2.addBox(-4.5F, -3F, 1.5F, 9, 4, 3);
		hair2.setRotationPoint(0F, 1F, 0F);
		setRotation(hair2, 0F, 0F, 0F);
		ModelRenderer righthorn1 = new ModelRenderer(this, 36, 28);
		righthorn1.addBox(-5F, -6F, -1F, 2, 2, 2);
		righthorn1.setRotationPoint(0F, 1F, 0F);
		setRotation(righthorn1, 0F, 0F, 0F);
		ModelRenderer righthorn2 = new ModelRenderer(this, 36, 32);
		righthorn2.addBox(-6F, -7F, -2F, 2, 2, 2);
		righthorn2.setRotationPoint(0F, 1F, 0F);
		setRotation(righthorn2, 0F, 0F, 0F);
		ModelRenderer righthorn3 = new ModelRenderer(this, 36, 36);
		righthorn3.addBox(-4.5F, -7.5F, -0.5F, 1, 1, 1);
		righthorn3.setRotationPoint(0F, 1F, 0F);
		setRotation(righthorn3, 0F, 0F, 0F);
		ModelRenderer lefthorn1 = new ModelRenderer(this, 36, 28);
		lefthorn1.mirror = true;
		lefthorn1.addBox(3F, -6F, -1F, 2, 2, 2);
		lefthorn1.setRotationPoint(0F, 1F, 0F);
		setRotation(lefthorn1, 0F, 0F, 0F);
		ModelRenderer lefthorn2 = new ModelRenderer(this, 36, 32);
		lefthorn2.mirror = true;
		lefthorn2.addBox(4F, -7F, -2F, 2, 2, 2);
		lefthorn2.setRotationPoint(0F, 1F, 0F);
		setRotation(lefthorn2, 0F, 0F, 0F);
		ModelRenderer lefthorn3 = new ModelRenderer(this, 36, 36);
		lefthorn3.mirror = true;
		lefthorn3.addBox(3.5F, -7.5F, -0.5F, 1, 1, 1);
		lefthorn3.setRotationPoint(0F, 1F, 0F);
		setRotation(lefthorn3, 0F, 0F, 0F);
		ModelRenderer rightear = new ModelRenderer(this, 36, 34);
		rightear.addBox(-4F, -5F, -1F, 0, 4, 4);
		rightear.setRotationPoint(0F, 1F, 0F);
		setRotation(rightear, 0F, -0.5235988F, 0F);
		ModelRenderer leftear = new ModelRenderer(this, 36, 34);
		leftear.mirror = true;
		leftear.addBox(4F, -5F, -1F, 0, 4, 4);
		leftear.setRotationPoint(0F, 1F, 0F);
		setRotation(leftear, 0F, 0.5235988F, 0F);
		bell = new ModelRenderer(this, 36, 42);
		bell.addBox(-1F, 0F, -1.5F, 2, 2, 2);
		bell.setRotationPoint(0F, 3F, -1.5F);
		setRotation(bell, -2.356194F, 0F, 0F);
		waistupper = new ModelRenderer(this, 36, 46);
		waistupper.addBox(-3F, 0F, -2F, 6, 9, 4);
		waistupper.setRotationPoint(0F, 1F, 0F);
		setRotation(waistupper, -0.0872665F, 0F, 0F);
		ModelRenderer rightwaist = new ModelRenderer(this, 64, 0);
		rightwaist.addBox(-2F, -1.5F, -2.5F, 4, 3, 5);
		rightwaist.setRotationPoint(-2F, 11F, -0.5F);
		setRotation(rightwaist, 0.0872665F, 0F, 0F);
		ModelRenderer leftwaist = new ModelRenderer(this, 82, 0);
		leftwaist.addBox(-2F, -1.5F, -2.5F, 4, 3, 5);
		leftwaist.setRotationPoint(2F, 11F, -0.5F);
		setRotation(leftwaist, 0.0872665F, 0F, 0F);
		tail = new ModelRenderer(this, 64, 8);
		tail.addBox(-1F, 0F, 0F, 2, 10, 0);
		tail.setRotationPoint(0F, 10F, 2F);
		setRotation(tail, 0.4014257F, 0F, 0F);
		ModelRenderer rightleglower = new ModelRenderer(this, 64, 18);
		rightleglower.addBox(-2F, 4F, 0F, 4, 8, 4);
		rightleglower.setRotationPoint(-2F, 11F, -0.5F);
		setRotation(rightleglower, -0.1745329F, -0.1745329F, 0F);
		ModelRenderer leftleglower = new ModelRenderer(this, 80, 18);
		leftleglower.addBox(-2F, 4F, 0F, 4, 8, 4);
		leftleglower.setRotationPoint(2F, 11F, -0.5F);
		setRotation(leftleglower, -0.1745329F, 0.1745329F, 0F);
		ModelRenderer rightfoot = new ModelRenderer(this, 64, 30);
		rightfoot.addBox(-2F, 11F, -3F, 4, 2, 4);
		rightfoot.setRotationPoint(-2F, 11F, -0.5F);
		setRotation(rightfoot, 0F, -0.1745329F, 0F);
		ModelRenderer leftfoot = new ModelRenderer(this, 64, 30);
		leftfoot.addBox(-2F, 11F, -3F, 4, 2, 4);
		leftfoot.setRotationPoint(2F, 11F, -0.5F);
		setRotation(leftfoot, 0F, 0.1745329F, 0F);

		convertToChild(head, hair1);
		convertToChild(head, hair2);
		convertToChild(head, righthorn1);
		convertToChild(head, righthorn2);
		convertToChild(head, righthorn3);
		convertToChild(head, lefthorn1);
		convertToChild(head, lefthorn2);
		convertToChild(head, lefthorn3);
		convertToChild(head, rightear);
		convertToChild(head, leftear);
		convertToChild(rightleg, rightleglower);
		convertToChild(rightleg, rightwaist);
		convertToChild(rightleg, rightfoot);
		convertToChild(leftleg, leftleglower);
		convertToChild(leftleg, leftwaist);
		convertToChild(leftleg, leftfoot);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		super.render(entityIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
		head.render(scale);
		headaccessory.render(scale);
		neck.render(scale);
		bodytop.render(scale);
		bodymiddle.render(scale);
		bodymiddlebutton.render(scale);
		bodybottom.render(scale);
		rightchest.render(scale);
		leftchest.render(scale);
		rightarm.render(scale);
		leftarm.render(scale);
		rightleg.render(scale);
		leftleg.render(scale);
		bell.render(scale);
		waistupper.render(scale);
		tail.render(scale);

		if (entityIn.ticksExisted % 60 == 0 && limbSwingAmount <= 0.1F) {
			headeyes.render(scale);
		}
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
		// head
		head.rotateAngleY = netHeadYaw / 57.295776F;
		head.rotateAngleX = headPitch / 57.295776F;
		headeyes.rotateAngleY = head.rotateAngleY;
		headeyes.rotateAngleX = head.rotateAngleX;
		headaccessory.rotateAngleY = head.rotateAngleY;
		headaccessory.rotateAngleX = head.rotateAngleX;

		// arms
		rightarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
		leftarm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;

		rightarm.rotateAngleZ = 0.0F;
		leftarm.rotateAngleZ = 0.0F;

		rightarm.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.1745329F;
		rightarm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
		leftarm.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.1745329F;
		leftarm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

		// body
		float chestDefaultRotateAngleX = 0.7853982F;

		rightchest.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.2F * limbSwingAmount + chestDefaultRotateAngleX;
		leftchest.rotateAngleX = rightchest.rotateAngleX;

		tail.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;

		// legs
		rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
		leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount;
		rightleg.rotateAngleX -= 0.1745329F;
		leftleg.rotateAngleX -= 0.1745329F;
		rightleg.rotateAngleY = -0.1745329F;
		leftleg.rotateAngleY = 0.1745329F;
		rightleg.rotateAngleZ = 0.0F;
		leftleg.rotateAngleZ = 0.0F;

		if (isRiding) {
			rightarm.rotateAngleX += -((float) Math.PI / 5F);
			leftarm.rotateAngleX += -((float) Math.PI / 5F);
			rightleg.rotateAngleX = -1.4137167F;
			rightleg.rotateAngleY = ((float) Math.PI / 10F);
			rightleg.rotateAngleZ = 0.07853982F;
			leftleg.rotateAngleX = -1.4137167F;
			leftleg.rotateAngleY = -((float) Math.PI / 10F);
			leftleg.rotateAngleZ = -0.07853982F;
		}
	}

	public ModelRenderer getRightArm() {
		return rightarm;
	}

	public ModelRenderer getLeftArm() {
		return leftarm;
	}
}
