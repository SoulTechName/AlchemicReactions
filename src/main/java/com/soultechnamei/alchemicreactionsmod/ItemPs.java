package com.soultechnamei.alchemicreactionsmod;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemPs extends Item {

    public ItemPs() {
        super();

        this.setUnlocalizedName("Philosopher's Stone");
        this.setTextureName(Reference.MOD_ID+":"+"PS");
        setCreativeTab(CreativeTabs.tabMisc);


    }
}