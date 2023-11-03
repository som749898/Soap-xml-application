package com.example.iserveudevices.repository;

import in.iserveu.com.devices.DeviceDetails;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Iserveu_device_repo {
    private static Map<String, List> devices = new HashMap<>();

    public Iserveu_device_repo() {
        initData();
    }
    public void initData(){
        DeviceDetails deviceDetails = new DeviceDetails();
        POS_device_repo pos_device_repo = new POS_device_repo();
        MicroATM_device_repo microATM_device_repo = new MicroATM_device_repo();

        devices.put("POS", pos_device_repo.findAllPOS());
        devices.put("microATM", microATM_device_repo.findAllMicroATM());
    }

    public List findDeviceDetails(String name){
        return devices.get(name);
    }
}
