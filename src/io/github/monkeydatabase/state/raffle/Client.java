package io.github.monkeydatabase.state.raffle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        RaffleActivity raffleActivity=new RaffleActivity(5);

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<100;i++){
            System.out.println("--------------"+i+"--------------");
            raffleActivity.raffle();
            raffleActivity.pay();
            raffleActivity.dispensePrize();
            raffleActivity.raffle();
            raffleActivity.dispensePrize();
            System.out.println(raffleActivity.getCount());
        }
    }
}
