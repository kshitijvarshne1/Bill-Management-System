/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 6:42 PM
 *   File: Service.java
 */

package com.example.billmanagementsystem.Service;

import com.example.billmanagementsystem.Model.Bill;
import com.example.billmanagementsystem.Model.User;
import com.example.billmanagementsystem.Repository.BillRepository;
import com.example.billmanagementsystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UABService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BillRepository billRepository;

    public String registerUser(User user) {
        userRepository.save(user);
        return "Now registered";
    }

    public String addBill(Bill bill) {
        billRepository.save(bill);
        return "Now bill is added";
    }

    public List<Bill> getBills(int userId) {
        return billRepository.findBillByUserId(userId);
    }

    public String updateBill(int id, String name, int amount, String type, int userId) {
        billRepository.updateBill(name,amount,type,userId,id);
        return "Updated";
    }
}

