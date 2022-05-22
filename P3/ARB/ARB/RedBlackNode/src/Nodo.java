//import classes and packages  
import java.util.Scanner;  
  
//creating a node for the red-black tree. A node has left and right child, element and color of the node  
class Nodo  
{      
    Nodo Izquierdo, Derecho;  
    int dato;  
    int color;  
  
    //constructor to set the value of a node having no left and right child  
    public Nodo(int element)  
    {  
        this( element, null, null );  
    }   
  
    //constructor to set value of element, leftChild, rightChild and color  
    public Nodo(int element, Nodo Izquierdo, Nodo Derecho)  
    {  
        this.dato = element;  
        this.Izquierdo = Izquierdo;  
        this.Derecho = Derecho;  
        color = 1;  
    }      
}  
  
//create class CreateRedBlackTree for creating red-black tree  
class Arbol  
{  
    private static Nodo nullNode;   //define null node  
    private Nodo actual;   //define current node   
    private Nodo padre;    //define parent node   
    private Nodo cabeza;   // define header node  
    private Nodo grand; //define grand node  
    private Nodo great; //define great node  
  
    //create two variables, i.e., RED and Black for color and the values of these variables are 0 and 1 respectively.   
    static final int RED   = 0;  
    static final int BLACK = 1;      
  
    // using static initializer for initializing null Node  
    static   
    {  
        nullNode = new Nodo(0);  
        nullNode.Izquierdo = nullNode;  
        nullNode.Derecho = nullNode;  
    }  
  
  
    // Constructor for creating header node   
    public Arbol(int cabeza)  
    {  
        this.cabeza = new Nodo(cabeza);  
        this.cabeza.Izquierdo = nullNode;  
        this.cabeza.Derecho = nullNode;  
    }  
  
    // create removeAll() for making the tree logically empty  
    public void removeAll()  
    {  
        cabeza.Derecho = nullNode;  
    }  
  
    //create method checkEmpty() to check whether the tree is empty or not  
    public boolean vacio()  
    {  
        return cabeza.Derecho == nullNode;  
    }  
  
    //create insertNewNode() method for adding a new node in the red black tree  
    public void insertarNodo(int dato )  
    {  
        actual = padre = grand = cabeza;      //set header value to current, parent, and grand node  
        nullNode.dato = dato;          //set newElement to the element of the null node  
  
        //repeat statements until the element of the current node will not equal to the value of the newElement  
        while (actual.dato != dato)  
        {              
            great = grand;   
            grand = padre;   
            padre = actual;  
  
            //if the value of the newElement is lesser than the current node element, the current node will point to the current left child else point to the current right child.  
            actual = dato < actual.dato ? actual.Izquierdo : actual.Derecho;   
  
            // Check whether both the children are RED or NOT. If both the children are RED change them by using handleColors() method          
            if (actual.Izquierdo.color == RED && actual.Derecho.color == RED)  
                cambioColor( dato );  
        }  
              
        // insertion of the new node will be fail if will already present in the tree  
        if (actual != nullNode)  
            return;  
  
        //create a node having no left and right child and pass it to the current node   
        actual = new Nodo(dato, nullNode, nullNode);  
  
        //connect the current node with the parent    
        if (dato < padre.dato)  
            padre.Izquierdo = actual;  
        else  
            padre.Derecho = actual;          
        cambioColor( dato );  
    }  
  
    //create handleColors() method to maintain the colors of Red-black tree nodes  
    private void cambioColor(int dato)  
    {  
        // flip the colors of the node  
        actual.color = RED;    //make current node RED  
        actual.Izquierdo.color = BLACK;    //make leftChild BLACK  
        actual.Derecho.color = BLACK;   //make rightChild BLACK  
  
        //check the color of the parent node  
        if (padre.color == RED)     
        {  
            // perform rotation in case when the color of parent node is RED  
            grand.color = RED;  
              
            if (dato < grand.dato && grand.dato != dato && dato < padre.dato)  
                padre = rotacion( dato, grand );  // Start dbl rotate  
            actual = rotacion(dato, great );  
            actual.color = BLACK;  
        }  
          
        // change the color of the root node with BLACK  
        cabeza.Derecho.color = BLACK;   
    }  
  
    //create performRotation() method to perform dbl rotation  
    private Nodo rotacion(int newElement, Nodo parent)  
    {  
        //check whether the value of the newElement is lesser than the element of the parent node or not  
        if(newElement < parent.dato)  
            //if true, perform the rotation with the left child and right child based on condition and set return value to the left child of the parent node  
            return parent.Izquierdo = newElement < parent.Izquierdo.dato ? rotacionIzquierda(parent.Izquierdo) : rotacionDerecha(parent.Izquierdo) ;    
        else  
            //if false, perform the rotation with the left child and right child based on condition and set return value to the right child of the parent node  
            return parent.Derecho = newElement < parent.Derecho.dato ? rotacionIzquierda(parent.Derecho) : rotacionDerecha(parent.Derecho);    
    }  
  
    //create rotationWithLeftChild() method  for rotating binary tree node with left child   
    private Nodo rotacionIzquierda(Nodo node2)  
    {  
        Nodo node1 = node2.Izquierdo;  
        node2.Izquierdo = node1.Derecho;  
        node1.Derecho = node2;  
        return node1;  
    }  
  
    // create rotationWithRightChild() method for rotating binary tree node with right child  
    private Nodo rotacionDerecha(Nodo node1)  
    {  
        Nodo node2 = node1.Derecho;  
        node1.Derecho = node2.Izquierdo;  
        node2.Izquierdo = node1.Izquierdo;  
        return node2;  
    }  
  
    // create nodesInTree() method for getting total number of nodes in a tree  
    public int nodosTotales()  
    {  
        return nodosTotales(cabeza.Derecho);  
    }  
    private int nodosTotales(Nodo node)  
    {  
        if (node == nullNode)  
            return 0;  
        else  
        {  
            int size = 1;  
            size = size + nodosTotales(node.Izquierdo);  
            size = size + nodosTotales(node.Derecho);  
            return size;  
        }  
    }  
    // create searchNode() method to get desired node from the Red-Black tree  
    public boolean buscar(int dato)  
    {  
        return searchNode(cabeza.Derecho, dato);  
    }  
    private boolean searchNode(Nodo node, int value)  
    {  
        boolean check = false;  
        while ((node != nullNode) && check != true)  
        {  
            int nodeValue = node.dato;  
            if (value < nodeValue)  
                node = node.Izquierdo;  
            else if (value > nodeValue)  
                node = node.Derecho;  
            else  
            {  
                check = true;  
                break;  
            }  
            check = searchNode(node, value);  
        }  
        return check;  
    }  
  
    //create preorderTraversal() method to perform inorder traversal  
    public void preOrder()  
    {  
        preOrder(cabeza.Derecho);  
    }  
    private void preOrder(Nodo node)  
    {  
        if (node != nullNode)  
        {  
            char c = 'R';  
            if (node.color == 1)  
                c = 'B';  
            System.out.print(node.dato +""+c+" ");  
            preOrder(node.Izquierdo);               
            preOrder(node.Derecho);  
        }  
    }  
  
    //create inorderTraversal() method to perform inorder traversal   
    public void inOrder()  
    {  
        inOrder(cabeza.Derecho);  
    }  
    private void inOrder(Nodo node)  
    {  
        if (node != nullNode)  
        {  
            inOrder(node.Izquierdo);  
            char c = 'R';  
            if (node.color == 1)  
                c = 'B';  
            System.out.print(node.dato +""+c+" ");  
            inOrder(node.Derecho);  
        }  
    }  
  
    //create postorderTraversal() method to perform inorder traversal   
    public void postOrder()  
    {  
        postOrder(cabeza.Derecho);  
    }  
    private void postOrder(Nodo node)  
    {  
        if (node != nullNode)  
        {  
            postOrder(node.Izquierdo);               
            postOrder(node.Derecho);  
            char c = 'R';  
            if (node.color == 1)  
             c = 'B';  
            System.out.print(node.dato +""+c+" ");  
        }  
    }       
}  
  
//create class RedBlackTreeExample having main() method  
class Ejemplo  
{  
    //main() method start  
    public static void main(String[] args)  
    {    
        //create instance of the Scanner class  
        Scanner sc = new Scanner(System.in);  
  
        //Create instance of the createRedBlackTree class and pass minimum integer value to the constructor to make it header node  
        Arbol arbol = new Arbol(Integer.MIN_VALUE);   
        char opcion;  
  
        //create switch case for performing the operation in Red Black Tree  
        int opt;   
        do      
        {  
            System.out.println("\nMENU:\n");  
            System.out.println("1. Insertar un Nodo ");  
            System.out.println("2. Buscar un Nodo");  
            System.out.println("3. inOrder");  
            System.out.println("4. Salir");  
            /*System.out.println("5. Eliminar TODOS los datos");   
            System.out.println("6. postOrder");  
            System.out.println("7. preOrder");  
            System.out.println("8. inOrder");  */
  
            opt = sc.nextInt();
                       
            switch (opt)  
            {  
                case 1 :   
                    System.out.println("Inserta el dato");  
                    arbol.insertarNodo( sc.nextInt() );                       
                    break;                            
                case 2 :   
                    System.out.println("Ingresa el dato a buscar");  
                    System.out.println(arbol.buscar( sc.nextInt() ));  
                    break;                                            
                case 3 :   
                    System.out.println("\ninOrder:\n");  
                    arbol.inOrder();  
                    break;     
                /*case 4 :   
                    System.out.println(obj.vacio());  
                    break;       
                case 5 :   
                    obj.removeAll();  
                    System.out.println("\nTree Cleared successfully");  
                    break;  
                case 6 :   
                    System.out.println("\nDisplay Red Black Tree in Post order");  
                    obj.postOrder();  
                    break;  
                case 7 :   
                    System.out.println("\nDisplay Red Black Tree in Pre order");  
                    obj.preOrder();  
                    break;  
                case 8 :   
                    System.out.println("\nDisplay Red Black Tree in In order");  
                    obj.inOrder();  
                    break;  */
                default :   
                    System.out.println("\n ");  
                    break;      
            }  
            /*System.out.println("\nPress 'y' or 'Y' to continue \n");  
            opcion = sc.next().charAt(0);          */                
        } while (opt != 4);                 
    }  
}  