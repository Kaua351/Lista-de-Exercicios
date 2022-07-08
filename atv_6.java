package atv_6;

import java.util.Scanner;

public class atv_6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
          double val, quilo, libra;

            System.out.println("Digite um valor para ser convertido: ");
              valor = ler.nextDouble();

     quilo = (val * 0.454);    
     libra = (val * 2.2046);

      System.out.println("O valor convertido para quilos é de: " + quilo + " kg");  
      System.out.println("O valor convertido para libras é de: " + libra + " lb");
    }
}
