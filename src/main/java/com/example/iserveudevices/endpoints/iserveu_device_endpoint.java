package com.example.iserveudevices.endpoints;

import com.example.iserveudevices.repository.Iserveu_device_repo;
import com.example.iserveudevices.repository.MicroATM_device_repo;
import com.example.iserveudevices.repository.POS_device_repo;
import in.iserveu.com.devices.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequestMapping("/devices")
public class iserveu_device_endpoint {
    private static final String NAMESPACE_URI = "http://com.iserveu.in/devices";
    @Autowired
    private Iserveu_device_repo iserveu_device_repo;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDeviceRequest")
    @ResponsePayload
    public GetDeviceResponse getdevices(@RequestPayload GetDeviceRequest request){
        GetDeviceResponse response = new GetDeviceResponse();
        response.setDeiceDetails((DeviceDetails) iserveu_device_repo.findDeviceDetails(request.getDeviceTypeName()));
        return response;
    }
}

@Endpoint
@RequestMapping("/atm")
class iserveu_micro_atm_device_endpoint {
    private static final String NAMESPACE_URI = "http://com.iserveu.in/devices";
    @Autowired
    private MicroATM_device_repo microATM_device_repo;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getATMDeviceRequest")
    @ResponsePayload
    public GetATMDeviceResponse getMicroATMDeviceResponse(@RequestPayload GetATMDeviceRequest request){
        GetATMDeviceResponse response = new GetATMDeviceResponse();
        response.setMicroATMDeviceDetail(microATM_device_repo.findMicroATM(request.getDeviceTypeName()));
        return response;
    }
}


@Endpoint
@RequestMapping("/pos")
class iserveu_pos_device_endpoint {
    private static final String NAMESPACE_URI = "http://com.iserveu.in/devices";
    @Autowired
    private POS_device_repo pos_device_repo;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPOSDeviceRequest")
    @ResponsePayload
    public GetPOSDeviceResponse getPOSDeviceResponse(@RequestPayload GetPOSDeviceRequest request){
        GetPOSDeviceResponse response = new GetPOSDeviceResponse();
        response.setPOSDeviceDetail(pos_device_repo.findPOS(request.getDeviceTypeName()));
        return response;
    }
}

@Endpoint
@RequestMapping("/all-atm")
class iserveu_all_pos_device_endpoint {
    private static final String NAMESPACE_URI = "http://com.iserveu.in/devices";
    @Autowired
    private MicroATM_device_repo microATM_device_repo;
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getATMDeviceListRequest")
    @ResponsePayload
    public GetATMDeviceListResponse getATMDeviceListResponse(@RequestPayload GetATMDeviceListRequest request){
        GetATMDeviceListResponse response = new GetATMDeviceListResponse();
        response.setMicroATMDeviceDetailList(microATM_device_repo.findAllMicroATM());
        return response;
    }
}