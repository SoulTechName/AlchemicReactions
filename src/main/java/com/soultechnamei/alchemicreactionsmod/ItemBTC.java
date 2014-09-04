package com.soultechnamei.alchemicreactionsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBTC extends Item {

    public ItemBTC() {
        super();
        this.setUnlocalizedName(Reference.MOD_ID+":"+"Basic Transmutations Circle");
        this.setTextureName(Reference.MOD_ID+":"+"Basic Transmutations Circle");
        setCreativeTab(CreativeTabs.tabMisc);

    }
}