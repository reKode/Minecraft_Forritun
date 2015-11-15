package com.skema.skemamod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SkemiumRock extends Block {

	public Item drop;
	
	public SkemiumRock(String name, Item drop) {
		super(Material.rock);
		
		this.drop = drop;
		
		setBlockName(name);
		setBlockTextureName(SkemaMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeMetal);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
	}
	
	public Item getItemDropped(int meta, Random random, int fortune) {
		return this.drop;
	}
}
