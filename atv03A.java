import java.util.Scanner;
public class atv03A {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        double tang,numero;
        System.out.println("Digite o grau do angulo:");
        numero=ler.nextDouble();
        double radi = Math.toRadians(numero);
        tang= Math.tan(radi);
        System.out.println(tang);
    }
}
