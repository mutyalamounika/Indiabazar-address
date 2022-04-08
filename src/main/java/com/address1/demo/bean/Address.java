package com.address1.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id
    @Column(name="address_id")
    String address_id;
    @Column(name="OBJECT_ID")
    int objectId;
    @Column(name="OBJECT_TYPE")
    String object_type;

}
