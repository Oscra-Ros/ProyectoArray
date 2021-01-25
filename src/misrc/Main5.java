package misrc;


public class Main5 {
    
    public static void main(String[] args) {
        
        int[] numero = {4,5,24,54,34,56};
        int[] numero2 = new int[numero.length]; 
        
        System.arraycopy(numero, 0, numero2, 0, numero.length);
        
        for(int i=0; i<numero2.length; i++){
           System.out.println(numero2[i]); 
        }
        
    } 
    
}
