package com.example.billmanagementsystem.Repository;


import com.example.billmanagementsystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {

}
