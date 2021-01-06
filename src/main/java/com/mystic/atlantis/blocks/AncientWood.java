package com.mystic.atlantis.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;

public class AncientWood extends Block {

    public AncientWood(Properties properties) {
        super(properties
                .sound(SoundType.WOOD)
                .harvestLevel(2)
                .harvestTool(ToolType.AXE)
                .setRequiresTool()
                .hardnessAndResistance(3.0F, 6.0F));

    }
}
