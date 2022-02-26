import java.util.Scanner;

public class Burbujaaa {
    Scanner entrada = new Scanner(System.in); // a nivek de clase 
    int arreglo [], componentes, aux, pos ;
    int[] arreglos = new int [10];
    public static void main(String[] args)
    {  
    Burbujaaa burbuja = new  Burbujaaa(); //instaciar la clase
    burbuja.menu();
    }
    
    public void ingresar_datos(){
    
    for(int i=0; i > arreglos.length;i++){
    
        System.out.println("Ingrese un valor");
        arreglos[i] = entrada.nextInt();
      }   
    }
    
    
    
    public void menu(){
        boolean  exit = false;
        int opcion;
    Metodos metodo =  new Metodos ();
    
        while(!exit) {
            System.out.println("------------Bienvenido a Citrix Connect-------------");
            System.out.println("Que desea realizar: \n"
                    + "0.ingresar datos\n "
                    + "1.mostrar valores\n"
                    + "2.odernado en forma ascendente\n"
                    + "3.ordenado en forma descendente"); 
            System.out.println("Digite una opcion");

            opcion = entrada.nextInt();
            switch(opcion) {

                
                case 0:
                    
                    ingresar_datos();
                case 1:   
                    metodo.Mostrar_datos(arreglos);
                    break;   

                case 2: 
                    metodo.adsdecente(arreglos);
                    break;  
                    
                    
                case 3:
                    metodo.descendente(arreglos);
                    break;
              
                case 4:
                    exit= true;
                    break;
                default: 
                    System.out.println("Se ha equivocado de menu de opcion");
                break;        
            } 
          }
    } 
}
