import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var baseYear = 2024;
        var scanner = new Scanner(System.in);
       System.out.println("Informe o seu nome!");
       var name = scanner.next();
       System.out.println("Informe o seu ano de nascimento!");
       var year = scanner.nextInt();
       var age = baseYear - year;
       System.out.printf("Olá, %s Você tem %s anos \n", name, age);
    }
}
