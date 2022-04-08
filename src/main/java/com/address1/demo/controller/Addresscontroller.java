package com.address1.demo.controller;

import com.address1.demo.bean.Address;
import com.address1.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class Addresscontroller {
    @Autowired
    AddressService Addser;
    @PostMapping("/add")
    public Address saveAddress(@RequestBody Address address){
        return Addser.saveAddress(address);
    }
    @GetMapping("/getAddressByobjectId/{id}")
    public  Address getAddressByobjectId(@PathVariable(value = "id") int objectId){
        return Addser.getAddressByobjectId(objectId);
    }

    @GetMapping("/getAlladdress/{id}")
    public Address getAddressById(@PathVariable(value = "id") String address_id) {
        return Addser.getAddressById(address_id);
    }

    @GetMapping("/getAlladdress")
    public List<Address> getAllItemData(){
        return Addser.getAllItemData();

    }
}


