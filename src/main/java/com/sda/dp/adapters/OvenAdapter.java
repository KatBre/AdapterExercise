package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.Oven;

public class OvenAdapter implements KitchenDevice {
    private Oven oven = new Oven();

    public OvenAdapter(Oven oven) {
        this.oven = oven;
    }

    public void turnDeviceOn() {

    }
}
