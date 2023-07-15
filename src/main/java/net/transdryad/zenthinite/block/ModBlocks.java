package net.transdryad.zenthinite.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.transdryad.zenthinite.ZenthiniteMod;

public class ModBlocks {

    public static final Block GEM_BLOCK = registerBlock("zenthinite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).mapColor(MapColor.RED).pistonBehavior(PistonBehavior.IGNORE).sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_GEM_BLOCK = registerBlock("raw_zenthinite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).mapColor(MapColor.RED).pistonBehavior(PistonBehavior.IGNORE).sounds(BlockSoundGroup.METAL)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ZenthiniteMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ZenthiniteMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ZenthiniteMod.LOGGER.info("Registering Mod BLocks For " + ZenthiniteMod.MOD_ID);

    }
}
