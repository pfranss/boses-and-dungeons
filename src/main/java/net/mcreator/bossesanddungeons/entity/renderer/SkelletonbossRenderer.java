package net.mcreator.bossesanddungeons.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.bossesanddungeons.entity.SkelletonbossEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SkelletonbossRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SkelletonbossEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelundead_captain(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("bosses_and_dungeons:textures/undead_captain.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.8.4
	// Exported for Minecraft version 1.15 - 1.16
	// Paste this class into your mod and generate all required imports
	public static class Modelundead_captain extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer rim_r1;
		private final ModelRenderer rim_r2;
		private final ModelRenderer feather_r1;
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;
		public Modelundead_captain() {
			textureWidth = 64;
			textureHeight = 96;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			setRotationAngle(Head, -0.1047F, 0.0873F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-7.5F, -6.9999F, 2.0F, 2.0F, 0.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-7.0F, -6.9999F, 0.75F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-5.0F, -6.9999F, -4.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-6.0F, -6.9998F, -1.75F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(5.5F, -6.9999F, 2.0F, 2.0F, 0.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(6.0F, -6.9999F, 0.75F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(4.0F, -6.9999F, -4.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(4.0F, -6.9998F, -1.75F, 2.0F, 0.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-7.0F, -7.0F, 4.5F, 14.0F, 0.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(35, 83).addBox(-7.0F, -11.0F, 5.5F, 14.0F, 4.0F, 0.0F, 0.0F, false);
			Head.setTextureOffset(36, 70).addBox(-4.0F, -6.9999F, -6.5F, 8.0F, 0.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(33, 65).addBox(-3.0F, -6.9999F, -9.0F, 6.0F, 0.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(28, 86).addBox(-4.0F, -6.9997F, -5.0F, 8.0F, 0.0F, 10.0F, 0.0F, false);
			Head.setTextureOffset(34, 86).addBox(-4.0F, -10.0F, -3.5F, 8.0F, 3.0F, 7.0F, 0.0F, false);
			Head.setTextureOffset(35, 73).addBox(-4.0F, -9.0F, -4.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(46, 93).addBox(-4.0F, -9.0F, 3.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			rim_r1 = new ModelRenderer(this);
			rim_r1.setRotationPoint(1.5F, -7.0F, -7.0F);
			Head.addChild(rim_r1);
			setRotationAngle(rim_r1, 0.0F, 0.3927F, 0.0F);
			rim_r1.setTextureOffset(0, 64).addBox(1.46F, -4.0F, -1.8F, 0.0F, 4.0F, 14.0F, 0.0F, false);
			rim_r1.setTextureOffset(0, 0).addBox(0.46F, 0.0F, -1.8F, 1.0F, 0.0F, 14.0F, 0.0F, false);
			rim_r2 = new ModelRenderer(this);
			rim_r2.setRotationPoint(-3.75F, -7.0F, -6.5F);
			Head.addChild(rim_r2);
			setRotationAngle(rim_r2, 0.0F, -0.3927F, 0.0F);
			rim_r2.setTextureOffset(35, 64).addBox(0.58F, -4.0F, -2.36F, 0.0F, 4.0F, 14.0F, 0.0F, false);
			rim_r2.setTextureOffset(0, 0).addBox(0.58F, 0.0F, -2.36F, 1.0F, 0.0F, 14.0F, 0.0F, false);
			feather_r1 = new ModelRenderer(this);
			feather_r1.setRotationPoint(-4.0F, -9.0F, 3.0F);
			Head.addChild(feather_r1);
			setRotationAngle(feather_r1, 0.0F, -0.7854F, 0.0F);
			feather_r1.setTextureOffset(10, 72).addBox(1.0F, -7.5F, -2.0F, 0.0F, 8.0F, 10.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(16, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			setRotationAngle(RightArm, -0.1745F, 0.0F, 0.0F);
			RightArm.setTextureOffset(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm.setTextureOffset(40, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			setRotationAngle(LeftArm, 0.2094F, 0.0F, 0.0F);
			LeftArm.setTextureOffset(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftArm.setTextureOffset(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			setRotationAngle(RightLeg, 0.192F, 0.0F, 0.0349F);
			RightLeg.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightLeg.setTextureOffset(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			setRotationAngle(LeftLeg, -0.1745F, 0.0F, -0.0349F);
			LeftLeg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg.setTextureOffset(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}
}
