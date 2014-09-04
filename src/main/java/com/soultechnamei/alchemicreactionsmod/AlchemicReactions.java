package com.soultechnamei.alchemicreactionsmod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemNameTag;
import com.soultechnamei.alchemicreactionsmod.*;

/*
*
* @author soultechnamei
* created 7-28-14
 */

@Mod(modid="alchemicreactions",name="Alchemic Reactions Mod",version="1.7.10-1.0")
public class AlchemicReactions
{
    public static final String MODID = "alchemicreactions";
    public static final String VERSION = "1.7.10-1.0";

    public static Item ItemBCC;
    public static Item ItemBTC;
    public static Item ItemC;
    public static Item ItemEm;
    public static Item ItemPs;
    public static Item ItemSc;
    public static CreativeTabs ARM;


    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)

    {
        //Item Initialization And Registration
        ItemBCC = new ItemBCC().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("ItemBCC");
        ItemBTC = new ItemBTC().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("ItemBTC");
        /*
        ItemC = new ItemC().setCreativeTabCreativeTabs(CreativeTabs.tabMaterials).setUnlocalizedName("ItemC");
        */
        ItemEm = new ItemEm().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("ItemC");
        ItemPs = new ItemPs().setCreativeTab(CreativeTabs.tabMaterials);
        ItemSc = new ItemSc().setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("ItemSc");

        GameRegistry.registerItem(ItemBCC,"ItemBCC");
        GameRegistry.registerItem(ItemBTC, "ItemBTC");
        GameRegistry.registerItem(ItemPs,"ItemPs");

        //Creative Tab Initialization And Registration

    }



    @Mod.EventHandler
    public void init(FMLInitializationEvent event)

    {
        ARMTab armTab = new ARMTab();

    }

    @Mod.EventHandler
    public void postinit (FMLPostInitializationEvent event)

    {


    }
}


