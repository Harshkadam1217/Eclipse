package com.dl.eight;

import java.util.*;

public class RecArraySum {
    static int sum(ArrayList<Integer> list, int sum) {
        for (int k = 0; k < list.size(); k++) {
            sum += list.get(k);
        }
        return sum;
    }

    public static void ArraySum(List<Integer> l, ArrayList<Integer> al) {
        if (sum(al, 0) >= 10 || l.size() == 0) {
            if (sum(al, 0) >= 10) {
                System.out.print(al + " ");
            }
            if (l.size() == 0) {
            }
        } else {
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            a.addAll(al);
            b.addAll(al);
            b.add(l.get(0));
            ArraySum(l.subList(1, l.size()), a);
            ArraySum(l.subList(1, l.size()), b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        ArraySum(l, al);
        sc.close();
    }
}

