package com.company;

public class Add {
    private int x;
    private int y;
    private int sum;

    Add(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void addNumbers(){
        this.sum = this.x + this.y;
    }

    public void printResult(){
        System.out.println(sum);
    }

}
