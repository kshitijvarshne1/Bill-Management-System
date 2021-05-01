/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 6:42 PM
 *   File: Service.java
 */

package com.example.billmanagementsystem.Service;

import com.example.billmanagementsystem.Model.User;
import com.example.billmanagementsystem.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UABService {
    @Autowired
    UserRepository userRepository;
    public String registerUser(User user) {
        userRepository.save(user);
        return "Now registered";
    }
}

