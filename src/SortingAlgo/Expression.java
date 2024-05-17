package SortingAlgo;

public class Expression {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int ans = (a > b) ? a : b;
        System.out.println(ans);

        int age = 18;
        String expected = (age >= 18) ? "Eligible to vote" : "Not Eligible to vote";
        System.out.println(expected);

        String status = "True";
        String output = (status=="tTrue") ? "A" : "B";
        System.out.println(output);

        int x = 30, y = 10;
        System.out.println("Before swapping= " + "x:" +x+ " " + "y:"+y);
        x = x + y; //40
        y = x - y; //40-30 = 10
        x = x - y; //40-10 = 30
        System.out.println("After swapping= " + "x:" + x + " " +"y:"+ y);

    }
}
