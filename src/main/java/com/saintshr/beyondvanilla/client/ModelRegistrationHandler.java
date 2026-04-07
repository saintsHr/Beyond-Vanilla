package com.saintshr.beyondvanilla.client;

import com.saintshr.beyondvanilla.BeyondVanilla;
import com.saintshr.beyondvanilla.init.ModBlocks;
import com.saintshr.beyondvanilla.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(
    value = Side.CLIENT,
    modid = BeyondVanilla.MODID
)
public class ModelRegistrationHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.TITANIUM_SWORD, 0);
		registerModel(ModItems.TITANIUM_PICKAXE, 0);
		registerModel(Item.getItemFromBlock(ModBlocks.TITANIUM_ORE_BLOCK), 0);
	}

	private static void registerModel(Item item, int meta) {
		if (item != null) {
			ModelLoader.setCustomModelResourceLocation(
				item,
				meta,
				new ModelResourceLocation(
					item.getRegistryName(),
					"inventory"
				)
			);
		}
	}
}