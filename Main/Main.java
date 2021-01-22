package Main;

import Nodo.Nodo;
import Regula_U2.Regula_U4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
     public static int  []A;
     public static void main(String args[]) throws Exception{
    Scanner leer = new Scanner(System.in);
        Regula_U4 obj = new Regula_U4();
      
       boolean continuar = true;
          Object Procesos;
       int  menu=0; 
        while(continuar){
    
        System.out.println("\n BIENVENIDOS AL MENU DE LISTAS ENLAZADAS \n"
                   + "1: INSERTAR NODOS AL  ARBOL\n"
                   + "2: RECORRIDO EN INORDEN \n"
                   + "3: RECORRIDO EN POSORDEN \n"
                   + "4: RECORRIDO EN PREORDEN "+"\n"
                   + "5: IMPRIMIR LA ALTURA  "+"\n"
                   + "6: IMPORMIR CANTIDAD DE NODO "+" \n"
                   + "7: mostrar elcontenido txt"+"\n"
                   + "8: BUSCAR UN NODO EN ESPESIFICO"+"\n"
                   + "9: Salir");
        menu=leer.nextInt();
        
          switch(menu){
              case 1:  
                  String  cadena="C:\\Users\\BIENVENIDOS\\Desktop\\Regula.txt";
        FileReader f = new FileReader(cadena);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
           
            System.out.println(cadena);
        
        }
        for(int i=0;i<A.length;i++){
            A[i]=Integer.parseInt(cadena);
            int num=A[i];
            obj.Insertar(num,1);
        }
                
        
          
            
                break;
            case 2: 
                Nodo raiz;
                obj.recorridoInorden(obj.nodoRaiz);
               break;
            case 3:
                 obj.recorridoPosorden(obj.nodoRaiz);
                
                break;
            case 4:
                obj.recorridoPreorden(obj.nodoRaiz);
                break;
            case 5: System.out.println("******************************************************");
                    System.out.println(" LA ALTURA DEL ARBOL ES: ["+obj.ImprimirAltura(obj.nodoRaiz,1)+"]");
                    System.out.println("******************************************************");
                break;
                case 6:
                    System.out.println(obj.cantidad());
                break;
                 case 7:
                   //  muestraContenido("");
                   
                   
                break;
                case 8:
                     System.out.println("INGRESA UN NODO QUE DESEAS BUSCAR");
                      //num1=leer.nextInt();
                      System.out.println("******************************************************");
                    //System.out.println(" ENCONTRO EL NODO : ["+obj.BuscarNodo(num1)+"]");
                    System.out.println("******************************************************");
                    
                   
                break;
                case 9:
               System.out.println("fuera");
                    continuar =false;
                break;
                 default:
                 System.out.println("");
                 break;
           
          }
     }
  }
    
}

