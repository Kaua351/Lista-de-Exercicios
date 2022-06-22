package atv_2;

public class atv_2 {
    public static void main (String[]args) {
        Scanner vtrapezio = new Scanner(System.in);
        float h, bmenor, bmaior, area;

        System.out.println("Digite a altura do trapézio: ");
        h = vtrapezio.nextFloat();

        System.out.println("Digite a base menor do trapézio: ");
        bmenor = vtrapezio.nextFloat();

        System.out.println("Digite a base maior do trapézio: ");
        bmaior = vtrapezio.nextFloat();
        
        area = (h * (bmenor + bmaior)) / 2;

        System.out.println("A área é de: " + area);


    }
    
}
