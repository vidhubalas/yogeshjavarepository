package com.company;

public class Probability {

    public static void main(String[] args){

        int whiteBall = 2,blackBall = 3;
        int total = whiteBall + blackBall;
        probabilityOfBall(whiteBall, total, "white");
        probabilityOfBall(blackBall, total, "black");

    }

    private static void probabilityOfBall(int countOfBall, int total, String color) {
        float probabilityOfWhiteBall =(float) countOfBall / total;
        System.out.println("Probability of " +color+ " Ball : " + probabilityOfWhiteBall + "(" + countOfBall + "/" + total + ")");
    }
}
