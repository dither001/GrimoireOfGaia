package gaia.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaDullahan extends ModelGaia {

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
	private ModelRenderer headpiece;
	private ModelRenderer waist1;
	private ModelRenderer waist2;

	public ModelGaiaDullahan() {
		textureWidth = 128;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(-3F, -3F, -3F, 6, 6, 6);
		head.setRotationPoint(4F, 3F, -6F);
		setRotation(head, 0F, 0F, 0F);
		headeyes = new ModelRenderer(this, 24, 0);
		headeyes.addBox(-3F, -3F, -3.1F, 6, 6, 0);
		headeyes.setRotationPoint(4F, 3F, -6F);
		setRotation(headeyes, 0F, 0F, 0F);
		headaccessory = new ModelRenderer(this, 36, 0);
		headaccessory.addBox(-3.5F, -3.5F, -3.5F, 7, 7, 7);
		headaccessory.setRotationPoint(4F, 3F, -6F);
		setRotation(headaccessory, 0F, 0F, 0F);
		neck = new ModelRenderer(this, 0, 12);
		neck.addBox(-1F, -1F, -1F, 2, 2, 2);
		neck.setRotationPoint(0F, 1F, 0F);
		setRotation(neck, -0.0872665F, 0F, 0F);
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
		rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		rightchest.setRotationPoint(-1.25F, 3F, -1.5F);
		setRotation(rightchest, 0.7853982F, 0.1745329F, 0F);
		leftchest = new ModelRenderer(this, 0, 36);
		leftchest.mirror = true;
		leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		leftchest.setRotationPoint(1.3F, 3F, -1.5F);
		setRotation(leftchest, 0.7853982F, -0.1745329F, 0F);
		rightarm = new ModelRenderer(this, 16, 12);
		rightarm.addBox(-2F, -1F, -1F, 2, 12, 2);
		rightarm.setRotationPoint(-2.5F, 2.5F, 0F);
		setRotation(rightarm, 0F, 0F, 0.1745329F);
		leftarm = new ModelRenderer(this, 16, 12);
		leftarm.addBox(0F, -1F, -1F, 2, 6, 2);
		leftarm.setRotationPoint(2.5F, 2.5F, 0F);
		setRotation(leftarm, 0F, 0F, -0.1745329F);
		rightleg = new ModelRenderer(this, 24, 12);
		rightleg.addBox(-1.5F, -1F, -1.5F, 3, 14, 3);
		rightleg.setRotationPoint(-2F, 11F, 0F);
		setRotation(rightleg, 0F, 0F, 0F);
		leftleg = new ModelRenderer(this, 24, 12);
		leftleg.addBox(-1.5F, -1F, -1.5F, 3, 14, 3);
		leftleg.setRotationPoint(2F, 11F, 0F);
		setRotation(leftleg, 0F, 0F, 0F);
		headpiece = new ModelRenderer(this, 36, 32);
		headpiece.addBox(-3.5F, -1F, -2F, 7, 1, 4);
		headpiece.setRotationPoint(4F, 0F, -9F);
		setRotation(headpiece, 0.7853982F, 0F, 0F);
		ModelRenderer rightshoulder = new ModelRenderer(this, 36, 14);
		rightshoulder.addBox(-3.5F, -3F, -2F, 4, 5, 4);
		rightshoulder.setRotationPoint(-2.5F, 2.5F, 0F);
		setRotation(rightshoulder, 0F, 0F, -0.1745329F);
		ModelRenderer leftshoulder = new ModelRenderer(this, 52, 14);
		leftshoulder.addBox(-0.5F, -3F, -2F, 4, 5, 4);
		leftshoulder.setRotationPoint(2.5F, 2.5F, 0F);
		setRotation(leftshoulder, 0F, 0F, 0.1745329F);
		ModelRenderer leftarmlower = new ModelRenderer(this, 16, 20);
		leftarmlower.addBox(0F, 0F, 4F, 2, 6, 2);
		leftarmlower.setRotationPoint(2.5F, 2.5F, 0F);
		setRotation(leftarmlower, -1.570796F, 0F, -0.1745329F);
		ModelRenderer rightgauntlet = new ModelRenderer(this, 36, 23);
		rightgauntlet.addBox(-2.5F, 5.5F, -1.5F, 2, 6, 3);
		rightgauntlet.setRotationPoint(-2.5F, 2.5F, 0F);
		setRotation(rightgauntlet, 0F, 0F, 0.1745329F);
		ModelRenderer leftgauntlet = new ModelRenderer(this, 46, 23);
		leftgauntlet.addBox(-0.5F, 0.5F, 4.5F, 3, 6, 2);
		leftgauntlet.setRotationPoint(2.5F, 2.5F, 0F);
		setRotation(leftgauntlet, -1.570796F, 0F, -0.1745329F);
		waist1 = new ModelRenderer(this, 68, 0);
		waist1.addBox(-3.5F, 7.5F, -3F, 7, 6, 4);
		waist1.setRotationPoint(0F, 1F, 0F);
		setRotation(waist1, 0.0872665F, 0F, 0F);
		waist2 = new ModelRenderer(this, 68, 10);
		waist2.addBox(-4F, 8.5F, -3.5F, 8, 8, 4);
		waist2.setRotationPoint(0F, 1F, 0F);
		setRotation(waist2, 0.1745329F, 0F, 0F);
		ModelRenderer rightfoot = new ModelRenderer(this, 68, 22);
		rightfoot.addBox(-2.5F, 5F, -2F, 4, 8, 4);
		rightfoot.setRotationPoint(-1.5F, 11F, 0F);
		setRotation(rightfoot, 0F, 0F, 0F);
		ModelRenderer leftfoot = new ModelRenderer(this, 68, 22);
		leftfoot.addBox(-1.5F, 5F, -2F, 4, 8, 4);
		leftfoot.setRotationPoint(1.5F, 11F, 0F);
		setRotation(leftfoot, 0F, 0F, 0F);

		convertToChild(head, headpiece);
		convertToChild(rightarm, rightshoulder);
		convertToChild(rightarm, rightgauntlet);
		convertToChild(leftarm, leftshoulder);
		convertToChild(leftarm, leftarmlower);
		convertToChild(leftarm, leftgauntlet);
		convertToChild(rightleg, rightfoot);
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
		waist1.render(scale);
		waist2.render(scale);

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
		leftarm.rotateAngleX = 0.0F;

		rightarm.rotateAngleZ = 0.0F;
		leftarm.rotateAngleZ = 0.0F;

		if (swingProgress > -9990.0F) {
			holdingMelee();
		}

		rightarm.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.1745329F;
		rightarm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
		leftarm.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.1745329F;
		leftarm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

		// legs
		rightleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
		leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount;
		rightleg.rotateAngleY = 0.0F;
		leftleg.rotateAngleY = 0.0F;
		rightleg.rotateAngleZ = 0.0F;
		leftleg.rotateAngleZ = 0.0F;

		if (isRiding) {
			rightarm.rotateAngleX += -((float) Math.PI / 5F);
//			leftarm.rotateAngleX += -((float) Math.PI / 5F);
			rightleg.rotateAngleX = -1.4137167F;
			rightleg.rotateAngleY = ((float) Math.PI / 10F);
			rightleg.rotateAngleZ = 0.07853982F;
			leftleg.rotateAngleX = -1.4137167F;
			leftleg.rotateAngleY = -((float) Math.PI / 10F);
			leftleg.rotateAngleZ = -0.07853982F;
		}
	}

	public void holdingMelee() {
		float f6;
		float f7;

		f6 = 1.0F - swingProgress;
		f6 *= f6;
		f6 *= f6;
		f6 = 1.0F - f6;
		f7 = MathHelper.sin(f6 * (float) Math.PI);
		float f8 = MathHelper.sin(swingProgress * (float) Math.PI) * -(head.rotateAngleX - 0.7F) * 0.75F;

		rightarm.rotateAngleX = (float) ((double) rightarm.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
		rightarm.rotateAngleX += (bodytop.rotateAngleY * 2.0F);
		rightarm.rotateAngleZ = (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);
	}

	public ModelRenderer getRightArm() {
		return rightarm;
	}
}
