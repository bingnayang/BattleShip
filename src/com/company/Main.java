package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean attackResult = false;

	    Battleship battleship = new Battleship();

        System.out.println("Welcome to the 1D BattleShip Game");
        battleship.printBattleMap();
        System.out.println();
        System.out.println();


        while(true){
            System.out.println("Enter your attack location (0-9): ");
            int userGuess = scanner.nextInt();

            attackResult = battleship.checkHitGuess(userGuess);
            if(attackResult){
                System.out.println("It's a Hit");
                if(battleship.getOpponentSize()){
                    System.out.println("You Win");
                    break;
                }
            }else {
                System.out.println("It's a No Hit");
            }
        }
    }
}
