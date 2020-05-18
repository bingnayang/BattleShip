package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Battleship {
    private ArrayList<Integer> opponentLocation = new ArrayList<>(Arrays.asList(4,5,6));
    private int mapSize = 10;
    private int numberOfHit;

    public Battleship() {
    }

    public int getNumberOfHit() {
        return numberOfHit;
    }
    public boolean getOpponentSize(){
        return opponentLocation.isEmpty();
    }

    public void setNumberOfHit(int numberOfHit) {
        this.numberOfHit = numberOfHit;
    }

    public ArrayList<Integer> getOpponentLocation() {
        return opponentLocation;
    }

    public void setOpponentLocation(ArrayList<Integer> opponentLocation) {
        this.opponentLocation = opponentLocation;
    }

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public void printBattleMap(){
        System.out.println("1D Battle Map. Opponent hide in these 10 location:");
        System.out.println("==================================================");
        for(int i=0; i<mapSize; i++){
            System.out.print("|_"+i+"_|");
        }
        System.out.println();
        System.out.println("==================================================");
    }

    public void printBattleshipLocation(){
        System.out.println("Opponent BattleShip Location: ");
        System.out.println("==================================================");
        for(int i=0; i<mapSize; i++){
            if(opponentLocation.contains(i)){
                System.out.print("|_@_|");
            }else{
                System.out.print("|_"+i+"_|");
            }
        }
        System.out.println();
        System.out.println("==================================================");
    }

    public void printGuessLocation(int guessLocation){
        for(int i=0; i<mapSize; i++){
            if(i == guessLocation){
                System.out.print("|_X_|");
            }else{
                System.out.print("|_"+i+"_|");
            }
        }
        System.out.println();
    }

    public boolean checkHitGuess(int guessLocation){
//        boolean checkResult = false;
//        int index = opponentLocation.indexOf(guessLocation);
//        if(index >= 0){
//            opponentLocation.remove(index);
//            if(opponentLocation.isEmpty()){
//                checkResult = true;
//            }else {
//                checkResult = false;
//            }
//        }
//        return checkResult;
        if(opponentLocation.contains(guessLocation)){
            opponentLocation.remove(Integer.valueOf(guessLocation));
            return true;
        }else {
            return false;
        }


    }
}
