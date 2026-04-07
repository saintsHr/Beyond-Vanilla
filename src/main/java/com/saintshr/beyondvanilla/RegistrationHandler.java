package com.saintshr.beyondvanilla;

import com.saintshr.beyondvanilla.init.ModBlocks;
import com.saintshr.beyondvanilla.init.ModItems;
import com.saintshr.beyondvanilla.init.ModMaterials;
import com.saintshr.beyondvanilla.init.ModNames;
import com.saintshr.beyondvanilla.item.TitaniumIngot;
import com.saintshr.beyondvanilla.item.TitaniumPickaxe;
import com.saintshr.beyondvanilla.item.TitaniumSword;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = BeyondVanilla.MODID)
public class RegistrationHandler {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.TITANIUM_ORE_BLOCK = new Block(ModMaterials.TITANIUM_ORE_MATERIAL)
            .setHardness(4.0f)
            .setResistance(7.0f)
            .setCreativeTab(BeyondVanilla.BEYOND_VANILLA_TAB)
            .setRegistryName(BeyondVanilla.MODID, ModNames.TITANIUM_ORE_BLOCK)
            .setTranslationKey(BeyondVanilla.MODID + "." + ModNames.TITANIUM_ORE_BLOCK);
            ModBlocks.TITANIUM_ORE_BLOCK.setHarvestLevel("pickaxe", 2);
        event.getRegistry().register(ModBlocks.TITANIUM_ORE_BLOCK);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // --- Items ---
        ModItems.TITANIUM_SWORD = new TitaniumSword()
            .setRegistryName(BeyondVanilla.MODID, ModNames.TITANIUM_SWORD)
            .setTranslationKey(BeyondVanilla.MODID + "." + ModNames.TITANIUM_SWORD)
            .setCreativeTab(BeyondVanilla.BEYOND_VANILLA_TAB);
        event.getRegistry().register(ModItems.TITANIUM_SWORD);

        ModItems.TITANIUM_PICKAXE = new TitaniumPickaxe()
            .setRegistryName(BeyondVanilla.MODID, ModNames.TITANIUM_PICKAXE)
            .setTranslationKey(BeyondVanilla.MODID + "." + ModNames.TITANIUM_PICKAXE)
            .setCreativeTab(BeyondVanilla.BEYOND_VANILLA_TAB);
        event.getRegistry().register(ModItems.TITANIUM_PICKAXE);

        ModItems.TITANIUM_INGOT = new TitaniumIngot()
            .setRegistryName(BeyondVanilla.MODID, ModNames.TITANIUM_INGOT)
            .setTranslationKey(BeyondVanilla.MODID + "." + ModNames.TITANIUM_INGOT)
            .setCreativeTab(BeyondVanilla.BEYOND_VANILLA_TAB);
        event.getRegistry().register(ModItems.TITANIUM_INGOT);

        // --- ItemBlocks ---
        ModItems.TITANIUM_ORE_ITEM = new ItemBlock(ModBlocks.TITANIUM_ORE_BLOCK)
            .setRegistryName(BeyondVanilla.MODID, ModNames.TITANIUM_ORE_BLOCK)
            .setTranslationKey(BeyondVanilla.MODID + "." + ModNames.TITANIUM_ORE_BLOCK)
            .setCreativeTab(BeyondVanilla.BEYOND_VANILLA_TAB);
        event.getRegistry().register(ModItems.TITANIUM_ORE_ITEM);
    }
}