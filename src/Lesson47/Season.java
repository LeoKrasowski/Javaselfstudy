package Lesson47;

public enum Season {
    SUMMER(28),WINTER(-2),AUTUMN(15),SPRING(20);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature(){
        return temperature;
    }
}
