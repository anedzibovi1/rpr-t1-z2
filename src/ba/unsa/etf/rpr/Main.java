package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    private static int sumaCifara(int n) {
        int suma=0;
        while(n!=0) {
            int c=n%10;
            suma+=c;
            n/=10;
        }
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite velicinu: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<n;i++) {
            if (i%sumaCifara(i)==0) System.out.println(i);
        }
    }
}
}
