package com.mrbengonio.first.init;

import net.minecraft.stats.Achievement;

public class ModAchievements {

	public static final Achievement achievementLaunch = new Achievement("achievement.launch", "launch_achievement", 0,
			0, ModItems.kreuthilingot, (Achievement) null);

	public static final Achievement achievementMiracle = new Achievement("achievement.miracle", "miracle_achievement",
			2, 1, ModItems.miraclerecord, achievementLaunch);

	public static final Achievement achievementObsidianShard = new Achievement("achievement.oshard",
			"obsidian_achievement", 2, 0, ModItems.obsidianshard, achievementLaunch);

}
