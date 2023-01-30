package su.a71.tardim_ic.tardim_ic;

import com.google.common.collect.Sets;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Registration {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TardimInControl.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TardimInControl.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TardimInControl.MODID);

    public static final CreativeModeTab TARDIM_IC_TAB = new CreativeModeTab("tardim_ic") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Registration.DIGITAL_TARDIM_INTERFACE.get());
        }
    };

    // Blocks
    public static final RegistryObject<Block> DIGITAL_TARDIM_INTERFACE = register("digital_tardim_interface", DigitalInterfaceBlock::new);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(TARDIM_IC_TAB)));
        return registryObject;
    }

    // Tile Entities
    public static final RegistryObject<BlockEntityType<DigitalInterfaceTileEntity>> DIGITAL_TARDIM_INTERFACE_TILEENTITY = Registration.BLOCK_ENTITIES.register("digital_tardim_interface", () -> new BlockEntityType<>(DigitalInterfaceTileEntity::new, Sets.newHashSet(DIGITAL_TARDIM_INTERFACE.get()), null));

    // Register our stuff
    public static void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        BLOCK_ENTITIES.register(modEventBus);
    }
}