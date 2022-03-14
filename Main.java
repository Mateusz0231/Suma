import java.util.Scanner;
class ScanLocal {
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę");
    int a = scanner.nextInt();
     System.out.println("Podaj liczbę");
    int b = scanner.nextInt();
    int suma = a + b;
    System.out.println("Suma liczb to" + suma);
  }
}