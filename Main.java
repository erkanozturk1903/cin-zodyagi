package org.example;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int yil, kalan;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz");
        yil = input.nextInt();

        if(yil%12==0){
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        }

        if(yil%12==1){
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }

        if(yil%12==2){
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }

        if(yil%12==3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }

        if(yil%12==4){
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }

        if(yil%12==5){
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }

        if(yil%12==6){
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }

        if(yil%12==7){
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }

        if(yil%12==8){
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }

        if(yil%12==9){
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }

        if(yil%12==10){
            System.out.println("Çin Zodyağı Burcunuz: At");
        }

        if(yil%12==11){
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }

    }
}
