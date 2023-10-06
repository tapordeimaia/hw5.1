import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int pozitiv = 0;
        int negativ = 0;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int g = scanner.nextInt();
            if (g==0){
                System.out.println("Exit");
                break;
            }
            if (g>0){
                pozitiv++;
                System.out.println("Numarul introdus la consola este: " + g + " care este pozitiv");
            } else {
                negativ++;
                System.out.println("Numarul introdus la consola este: " + g + " care este negativ");
            }
            suma = suma + g;
        }
        System.out.println("Suma este: " + suma);
        System.out.println("Nr poz sunt: " + pozitiv);
        System.out.println("Nr neg sunt: " + negativ);
    }
}