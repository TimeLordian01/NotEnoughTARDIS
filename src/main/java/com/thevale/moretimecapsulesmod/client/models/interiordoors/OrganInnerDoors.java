package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.OrganRender;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.PtoredRender;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.ConsoleTile;

public class OrganInnerDoors extends EntityModel<Entity> implements IInteriorDoorRenderer {
    private final ModelRenderer bb_main;
    private final ModelRenderer Door;

    public OrganInnerDoors() {
        textureWidth = 128;
        textureHeight = 128;

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.setTextureOffset(99, 1).addBox(6.0F, -31.0F, -7.3125F, 2.0F, 29.0F, 2.0F, 0.0F, false);
        bb_main.setTextureOffset(99, 1).addBox(-8.0F, -31.0F, -7.3125F, 2.0F, 29.0F, 2.0F, 0.0F, true);
        bb_main.setTextureOffset(92, 23).addBox(-8.0F, -32.0F, -7.3125F, 16.0F, 1.0F, 2.0F, 0.0F, true);
        bb_main.setTextureOffset(92, 23).addBox(-8.0F, -2.0F, -7.3125F, 16.0F, 2.0F, 2.0F, 0.0F, true);

        Door = new ModelRenderer(this);
        Door.setRotationPoint(7.0F, 7.75F, -6.5625F);
        Door.setTextureOffset(0, 0).addBox(-13.0F, -14.75F, -0.75F, 13.0F, 29.0F, 1.0F, 0.0F, false);
        Door.setTextureOffset(0, 40).addBox(-12.0F, -0.75F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
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
        matrixStack.rotate(Vector3f.YP.rotationDegrees(180));
        matrixStack.scale(1.0F, 1.0F, 1.0F);
        matrixStack.translate(0F,0F,1F);
        switch(state) {
            case ONE:
                this.Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.ORGAN.getRotationForState(EnumDoorState.ONE));
                break;
            case BOTH:
                this.Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.ORGAN.getRotationForState(EnumDoorState.BOTH));
                break;
            case CLOSED:
                this.Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.ORGAN.getRotationForState(EnumDoorState.CLOSED));
        }

        this.Door.render(matrixStack, buffer, packedLight, packedOverlay);
        this.bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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
        if (tile != null) {
            int index = tile.getExteriorManager().getExteriorVariant();
            TexVariant[] vars = tile.getTextureVariants();
            if (vars != null && index < vars.length) {
                return vars[index].getTexture();
            }
        }
        return OrganRender.TEXTURE;
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