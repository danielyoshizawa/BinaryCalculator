package com.danielyoshizawa.binarycalculator.app.Entities;

import android.util.Log;

import java.util.ArrayList;

public class Binary {

    ArrayList<Integer> binaryList = new ArrayList<Integer>();
    String value = "";

    public Binary() {

    }

    public Binary(Binary binaryCopy) {
        binaryList = binaryCopy.binaryList;
        value = GetDecimalString();
    }

    public void AddDigit(int number) {
        binaryList.add(number);
    }

    public ArrayList<Integer> GetBinaryList() {
        return binaryList;
    }

    public void Clear() {
        value = "";
        binaryList.clear();
    }

    public String GetDecimalString() {
        value = "";

        for (Integer i: binaryList) {
            value += i.toString();
        }

        return Integer.toString(Integer.parseInt(value, 2));
    }

    public void SetValueFromString(String value) {

        binaryList.clear();

        for (int i = 0; i < value.length(); i++) {
            binaryList.add(Integer.parseInt(value.substring(i, i+1)));
        }
    }

    public int GetDecimal() {
        return Integer.parseInt(GetDecimalString());
    }
}