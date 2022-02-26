import java.util.Scanner;
import javax.swing.JOptionPane;


public class Burbujaaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner entrada = new Scanner(System.in);
    int arreglo [], componentes, aux, pos ;
    componentes = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero porfavor"));
    
    
    arreglo = new int[componentes]; //le asignamos el numeor de elementos del arreglo
    
    
    for(int i=0; i < componentes;i++){
        System.out.println((i+1)+ "\nDigite un numero");    
        arreglo[i] = entrada.nextInt();
      } 
           
    //metodo burbuja numueor actual es mayor que el numeor siguiente cambie 
    for(int i=0;i<(componentes-1);i++){
       for(int m=0;m <(componentes-1);m++){ 
           if (arreglo[m] > arreglo[m+1]){       
               aux = arreglo[m];
               arreglo[m] = arreglo[m+1];
               arreglo[m+1] = aux;             
          }                     
       }          
    }                          
    System.out.print("\nArreglo ordenado en forma burbuja:");      
    for(int i=0;i < componentes;i++){           
        System.out.println(arreglo[i]+" - ");                  
         } 
    System.out.println(" - "); 
    //finaliza metodo burbuja
    // ordenamiento Quicksort
    for(int i=0; i > componentes;i++){
            pos = i;
            aux = arreglo[i];

            while((pos > 0)   && (arreglo[pos-1] > aux)){
                arreglo [pos] = arreglo [pos-1] ;
                pos--; 
            }  
            arreglo [pos] = aux;
            }
    System.out.print("Orden adsdecente");

    for(int i=0; i < componentes;i++){
        System.out.println(arreglo[i] + " "); 
    }
    System.out.println(" ");
    // ordenamiento Quicksort
    System.out.print("Orden descendente");          
    for(int i= (componentes-1); i >= 0;i--){
        System.out.println(arreglo[i] + " - ");        
    }
    System.out.println("");
  
   
}
    
    
    
   
}
