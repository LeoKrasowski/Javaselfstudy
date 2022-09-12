import java.util.Scanner;

public
class Input {
    public static
    void main(String[] args) {
        String s = new String ("dfgdgfd");
        System.out.println(s);

        Scanner xyz = new Scanner(System.in);
        System.out.println("Insert something");
        String string = xyz.nextLine();
        System.out.println("You wrote " +string);
    }
}
