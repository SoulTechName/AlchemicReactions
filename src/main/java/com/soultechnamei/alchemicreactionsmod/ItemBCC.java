package com.soultechnamei.alchemicreactionsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBCC extends Item {

    public ItemBCC() {
        super();

        this.setUnlocalizedName(Reference.MOD_ID+":"+"Basic Chalk Circle");
        this.setTextureName(Reference.MOD_ID+":"+"Basic Chalk Circle");
        this.setCreativeTab(CreativeTabs.tabMaterials);

    }
}