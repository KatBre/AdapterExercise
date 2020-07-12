import com.sda.dp.KitchenDevice;
import com.sda.dp.adapters.CoffeMachineAdapter;
import com.sda.dp.adapters.FridgeAdapter;
import com.sda.dp.adapters.OvenAdapter;
import com.sda.dp.devices.CoffeMachine;
import com.sda.dp.devices.Fridge;
import com.sda.dp.devices.Oven;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KitchenDevice> kitchenDevices = new ArrayList<KitchenDevice>();
        kitchenDevices.add(new CoffeMachineAdapter(new CoffeMachine()));
        kitchenDevices.add(new FridgeAdapter(new Fridge()));
        kitchenDevices.add(new OvenAdapter(new Oven()));

        turnAllDevicesOff(kitchenDevices);
    }

    private static void turnAllDevicesOff(List<KitchenDevice> kitchenDevices) {
        for (KitchenDevice kitchenDevice: kitchenDevices) {
            kitchenDevice.turnDeviceOn();

        }
    }
}