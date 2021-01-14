package com.thevale.moretimecapsulesmod.util;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.misc.IDoorType;

import java.util.function.Function;
import java.util.function.Supplier;

public enum EnumDoorTypes implements IDoorType {

SHALKA(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return 85.0;
                case BOTH : return -85.0;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    PTORED(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return 85.0;
                case BOTH : return -85.0;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    WARDROBE(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return -100.0;
                case BOTH : return 100.0;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
       ELEVATOR(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return -15.0D;
                case BOTH : return -15.0D;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
        ORGAN(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return 45.0D;
                case BOTH : return 90.0D;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH),
    CANON05(state -> {
            switch(state) {
            case CLOSED: return 0.0D;
                case ONE: return 90.0D;
                case BOTH : return -90.0D;
                default:return 0.0;
            }
        }, EnumDoorState.CLOSED, EnumDoorState.ONE, EnumDoorState.BOTH);


        Function<EnumDoorState, Double> func;
        EnumDoorState[] validStates;
        Supplier<Supplier<IInteriorDoorRenderer>> renderer;

        EnumDoorTypes(Function<EnumDoorState, Double> func, EnumDoorState... states){
            this.validStates = states;
            this.func = func;
        }

        @Override
        public EnumDoorState[] getValidStates() {
            return this.validStates;
        }

        @Override
        public double getRotationForState(EnumDoorState state) {
            return func.apply(state);
        }

        @OnlyIn(Dist.CLIENT)
        public void setInteriorDoorModel(IInteriorDoorRenderer renderer) {
            this.renderer = () -> () -> renderer;
        }

        @OnlyIn(Dist.CLIENT)
        public IInteriorDoorRenderer getInteriorDoorRenderer() {
            return this.renderer.get().get();
        }

    }

