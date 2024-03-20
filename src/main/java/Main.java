// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Wprowadź pierwszą liczbę: ");
    int liczba1 = scanner.nextInt();

    System.out.println("Wprowadź drugą liczbę: ");
    int liczba2 = scanner.nextInt();

    System.out.println("Dodawanie: " + dodaj(liczba1, liczba2));
    System.out.println("Odejmowanie: " + odejmij(liczba1, liczba2));
    System.out.println("Mnożenie: " + pomnóż(liczba1, liczba2));
    System.out.println("Dzielenie: " + podziel(liczba1, liczba2));

    scanner.close();
  }

  public static int dodaj(int a, int b) {
    return a + b;
  }

  public static int odejmij(int a, int b) {
    return a - b;
  }

  public static int pomnóż(int a, int b) {
    return a * b;
  }

  public static double podziel(int a, int b) {
      if (b == 0) {
          System.out.println("Błąd: Dzielenie przez zero!");
          return 0;
      }
      return (double) a / b;
  }
}