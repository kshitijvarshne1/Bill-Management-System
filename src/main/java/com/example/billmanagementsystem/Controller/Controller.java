/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 6:35 PM
 *   File: Controller.java
 */

package com.example.billmanagementsystem.Controller;

import com.example.billmanagementsystem.Dto.ResponseDto;
import com.example.billmanagementsystem.Model.Bill;
import com.example.billmanagementsystem.Model.User;
import com.example.billmanagementsystem.Service.UABService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    UABService uabService;

    @PostMapping("/registerUser")
    public ResponseDto<String> registerUser(@RequestBody User user) {
        String str = uabService.registerUser(user);
        return new ResponseDto<>(str, HttpStatus.OK);
    }

    @PostMapping("/addBill")
    public ResponseDto<String> addBill(@RequestBody Bill bill) {
        String str = uabService.addBill(bill);
        return new ResponseDto<>(str, HttpStatus.OK);
    }

    @GetMapping("/getBills/{userId}")
    public List<Bill> getBills(@PathVariable int userId) {
        return uabService.getBills(userId);
    }

    @PutMapping("/updateBill")
    public String updateBill(@RequestBody Bill bill){
        return uabService.updateBill(bill);
    }
}

