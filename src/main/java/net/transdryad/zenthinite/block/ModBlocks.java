package net.transdryad.zenthinite.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.transdryad.zenthinite.ZenthiniteMod;

public class ModBlocks {

    public static final Block GEM_BLOCK = registerBlock("zenthinite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).mapColor(MapColor.RED).pistonBehavior(PistonBehavior.IGNORE).sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_GEM_BLOCK = registerBlock("raw_zenthinite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).mapColor(MapColor.RED).pistonBehavior(PistonBehavior.IGNORE).sounds(BlockSoundGroup.METAL)));

    public static final Block ZENTHINITE_ORE = registerBlock("zenthinite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).strength(5.0f, 5.0f), UniformIntProvider.create(6, 10)));
    public static final Block DEEPSLATE_ZENTHINITE_ORE = registerBlock("deepslate_zenthinite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).mapColor(MapColor.DEEPSLATE_GRAY).strength(6.0f, 7.0f), UniformIntProvider.create(6, 10)));
    public static final Block NETHER_ZENTHINITE_ORE = registerBlock("nether_zenthinite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).mapColor(MapColor.DARK_RED).strength(5.0f, 5.0f), UniformIntProvider.create(6, 10)));
    public static final Block END_ZENTHINITE_ORE = registerBlock("end_stone_zenthinite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).mapColor(MapColor.PALE_YELLOW).strength(5.0f, 12.0f), UniformIntProvider.create(6, 10)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ZenthiniteMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ZenthiniteMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ZenthiniteMod.LOGGER.info("Registering Mod Blocks For " + ZenthiniteMod.MOD_ID);

    }
}
