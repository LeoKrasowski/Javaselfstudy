package Lesson47;

public enum Animal {
    DOG("pes"), CAT("macka"), FROG("žaba");

    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString(){
        return "Prekladanie na slovencinu " + translation;
    }
}
