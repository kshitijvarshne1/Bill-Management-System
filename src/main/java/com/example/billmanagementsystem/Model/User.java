/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 5:40 PM
 *   File: User.java
 */

package com.example.billmanagementsystem.Model;

public class User {
    private String name;
    private String email;
    private int id;
    private String mobile;

    public User(String name, String email, String mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
}

