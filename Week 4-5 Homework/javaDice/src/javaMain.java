/**
 * Created by
 * @cersion 03.02.2015.1
 * Assignment: Dice-game, Lab 4
 * Purpose: College Java Programming
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class javaMain {

    private int dieType;
    private int numofDie;
    private int[] Dies;

    private int outcome;
    private final int FOUR  = 4;
    private final int SIX = 6;
    private final int EIGHT = 8;
    private final int TEN = 10;
    private final int TWELVE = 12;
    private final int TWENTY = 20;
    private final int ONEHUNDRED = 100;
    //I don't wanna use a bunch of if statements to check if it's one of these,
    //I did anyway, but it's not very pretty. :|
    //is there any other way?

    private boolean didwin = false;

    public int getDieType() {
        return dieType;
    }

    public void setDieType(int dieType) {
        this.dieType = dieType;
    }

    public int getNumofDie() {
        return numofDie;
    }

    public void setNumofDie(int numofDie) {
        this.numofDie = numofDie;
    }

    public int getOutcome() {
        return outcome;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    public boolean isDidIwin() {
        return didwin;
    }

    public void setDidIwin(boolean didIwin) {
        this.didwin = didIwin;
    }

    public boolean calculateWin()
    {
        if(outcome == 5 || outcome == 30)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean checkDieType(int dieType)
    {
        if(dieType == FOUR || dieType ==  SIX || dieType ==  EIGHT || dieType ==  TEN || dieType ==  TWELVE || dieType ==  TWENTY || dieType == ONEHUNDRED)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean calculateLoss()
    {
        for(int i = 0; i <= numofDie; i++)
        {
            if(Dies[i] == Dies[i-1]) //same results
            {
                if(Dies[i] == 1)//2 or more die are equal to 1
                {
                    return true; //lost
                }
                //else, do nothing, no bust
            }
            //else, do nothing, no bust
        }
        return false;
    }

    public void rollDice(int dieType, int numofDie)
    {
        this.dieType = 0;
        Random rand = new Random();
        Dies = new int[numofDie];
        if(dieType <= 0 || numofDie <= 0 || numofDie > 10 || checkDieType(dieType) == false)
        {
            //Not valid
            this.dieType = 0;
            this.numofDie = 0;
        }
        else
        {
            for(int i = 0; i <= numofDie; i++)
            {
                Dies[i] = rand.nextInt(dieType) + 1; //prevent 0;
                outcome = outcome + rand.nextInt(dieType) + 1;
            }
            if(calculateLoss() == true)
            {
                //LOST!
            }
            else if(calculateWin() == true)
            {
                //WON!
            }
        }
    }
}


