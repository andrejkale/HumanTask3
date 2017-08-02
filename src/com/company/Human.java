package com.company;

import java.util.Random;

/**
 * Created by User on 8/1/2017.
 */
public abstract class Human {
    protected boolean sex;
   protected   String name;
   protected   String surname;
    protected float height;
   protected   float weight;

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



    public boolean isSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHeight(float height) {this.height = height;}

    public void setWeight(float weight) {
        this.weight = weight;
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

    boolean speak(Human partner) {
        if (!this.sex || !partner.sex)
            return true;
        else {
            Random r = new Random();
            if (r.nextDouble() < 0.5)
                return true;
        }
        return false;
     }
     boolean tolerate(Human partner){
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
     boolean spendingTimeTogether(Human partner){
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
    Human haveRelationship(Human partner){
         if (this.sex != partner.sex){
             if (this.speak(partner) && this.tolerate(partner) && this.spendingTimeTogether(partner) ){
                 if (this.sex)
                     return ((Woman)partner).birthBaby((Man)this);
                 return ((Woman)this).birthBaby((Man)partner);
             }
         }
         return null;

    }
    static Human matchHuman(Human partner1, Human partner2){
        return partner1.haveRelationship(partner2);
    }

}