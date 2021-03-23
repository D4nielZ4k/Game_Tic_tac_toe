package game;

import java.util.Arrays;
import java.util.Random;

public class Game {


    int tour = 0;
    int control = 0;
    boolean move = false;


    int[] gameArrayList = {0, 0, 0, 0, 0, 0, 0, 0, 0};


    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }


    private int valuePlayerOne = 0;
    private int valuePlayerTwo = 0;
    private boolean continueGame = false;

    public int getControl() {
        return control;
    }

    public void setControl(int control) {
        this.control = control;
    }


    public int[] gameArrayList() {
        return gameArrayList;
    }


    public void setTour(int tour) {
        this.tour = tour;
    }

    public void setContinueGame(boolean continueGame) {
        this.continueGame = continueGame;
    }

    public boolean isContinueGame() {
        return !continueGame;
    }

    public int getValuePlayerOne() {
        return valuePlayerOne;
    }

    public void setValuePlayerOne(int value) {
        this.valuePlayerOne = value;
    }

    public void setValuePlayerTwo(int value) {
        this.valuePlayerTwo = value;
    }

    public int getValuePlayerTwo() {
        return valuePlayerTwo;
    }

    public boolean hasEmptyField(int[] array) {
        for (int j : array) {
            if (j == 0) {
                return true;
            }
        }
        return false;
    }

    public void listGameGenerator() {
        for (int j = 0; j < 9; j++) {
            gameArrayList[j] = 0;
        }
    }

    public void player(int index) {
        if (isContinueGame() && gameArrayList[index] == 0 && tour == 0) {
            gameArrayList[index] = 1;
            tour++;
            checkingTheResult();
            move = true;
        } else if (isContinueGame() && gameArrayList[index] == 0 && tour == 1) {
            gameArrayList[index] = 10;
            tour = 0;
            checkingTheResult();
        }


    }

    public void iARandom() {

        Random random = new Random();

        while (isContinueGame() && hasEmptyField(gameArrayList)) {

            int randomIndex = random.nextInt(gameArrayList.length);
            if (gameArrayList[randomIndex] == 0) {
                gameArrayList[randomIndex] = 10;
                tour = 0;
                checkingTheResult();
                break;

            }
        }
    }


    public void checkingTheResult() {

        int first = gameArrayList[0] + gameArrayList[1] + gameArrayList[2];  //0 1 2
        int second = gameArrayList[3] + gameArrayList[4] + gameArrayList[5];  //3 4 5
        int third = gameArrayList[6] + gameArrayList[7] + gameArrayList[8];  //6 7 8

        int fourth = gameArrayList[0] + gameArrayList[3] + gameArrayList[6];  //0 3 6
        int fifth = gameArrayList[1] + gameArrayList[4] + gameArrayList[7];  //1 4 7
        int sixth = gameArrayList[2] + gameArrayList[5] + gameArrayList[8];  //2 5 8

        int seventh = gameArrayList[0] + gameArrayList[4] + gameArrayList[8];  //0 4 8
        int eighth = gameArrayList[2] + gameArrayList[4] + gameArrayList[6];  //2 4 6

        int valuePlayerOneGame = 3;
        int valuePlayerTwoGame = 30;

        if (first == valuePlayerOneGame || second == valuePlayerOneGame || third == valuePlayerOneGame || fourth == valuePlayerOneGame || fifth == valuePlayerOneGame || sixth == valuePlayerOneGame
                || seventh == valuePlayerOneGame || eighth == valuePlayerOneGame) {
            valuePlayerOne++;
            continueGame = true;
            control = 1;
            System.out.println("Player One WIN");

        } else if (first == valuePlayerTwoGame || second == valuePlayerTwoGame || third == valuePlayerTwoGame || fourth == valuePlayerTwoGame || fifth == valuePlayerTwoGame || sixth == valuePlayerTwoGame
                || seventh == valuePlayerTwoGame || eighth == valuePlayerTwoGame) {
            valuePlayerTwo++;
            control = 2;
            System.out.println("Player Two WIN");
            continueGame = true;
        } else if (Arrays.stream(gameArrayList).sum() == 45) {
            control = 3;
            System.out.println("DRAW");
        } else {
            System.out.println("the game continues");
        }

    }


}
