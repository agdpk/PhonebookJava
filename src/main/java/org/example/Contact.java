package org.example;

import java.util.ArrayList;

public class Contact {
    private String name;
    private ArrayList<Integer> numbers;

    public Contact(String name, int number) {
        this.name = name;
        this.numbers = new ArrayList<>();
        this.numbers.add(number);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void deleteNumber(int number) {
        numbers.remove(Integer.valueOf(number));
    }


    @Override
    public String toString() {
        return name + ": " + numbers.toString();
    }
}
