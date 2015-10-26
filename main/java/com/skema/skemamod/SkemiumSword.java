package com.skema.skemamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SkemiumSword extends ItemSword {
	
	public SkemiumSword(ToolMaterial material, String name) {
		super(material);
		
		setUnlocalizedName(name);
		setTextureName(SkemaMain.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabCombat);
	}
}
