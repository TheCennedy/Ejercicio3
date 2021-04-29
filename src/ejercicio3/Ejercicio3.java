/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Karol Cobos
 */
public class Ejercicio3 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
       int suma=0;
      // double media=1;
      //  double aux=1;
        long promed=0;
        int n1;
        int n2;
       // int ifactorial=10;
       // int factorial=1;
        System.out.println("-----------------Ejercicio 1 -------------");
     //   for(int i=1;i<=102;i++){
      //      suma= suma+i;
      //  }
     //   System.out.println("la suma de 0 al 102 es : "+ suma);
        System.out.println("-----------------Ejercicio 2 -------------");
    //   for(int i=ifactorial;i>0;i--){
      //   factorial = factorial*i;
      //  }
       // System.out.println("El factorial del 1 al 10. es : "+ factorial);
        System.out.println("-----------------Ejercicio 3 -------------");
      //  System.out.println("Introduzca un numero numero");
     //   n1 = sc.nextInt();
       // for(int i=2;i<=n1;i++){
        //   aux=aux*i;
        //}
        //System.out.println("El factorial de "+n1+" es: "+aux);
    
        System.out.println("-----------------Ejercicio 4 -------------");
       // System.out.println("Introduzca un numero numero");
       //   n1 = sc.nextInt();
       //  for(int i=0;i<=n1;i++){
         // aux=aux+i;
        // }
        //  media = aux/n1;
        //  System.out.println("La media es  "+media); 
          System.out.println("-----------------Ejercicio 5-------------");
        Scanner leer = new Scanner (System.in);
        int num [] = new int [3];
        System.out.println("Ingrese los numeros que va a sumar y sacar el promedio");
        int sum = 0; 
        for (int i = 0; i < 3; i++) {
            num[i] = leer.nextInt();
            sum = sum+ num[i];
            System.out.println("suma="+sum);
        }
        int mayor = num[0];
        int menor = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>mayor) {
                mayor = num[i];
            }
            if (num[i]<menor) {
                menor = num[i];
            }
            
        }
        int distacia = mayor-menor;
        float promedio = sum/3;
        System.out.println("El promedio es: "+ promedio );
        System.out.println("El numero mayor es: " + mayor +" y el numero menor es: "+ menor );
        System.out.println("La distancia entre entre los numeros es: "+ distacia );

          System.out.println("-----------------Ejercicio 6-------------");
   //       Scanner entrada = new Scanner(System.in);
   //  String Dia[]={"Domingo", "Lunes", "Martes", "Miercoles", "Jueves",
   //     "Viernes", "Sabado"};
   //   System.out.println("Favor de ingresar un numero del 1 al 7");
   //   int m= entrada.nextInt();
   //   if(m >= 1 && m <= 7){System.out.println("El dia "+m+" es "+Dia[m-1]);
   //   }
  //    else{System.out.println("Error, No es un dia de la semana");
   //   }
        System.out.println("-----------------Ejercicio 7--------------");  
      //  System.out.println("Matriz de personajes");
     //   sWar[0][0]="Darth Vader";
      //  sWar[0][1]="Kylo Ren";
      //  sWar[0][2]="Han solo";
       // sWar[0][3]="Ahsoka tano";
       // sWar[1][0]="Obi-Wan Kenobi";
      //  sWar[1][1]="Chewbacca";
      //  sWar[1][2]="Yoda";
      //  sWar[1][3]="Palpatine";
     //   sWar[2][0]="R2-D2";
       // sWar[2][1]="C-3PO";
      // sWar[2][2]="Boba Fett";
       // sWar[2][3]="The mandalorian";
       // int i,j;
       // for (i = 0;i < sWar.length; i++){
         //   for(j = 0; j < sWar[i].length; j++){
        //        System.out.print("["+sWar[i][j]+"]");
          //  }
        //}  
        System.out.println("-----------------Ejercicio 8--------------");
        }
        }
