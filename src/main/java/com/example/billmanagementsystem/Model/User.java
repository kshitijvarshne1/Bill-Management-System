/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 5:40 PM
 *   File: User.java
 */

package com.example.billmanagementsystem.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User {
    private String name;
    private String email;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String mobile;

    public User(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public User(){
    }
}

