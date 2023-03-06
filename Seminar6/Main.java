package Seminars_Java.Seminar6;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        
        Cat[] cats = new Cat[]{
        new Cat("Belka"),
        new Cat("Rolex"),
        new Cat("Leopold"),
        new Cat("Saumon")};

        for (Cat cat : cats) {
            System.out.println(cat);
        }

        while(plate.food !=0){
            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.println("В тарелке осталось " + plate.food + " едениц еды");
            }

            if(plate.food < 50){
                plate.increaseFood();
            }
            try {
                Thread.sleep(5000);
                
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("__________________________________");
        }


    }
}
