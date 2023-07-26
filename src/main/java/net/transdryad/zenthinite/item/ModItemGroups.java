package net.transdryad.zenthinite.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.transdryad.zenthinite.ZenthiniteMod;
import net.transdryad.zenthinite.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup ZENTHINITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ZenthiniteMod.MOD_ID, "zenthinite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.zenthinite"))
                    .icon(() -> new ItemStack(ModItems.GEM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GEM);
                        entries.add(ModItems.RAW_GEM);
                        entries.add(ModItems.METAL_DETECTOR);

                        entries.add(ModBlocks.GEM_BLOCK);
                        entries.add(ModBlocks.RAW_GEM_BLOCK);

                        entries.add(ModBlocks.ZENTHINITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ZENTHINITE_ORE);
                        entries.add(ModBlocks.NETHER_ZENTHINITE_ORE);
                        entries.add(ModBlocks.END_ZENTHINITE_ORE);

                    }).build());

    public static void registerItemGroups() {
        ZenthiniteMod.LOGGER.info("Registering Item Groups for " + ZenthiniteMod.MOD_ID);


    }
}
