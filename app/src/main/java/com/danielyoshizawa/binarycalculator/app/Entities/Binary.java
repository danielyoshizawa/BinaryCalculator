package com.danielyoshizawa.binarycalculator.app.Entities;

import java.util.ArrayList;

public class Binary {

    ArrayList<Integer> binaryList = new ArrayList<Integer>();

    public Binary() {

    }

    public void AddDigit(int number) {
        binaryList.add(number);
    }

    public ArrayList<Integer> GetBinaryList() {
        return binaryList;
    }

    public void Clear() {
        binaryList.clear();
    }
}