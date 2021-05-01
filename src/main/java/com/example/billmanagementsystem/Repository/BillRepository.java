package com.example.billmanagementsystem.Repository;

import com.example.billmanagementsystem.Model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {

    List<Bill> findBillByUserId(int id);
    @Modifying
    @Transactional
    @Query(value = "UPDATE bill b SET b.name=:name, b.amount= :amount, b.type=:type,b.user_id=:userid WHERE b.id=:id",nativeQuery = true)
    void updateBill(@Param("name") String name,@Param("amount") long amount ,@Param("type") String type , @Param("userid") int userid,@Param("id") int id);
}
