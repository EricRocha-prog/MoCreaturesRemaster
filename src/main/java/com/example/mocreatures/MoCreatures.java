package com.example.mocreatures;

import net.neoforged.api.ModInitializer;
import net.neoforged.api.fml.common.Mod;
import com.example.mocreatures.init.ModBlocks;

@Mod("mocreatures")
public class MoCreatures implements ModInitializer {
    @Override
    public void onInitialize() {
        ModBlocks.register();
    }
}