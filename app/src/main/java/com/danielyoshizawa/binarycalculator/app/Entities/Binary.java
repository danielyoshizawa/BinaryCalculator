package com.danielyoshizawa.binarycalculator.app.Entities;

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

    public Binary(String binaryString) {
        this.SetValueFromString(binaryString);
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

        convertBinaryToString();

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

    public String GetString() {
        convertBinaryToString();
        return value;
    }

    // TODO : Create a Helper or something, I think I use something like this in another place
    private void convertBinaryToString() {
        for (Integer i: binaryList) {
            value += i.toString();
        }
    }
}