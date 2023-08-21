import java.util.Scanner;
public class atv03C {
    public static void main(String[] args) {
        double num,cos;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero para ser calculado o cosseno: ");
        num = input.nextDouble();
        cos = Math.cos(num);
        System.out.println(cos);
    }
}
