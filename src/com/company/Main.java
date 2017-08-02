package com.company;

public class Main {

    public static void main(String[] args) {
	Human Vasya = new Man("Vasya", "Ivanov", 180, 80);
	Human Pety = new Man("Pety", "Petin", 170, 70);
	Human Masha = new Woman("Masha","Petrova", 165, 55);
	Human Igor1 = new Man("Igor", "Vasil'ev", 215, 1);

        System.out.println(Vasya);
        System.out.println(Pety);
        System.out.println(Masha);
        System.out.println(Igor1);
    }

}
