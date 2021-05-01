/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 5:40 PM
 *   File: Bill.java
 */

package com.example.billmanagementsystem.Model;

import javax.persistence.Id;

public class Bill {
    @Id
    private int id;
    private String name;
    private long amount;
    private String type;
    private int userId;

    public Bill(String name, long amount, String type, int userId) {
        this.name = name;
        this.amount = amount;
        this.type = type;
        this.userId = userId;
    }
}

