package com.soultechnamei.alchemicreactionsmod;
import com.soultechnamei.alchemicreactionsmod.ItemEm;
import com.soultechnamei.alchemicreactionsmod.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;


/**
 * Creative tab for EvilCraft.
 * @author rubensworks
 *
 */
public class ARMTab extends CreativeTabs{

    private static ARMTab _instance = null;

    /**
     * Get the unique instance.
     * @return The unique instance.
     */
    public static ARMTab getInstance() {
        if(_instance == null)
            _instance = new ARMTab();
        return _instance;
    }

    ARMTab() {
        super(Reference.MOD_NAME);
        LanguageRegistry.instance().addStringLocalization("itemGroup." + Reference.MOD_NAME, "en_US", Reference.MOD_NAME);
    }


    @Override
    public Item getTabIconItem() {
        return null;
    }
}
