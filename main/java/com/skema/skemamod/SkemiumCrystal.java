package com.skema.skemamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SkemiumCrystal extends Item {
	
	public SkemiumCrystal(String name) 
	{
		setUnlocalizedName(name);
		this.setTextureName(SkemaMain.MODID + ":" + name);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}
}
