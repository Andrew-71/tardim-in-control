package su.a71.tardim_ic.tardim_ic.sonic;

import net.minecraft.world.item.Item;

import com.swdteam.tardim.TardimData;
import com.swdteam.tardim.TardimManager;

import com.swdteam.client.gui.GuiCommandScreen;

public class SonicProbe extends Item {
    private TardimData tardim;
    public SonicProbe(Properties properties) {
        super(properties.stacksTo(1));
    }

    public void setTardim(TardimData tardim) {
        this.tardim = tardim;
    }

    // Add tile entity

}
