package com.company.Test5;

public class Pants implements Sonorous,Paperous {
    private String rightPocket ;
    private String leftPocket;

    public String getRightPocket() {
        return rightPocket;
    }

    public void setRightPocket(String rightPocket) {
        this.rightPocket = rightPocket;
    }

    public String getLeftPocket() {
        return leftPocket;
    }

    public void setLeftPocket(String leftPocket) {
        this.leftPocket = leftPocket;
    }



    @Override
    public void rustling() {
        System.out.println("In" + leftPocket);
        return ;
    }

    @Override
    public void Sound() {
        System.out.println("In" + rightPocket);
        return;

    }

    @Override
    public String toString() {
        return "Pants{" +
                "rightPocket='" +  + '\'' +
                ", leftPocket='" +  + '\'' +
                '}';
    }
}
