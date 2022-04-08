package com.address1.demo.repository;

import com.address1.demo.bean.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,String> {
   public Address findByObjectId(int objectId);
}
