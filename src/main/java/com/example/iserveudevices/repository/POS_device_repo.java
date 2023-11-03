package com.example.iserveudevices.repository;

import in.iserveu.com.devices.POS;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class POS_device_repo {
    private static Map<String, POS> posMap = new HashMap<>();

    public POS_device_repo() {
        initData();
    }

    private void initData() {
        POS pos = new POS();
        pos.setDeviceId("pos-Wiseasy P3FI");
        pos.setDeviceName("Wiseasy P3FI");
        posMap.put(pos.getDeviceName(), pos);

        pos.setDeviceId("pos-PAX D180");
        pos.setDeviceName("PAX D180");
        posMap.put(pos.getDeviceName(), pos);

        pos.setDeviceId("pos-Morefun MP-63");
        pos.setDeviceName("Morefun MP-63");
        posMap.put(pos.getDeviceName(), pos);
    }

    public POS findPOS(String name){
        return posMap.get(name);
    }

    public List<POS> findAllPOS(){
        List<POS> posDeviceList = new ArrayList<>();

        for (POS pos : posMap.values()){
            posDeviceList.add(pos);
        }
        return posDeviceList;
    }
}
