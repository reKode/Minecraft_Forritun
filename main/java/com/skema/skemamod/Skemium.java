package com.skema.skemamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Skemium extends Item {
	
	public Skemium(String name) 
	{
		setUnlocalizedName(name);
		this.setTextureName(SkemaMod.MODID + ":" + name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
}
