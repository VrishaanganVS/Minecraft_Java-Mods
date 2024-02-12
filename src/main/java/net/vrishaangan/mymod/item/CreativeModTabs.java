package net.vrishaangan.mymod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.vrishaangan.mymod.MyMod;

public class CreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB    =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_TAB = CREATIVE_MODE_TAB.register("mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DropItem.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(DropItem.SAPPHIRE.get());
                        output.accept(DropItem.RAW_SAPPHIRE.get());
                        output.accept(Items.DARK_OAK_BOAT);
                    })
                    .build());

/* the above code is to register the creative mod tab and the respective code to add our modded itmes into the
* the tab and we can add vanilla items also these don require get() look at this a little more depper*/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
/*we also need to register the creative mode tab also a*/

