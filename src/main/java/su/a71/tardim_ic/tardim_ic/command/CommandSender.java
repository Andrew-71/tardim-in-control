package su.a71.tardim_ic.tardim_ic.command;

import dan200.computercraft.api.network.IPacketSender;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

public class CommandSender implements IPacketSender {

    private final Player player;
    private final Level level;
    private final BlockPos pos;

    CommandSender(Player player, BlockPos pos) {
        this.player = player;
        this.level = player.level;
        this.pos = pos;
    }

    @NotNull
    @Override
    public Level getLevel() {
        return this.level;
    }

    @NotNull
    @Override
    public Vec3 getPosition() {
        return new Vec3(this.pos.getX(), this.pos.getY(), this.pos.getZ());
    }

    @NotNull
    @Override
    public String getSenderID() {
        return this.player.getName().getString();
    }
}
