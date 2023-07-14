package net.transdryad.zenthinite.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.transdryad.zenthinite.ZenthiniteMod;

public class ModItems {

    public static final Item GEM = registerItem("gem", new Item(new FabricItemSettings()));

    public static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(GEM);
    }

    public static Item  registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ZenthiniteMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ZenthiniteMod.LOGGER.info("Registering Mod Items for " + ZenthiniteMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
