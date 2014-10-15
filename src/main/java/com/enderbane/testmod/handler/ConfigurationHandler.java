package com.enderbane.testmod.handler;

import com.enderbane.testmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile)
    {
        if(configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onCongifurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MODID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("confivValue", Configuration.CATEGORY_GENERAL, false, "this is  an example value");

        if(configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
