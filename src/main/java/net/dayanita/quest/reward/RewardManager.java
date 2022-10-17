package net.dayanita.quest.reward.extra;

import lombok.Getter;
import net.dayanita.quest.QuestPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class RewardManager implements Listener {

    @Getter public static RewardManager instance;


    public RewardManager(QuestPlugin plugin) {
        instance = this;

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }



}
