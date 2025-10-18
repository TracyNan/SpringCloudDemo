package com.nan.user.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    int id;
    String name;
    String sex;
    String birth;
    String phone;
    String id_no;
    String password;
}

