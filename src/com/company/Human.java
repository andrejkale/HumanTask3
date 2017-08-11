package com.company;

import java.util.Random;


public  class Human {
     boolean sex;
      private String name;
     private String surname;
     private float height;
    private float weight;

    Human( String name, String surname, float height, float weight) {
        this.name = name;
        this.surname = surname;
        if (height >= 25 && height <= 210) {
            this.height = height;
        } else {
            System.out.println("Enter to normal height ! ");
        }
        if (weight >= 2 && weight <= 160) {
            this.weight = weight;
        } else {
            System.out.println("Enter to normal weight ! ");
        }
    }



    boolean isSex() {
        return sex;
    }

     String getName() {
        return name;
    }

     String getSurname() {
        return surname;
    }

     float getHeight() {
        return height;
    }

    float getWeight() {
        return weight;
    }



    @Override
    public String toString() {
        return "Human{" +
                "sex=" + sex +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    // method implements ability to speak

    private boolean speak(Human partner) {
        if (!this.sex || !partner.sex)
            return true;
        else {
            Random r = new Random();
            if (r.nextDouble() < 0.5)
                return true;
        }
        return false;
     }
    //method implements ability to tolerate


    private boolean tolerate(Human partner){
        if (this.sex != partner.sex){
             Random r = new Random();
             if(r.nextDouble() < 0.7)
                 return true;
         } else {
             if (this.sex){
                 Random r = new Random();
                 if (r.nextDouble() < 0.056)
                     return true;
             } else {
                 Random r = new Random();
                 if (r.nextDouble() < 0.05)
                     return true;
             }
         }
         return false;
     }

    //method implements ability to spending time together

     private boolean spendingTimeTogether(Human partner){
         if ((Math.abs(100 - this.getHeight() * 100) / partner.getHeight()) < 10  ){
             Random r = new Random();
             if(r.nextDouble() < 0.95)
                 return true;
         } else {
             Random r = new Random();
             if (r.nextDouble() < 0.85)
                 return true;
         }
         return false;
     }
    //method implements ability to have relationship
    private Human haveRelationship(Human partner){
         if (this.sex != partner.sex){
             if (this.speak(partner) && this.tolerate(partner) && this.spendingTimeTogether(partner) ){
                 if (this.sex)
                     return ((Woman)partner).birthBaby((Man)this);
                 return ((Woman)this).birthBaby((Man)partner);
             }
         }
         return null;

    }

    //method implements ability to create new instance
    static Human matchHuman(Human partner1, Human partner2){
        return partner1.haveRelationship(partner2);
    }

}
