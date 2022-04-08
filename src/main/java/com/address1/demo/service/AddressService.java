package com.address1.demo.service;

import com.address1.demo.bean.Address;
import com.address1.demo.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class AddressService {
    @Autowired
    AddressRepository addrep;
    public Address saveAddress(Address address){

        return addrep.save(address);
    }
    public Address getAddressById(String  address_id){

        return  addrep.findById(address_id).get();
    }
    public List<Address> getAllItemData(){

        return  addrep.findAll();
    }
    public Address getAddressByobjectId(int objectId){
        return  addrep.findByObjectId(objectId);
    }
}
