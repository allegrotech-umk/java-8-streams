package pl.allegro.tech.umk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Introduction {

    //suma liczb od .. do
    public int sum(int lowerBoundary, int upperBoundary) {
        int sum = 0;
        for (int i = lowerBoundary; i <= upperBoundary; i++) {
            sum += i;
        }

        return sum;
    }

    //suma kwadratów liczb od .. do
    public int sumOfSquares(int lowerBoundary, int upperBoundary) {
        int sum = 0;
        for (int i = lowerBoundary; i <= upperBoundary; i++) {
            sum += i * i;
        }

        return sum;
    }

    //ile jest kwadratów liczb od 0 do upperBoundary, które pomniejszone o 1 są podzielne przez 4
    public int howMany(int upperBoundary) {
        int count = 0;
        for (int i = 0; i <= upperBoundary; i++) {
            if ((i * i - 1) % 4 == 0) {
                count++;
            }
        }
        return count;
    }

    //opuść pierwszych 10 linii, znajdź wszystkie linie zaczynające się na g lub G, zamień litery na wielkie
    //Files.lines(path)
    public List<String> fileLines(Path path) throws IOException {

        List<String> allLines = Files.readAllLines(path);
        List<String> subList = allLines.subList(10, allLines.size());
        List<String> upperCaseList = new ArrayList<>();
        for (String s : subList) {
            if (s.toLowerCase().startsWith("g")) {
                upperCaseList.add(s.toUpperCase());
            }
        }

        return upperCaseList;
    }


    //wszystkie niepowtarzające się (unikalne) elementy z listy
    public List<Integer> distinct(List<Integer> input) {
        Set<Integer> set = new HashSet<>(input); //niszczy kolejność!
        ArrayList<Integer> distinct = new ArrayList<>(set);

        return distinct;
    }

    //czy wszystkie kwadraty liczb nieparzystych między .. i .. są postaci 4k+1
    public boolean allMatch(int from, int to) {
        boolean allMatch = true;
        for (int i = from; i < to; i++) {
            if (i % 2 == 1 && ((i * i) % 4 != 1)) {
                allMatch = false;
            }
        }
        return allMatch;
    }

    //czy liczba jest pierwsza
    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    //największa liczba pierwsza w przedziale od 0 do to (to > 2)
    public int biggestPrime(int to) {
        int biggest = 2;
        for (int i = 2; i < to; i++) {
            if (isPrime(i)) {
                biggest = i;
            }
        }
        return biggest;
    }

    //wszystkie dzielniki liczby nieujemnej
    public List<Integer> divisors(int number) {
        List<Integer> divs = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) divs.add(i);
        }
        return divs;
    }

    //z listy imion wybierz żeńskie, a potem zamień wszystkie litery na wielkie
    public List<String> upperCaseFemaleNames(List<String> names) {

        List<String> upperCaseNames = new ArrayList<>();
        for (String name : names) {
            if (name.endsWith("a")) {
                String upperCase = name.toUpperCase();
                upperCaseNames.add(upperCase);
            }
        }

        return upperCaseNames;
    }

}
