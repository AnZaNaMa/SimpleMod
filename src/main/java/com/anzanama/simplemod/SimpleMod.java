package com.anzanama.simplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * SimpleMod - Main Class
 *
 * This is the main class for the entire mod. It handles registering your mod as a mod with forge, handling all the
 * different things that need to get loaded when the game loads, and more! It also holds instances to things, like
 * your creative tab (Doesn't have to, but this is a good place for it), your mod instance (don't worry about what that
 * is if you don't already know).
 *
 * @author AnZaNaMa - Andrew Graber
 * @version 03/05/2017
 */

/**
 * The @Mod annotation can take other options as well, but we don't need any of them currently. We only need the modid,
 * which you will see time and time again, the name, which is what will be displayed to the player in game, and the
 * version of the mod. It's very important that the modid be all lower-case with no spaces in it. This is because it's
 * used in places all over the game and there are some constructs that make it impossible to use an uppercase modid. You
 * may or may not be able to use symbols and strange characters in your modid, but I would HIGHLY recommend against it.
 * It will only cause complication in the future, and nobody is going to see your modid anyway.
 */
@Mod(modid = SimpleMod.MODID, name = SimpleMod.MODNAME, version = SimpleMod.VERSION)
public class SimpleMod {
    public static final String MODID = "simplemod"; //The "modid" for your mod. Should be something unique, as well as all lower case and no spaces
    public static final String MODNAME = "Simple Mod"; //The "name" for your mod. This is what people will see in game. You can format it however you want.
    public static final String VERSION = "1.0"; //The version of your mod. Doesn't need a specific format, since it's just a string.

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        System.out.println("I'm in the Pre-Initialization Stage!");
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        System.out.println("Now I've made it all the way to Initialization!");
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        System.out.println("Finally, I'm in the Post-Initialization Stage of loading. We're almost done loading the game!");
    }

}