package com.skema.skemamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class SkemiumPickaxe extends ItemPickaxe {
	
	public SkemiumPickaxe(ToolMaterial material, String name) {
		super(material);
		
		setUnlocalizedName(name);
		setTextureName(SkemaMain.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
