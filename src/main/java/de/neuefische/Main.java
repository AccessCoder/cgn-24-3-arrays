package de.neuefische;

public class Main {

    public static void main(String[] args) {

        //Erstellung eines Arrays, wenn alle Werte bekannt => schnelle Version
        String[] students = {"Juliane", "Ursula", "René", "Dauren", "Mohammed"}; // 0 1 2 3 4

        //Erstellung eines Arrays, wenn keine Werte bekannt => "langsame" Version
        String[] students2 = new String[4]; //0 1 2 3
        //Zuweisung von Werten
        students2[1] = "Test";


        for (int i = 0; i < students.length; i++){
            greetStudent(students[i]);
        }

        for (String s:students) {
            greetStudent(s);
        }


        //BONUS, nicht Pflicht!
        int count = 0;
        while (count < students.length){
            greetStudent(students[count]);
            count++;
        }

    }

    public static void greetStudent(String name){
        System.out.println("Hallo " + name);
    }
}