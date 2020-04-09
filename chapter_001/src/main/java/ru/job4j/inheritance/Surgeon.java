package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int PosOperationCount;
    private int NegOperationCount;
    private boolean PossitiveTrend;

public int getPosOperationCount(){
    return PosOperationCount;
}

public int getNegOperationCount(){
        return NegOperationCount;
    }

}
