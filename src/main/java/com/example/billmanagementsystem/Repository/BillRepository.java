package com.example.billmanagementsystem.Repository;

import com.example.billmanagementsystem.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill,Integer> {
}
