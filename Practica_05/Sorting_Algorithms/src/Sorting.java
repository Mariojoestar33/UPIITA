import java.util.Random;

public class Sorting {
    
    public void bubbleSort(int[] dato) {
            
        int aux;
        for (int i = 0; i < dato.length; i++) {
            for (int j = 0; j < dato.length - 1; j++) {
                if (dato[j] > dato[j + 1]) {
                    aux = dato[j];
                    dato[j] = dato[j + 1];
                    dato[j + 1] = aux;
                }
            }
        }
    }

    public void selectionSort(int[] dato) {
        int aux;
        for (int i = 0; i < dato.length; i++) {
            int min = i;
            for (int j = i + 1; j < dato.length; j++) {
                if (dato[j] < dato[min]) {
                    min = j;
                }
            }
            aux = dato[i];
            dato[i] = dato[min];
            dato[min] = aux;
        }
    }

    public void insertionSort(int[] dato) {
        int aux;
        for (int i = 1; i < dato.length; i++) {
            int j = i;
            while (j > 0 && dato[j] < dato[j - 1]) {
                aux = dato[j];
                dato[j] = dato[j - 1];
                dato[j - 1] = aux;
                j--;
            }
        }
    }

    public void mergeSort(int[] dato, int izquierda, int derecha) {
        if(izquierda < derecha) {
            int medio = (derecha + izquierda) / 2;
            mergeSort(dato, izquierda, medio);
            mergeSort(dato, medio + 1, derecha);
            unir(dato, izquierda, medio, derecha);
        } 
    }

    public void unir(int[] dato, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        int[] vectorIzquierdo = new int[n1];
        int[] vectorDerecho = new int[n2];

        for (int i = 0; i < n1; i++) {
            vectorIzquierdo[i] = dato[izquierda + i];
        }

        for (int i = 0; i < n2; i++) {
            vectorDerecho[i] = dato[medio + i + 1];
        }

        int i = 0, j = 0, k = izquierda;

        while(i < n1 && j < n2) {
            if(vectorIzquierdo[i] <= vectorDerecho[j]) {
                dato[k] = vectorIzquierdo[i];
                i++;
            } else {
                dato[k] = vectorDerecho[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            dato[k] = vectorIzquierdo[i];
            i++;
            k++;
        }   

        while(j < n2) {
            dato[k] = vectorDerecho[j];
            j++;
            k++;
        }

    }

    public void quickSort(int[] dato, int izquierda, int derecha) {

        int pivote=dato[izquierda]; 
        int i=izquierda;       
        int j=derecha;        
        int aux;
       
        while(i < j){                                                        
           while(dato[i] <= pivote && i < j) i++;
           while(dato[j] > pivote) j--;         
           if (i < j) {                                         
               aux= dato[i];                    
               dato[i]=dato[j];
               dato[j]=aux;
           }
         }
         
         dato[izquierda]=dato[j];                                     
         dato[j]=pivote;    
         
         if(izquierda < j-1)
            quickSort(dato,izquierda,j-1);       
         if(j+1 < derecha)
            quickSort(dato,j+1,derecha);        
         
      }

      public void countSort(int[] dato, int tamanio) {
        int[] output = new int[tamanio + 1];
        int max = dato[0];

        for (int i = 1; i < tamanio; i++) {
          if (dato[i] > max)
            max = dato[i];
        }

        int[] count = new int[max + 1];
    
        for (int i = 0; i < max; ++i) {
          count[i] = 0;
        }
    
        for (int i = 0; i < tamanio; i++) {
          count[dato[i]]++;
        }
    
        for (int i = 1; i <= max; i++) {
          count[i] += count[i - 1];
        }
    
        for (int i = tamanio - 1; i >= 0; i--) {
          output[count[dato[i]] - 1] = dato[i];
          count[dato[i]]--;
        }
    
        for (int i = 0; i < tamanio; i++) {
          dato[i] = output[i];
        }

      }
    
      public void heapSort(int []dato) {
        
        for(int i=dato.length/2-1;i>=0;i--) {
            ajustarHeap(dato,i,dato.length);
        }
                 
        for(int j=dato.length-1;j>0;j--) {
                         swap (dato, 0, j); 
                         ajustarHeap (dato, 0, j); 
                         
        }
    }
 
        public static void ajustarHeap(int []dato,int i,int tamanio) {
            int temp = dato [i]; 
            for (int k = i * 2 + 1; k < tamanio; k = k * 2 + 1) {
                    if (k + 1 <tamanio && dato [k] <dato [k + 1]) {
           k++;
       }
                    if (dato [k]> temp) {
           dato[i] = dato[k];
           i = k;
       }else {
           break;
       }
   }
            dato [i] = temp;
}

    public static void swap(int []arr,int a ,int b) {

        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public void mezclarVector(int[] array) {

    int index;
    Random random = new Random();
    for (int i = array.length - 1; i > 0; i--) {
        index = random.nextInt(i + 1);
        if (index != i) {
            array[index] ^= array[i];
            array[i] ^= array[index];
            array[index] ^= array[i];
        }
    }
}

    public void imprimirArreglo(int[] dato) {
        System.out.println("\n");
        for(int i = 0; i < dato.length; i++) {
            System.out.print(dato[i] + " ");
        }
    }

}
