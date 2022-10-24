import java.util.*;
import java.lang.Math;

public class EmpresaTimo {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calcularEntrada();
    }
    
    public static void calcularEntrada() {
        int idade;
        double prezo;
        
        System.out.println("Cal é a tua idade?");
        idade = input.nextInt();
        if (idade < 0) {
            System.out.println("NO ME PUEDES TROLEAR, ESA NO PUEDE SER TU EDAD!!!!");
        } else {
            if (idade < 4) {
                prezo = 0;
            } else {
                if (idade < 18) {
                    prezo = 5;
                } else {
                    prezo = 10;
                }
            }
            System.out.println("O prezo para a entrada para o cliente é " + prezo + " euros");
        }
    }
}
