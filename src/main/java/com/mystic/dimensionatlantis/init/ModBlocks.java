package com.mystic.dimensionatlantis.init;

import java.util.ArrayList;
import java.util.List;
import com.mystic.dimensionatlantis.blocks.AquamarineOre;
import com.mystic.dimensionatlantis.blocks.BlockAquamarine;
import com.mystic.dimensionatlantis.blocks.BlockBase;
import com.mystic.dimensionatlantis.blocks.OceanLantern;
import com.mystic.dimensionatlantis.blocks.portal.AtlanteanCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ANCIENT_SPRUCE_WOOD_MOSS = new BlockBase("ancient_spruce_wood_moss", Material.WOOD);
	public static final Block ANCIENT_ACACIA_WOOD_MOSS = new BlockBase("ancient_acacia_wood_moss", Material.WOOD);
	public static final Block ANCIENT_BIRCH_WOOD_MOSS = new BlockBase("ancient_birch_wood_moss", Material.WOOD);
	public static final Block ANCIENT_DARK_OAK_WOOD_MOSS = new BlockBase("ancient_dark_oak_wood_moss", Material.WOOD);
	public static final Block ANCIENT_JUNGLE_WOOD_MOSS = new BlockBase("ancient_jungle_wood_moss", Material.WOOD);
	public static final Block ANCIENT_OAK_WOOD_MOSS = new BlockBase("ancient_oak_wood_moss", Material.WOOD);
	public static final Block AQUAMARINE_ORE = new AquamarineOre("aquamarine_ore", Material.ROCK);
	public static final Block ATLANTEAN_CORE = new AtlanteanCore("atlantean_core", Material.GLASS);
	public static final Block OCEAN_LANTERN = new OceanLantern("ocean_lantern", Material.IRON);
	public static final Block BLOCK_OF_AQUAMARINE = new BlockAquamarine("block_of_aquamarine", Material.IRON);
}
