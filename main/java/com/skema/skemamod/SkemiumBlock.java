package com.skema.skemamod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SkemiumBlock extends Block {

	public SkemiumBlock(String name) {
		super(Material.rock);
		
		setBlockName(name);
		setBlockTextureName(SkemaMod.MODID + ":" + name);
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeMetal);
		setHardness(2F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
		
		//GlowStone er með sömu ljósstillingu og þessi kubbur!
		setLightLevel(1.0F);
	}

}
