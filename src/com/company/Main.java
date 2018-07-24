package com.company;
import com.leishuai.*;
public class Main {

    public static void main(String[] args) {
        for(int i=1;i<10;i++) {
            for (int j = 1; j < 10; j++)
                if (j <= i)
                    System.out.printf("%d*%d=%2d  ",i,j,i*j);
            System.out.println();
        }
    }


}
