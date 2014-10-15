package com.enderbane.testmod.init;

import com.enderbane.testmod.item.ItemMapleLeaf;
import com.enderbane.testmod.item.ItemTMOD;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemTMOD mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
