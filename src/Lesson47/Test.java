package Lesson47;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal);


        switch(animal) {
            case CAT:
                System.out.println("It's a cat");
                break;
            case DOG:
                System.out.println("It's a dog");
        }
        Season season = Season.SUMMER;
        System.out.println(season.getTemperature());

        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
                break;
        }
    }
}
