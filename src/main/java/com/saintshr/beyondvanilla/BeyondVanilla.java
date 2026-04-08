package com.saintshr.beyondvanilla;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Logger;
import com.saintshr.beyondvanilla.recipe.ModRecipes;
import com.saintshr.beyondvanilla.world.gen.ModWorldGen;

@Mod(
    modid   = BeyondVanilla.MODID,
    name    = BeyondVanilla.NAME,
    version = BeyondVanilla.VERSION
)
public class BeyondVanilla {
    public static final String MODID = "beyondvanilla";
    public static final String NAME = "Beyond Vanilla";
    public static final String VERSION = "0.0.0";

    private static Logger logger;

    public static final CreativeTabs BEYOND_VANILLA_TAB = new ModTab();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Pre-Init Done!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.initSmelting();
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
        logger.info("Init Done!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("Post-Init Done!");
    }
}
