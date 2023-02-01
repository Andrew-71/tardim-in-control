package su.a71.tardim_ic.tardim_ic.digital_interface;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.NotNull;
import su.a71.tardim_ic.tardim_ic.Registration;

import javax.annotation.Nullable;


public class DigitalInterfaceBlock extends Block implements EntityBlock {

    public DigitalInterfaceBlock() {
        super(Properties.of(Material.METAL).strength(2, 4).noOcclusion());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return Registration.DIGITAL_TARDIM_INTERFACE_TILEENTITY.get().create(pos, state);
    }
}
