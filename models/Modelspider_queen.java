// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports

public static class Modelspider_queen extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_leg1;
	private final ModelRenderer under_r1;
	private final ModelRenderer over_r1;
	private final ModelRenderer left_leg1;
	private final ModelRenderer under_r2;
	private final ModelRenderer over_r2;
	private final ModelRenderer right_leg2;
	private final ModelRenderer under_r3;
	private final ModelRenderer over_r3;
	private final ModelRenderer left_leg2;
	private final ModelRenderer under_r4;
	private final ModelRenderer over_r4;
	private final ModelRenderer right_leg3;
	private final ModelRenderer under_r5;
	private final ModelRenderer over_r5;
	private final ModelRenderer left_leg3;
	private final ModelRenderer under_r6;
	private final ModelRenderer over_r6;
	private final ModelRenderer right_leg4;
	private final ModelRenderer under_r7;
	private final ModelRenderer over_r7;
	private final ModelRenderer left_leg4;
	private final ModelRenderer under_r8;
	private final ModelRenderer over_r8;

	public Modelspider_queen() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 15.0F, -3.0F);
		head.setTextureOffset(37, 64).addBox(-7.0F, -9.0F, -9.0F, 14.0F, 11.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(47, 55).addBox(-5.0F, -4.0F, -11.0F, 10.0F, 5.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.0F);
		body.setTextureOffset(4, 87).addBox(-10.0F, -12.0F, 12.0F, 20.0F, 15.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(88, 74).addBox(-9.0F, -11.0F, 24.0F, 18.0F, 13.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(91, 60).addBox(-8.0F, -10.0F, 26.0F, 16.0F, 11.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(99, 49).addBox(-6.0F, -8.0F, 28.0F, 12.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(104, 40).addBox(-5.0F, -7.0F, 30.0F, 10.0F, 6.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 90).addBox(-9.0F, -11.0F, -12.0F, 18.0F, 14.0F, 24.0F, 0.0F, false);

		right_leg1 = new ModelRenderer(this);
		right_leg1.setRotationPoint(0.0F, 15.0F, 9.0F);

		under_r1 = new ModelRenderer(this);
		under_r1.setRotationPoint(-25.6214F, -10.7776F, 8.0F);
		right_leg1.addChild(under_r1);
		setRotationAngle(under_r1, 0.0F, 0.0F, -0.829F);
		under_r1.setTextureOffset(94, 0).addBox(-12.0F, 5.0F, -1.0F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r1 = new ModelRenderer(this);
		over_r1.setRotationPoint(-19.0F, 0.0F, 7.0F);
		right_leg1.addChild(over_r1);
		setRotationAngle(over_r1, 0.0F, 0.0F, 0.6981F);
		over_r1.setTextureOffset(96, 5).addBox(-5.0F, -7.0F, 0.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);

		left_leg1 = new ModelRenderer(this);
		left_leg1.setRotationPoint(-4.0F, 15.0F, 4.0F);

		under_r2 = new ModelRenderer(this);
		under_r2.setRotationPoint(23.0088F, -1.7556F, -4.5F);
		left_leg1.addChild(under_r2);
		setRotationAngle(under_r2, 0.0F, 0.0F, -2.3126F);
		under_r2.setTextureOffset(94, 0).addBox(-8.5F, 4.0F, 16.5F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r2 = new ModelRenderer(this);
		over_r2.setRotationPoint(19.5F, -4.0F, 13.0F);
		left_leg1.addChild(over_r2);
		setRotationAngle(over_r2, 0.0F, 0.0F, -0.7418F);
		over_r2.setTextureOffset(96, 5).addBox(-9.0F, -3.0F, -1.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(4.0F, 15.0F, 1.0F);

		under_r3 = new ModelRenderer(this);
		under_r3.setRotationPoint(-29.6214F, -10.7776F, 16.0F);
		right_leg2.addChild(under_r3);
		setRotationAngle(under_r3, 0.0F, 0.0F, -0.829F);
		under_r3.setTextureOffset(94, 0).addBox(-12.0F, 5.25F, -7.0F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r3 = new ModelRenderer(this);
		over_r3.setRotationPoint(-23.0F, 0.0F, 0.0F);
		right_leg2.addChild(over_r3);
		setRotationAngle(over_r3, 0.0F, 0.0F, 0.7418F);
		over_r3.setTextureOffset(96, 5).addBox(-5.0F, -7.0F, 9.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(-4.0F, 15.0F, 1.0F);

		under_r4 = new ModelRenderer(this);
		under_r4.setRotationPoint(23.0088F, -1.7556F, -1.5F);
		left_leg2.addChild(under_r4);
		setRotationAngle(under_r4, 0.0F, 0.0F, -2.3126F);
		under_r4.setTextureOffset(94, 0).addBox(-8.5F, 4.0F, 11.0F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r4 = new ModelRenderer(this);
		over_r4.setRotationPoint(21.0F, -4.0F, 9.0F);
		left_leg2.addChild(over_r4);
		setRotationAngle(over_r4, 0.0F, 0.0F, -0.7418F);
		over_r4.setTextureOffset(96, 5).addBox(-10.0F, -4.0F, 0.5F, 14.0F, 2.0F, 2.0F, 0.0F, false);

		right_leg3 = new ModelRenderer(this);
		right_leg3.setRotationPoint(4.0F, 15.0F, -2.0F);

		under_r5 = new ModelRenderer(this);
		under_r5.setRotationPoint(-29.6214F, -10.7776F, 19.0F);
		right_leg3.addChild(under_r5);
		setRotationAngle(under_r5, 0.0F, 0.0F, -0.829F);
		under_r5.setTextureOffset(94, 0).addBox(-12.0F, 5.25F, -12.25F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r5 = new ModelRenderer(this);
		over_r5.setRotationPoint(-23.0F, 0.0F, 0.0F);
		right_leg3.addChild(over_r5);
		setRotationAngle(over_r5, 0.0F, 0.0F, 0.7418F);
		over_r5.setTextureOffset(96, 5).addBox(-5.0F, -7.0F, 6.75F, 14.0F, 2.0F, 2.0F, 0.0F, false);

		left_leg3 = new ModelRenderer(this);
		left_leg3.setRotationPoint(-4.0F, 15.0F, -2.0F);

		under_r6 = new ModelRenderer(this);
		under_r6.setRotationPoint(23.0088F, -1.7556F, 1.5F);
		left_leg3.addChild(under_r6);
		setRotationAngle(under_r6, 0.0F, 0.0F, -2.3126F);
		under_r6.setTextureOffset(94, 0).addBox(-8.5F, 4.0F, 5.5F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r6 = new ModelRenderer(this);
		over_r6.setRotationPoint(20.0F, -3.0F, 6.0F);
		left_leg3.addChild(over_r6);
		setRotationAngle(over_r6, 0.0F, 0.0F, -0.7418F);
		over_r6.setTextureOffset(96, 5).addBox(-8.5F, -4.25F, 1.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);

		right_leg4 = new ModelRenderer(this);
		right_leg4.setRotationPoint(4.0F, 15.0F, -5.0F);

		under_r7 = new ModelRenderer(this);
		under_r7.setRotationPoint(-29.6214F, -10.7776F, 22.0F);
		right_leg4.addChild(under_r7);
		setRotationAngle(under_r7, 0.0F, 0.0F, -0.829F);
		under_r7.setTextureOffset(94, 0).addBox(-12.0F, 5.25F, -17.5F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r7 = new ModelRenderer(this);
		over_r7.setRotationPoint(-23.0F, 0.0F, 0.0F);
		right_leg4.addChild(over_r7);
		setRotationAngle(over_r7, 0.0F, 0.0F, 0.7418F);
		over_r7.setTextureOffset(96, 5).addBox(-5.0F, -7.0F, 4.5F, 14.0F, 2.0F, 2.0F, 0.0F, false);

		left_leg4 = new ModelRenderer(this);
		left_leg4.setRotationPoint(-4.0F, 15.0F, -5.0F);

		under_r8 = new ModelRenderer(this);
		under_r8.setRotationPoint(23.0088F, -1.7556F, 4.5F);
		left_leg4.addChild(under_r8);
		setRotationAngle(under_r8, 0.0F, 0.0F, -2.3126F);
		under_r8.setTextureOffset(94, 0).addBox(-8.5F, 4.0F, -0.5F, 15.0F, 2.0F, 2.0F, 0.0F, false);

		over_r8 = new ModelRenderer(this);
		over_r8.setRotationPoint(23.0F, 0.0F, 5.0F);
		left_leg4.addChild(over_r8);
		setRotationAngle(over_r8, 0.0F, 0.0F, -0.7418F);
		over_r8.setTextureOffset(96, 5).addBox(-8.5F, -8.0F, -1.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg4.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.under_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.under_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.under_r3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.under_r4.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.under_r5.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.under_r6.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.under_r7.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.under_r8.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.over_r7.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.over_r8.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.over_r3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.over_r4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.over_r5.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.over_r6.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.over_r1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.over_r2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}