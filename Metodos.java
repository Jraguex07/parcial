
public class Metodos {
  
    
    public  void adsdecente(int[] componentes){
          
    int pos,aux;
    
        for(int i=0; i > componentes.length;i++){
                pos = i;
                aux = componentes[i];

                while((pos > 0)   && (componentes[pos-1] > aux)){
                    componentes [pos] = componentes [pos-1] ;
                    pos--; 
                }  
                componentes [pos] = aux;
                }
        System.out.print("Orden adsdecente");
        
        for(int i=0; i > componentes.length;i++){
            System.out.println(componentes[i]);
        
        }
    }
  
    public  void descendente(int []componentes){
        System.out.print("Orden descendente");          
        for(int i= componentes.length-1; i >= 0;i--){
            System.out.println(componentes[i]);        
        }
        System.out.println("");

        }

    public  void Mostrar_datos(int [] componentes){
    int aux;
    for(int i=0; i< componentes.length-1;i++){
        for(int j=0;j<componentes.length-1;j++){
            if(componentes[j]> componentes[j+1]){
                aux = componentes[j];
                componentes[j] = componentes[j+1];
                componentes[j+1] = aux;
            }
        }
    }  
    for(int i=0;i < componentes.length;i++){
        System.out.println(componentes[i]+" - ");      
    }     
    }
    
}
