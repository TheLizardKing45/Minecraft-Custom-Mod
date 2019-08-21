package com.mrbengonio.first.items;

import com.mrbengonio.first.First;
import com.mrbengonio.first.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class ItemTestItem extends ItemBase {

	public ItemTestItem(String name, CreativeTabs tab, int maxSize) {
		super(name, tab, maxSize);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));

		if (!worldIn.isRemote) {
			WorldServer worldserver = (WorldServer) worldIn;
			MinecraftServer minecraftserver = worldIn.getMinecraftServer();
			TemplateManager templatemanager = worldserver.getStructureTemplateManager();
			ResourceLocation loc = new ResourceLocation(Reference.MOD_ID, "t1");
			Template template = templatemanager.getTemplate(minecraftserver, loc);
			First.LOGGER.info("=======0=======" + template);
			if (template != null) {
				worldIn.notifyBlockUpdate(pos, iblockstate, iblockstate, 3);
				PlacementSettings placementsettings = (new PlacementSettings()).setMirror(Mirror.NONE)
						.setRotation(Rotation.NONE).setIgnoreEntities(false).setChunk((ChunkPos) null)
						.setReplacedBlock((Block) null).setIgnoreStructureBlock(false);

				First.LOGGER.info("=======1=======" + loc);

				template.addBlocksToWorld(worldIn, pos, placementsettings);

				First.LOGGER.info("========2=======" + pos);
			}
		}

	}

}
