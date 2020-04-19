package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int wybor, n;
        float a1, a2, b1, b2, c1, c2, x, y, z, wynik;
        long przedzial = Integer.MAX_VALUE + 1;

        System.out.println("Metody numeryczne");
        System.out.println("WYBOR OPCJI: ");
        System.out.println("Calki powieszchniowe [1]");
        System.out.println("Calki objetosciowe [2]");

        wybor = Integer.parseInt(reader.readLine());

        if (wybor == 1) {

            System.out.println("Calki powieszchniowe");
            System.out.println("Podaj poczatek przedzialu x");
            a1 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj koniec przedzialu x");
            a2 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj poczatek przedzialu y");
            b1 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj koniec przedzialu y");
            b2 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj dokladnosc calkowania");
            n = Integer.parseInt(reader.readLine());

            x = (a2 - a1);
            y = (b2 - b1);

            for (int j = 0; j < 10; j++) {
                wynik = 0;

                for (int i = 1; i <= n; i++) {
                    wynik += calka1(a1 + ((Math.random() * przedzial) / Integer.MAX_VALUE * x),
                            b1 + ((Math.random() * przedzial) / Integer.MAX_VALUE * y));
                }

                wynik = ((x * y) / n) * wynik;
                System.out.println("Wartosc calki wynosi : " + wynik);
            }
        } else if (wybor == 2) {

            System.out.println("Calki objetosciowe");
            System.out.println("Podaj poczatek przedzialu x");
            a1 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj koniec przedzialu x");
            a2 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj poczatek przedzialu y");
            b1 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj koniec przedzialu y");
            b2 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj poczatek przedzialu z");
            c1 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj koniec przedzialu z");
            c2 = Integer.parseInt(reader.readLine());
            System.out.println("Podaj dokladnosc calkowania");
            n = Integer.parseInt(reader.readLine());

            x = (a2 - a1);
            y = (b2 - b1);
            z = (c2 - c1);

            for (int j = 0; j < 10; j++) {
                wynik = 0;

                for (int i = 1; i <= n; i++) {
                    wynik += calka2(a1 + ((Math.random() * przedzial) / Integer.MAX_VALUE * x),
                            b1 + ((Math.random() * przedzial) / Integer.MAX_VALUE * y),
                            c1 + ((Math.random() * przedzial) / Integer.MAX_VALUE * z));
                }

                wynik = (x * y * z / n) * wynik;
                System.out.println("Wartosc calki wynosi : " + wynik);
            }
        } else {
            System.out.println("Nie ma takiego wyboru");
        }
    }

    public static double calka1(double x, double y) {
        return (x) * (y);
    }

    public static double calka2(double x, double y, double z) {
        return x * (2 * y) * z * z;
    }
}
