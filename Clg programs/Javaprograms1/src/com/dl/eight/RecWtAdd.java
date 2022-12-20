package com.dl.eight;

import java.util.*;

public class RecWtAdd {
    public static int Array(List<Integer> p, List<Integer> l, int w, int s) {
        if (l.size() == 0 || w == 0)
            return s;
        else if (w >= l.get(0)) {
            System.out.println(l.get(0));
            int t = Array(p.subList(1, p.size()), l.subList(1, l.size()), w, s);
            int t1 = Array(p.subList(1, p.size()), l.subList(1, l.size()), w - l.get(0), s + p.get(0));
            return Math.max(t, t1);
        } else if (w < l.get(0)) {
            int t = Array(p.subList(1, p.size()), l.subList(1, l.size()), w, s);
            return t;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>();
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }
        int w = sc.nextInt();
        int s = sc.nextInt();
        System.out.print(Array(p, l, w, s));
        sc.close();
    }
}

