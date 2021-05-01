/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 5:40 PM
 *   File: Bill.java
 */

package com.example.billmanagementsystem.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Bill {
    @Id
    @SequenceGenerator(name = "id_generator", sequenceName = "id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
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
    public Bill() {
    }
}

