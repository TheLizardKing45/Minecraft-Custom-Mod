package com.mrbengonio.first.renderer.layers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class LayerLukasdragonHead implements LayerRenderer<AbstractClientPlayer> {

	private final RenderPlayer playerRenderer;
	private final ModelBase slimeModel = new ModelPlayer(0, false);

	public LayerLukasdragonHead(RenderPlayer playerRendererIn) {
		this.playerRenderer = playerRendererIn;
	}

	public void doRenderLayer(AbstractClientPlayer entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if ("lukasdragon".equals(entitylivingbaseIn.getName())
				&& entitylivingbaseIn.isWearing(EnumPlayerModelParts.CAPE) && !entitylivingbaseIn.isInvisible()) {

			GlStateManager.pushMatrix();
			if (entitylivingbaseIn.isSneaking()) {
				GlStateManager.translate(0.0F, 0.2F, 0.0F);
			}
			this.playerRenderer.getMainModel().bipedHead.postRender(0.0625F);
			float f = 0.625F;
			GlStateManager.translate(0.0F, -0.28F, 0.0F);
			GlStateManager.scale(0.7F, -0.7F, -0.7F);
			Minecraft.getMinecraft().getItemRenderer().renderItem(entitylivingbaseIn, new ItemStack(Blocks.GLASS, 1),
					ItemCameraTransforms.TransformType.HEAD);
			GlStateManager.popMatrix();
		}
	}

	public boolean shouldCombineTextures() {
		return true;
	}
}