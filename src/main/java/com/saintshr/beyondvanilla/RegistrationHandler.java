package com.saintshr.beyondvanilla;

import com.saintshr.beyondvanilla.item.TitaniumSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(
    modid = BeyondVanilla.MODID
)
public class RegistrationHandler {
    @SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
            // --- Titanium Sword ---
			new TitaniumSword()
                .setRegistryName(BeyondVanilla.MODID, "titanium_sword")
                .setTranslationKey(BeyondVanilla.MODID + "." + "titanium_sword")
                .setCreativeTab(CreativeTabs.COMBAT)
		};

		event.getRegistry().registerAll(items);
	}
}
