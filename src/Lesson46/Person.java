package Lesson46;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 6463254908545094119L;

    private int id;
    private String name;



    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {return id;}
    public String getName(){return name;}
    public String toString(){return id + ":" + name;}
}
