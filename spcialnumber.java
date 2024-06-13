import java.util.Scanner;
class main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        String word = ((A/10+A%10 == 7) || (A%7 == 0) ||(A/10==7)||(A%10==7))?"Special Number":"Normal Number";
        System.out.println(word);
        input.close();
    }
}