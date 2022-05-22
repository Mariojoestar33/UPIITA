import java.util.Scanner;

public class App {  //main() method start  
    public static void main(String[] args)  
    {    
        
        Scanner sc = new Scanner(System.in);  
        Arbol arbol = new Arbol(Integer.MIN_VALUE);   
        int opt;   
        
        do {  
            System.out.println("\nMENU:\n");  
            System.out.println("1. Insertar un Nodo ");  
            System.out.println("3. inOrder");  
            System.out.println("4. Salir");  
  
            opt = sc.nextInt();
                       
            switch (opt) {  
                case 1 :   
                    System.out.println("Inserta el dato");  
                    arbol.insertarNodo(sc.nextInt() );                       
                    break;                            
                case 2 :   
                    System.out.println("Ingresa el dato a buscar");  
                    System.out.println(arbol.buscar( sc.nextInt() ));  
                    break;                                            
                case 3 :   
                    System.out.println("\ninOrder:\n");  
                    arbol.inOrder();  
                    break;     
                case 4 :   
                    System.out.println("\nHasta la proxima :)))");
                    break;       
                default :   
                    System.out.println("\nIngrese una opcion valida!!!\n");  
                    break;      
            }           
        } while (opt != 4);                 
    }  
}
