package com.skema.skemamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class SkemiumShovel extends ItemSpade {
	
	public SkemiumShovel(ToolMaterial material, String name) {
		super(material);
		
		setUnlocalizedName(name);
		setTextureName(SkemaMain.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}

}
