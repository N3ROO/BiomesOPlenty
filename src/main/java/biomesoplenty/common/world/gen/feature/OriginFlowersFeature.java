/*******************************************************************************
 * Copyright 2014-2019, the Biomes O' Plenty Team
 *
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 *
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/
package biomesoplenty.common.world.gen.feature;

import biomesoplenty.api.block.BOPBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;

public class OriginFlowersFeature extends DefaultFlowersFeatureNoConfig
{
	@Override
	public BlockState getRandomFlower(Random p_202355_1_, BlockPos p_202355_2_, NoFeatureConfig config)
	{
		return p_202355_1_.nextFloat() > 0.6666667F ? Blocks.DANDELION.defaultBlockState() : BOPBlocks.rose.defaultBlockState();
	}
}
