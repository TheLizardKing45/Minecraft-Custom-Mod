package com.mrbengonio.first.gui;

import java.text.DecimalFormat;

import org.lwjgl.opengl.GL11;

import com.mrbengonio.first.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class TechStatusBarRenderer extends Gui {

	private final static ResourceLocation overlayBar = new ResourceLocation(Reference.MOD_ID,
			"textures/gui/tech_hud_overlay.png");

	private final static int BAR_WIDTH = 81;
	private final static int BAR_HEIGHT = 9;
	private final static int BAR_SPACING_ABOVE_EXP_BAR = 3; // pixels between the BAR and the Experience Bar below it

	private Minecraft mc;

	public TechStatusBarRenderer(Minecraft mc) {
		this.mc = mc;
	}

	public void renderStatusBar(int screenWidth, int screenHeight) {
		renderHealthBar(screenWidth, screenHeight);
		renderHungerBar(screenWidth, screenHeight);
	}

	public void renderHealthBar(int screenWidth, int screenHeight) {
		World world = mc.world;
		EntityPlayer player = mc.player;

		/* This object draws text using the Minecraft font */
		FontRenderer fr = mc.fontRenderer;

		/* This object inserts commas into number strings */
		DecimalFormat d = new DecimalFormat("#,###");

		/* Saving the current state of OpenGL so that I can restore it when I'm done */
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
		GL11.glPushMatrix();// 0
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		/* This method tells OpenGL to draw with the custom texture */
		mc.renderEngine.bindTexture(overlayBar);

		final int vanillaExpLeftX = screenWidth / 2 - 91; // leftmost edge of the experience bar
		final int vanillaExpTopY = screenHeight - 32 + 3; // top of the experience bar

		// Health
		GL11.glTranslatef(vanillaExpLeftX, vanillaExpTopY - BAR_SPACING_ABOVE_EXP_BAR - BAR_HEIGHT, 0);

		drawTexturedModalRect(0, 0, 0, 0, BAR_WIDTH, BAR_HEIGHT);
		drawTexturedModalRect(0, 0, 0, BAR_HEIGHT, (int) (BAR_WIDTH * (player.getTotalArmorValue() / 20f)), BAR_HEIGHT);
		GL11.glPushMatrix();// 1
		GL11.glTranslatef(1, 1, 0);

		float maxHp = player.getMaxHealth();
		float absorptionAmount = player.getAbsorptionAmount();
		float effectiveHp = player.getHealth() + absorptionAmount;

		GL11.glPushMatrix();// 2
		GL11.glScalef((BAR_WIDTH - 2) * Math.min(1, effectiveHp / maxHp), 1, 1);

		final int NORMAL_TEXTURE_U = BAR_WIDTH; // red texels
		final int REGEN_TEXTURE_U = BAR_WIDTH + 1; // Pink texels
		final int WITHER_TEXTURE_U = BAR_WIDTH + 2; // black texels
		final int HUNGER_TEXTURE_U = BAR_WIDTH + 3; // brown texels
		final int POISON_TEXTURE_U = BAR_WIDTH + 4; // green texels

		if (player.isPotionActive(MobEffects.HUNGER)) {
			drawTexturedModalRect(0, 0, HUNGER_TEXTURE_U, 0, 1, BAR_HEIGHT - 2);
		} else if (player.isPotionActive(MobEffects.WITHER)) {
			drawTexturedModalRect(0, 0, WITHER_TEXTURE_U, 0, 1, BAR_HEIGHT - 2);
		} else if (player.isPotionActive(MobEffects.POISON)) {
			drawTexturedModalRect(0, 0, POISON_TEXTURE_U, 0, 1, BAR_HEIGHT - 2);
		} else if (player.isPotionActive(MobEffects.REGENERATION)) {
			drawTexturedModalRect(0, 0, REGEN_TEXTURE_U, 0, 1, BAR_HEIGHT - 2);
		} else {
			drawTexturedModalRect(0, 0, NORMAL_TEXTURE_U, 0, 1, BAR_HEIGHT - 2);
		}

		GL11.glPopMatrix();
		GL11.glTranslatef(BAR_WIDTH - 3, 1, 0);
		GL11.glPushMatrix();
		GL11.glScalef(0.5f, 0.5f, 1);
		String s = d.format(effectiveHp) + "/" + d.format(maxHp);

		if (absorptionAmount > 0) {
			/* Draw the shadow string */
			fr.drawString(s, -fr.getStringWidth(s) + 1, 2, 0x5A2B00);
			/* Draw the actual string */
			fr.drawString(s, -fr.getStringWidth(s), 1, 0xFFD200);
		} else {
			fr.drawString(s, -fr.getStringWidth(s) + 1, 2, 0x4D0000);
			fr.drawString(s, -fr.getStringWidth(s), 1, 0xFFFFFF);
		}
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		GL11.glPopMatrix();// 0
		GL11.glPopAttrib();
	}

	public void renderHungerBar(int screenWidth, int screenHeight) {
		World world = mc.world;
		EntityPlayer player = mc.player;

		/* This object draws text using the Minecraft font */
		FontRenderer fr = mc.fontRenderer;

		/* This object inserts commas into number strings */
		DecimalFormat d = new DecimalFormat("#,###");

		/* Saving the current state of OpenGL so that I can restore it when I'm done */
		GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
		GL11.glPushMatrix();// 0
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

		/* This method tells OpenGL to draw with the custom texture */
		mc.renderEngine.bindTexture(overlayBar);

		final int vanillaExpRightX = screenWidth / 2 + 10; // Rightmost edge of the experience bar
		final int vanillaExpTopY = screenHeight - 32 + 3; // top of the experience bar

		float food = player.getFoodStats().getFoodLevel();
		float saturation = player.getFoodStats().getSaturationLevel();

		// food
		GL11.glTranslatef(vanillaExpRightX, vanillaExpTopY - BAR_SPACING_ABOVE_EXP_BAR - BAR_HEIGHT, 0);

		drawTexturedModalRect(0, 0, 0, 0, BAR_WIDTH, BAR_HEIGHT);
		drawTexturedModalRect(0, 0, 0, BAR_HEIGHT * 2, (int) (BAR_WIDTH * (saturation / 20)), BAR_HEIGHT);
		GL11.glPushMatrix();// 1
		GL11.glTranslatef(1, 1, 0);

		GL11.glPushMatrix();// 2
		GL11.glScalef((BAR_WIDTH - 2) * Math.min(1, food / 20f), 1, 1);

		final int NORMAL_TEXTURE_U = BAR_WIDTH + 5; // red texels
		final int HUNGER_TEXTURE_U = BAR_WIDTH + 3; // brown texels

		if (player.isPotionActive(MobEffects.HUNGER)) {
			drawTexturedModalRect(0, 0, HUNGER_TEXTURE_U, 0, 1, BAR_HEIGHT - 2);
		} else {
			drawTexturedModalRect(0, 0, NORMAL_TEXTURE_U, 0, 1, BAR_HEIGHT - 2);
		}

		GL11.glPopMatrix();
		GL11.glTranslatef(BAR_WIDTH - 3, 1, 0);
		GL11.glPushMatrix();
		GL11.glScalef(0.5f, 0.5f, 1);
		String s = d.format(food) + "/" + d.format(20);

		fr.drawString(s, -fr.getStringWidth(s) + 1, 2, 0x4D0000);
		fr.drawString(s, -fr.getStringWidth(s), 1, 0xFFFFFF);

		GL11.glPopMatrix();
		GL11.glPopMatrix();
		GL11.glPopMatrix();// 0
		GL11.glPopAttrib();
	}

}