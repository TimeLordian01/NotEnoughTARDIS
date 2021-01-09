package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;

public class ShalkaInteriorDoor extends Model implements IInteriorDoorRenderer {
	    public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/interiordoor/shalkadoor.png");

	private final RendererModel Frame;
	private final RendererModel Base;
	private final RendererModel PCB;
	private final RendererModel RightDoor;
	private final RendererModel LeftDoor;

	public ShalkaInteriorDoor() {
		textureWidth = 512;
		textureHeight = 512;

		Frame = new RendererModel(this);
		Frame.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Base = new RendererModel(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Frame.addChild(Base);
		Base.cubeList.add(new ModelBox(Base, 0, 0, -10.5F, -1.0F, -8.375F, 21, 1, 4, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 0, 0, -10.5F, -42.5F, -8.375F, 21, 1, 4, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 228, 0, 8.375F, -41.75F, -7.25F, 1, 40, 1, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 233, 0, -9.375F, -41.75F, -7.25F, 1, 40, 1, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 248, 0, 7.75F, -38.5F, -7.125F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 272, 0, -9.25F, -38.5F, -6.625F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 252, 0, 8.25F, -38.5F, -6.625F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 244, 0, -8.75F, -38.5F, -7.125F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 276, 0, 6.5F, -38.75F, -7.375F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 288, 0, -9.5F, -38.75F, -5.375F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 280, 0, 8.5F, -38.75F, -5.375F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 276, 0, -7.5F, -38.75F, -7.375F, 1, 38, 1, -0.25F, false));

		PCB = new RendererModel(this);
		PCB.setRotationPoint(0.0F, -1.75F, 0.0F);
		Frame.addChild(PCB);
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, -8.0F, -37.25F, -9.25F, 16, 1, 3, -0.25F, false));
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, -8.0625F, -39.6875F, -9.3125F, 2, 3, 3, -0.3125F, false));
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, 6.0625F, -39.6875F, -9.3125F, 2, 3, 3, -0.3125F, false));
		PCB.cubeList.add(new ModelBox(PCB, 186, 18, -7.0F, -39.6875F, -7.8125F, 14, 3, 1, -0.3125F, false));
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, -8.0F, -40.125F, -9.25F, 16, 1, 3, -0.25F, false));

		RightDoor = new RendererModel(this);
		RightDoor.setRotationPoint(7.3221F, 0.4087F, -6.6181F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 292, 0, -1.8221F, -15.1587F, -0.2569F, 2, 38, 1, -0.25F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.9471F, 19.9038F, -0.2569F, 6, 3, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.9471F, 11.4038F, -0.2569F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.9471F, 2.9038F, -0.2569F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.9471F, -5.9712F, -0.2569F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.9471F, -14.9712F, -0.2569F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -5.4471F, -14.0962F, -0.1319F, 1, 9, 1, -0.25F, true));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -3.6971F, -14.0962F, -0.1319F, 1, 9, 1, -0.25F, true));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -7.6971F, -9.9712F, -0.0694F, 7, 1, 1, -0.25F, true));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 195, 25, -7.6971F, -13.7837F, -0.1944F, 7, 9, 1, -0.4375F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 385, 15, -7.5096F, -5.3462F, -0.2569F, 7, 26, 1, -0.4375F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 276, 0, -7.3221F, -15.1587F, -0.2569F, 1, 38, 1, -0.25F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 276, 0, -7.8221F, -15.1587F, -0.2569F, 1, 38, 1, -0.25F, false));

		LeftDoor = new RendererModel(this);
		LeftDoor.setRotationPoint(-7.2743F, 0.5451F, -6.6181F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 292, 0, -0.2257F, -15.2951F, -0.2569F, 2, 38, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 276, 0, 6.7743F, -15.2951F, -0.7569F, 1, 38, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 276, 0, 6.2743F, -15.2951F, -0.2569F, 1, 38, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8993F, 19.7674F, -0.2569F, 6, 3, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 385, 15, 0.8368F, 3.5174F, -0.2569F, 7, 17, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8993F, 11.2674F, -0.2569F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8993F, 2.7674F, -0.2569F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 0.5243F, -4.0451F, -0.2569F, 2, 7, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 216, 18, 1.5243F, -4.0451F, -0.1319F, 5, 7, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 5.5243F, -4.0451F, -0.2569F, 2, 7, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 0.6493F, 2.0799F, -0.2569F, 7, 2, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 195, 25, 0.6493F, -13.9201F, -0.1944F, 7, 9, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 0.6493F, -5.1701F, -0.2569F, 7, 2, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8993F, -6.1076F, -0.2569F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8993F, -15.1076F, -0.2569F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 2.6493F, -14.2326F, -0.1319F, 1, 9, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 4.3993F, -14.2326F, -0.1319F, 1, 9, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.6493F, -10.1076F, -0.0694F, 7, 1, 1, -0.25F, false));
	}
	
		@Override
		 public void render(DoorEntity door) {
        EnumDoorState state = door.getOpenState();
        switch(state) {
        case ONE:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
        }

        this.LeftDoor.render(0.0625F);
        this.RightDoor.render(0.0625F);
        this.Frame.render(0.0625F);
    }

	public ResourceLocation getTexture() {
        return TEXTURE;
    }
}
