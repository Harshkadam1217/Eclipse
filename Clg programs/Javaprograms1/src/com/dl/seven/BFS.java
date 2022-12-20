package com.dl.seven;

import java.util.Scanner;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[9][9];
        int v[] = new int[8];
        for (int i = 0; i < 8; i++)
            v[i] = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 8; i++) {
            if (v[i] == 0) {
                System.out.print(i + " ");
                v[i]++;
            }
            for (int j = 0; j < 8; j++) {
                if (a[i][j] != 0 && v[j] == 0) {
                    System.out.print(j + " ");
                    v[j]++;
                }
            }
        }
        sc.close();
    }
}



