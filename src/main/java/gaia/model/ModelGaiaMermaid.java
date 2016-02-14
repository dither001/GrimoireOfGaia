package gaia.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelGaiaMermaid extends ModelBase {
	ModelRenderer head;
	ModelRenderer headaccessory;
	ModelRenderer headhelmet;
	ModelRenderer finright;
	ModelRenderer finleft;
	ModelRenderer hair1;
	ModelRenderer hair2;
	ModelRenderer hairaccessory;
	ModelRenderer bodytop;
	ModelRenderer bodymiddle;
	ModelRenderer bodymiddlebutton;
	ModelRenderer bodybottom;
	ModelRenderer rightchest;
	ModelRenderer leftchest;
	public static ModelRenderer rightarm;
	ModelRenderer leftarm;
	ModelRenderer rightpauldron;
	ModelRenderer leftpauldron;
	ModelRenderer waist;
	ModelRenderer fin1;
	ModelRenderer fin2;
	ModelRenderer fin3;
	ModelRenderer fin4;
	ModelRenderer fintail;

	public ModelGaiaMermaid() {
		this.textureWidth = 128;
		this.textureHeight = 64;

		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3F, -6F, -3F, 6, 6, 6);
		this.head.setRotationPoint(0F, 1F, 1F);
		this.head.setTextureSize(128, 64);
		this.head.mirror = true;
		this.setRotation(head, 0F, 0F, 0F);
		this.headaccessory = new ModelRenderer(this, 36, 0);
		this.headaccessory.addBox(-3.5F, -6.5F, -3.5F, 7, 7, 7);
		this.headaccessory.setRotationPoint(0F, 1F, 1F);
		this.headaccessory.setTextureSize(128, 64);
		this.headaccessory.mirror = true;
		this.setRotation(headaccessory, 0F, 0F, 0F);
		this.headhelmet = new ModelRenderer(this, 36, 46);
		this.headhelmet.addBox(-4F, -8.5F, -6.5F, 8, 8, 8);
		this.headhelmet.setRotationPoint(0F, 1F, 1F);
		this.headhelmet.setTextureSize(128, 64);
		this.headhelmet.mirror = true;
		this.setRotation(headhelmet, -0.5235988F, 0F, 0F);
		this.finright = new ModelRenderer(this, 36, 38);
		this.finright.addBox(-4F, -6F, -1F, 0, 5, 3);
		this.finright.setRotationPoint(0F, 1F, 1F);
		this.finright.setTextureSize(128, 64);
		this.finright.mirror = true;
		this.setRotation(finright, 0F, -0.5235988F, 0F);
		this.finleft = new ModelRenderer(this, 36, 38);
		this.finleft.addBox(4F, -6F, -1F, 0, 5, 3);
		this.finleft.setRotationPoint(0F, 1F, 1F);
		this.finleft.setTextureSize(128, 64);
		this.finleft.mirror = true;
		this.setRotation(finleft, 0F, 0.5235988F, 0F);
		this.hair1 = new ModelRenderer(this, 36, 14);
		this.hair1.addBox(-4F, -6F, 1F, 8, 8, 3);
		this.hair1.setRotationPoint(0F, 1F, 1F);
		this.hair1.setTextureSize(128, 64);
		this.hair1.mirror = true;
		this.setRotation(hair1, 0F, 0F, 0F);
		this.hair2 = new ModelRenderer(this, 36, 25);
		this.hair2.addBox(-4.5F, -1F, 1.5F, 9, 9, 3);
		this.hair2.setRotationPoint(0F, 1F, 1F);
		this.hair2.setTextureSize(128, 64);
		this.hair2.mirror = true;
		this.setRotation(hair2, 0F, 0F, 0F);
		this.hairaccessory = new ModelRenderer(this, 36, 37);
		this.hairaccessory.addBox(-1.5F, -6F, 3.5F, 3, 3, 1);
		this.hairaccessory.setRotationPoint(0F, 1F, 1F);
		this.hairaccessory.setTextureSize(128, 64);
		this.hairaccessory.mirror = true;
		this.setRotation(hairaccessory, 0F, 0F, 0F);
		this.bodytop = new ModelRenderer(this, 0, 12);
		this.bodytop.addBox(-2.5F, 0F, -1.5F, 5, 5, 3);
		this.bodytop.setRotationPoint(0F, 1F, 1F);
		this.bodytop.setTextureSize(128, 64);
		this.bodytop.mirror = true;
		this.setRotation(bodytop, -0.0872665F, 0F, 0F);
		this.bodymiddle = new ModelRenderer(this, 0, 20);
		this.bodymiddle.addBox(-2F, 4.5F, -1.5F, 4, 3, 2);
		this.bodymiddle.setRotationPoint(0F, 1F, 1F);
		this.bodymiddle.setTextureSize(128, 64);
		this.bodymiddle.mirror = true;
		this.setRotation(bodymiddle, 0F, 0F, 0F);
		this.bodymiddlebutton = new ModelRenderer(this, 0, 20);
		this.bodymiddlebutton.addBox(-0.5F, 5F, -1.6F, 1, 2, 0);
		this.bodymiddlebutton.setRotationPoint(0F, 1F, 1F);
		this.bodymiddlebutton.setTextureSize(128, 64);
		this.bodymiddlebutton.mirror = true;
		this.setRotation(bodymiddlebutton, 0F, 0F, 0F);
		this.bodybottom = new ModelRenderer(this, 0, 25);
		this.bodybottom.addBox(-2.5F, 7F, -2.5F, 5, 3, 3);
		this.bodybottom.setRotationPoint(0F, 1F, 1F);
		this.bodybottom.setTextureSize(128, 64);
		this.bodybottom.mirror = true;
		this.setRotation(bodybottom, 0.0872665F, 0F, 0F);
		this.rightchest = new ModelRenderer(this, 0, 31);
		this.rightchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.rightchest.setRotationPoint(-1.3F, 3F, -0.5F);
		this.rightchest.setTextureSize(128, 64);
		this.rightchest.mirror = true;
		this.setRotation(rightchest, 0.6981317F, 0.1745329F, 0.0872665F);
		this.leftchest = new ModelRenderer(this, 8, 31);
		this.leftchest.addBox(-1F, -1F, -1F, 2, 2, 2);
		this.leftchest.setRotationPoint(1.3F, 3F, -0.5F);
		this.leftchest.setTextureSize(128, 64);
		this.leftchest.mirror = true;
		this.setRotation(leftchest, 0.6981317F, -0.1745329F, -0.0872665F);
		this.rightarm = new ModelRenderer(this, 16, 12);
		this.rightarm.addBox(-2F, -1F, -1F, 2, 10, 2);
		this.rightarm.setRotationPoint(-2.5F, 2.5F, 1F);
		this.rightarm.setTextureSize(128, 64);
		this.rightarm.mirror = true;
		this.setRotation(rightarm, -0.0872665F, 0F, 0.1745329F);
		this.leftarm = new ModelRenderer(this, 16, 12);
		this.leftarm.addBox(0F, -1F, -1F, 2, 10, 2);
		this.leftarm.setRotationPoint(2.5F, 2.5F, 1F);
		this.leftarm.setTextureSize(128, 64);
		this.leftarm.mirror = true;
		this.setRotation(leftarm, -0.0872665F, 0F, -0.1745329F);
		this.rightpauldron = new ModelRenderer(this, 68, 0);
		this.rightpauldron.addBox(-3F, -2F, -2F, 4, 3, 4);
		this.rightpauldron.setRotationPoint(-2.5F, 2.5F, 1F);
		this.rightpauldron.setTextureSize(128, 64);
		this.rightpauldron.mirror = true;
		this.setRotation(rightpauldron, -0.0872665F, 0F, -0.3490659F);
		this.leftpauldron = new ModelRenderer(this, 84, 0);
		this.leftpauldron.addBox(-1F, -2F, -2F, 4, 3, 4);
		this.leftpauldron.setRotationPoint(2.5F, 2.5F, 1F);
		this.leftpauldron.setTextureSize(128, 64);
		this.leftpauldron.mirror = true;
		this.setRotation(leftpauldron, -0.0872665F, 0F, 0.3490659F);
		this.waist = new ModelRenderer(this, 68, 7);
		this.waist.addBox(-3.5F, -1.5F, -2F, 7, 8, 5);
		this.waist.setRotationPoint(0F, 11F, 0F);
		this.waist.setTextureSize(128, 64);
		this.waist.mirror = true;
		this.setRotation(waist, 0F, 0F, 0F);
		this.fin1 = new ModelRenderer(this, 68, 20);
		this.fin1.addBox(-3F, -1F, -1.5F, 6, 3, 4);
		this.fin1.setRotationPoint(0F, 11F, 0F);
		this.fin1.setTextureSize(128, 64);
		this.fin1.mirror = true;
		this.setRotation(fin1, 0.0872665F, 0F, 0F);
		this.fin2 = new ModelRenderer(this, 68, 27);
		this.fin2.addBox(-2.5F, 2F, -1F, 5, 3, 3);
		this.fin2.setRotationPoint(0F, 11F, 0F);
		this.fin2.setTextureSize(128, 64);
		this.fin2.mirror = true;
		this.setRotation(fin2, 0.2617994F, 0F, 0F);
		this.fin3 = new ModelRenderer(this, 68, 33);
		this.fin3.addBox(-2F, 5F, -0.5F, 4, 4, 2);
		this.fin3.setRotationPoint(0F, 11F, 0F);
		this.fin3.setTextureSize(128, 64);
		this.fin3.mirror = true;
		this.setRotation(fin3, 0.2617994F, 0F, 0F);
		this.fin4 = new ModelRenderer(this, 68, 39);
		this.fin4.addBox(-1.5F, 9F, -1F, 3, 4, 2);
		this.fin4.setRotationPoint(0F, 11F, 0F);
		this.fin4.setTextureSize(128, 64);
		this.fin4.mirror = true;
		this.setRotation(fin4, 0.3490659F, 0F, 0F);
		this.fintail = new ModelRenderer(this, 68, 45);
		this.fintail.addBox(-3F, 7F, -9.5F, 7, 7, 0);
		this.fintail.setRotationPoint(-0.5F, 11F, 0F);
		this.fintail.setTextureSize(128, 64);
		this.fintail.mirror = true;
		this.setRotation(fintail, 1.308997F, 0F, 0F);
	}

	public void render(Entity entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		super.render(entity, par2, par3, par4, par5, par6, par7);
		this.setRotationAngles(par2, par3, par4, par5, par6, par7);
		this.head.render(par7);
		this.headaccessory.render(par7);
		this.headhelmet.render(par7);
		this.finright.render(par7);
		this.finleft.render(par7);
		this.hair1.render(par7);
		this.hair2.render(par7);
		this.hairaccessory.render(par7);
		this.bodytop.render(par7);
		this.bodymiddle.render(par7);
		this.bodymiddlebutton.render(par7);
		this.bodybottom.render(par7);
		this.rightchest.render(par7);
		this.leftchest.render(par7);
		this.rightarm.render(par7);
		this.leftarm.render(par7);
		this.rightpauldron.render(par7);
		this.leftpauldron.render(par7);
		this.waist.render(par7);
		this.fin1.render(par7);
		this.fin2.render(par7);
		this.fin3.render(par7);
		this.fin4.render(par7);
		this.fintail.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6) {
		this.head.rotateAngleY = par4 / 57.295776F;
		this.head.rotateAngleX = par5 / 57.295776F;
		this.headaccessory.rotateAngleY = this.head.rotateAngleY;
		this.headaccessory.rotateAngleX = this.head.rotateAngleX;
		this.headhelmet.rotateAngleY = this.head.rotateAngleY;
		this.headhelmet.rotateAngleX = this.head.rotateAngleX - 0.5235988F;
		this.finright.rotateAngleY = this.head.rotateAngleY - 0.5235988F;
		this.finright.rotateAngleX = this.head.rotateAngleX;
		this.finleft.rotateAngleY = this.head.rotateAngleY + 0.5235988F;
		this.finleft.rotateAngleX = this.head.rotateAngleX;
		this.hair1.rotateAngleY = this.head.rotateAngleY;
		this.hair2.rotateAngleY = this.head.rotateAngleY;
		this.hairaccessory.rotateAngleY = this.head.rotateAngleY;
		this.hairaccessory.rotateAngleX = this.head.rotateAngleX;
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 0.8F * par2 * 0.5F;
		this.rightpauldron.rotateAngleX = rightarm.rotateAngleX - 0.0872665F;
		rightarm.rotateAngleX -= 0.0872665F;
		this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 0.8F * par2 * 0.5F;
		this.leftpauldron.rotateAngleX = this.leftarm.rotateAngleX - 0.0872665F;
		this.leftarm.rotateAngleX -= 0.0872665F;
		this.fin1.rotateAngleY = MathHelper.cos(par1 * 0.6162F) * 0.1F * par2;
		this.fin2.rotateAngleY = MathHelper.cos(par1 * 0.6262F) * 0.1F * par2;
		this.fin3.rotateAngleY = MathHelper.cos(par1 * 0.6362F) * 0.1F * par2;
		this.fin4.rotateAngleY = MathHelper.cos(par1 * 0.6362F) * 0.1F * par2;
		this.fintail.rotateAngleY = this.fin4.rotateAngleY;
		
        float f6;
        float f7;

        if (this.onGround > -9990.0F)
        {
            f6 = this.onGround;
            f6 = 1.0F - this.onGround;
            f6 *= f6;
            f6 *= f6;
            f6 = 1.0F - f6;
            f7 = MathHelper.sin(f6 * (float)Math.PI);
            float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            
            this.rightarm.rotateAngleX = (float)((double)this.rightarm.rotateAngleX - ((double)f7 * 1.2D + (double)f8)) - 0.0872665F;
            this.rightpauldron.rotateAngleX = this.rightarm.rotateAngleX;
            this.rightarm.rotateAngleY += (this.bodytop.rotateAngleY * 2.0F);
            this.rightpauldron.rotateAngleY = this.rightarm.rotateAngleY;
            this.rightarm.rotateAngleZ = (MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F);
            this.rightpauldron.rotateAngleZ = this.rightarm.rotateAngleZ - 0.3490659F;
            this.rightarm.rotateAngleZ = this.rightarm.rotateAngleZ + 0.1745329F;
        }
	}
}
