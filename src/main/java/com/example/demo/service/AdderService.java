package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    private int num = 0;

    public void baseNum(int base) {
        this.num = base;
    }

    public int currentBase() {
        return num;
    }

    public int add(int adder) {
        return this.num + adder;
    }

    public int accumulate(int adder) {
        return this.num+= adder;
    }


}