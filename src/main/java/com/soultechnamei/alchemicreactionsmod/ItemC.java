package com.soultechnamei.alchemicreactionsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemC extends Item {

    public ItemC() {
        super();

        this.setUnlocalizedName(Reference.MOD_ID+":"+"Chalk");
        this.setTextureName(Reference.MOD_ID+":"+"Chalk");
        this.setCreativeTab(CreativeTabs.tabMaterials);

    }
}