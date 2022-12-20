package com.dl.seven;

public class Stacktwo {
    static int top = -1, max = 5;

    public static void push(int a[], int x) {
        if (top == max - 1) {
            System.out.println("Overflow");
            return;
        }
        a[top + 1] = x;
        top++;
    }

    public static void pop(int a[]) {
        if (top == -1) {
            System.out.println("Underflow");
            return;
        }
        a[top] = 0;
        top--;
    }

    public static void display(int a[]) {
        for (int i = 0; i < top + 1; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = new int[max];
        for (int i = 0; i < max; i++)
            a[i] = 0;
        push(a, 50);
        push(a, 40);
        push(a, 30);
        push(a, 20);
        push(a, 10);
        push(a, 10);
        // pop(a);
        // pop(a);
        display(a);
    }
}
