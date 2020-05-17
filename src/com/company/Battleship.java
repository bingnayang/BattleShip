package com.company;

import java.util.Arrays;

public class Battleship {
    private int[] opponentLocation = {4,5,6};
    private int mapSize = 10;

    public Battleship() {
    }

    public void setOpponentLocation(int[] opponentLocation) {
        this.opponentLocation = opponentLocation;
    }

    public int[] getOpponentLocation() {
        return opponentLocation;
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
            if(i == opponentLocation[0] || i == opponentLocation[1] || i == opponentLocation[2] ){
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
        for (int cell : opponentLocation) {
            if (cell == guessLocation) {
                return true;
            }
        }
        return false;
    }
}
