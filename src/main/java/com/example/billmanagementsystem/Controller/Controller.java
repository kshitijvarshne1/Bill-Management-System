/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 6:35 PM
 *   File: Controller.java
 */

package com.example.billmanagementsystem.Controller;

import com.example.billmanagementsystem.Dto.ResponseDto;
import com.example.billmanagementsystem.Model.User;
import com.example.billmanagementsystem.Service.UABService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    UABService uabService;
    @PostMapping("/registerUser")
    public ResponseDto<String> registerUser(@RequestBody User user){
        String str= uabService.registerUser(user);
        return new ResponseDto<>(str,HttpStatus.OK);
    }
}

