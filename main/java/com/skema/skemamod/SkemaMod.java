package com.skema.skemamod;

import net.minecraft.block.Block;
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

@Mod(modid = SkemaMod.MODID, version = SkemaMod.VERSION)
public class SkemaMod
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
		public static Block skemiumRock;
		public static Block skemiumBlock;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	//SKEMIUM (Item)
    	skemiumCrystal = new Skemium("Skemium");
    	GameRegistry.registerItem(skemiumCrystal, "Skemium");
    	
    	//SKEMIUM SWORD (Item)
    	skemium_sword = new SkemiumSword(skemium, "SkemiumSword");
    	GameRegistry.registerItem(skemium_sword, "SkemiumSword");
    	
    	//SKEMIUM SHOWEL (Item)
    	skemium_shovel = new SkemiumShovel(skemium, "SkemiumShovel");
    	GameRegistry.registerItem(skemium_shovel, "SkemiumShovel");
    	
    	//SKEMIUM PICKAXE (Item)
    	skemium_pickaxe = new SkemiumPickaxe(skemium, "SkemiumPickaxe");
    	GameRegistry.registerItem(skemium_pickaxe, "SkemiumPickaxe");
    	
    	//SKEMIUM AXE (Item)
    	skemium_axe = new SkemiumAxe(skemium, "SkemiumAxe");
    	GameRegistry.registerItem(skemium_axe, "SkemiumAxe");
    	
    	//SKEMIUM HOE (Item)
    	skemium_hoe = new SkemiumHoe(skemium, "SkemiumHoe");
    	GameRegistry.registerItem(skemium_hoe, "SkemiumHoe");
    	
    	//SKEMIUM ROCK  (Block)
    	skemiumRock = new SkemiumRock("SkemiumRock", skemiumCrystal);
    	GameRegistry.registerBlock(skemiumRock, "SkemiumRock");
    	
    	//SKEMIUM BLOCK (block)
    	skemiumBlock = new SkemiumBlock("SkemiumBlock");
    	GameRegistry.registerBlock(skemiumBlock, "SkemiumBlock");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
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
    	
    	//SKEMIUM BLOCK
    	GameRegistry.addRecipe(new ItemStack(skemiumBlock),
    			"SSS",
    			"SSS",
    			"SSS",
    			'S', skemiumCrystal);
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(SkemaMod.skemiumCrystal, 9),
    			SkemaMod.skemiumBlock
    			);
    }
}
