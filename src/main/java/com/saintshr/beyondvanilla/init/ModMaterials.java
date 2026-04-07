package com.saintshr.beyondvanilla.init;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials {
    public static final ToolMaterial TITANIUM_TOOL_MATERIAL = EnumHelper.addToolMaterial(
        "TITANIUM",
        3,
        1800,
        7.0F,
        2.5F,
        16
    );

    public static final Material TITANIUM_ORE_MATERIAL = new Material(MapColor.BLUE_STAINED_HARDENED_CLAY) {
        @Override
        public boolean isToolNotRequired() {
            return false;
        }
    };
}