package com.saintshr.beyondvanilla;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import org.apache.logging.log4j.Logger;

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

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        logger.info("Pre-Init Done!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Init Done!");
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event) {
        logger.info("Post-Init Done!");
    }
}
