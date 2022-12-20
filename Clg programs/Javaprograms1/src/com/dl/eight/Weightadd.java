package com.dl.eight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Weightadd {
    static int sum(List<Integer> l,int sum){
        for(int i=0;i<l.size();i++){
            sum+=l.get(i);
        }
        return sum;
    }
    static int add(List<Integer> list,int w,int s){
        if(w==0|| list.size()==0 ){
            return s;
        }
        else if(w>=list.get(0)){
            int t = add(list.subList(1, list.size()),w,s);
            int t1 = add(list.subList(1, list.size()),w-list.get(0),s+list.get(0));
            return (int)Math.max(t,t1);
        }
        else if(w<list.get(0)){
            int t = add(list.subList(1, list.size()),w,s);
            return t;
        }
        return 0;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<n;i++){
                al.add(sc.nextInt());
            }
            int w = sc.nextInt();
            int s=0;
            int m = add(al,w,s);
            System.out.println(m);
        }
    }
}


