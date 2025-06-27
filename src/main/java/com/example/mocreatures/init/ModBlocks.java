package com.example.mocreatures.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.RegistryBuilder;
import net.neoforged.neoforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, "mocreatures");

    public static final RegistryObject<Block> FIRESTONE = BLOCKS.register("firestone",
        () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(3.0F, 6.0F).sound(SoundType.STONE)));

    public static void register() {
        BLOCKS.register(RegisterEvent.EVENT_BUS);
    }
}