package net.mohsenemx.creativecommand.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mohsenemx.creativecommand.CreativeCommand;

public class ModItemGroups {
    public static final ItemGroup COMMAND_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreativeCommand.MOD_ID, "creativecommand"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.creativecommand"))
                    .icon(() -> new ItemStack(Items.COMMAND_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(Items.COMMAND_BLOCK);
                        entries.add(Items.REPEATING_COMMAND_BLOCK);
                        entries.add(Items.CHAIN_COMMAND_BLOCK);
                        entries.add(Items.COMMAND_BLOCK_MINECART);
                        entries.add(Items.BARRIER);
                        entries.add(Items.STRUCTURE_VOID);
                        entries.add(Items.STRUCTURE_BLOCK);
                        entries.add(Items.JIGSAW);

                    }).build());

    public static void registerItemGroups() {
        CreativeCommand.LOGGER.info("Registering Item Groups for " + CreativeCommand.MOD_ID);
    }
}
