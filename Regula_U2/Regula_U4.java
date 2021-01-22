
package Regula_U2;

import Nodo.Nodo;


public class Regula_U4  {
    
    

    
   
    int altura;
   // 5,7,3,10,1,6,2,8,9,4
    int CantiadadNodos=0;
   public  Nodo nodoRaiz=null;
   public Nodo nodoPadre=null;
   public Nodo prueba;
   
    public void Insertar (int nodo,int CantiadadNodo){
        Nodo nodoActual = new Nodo(nodo);
        if(nodoPadre ==null){
            nodoPadre= nodoActual;
            nodoRaiz=nodoActual;   
        }else {
            
        if(nodoActual.elemento  <  nodoPadre.elemento){
           if(nodoPadre.izquierda==null){
           nodoPadre.izquierda=nodoActual;
           nodoPadre=nodoRaiz;
           }else{
                   nodoPadre = nodoPadre.izquierda;
                   Insertar(nodo,CantiadadNodos);
                    CantiadadNodos++;
           }    
                }else{
                   if(nodoPadre.Derecha==null){
                       nodoPadre.Derecha = nodoActual;
                    nodoPadre=nodoRaiz;
                   }else{
                   nodoPadre = nodoPadre.Derecha;
                   Insertar(nodo, CantiadadNodos);
                    CantiadadNodos++;
                   }
              }
        }
      
    }
    
    public int cantidad() {  
        return CantiadadNodos; 
    }

   public void recorridoInorden(Nodo reco ) {
        if (reco != null) {
            recorridoInorden (reco.izquierda); 
            System.out.print(": "+reco.elemento+"  ");
            recorridoInorden (reco.Derecha);
        } 
    }
   
     public int ImprimirAltura (Nodo reco,int nivel) {
         //
        if (reco != null) {
            
            ImprimirAltura (reco.izquierda,nivel+1);
            
            if (nivel>altura) altura=nivel;
            
            ImprimirAltura (reco.Derecha,nivel+1);
        } 
      return altura;
    } 
     
     
     
   public void recorridoPosorden (Nodo reco) {
        if (reco != null) {
            recorridoPosorden (reco.izquierda); 
            recorridoPosorden (reco.Derecha);
            System.out.print("  "+reco.elemento+ "  ");
        } 
    }
   public void recorridoPreorden (Nodo reco) {
        if (reco != null) {
            System.out.print(" "+ reco.elemento + " ");
            recorridoPreorden (reco.izquierda); 
            recorridoPreorden (reco.Derecha);
            
        } 
        
        
    }
    
}
