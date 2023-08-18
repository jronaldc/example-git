package org.example;

public class EstructuraAlternativa {
    public static void main(String[] args) {
        /*for (int i= 0; 1< 10; i++){
            System.out.println("i es igual: " + i);
        }*/


        int var1 = 0;
        int var2 = 10;
        /*
        while (var1 == var2 || var1<var2){
            System.out.println("var1 es:" + var1 + "var2 es:" +var2);
            var1++;
            var2--;
        }*/

        String abc;
        abc = "En valor de var1: ";

        do {
            System.out.println(abc + var1);
            var1++;
        } while (var1<8);

        System.out.println(abc.substring(3,11));


    }
}
