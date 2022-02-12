//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.thevale.notenoughtardis.variants;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.misc.TexVariant;

//WIP MODEL VARIANTS CLASS
public class ModVariant {
    private ResourceLocation mod;
    private TranslationTextComponent translation;
    private ModVariant interiordoor;

    public ModVariant(ResourceLocation loc, String translationkey) {
        this.mod = loc;
        this.translation = new TranslationTextComponent("modvar."+loc.getNamespace() + "." +translationkey);
    }

    public ModVariant(String fileName, String translationkey) {
        this(new ResourceLocation("notenoughtardis","models/exteriors/"+ fileName + ".class"), translationkey);
    }
     public ResourceLocation getInteriorDoorModel() {
        return this.interiordoor != null ? this.interiordoor.getModel() : this.getModel();
     }

     public ModVariant addInteriorDoorVariaint(String fileName) {
        ModVariant m = new ModVariant(new ResourceLocation("notenoughtardis","models/interiordoor/" +fileName + ".class"), "");
        this.interiordoor = m;
        return this;
     }

     public ModVariant addInteriorDoorVariant(ResourceLocation loc) {
        ModVariant m = new ModVariant(loc,"");
        this.interiordoor = m;
        return this;
     }

    public ResourceLocation getModel() {return this.mod;}

    public TranslationTextComponent getTranslation() {return this.translation;}
}
