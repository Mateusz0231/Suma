
class ScanLocal {
  public static void main(String[] args) 
  {
    int a;
    int b;
    int suma;
    System.out.println("Podaj liczbę");
    Scanner skana = new Scanner(System.in);
     a = skana.nextInt();
     System.out.println("Podaj liczbę");
    Scanner skanb = new Scanner(System.in);
     b = skanb.nextInt();
     suma = a + b;
    System.out.println("Suma liczb to" + suma);
  }
}