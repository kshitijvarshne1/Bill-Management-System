/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-May-21
 *   Time: 6:45 PM
 *   File: ResponseDTO.java
 */

package com.example.billmanagementsystem.Dto;

import com.example.billmanagementsystem.Model.Bill;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;

@Getter
@Setter
public class ResponseDto<T> {
    T data;
    HttpStatus httpStatus;

    public ResponseDto(T data, HttpStatus httpStatus) {
        this.data = data;
        this.httpStatus = httpStatus;
    }

    public ResponseDto(List<Bill> billList) {
        this.data= (T) billList;
    }
}

