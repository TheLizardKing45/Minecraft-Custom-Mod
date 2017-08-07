package com.mrbengonio.first.init;

import net.minecraft.stats.Achievement;

public class ModAchievements {

	public static final Achievement achievementLaunch = new Achievement("achievement.launch", "launch_achievement", 0,
			0, ModItems.kreuthilingot, (Achievement) null);

	public static final Achievement achievementMiracle = new Achievement("achievement.miracle", "miracle_achievement",
			2, 1, ModItems.miraclerecord, achievementLaunch);

	public static final Achievement achievementObsidianShard = new Achievement("achievement.oshard",
			"obsidian_achievement", 2, -2, ModItems.obsidianshard, achievementLaunch);

	public static final Achievement achievementTechAlloy = new Achievement("achievement.talloy",
			"techalloy_achievement", 4, -2, ModItems.TechAlloy, achievementObsidianShard);

	public static final Achievement achievementTHelm = new Achievement("achievement.thelm", "techhelm_achievement", 6,
			-2, ModItems.tech_helmet, achievementTechAlloy);

}
