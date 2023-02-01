package su.a71.tardim_ic.tardim_ic.redsone_input;

import com.swdteam.tileentity.TileEntityBaseTardimPanel;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;

import com.swdteam.common.init.TRDTiles;

import su.a71.tardim_ic.tardim_ic.Registration;
import com.swdteam.tileentity.TileEntityTardimScanner;
import com.swdteam.common.block.BlockTardimScanner;


public class RedstoneInputTileEntity extends TileEntityBaseTardimPanel {
    public RedstoneInputTileEntity(BlockPos pos, BlockState state) {
        super(Registration.REDSTONE_TARDIM_INPUT_TILEENTITY.get(), pos, state);
    }


    public BlockPos getPos() {
        return this.worldPosition;
    }
}
