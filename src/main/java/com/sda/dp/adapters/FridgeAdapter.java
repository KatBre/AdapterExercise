package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.Fridge;

public class FridgeAdapter implements KitchenDevice {
    private Fridge fridge = new Fridge();

    public FridgeAdapter(Fridge fridge) {
        this.fridge = fridge;
    }

    public void turnDeviceOn() {

    }
}
