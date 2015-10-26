package com.skema.skemamod;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SkemaMain.MODID, version = SkemaMain.VERSION)
public class SkemaMain
{
    public static final String MODID = "skemamod";
    public static final String VERSION = "1.0";
    
    /*********** BREYTUR ***********/
    
    //Efni
    public static Item skemiumCrystal;
    ToolMaterial skemium = EnumHelper.addToolMaterial("skemium", 3, 1600, 10.0F, 3.0F, 10);
    
    //Items
    	//Weapons
    	public static Item skemium_sword;
    	//Tools
    	public static Item skemium_shovel;
    	public static Item skemium_pickaxe;
    	public static Item skemium_axe;
    	public static Item skemium_hoe;
    
    //Blocks
    
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	/***** SKEMIUM *****/
    	skemiumCrystal = new SkemiumCrystal("Skemium");
    	GameRegistry.registerItem(skemiumCrystal, "Skemium");
    	
    	/***** SKEMIUM SWORD *****/
    	skemium_sword = new SkemiumSword(skemium, "SkemiumSword");
    	GameRegistry.registerItem(skemium_sword, "SkemiumSword");
    	
    	/***** SKEMIUM SHOWEL *****/
    	skemium_shovel = new SkemiumShovel(skemium, "SkemiumShovel");
    	GameRegistry.registerItem(skemium_shovel, "SkemiumShovel");
    	
    	/***** SKEMIUM PICKAXE *****/
    	skemium_pickaxe = new SkemiumPickaxe(skemium, "SkemiumPickaxe");
    	GameRegistry.registerItem(skemium_pickaxe, "SkemiumPickaxe");
    	
    	/***** SKEMIUM AXE *****/
    	skemium_axe = new SkemiumAxe(skemium, "SkemiumAxe");
    	GameRegistry.registerItem(skemium_axe, "SkemiumAxe");
    	
    	/***** SKEMIUM HOE *****/
    	skemium_hoe = new SkemiumHoe(skemium, "SkemiumHoe");
    	GameRegistry.registerItem(skemium_hoe, "SkemiumHoe");
    	
    	//SKEMIUM SWORD RECIPE
    	GameRegistry.addRecipe(new ItemStack(skemium_sword),
    			" X ",
    			" X ",
    			" I ",
    			'X', skemiumCrystal, 'I', Items.stick );
    	
    	//SKEMIUM SHOVEL RECIPE
    	GameRegistry.addRecipe(new ItemStack(skemium_shovel),
    			" X ",
    			" I ",
    			" I ",
    			'X', skemiumCrystal, 'I', Items.stick );
    	
    	//SKEMIUM PICKAXE RECIPE
    	GameRegistry.addRecipe(new ItemStack(skemium_pickaxe),
    			"XXX",
    			" I ",
    			" I ",
    			'X', skemiumCrystal, 'I', Items.stick );
    	
    	//SKEMIUM AXE RECIPE
    	GameRegistry.addRecipe(new ItemStack(skemium_axe),
    			"XX ",
    			"XI ",
    			" I ",
    			'X', skemiumCrystal, 'I', Items.stick );
    	
    	//SKEMIUM HOE RECIPE (LEFT)
    	GameRegistry.addRecipe(new ItemStack(skemium_hoe),
    			"XX ",
    			" I ",
    			" I ",
    			'X', skemiumCrystal, 'I', Items.stick );
    	
    	//SKEMIUM HOE RECIPE (RIGHT)
    	GameRegistry.addRecipe(new ItemStack(skemium_hoe),
    			" XX",
    			" I ",
    			" I ",
    			'X', skemiumCrystal, 'I', Items.stick );
    	
    	//Skemgen skemium_gen = new Skemgen();
    	//GameRegistry.registerWorldGenerator(skemium_gen, 0);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
}
