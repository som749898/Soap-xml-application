package com.example.iserveudevices.repository;

import in.iserveu.com.devices.MicroATM;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MicroATM_device_repo {
    private static Map<String, MicroATM> microATMMap = new HashMap<>();

    public MicroATM_device_repo() {
        initData();
    }

    private void initData() {
        MicroATM microATM = new MicroATM();
        microATM.setDeviceId("micro-atm-PAX D180");
        microATM.setDeviceName("PAX D180");
        microATMMap.put(microATM.getDeviceName(), microATM);

        microATM.setDeviceId("micr0-atm-Morfun MP63");
        microATM.setDeviceName("Morfun MP63");
        microATMMap.put(microATM.getDeviceName(), microATM);

        microATM.setDeviceId("micro-atm-PAX A910");
        microATM.setDeviceName("PAX A910");
        microATMMap.put(microATM.getDeviceName(), microATM);

        microATM.setDeviceId("micro-atm-Wiseasy P3F1");
        microATM.setDeviceName("Wiseasy P3F1");
        microATMMap.put(microATM.getDeviceName(), microATM);
    }

    public MicroATM findMicroATM(String name){
        return microATMMap.get(name);
    }
    public List<MicroATM> findAllMicroATM(){
        List<MicroATM> microATMList = new ArrayList<>();

        for (MicroATM microATM : microATMMap.values()){
            microATMList.add(microATM);
        }
        return microATMList;
    }
}
