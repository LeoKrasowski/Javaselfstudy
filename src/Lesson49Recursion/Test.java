package Lesson49Recursion;

public class Test {
    public static void main(String[] args) {
        //4! = 4*3*2*1
        //1! = 1
        //0! = 1

        System.out.println(fac(4));
    }

    // fac(4)
    //4 * fac(3) return (6)-> 4 * 6 = 24
    //3 * fac(2)  return (2)-> 3 * 2 = 6
    //2 * fac(1)  return (1)-> 2 * 1 = 2
    // fac(1) = return 1;
    private static int fac(int n){
        if(n == 1)
            return 1;

        return n * fac(n-1);
    }
}
