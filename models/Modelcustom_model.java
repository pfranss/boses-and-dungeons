// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;

	public Modelcustom_model() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -7.0F, 0.0F);
		body.setTextureOffset(0, 90).addBox(-14.0F, -24.5F, 5.0F, 29.0F, 9.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 120).addBox(-14.0F, -29.5F, 14.0F, 29.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 161).addBox(-14.0F, -29.5F, 5.0F, 4.0F, 5.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 138).addBox(11.0F, -29.5F, 5.0F, 4.0F, 5.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 203).addBox(-15.0F, -31.0F, -6.0F, 30.0F, 43.0F, 11.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.0F, -2.0F);
		head.setTextureOffset(179, 0).addBox(-9.0F, -47.0F, -8.5F, 18.0F, 16.0F, 21.0F, 0.0F, false);
		head.setTextureOffset(101, 216).addBox(-20.0F, -50.0F, -16.5F, 41.0F, 4.0F, 37.0F, 0.0F, false);
		head.setTextureOffset(215, 106).addBox(-5.0F, -61.5F, -4.0F, 11.0F, 3.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(187, 124).addBox(-9.0F, -58.5F, -7.0F, 19.0F, 3.0F, 16.0F, 0.0F, false);
		head.setTextureOffset(131, 174).addBox(-16.0F, -52.5F, -13.0F, 33.0F, 6.0F, 30.0F, 0.0F, false);
		head.setTextureOffset(165, 147).addBox(-12.0F, -55.5F, -9.0F, 25.0F, 3.0F, 21.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(0.0F, -7.0F, 0.0F);
		left_arm.setTextureOffset(225, 59).addBox(15.0F, -29.0F, -4.0F, 9.0F, 31.0F, 7.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-5.0F, 11.0F, 0.0F);
		right_leg.setTextureOffset(40, 146).addBox(-5.5F, -6.0F, -4.0F, 9.0F, 19.0F, 7.0F, 0.0F, false);
		right_leg.setTextureOffset(142, 57).addBox(-5.5F, 7.0F, -11.0F, 9.0F, 6.0F, 7.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		right_arm.setTextureOffset(189, 59).addBox(-24.0F, -60.0F, -4.0F, 9.0F, 31.0F, 7.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.0F, 11.0F, 0.0F);
		left_leg.setTextureOffset(81, 145).addBox(-1.5F, -6.0F, -4.0F, 9.0F, 19.0F, 7.0F, 0.0F, false);
		left_leg.setTextureOffset(97, 58).addBox(-1.5F, 7.0F, -11.0F, 9.0F, 6.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}