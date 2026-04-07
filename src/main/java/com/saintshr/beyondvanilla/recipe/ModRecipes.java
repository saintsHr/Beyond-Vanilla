package com.saintshr.beyondvanilla.recipe;

import com.saintshr.beyondvanilla.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void initSmelting() {
        // Titanium Ore -> Titanium Ingot
        GameRegistry.addSmelting(
            ModItems.TITANIUM_ORE_ITEM,
            new ItemStack(ModItems.TITANIUM_INGOT),
            0.8F
        );
    }
}
