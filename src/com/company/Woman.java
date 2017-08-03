package com.company;

import java.util.Random;
import java.util.Scanner;

 class Woman extends Human {


    Woman(String name, String surname, float height, float weight) {
        super(name, surname, height, weight);
        this.sex = false;
    }

     //method implements ability to birth

      Human birthBaby(Man partner){
        boolean gender = false;
         Random r = new Random();
         if (r.nextDouble() < 0.5)
             gender = true;
         float h;
         float w;
         if (gender){
             h = (float)(partner.getHeight() + 0.1 * (this.getHeight() - partner.getHeight()));
             w = (float)(partner.getWeight() + 0.1 * (this.getWeight() - partner.getWeight()));
         } else {
             h = (float)(this.getHeight() + 0.1 * (partner.getHeight() - this.getHeight()));
             w = (float)(this.getWeight() + 0.1 * (partner.getWeight() - this.getWeight()));
         }
         String sr = partner.getSurname();
         String sex = "girl";
         if (gender) sex = "boy";
         System.out.println("Pleas type baby name. It's a " + sex);
         String n = "" ;
         Scanner sc = new Scanner(System.in);
         if (sc.hasNext()){
             n = sc.next();
         }
         if(gender)
             return new Man(n, sr, h, w);
             return new Woman(n, sr, h, w);




     }



}
