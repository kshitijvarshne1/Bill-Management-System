package com.example.billmanagementsystem.Repository;

import com.example.billmanagementsystem.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill,Integer> {

    List<Bill> findBillByUserId(int id);
}
