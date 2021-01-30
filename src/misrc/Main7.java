package misrc;

import java.util.Scanner;

public class Main7 {

    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Dime el tamaño del array");
        
        int x = lector.nextInt();
        
        int[] elementos = new int[x];
       
        for (int i=0; i<x; i++){
            elementos[i]=i; 
            System.out.println(elementos[i]);
        }
        
    }
    
}
