package net.vrishaangan.mymod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.EventBus;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vrishaangan.mymod.MyMod;

public class DropItem {
    public static final DeferredRegister<Item> ITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, MyMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEM.register("sapphire",
            () -> new Item(new Item.Properties()));
    // This is to register a custom Item named sapphire with the name sapphire
    /* () -> new Item(new Item.Properties()) this is a lambda expression defining how to
    create an instance of the item. Here, it creates a new Item instance with default properties
     */

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEM.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus)
    {
        ITEM.register(eventBus);
    }


}


