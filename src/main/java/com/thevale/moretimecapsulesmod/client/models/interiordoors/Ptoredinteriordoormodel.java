package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.PtoredRender;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.ShalkaRender;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.ConsoleTile;

public class Ptoredinteriordoormodel extends EntityModel<Entity> implements IInteriorDoorRenderer {
    private final ModelRenderer Chassis;
    private final ModelRenderer DoorR;
    private final ModelRenderer cube_r1;
    private final ModelRenderer DoorL;
    private final ModelRenderer cube_r2;

    public Ptoredinteriordoormodel() {
        textureWidth = 256;
        textureHeight = 256;

        Chassis = new ModelRenderer(this);
        Chassis.setRotationPoint(-1.1875F, -11.7188F, 9.0938F);
        setRotationAngle(Chassis, 0.0F, 1.5708F, 0.0F);
        Chassis.setTextureOffset(0, 0).addBox(14.1875F, 32.7188F, -17.0938F, 3.0F, 3.0F, 36.0F, 0.0F, false);
        Chassis.setTextureOffset(42, 76).addBox(14.1875F, -24.2813F, 14.9063F, 3.0F, 57.0F, 3.0F, 0.0F, false);
        Chassis.setTextureOffset(30, 76).addBox(14.1875F, -24.2813F, -16.0938F, 3.0F, 57.0F, 3.0F, 0.0F, false);
        Chassis.setTextureOffset(0, 39).addBox(12.1875F, -23.2813F, -15.0938F, 5.0F, 5.0F, 32.0F, 0.0F, false);

        DoorR = new ModelRenderer(this);
        DoorR.setRotationPoint(14.1875F, 32.7188F, 14.9063F);
        Chassis.addChild(DoorR);
        DoorR.setTextureOffset(0, 0).addBox(1.0F, -34.0F, -13.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        DoorR.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.setTextureOffset(0, 76).addBox(-14.0F, -51.0F, -1.0F, 14.0F, 51.0F, 1.0F, 0.0F, false);

        DoorL = new ModelRenderer(this);
        DoorL.setRotationPoint(14.1875F, 32.7188F, -13.0938F);
        Chassis.addChild(DoorL);
        DoorL.setTextureOffset(4, 4).addBox(1.0F, -33.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
        DoorL.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
        cube_r2.setTextureOffset(75, 75).addBox(0.0F, -51.0F, -1.0F, 14.0F, 51.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
        EnumDoorState state = door.getOpenState();
        matrixStack.push();
        matrixStack.translate(0.0D, 0.57D, -0.3D);
        matrixStack.scale(0.65F, 0.65F, 0.65F);
        switch (state) {
            case ONE:
                this.DoorR.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.ONE));
                this.DoorL.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
                break;
            case BOTH:
                this.DoorR.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.ONE));
                this.DoorL.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.BOTH));
                break;
            case CLOSED:
                this.DoorR.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
                this.DoorL.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
        }
        Chassis.render(matrixStack, buffer, packedLight, packedOverlay);
        matrixStack.pop();
    }

    @Override
    public void renderBones(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

    }

    @Override
    public void renderBoti(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

    }

    @Override
    public ResourceLocation getTexture() {
        ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().world).orElse(null);
        ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod","textures/interiordoor/ptoredinterior.png");
        return TEXTURE;
    }

    @Override
    public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer modelRenderer) {

    }

    @Override
    public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer... modelRenderers) {

    }

    @Override
    public boolean doesDoorOpenIntoBotiWindow() {
        return false;
    }

    @Override
    public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

    }
}