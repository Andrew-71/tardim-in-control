package su.a71.tardim_ic.tardim_ic.command;

// This will be added whenever I manage to convince TARDIM devs to make CommandManager.register public

import com.mojang.brigadier.Command;
import com.swdteam.common.command.tardim.CommandTardimBase;
import com.swdteam.common.command.tardim.ICommand;
import com.swdteam.tardim.TardimData;
import com.swdteam.tardim.TardimManager;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;

import dan200.computercraft.api.network.Packet;
import dan200.computercraft.api.ComputerCraftAPI;

import static com.swdteam.common.command.tardim.CommandTardimBase.sendResponse;

public class CommandModemTransmit implements ICommand {
    @Override
    public void execute(String[] args, Player player, BlockPos pos, CommandTardimBase.CommandSource source) {
        if (args.length == 3) {
            TardimData data = TardimManager.getFromPos(pos);
            if (data != null) {
                if (data.hasPermission(player)) {
                    try {
                        int sendChannel = Integer.parseInt(args[0]);
                        int replyChannel = Integer.parseInt(args[1]);
                        String message = args[2];
                        boolean allDimensions = Boolean.parseBoolean(args[3]) || args[3].equals("true");

                        if (data.getTravelLocation() == null) {
                            data.setTravelLocation(new TardimData.Location(data.getCurrentLocation()));
                        }

                        if (allDimensions)
                        {
                            ComputerCraftAPI.getWirelessNetwork().transmitInterdimensional(new Packet(sendChannel, replyChannel, message, new CommandSender(player, data.getTravelLocation().getPos())));
                        }
                        else {
                            ComputerCraftAPI.getWirelessNetwork().transmitSameDimension(new Packet(sendChannel, replyChannel, message,
                                    new CommandSender(player, data.getTravelLocation().getPos())), 300);
                        }
                        sendResponse(player, "Sent modem message", CommandTardimBase.ResponseType.COMPLETE, source);
                    } catch (Exception var9) {
                        sendResponse(player, "Invalid coordinates", CommandTardimBase.ResponseType.FAIL, source);
                    }
                } else {
                    sendResponse(player, "You do not have permission", CommandTardimBase.ResponseType.FAIL, source);
                }
            }
        } else {
            sendResponse(player, this.getUsage(), CommandTardimBase.ResponseType.FAIL, source);
        }
    }

    @Override
    public String getCommandName() {
        return "ccModemTransmit";
    }

    @Override
    public String getUsage() {
        return "ccModemTransmit <channel: int> <replyChannel: int> <message: string> <all_dimension: true/false>";
    }

    @Override
    public CommandTardimBase.CommandSource allowedSource() {
        return CommandTardimBase.CommandSource.BOTH;
    }
}