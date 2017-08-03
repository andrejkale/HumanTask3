package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // this method create to instance

    private static void instance(Boolean s1, Boolean s2, String n1, String n2, String sr1, String sr2, float h1, float h2, float w1, float w2){
        Human partner1, partner2;

	    if (s1){
	        partner1 = new Man(n1, sr1, h1, w1);

	    } else {
	        partner1 = new Woman(n1, sr1, h1, w1);

	    }

	    if (s2){
	        partner2 = new Man(n2, sr2, h2, w2);

        } else {
	        partner2 = new Woman(n2, sr2, h2, w2);

        }
         System.out.println(partner1);
         System.out.println(partner2);

        Human human = Human.matchHuman(partner1, partner2);
	    if (human == null){
            System.out.println("Nothing happened, ran away ");
        } else System.out.println(human);
    }

    public static void main(String[] args) {
	    boolean s1;
        boolean s2;
         String n1;
        String n2;
        String sr1;
        String sr2 ;
        float h1, h2, w1, w2;

        // here we read the data from console

        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please, type sex for first partner (true for man, false for woman) ");
            String sex1 = in.readLine();
            s1 = Boolean.parseBoolean(sex1);
            System.out.println("Please, type  name for first partner ");
            n1 = in.readLine();
            System.out.println("Please, type surname for first partner ");
            sr1 = in.readLine();
            System.out.println("Please, type height for first partner ");
            String height1 = in.readLine();
            h1 = Float.parseFloat(height1);
            System.out.println("Please, type weight for first partner ");
            String weight1 = in.readLine();
            w1 = Float.parseFloat(weight1);
            System.out.println("Please, type sex for second partner (true for man, false for woman) ");
            String sex2 = in.readLine();
            s2 = Boolean.parseBoolean(sex2);
            System.out.println("Please, type  name for second partner ");
            n2 = in.readLine();
            System.out.println("Please, type surname for second partner ");
            sr2 = in.readLine();
            System.out.println("Please, type height for second partner ");
            String height2 = in.readLine();
            h2 = Float.parseFloat(height2);
            System.out.println("Please, type weight for second partner ");
            String weight2 = in.readLine();
            w2 = Float.parseFloat(weight2);

            instance(s1, s2, n1, n2, sr1, sr2, h1, h2, w1, w2);

        } catch (NumberFormatException e){
            System.out.println("Please, input numbers!");
        }


        catch (IOException e) {
            System.out.println("Problem with input data");
        }


    }

}
