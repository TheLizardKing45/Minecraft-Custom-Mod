package com.mrbengonio.first.items.records;

import com.mrbengonio.first.Reference;
import com.mrbengonio.first.init.ModAchievements;

import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGenericRecord extends ItemRecord {

	public final String title;

	public ItemGenericRecord(String name, SoundEvent song, String title, String author) {
		super(title, song);
		this.title = author + " - " + title;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getRecordNameLocal() {
		return title;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation(Reference.MOD_ID, name);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getBlock() == Blocks.JUKEBOX
				&& !((Boolean) iblockstate.getValue(BlockJukebox.HAS_RECORD)).booleanValue()) {
			if (!worldIn.isRemote) {
				ItemStack itemstack = player.getHeldItem(hand);
				((BlockJukebox) Blocks.JUKEBOX).insertRecord(worldIn, pos, iblockstate, itemstack);
				worldIn.playEvent((EntityPlayer) null, 1010, pos, Item.getIdFromItem(this));
				itemstack.shrink(1);
				player.addStat(StatList.RECORD_PLAYED);
				player.addStat(ModAchievements.achievementMiracle, 1);
			}

			return EnumActionResult.SUCCESS;
		} else {
			return EnumActionResult.PASS;
		}
	}

}
