package com.enderbane.testmod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHelper
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);

        try
        {
            configuration.load();

            boolean configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "This is an example configuration value").getBoolean(true);
        }
        catch(Exception e)
        {

        }
        finally
        {
            configuration.save();
        }
    }
}
