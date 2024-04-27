public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try (Scanner op = new Scanner (System.in)) {
            // Lo que hace a qui es que es ingresando los tres numeros enteros y que todos sean diferentes y tambien para saber cual es el mayor de los numeros
            int n1,n2,n3;
      System.out.println("Ingrese el primer numero");
      n1 = op.nextInt();
      System.out.println("Ingrese el segundo umero");
      n2 = op.nextInt();
      System.out.println("Ingrese el tercer numero");
      n3 = op.nextInt();
      if( n1 != n2 && n1 != n3 && n2 != n3){
             if(n1 > n2){
                if(n1 > n3){
                  System.out.println("El numero mayor es: " +n1);
              }else{
                System.out.println("El numero mayor es: " +n3);
              }
    
      
      }else{
            if ( n2 > n3){
                System.err.println("El numero mayor es: " +n2);
            }else{
                System.out.println("El numero mayor es: " +n3);
            }
      }
     
      } else{
            System.out.println(" Los numeros deben ser diferentes");
      }
      
      // Este es para hacer la suma de los dos menores y la deferencia de los dos mayores
      int menor1,menor2,mayor;
      if(n1 < n2 && n1 < n3){
             menor1 = n1;
             if(n2 <n3){
                menor2 = n2;
                mayor = n3;
             }
             else{menor2 = n3;
               mayor = n2;}
             
  
      }else if(n2 < n1 && n2 < n1){
      menor1 = n2;
      if(n1 < n3){
            menor2 = n1;
            mayor = n3; 
  
      }
      else{menor2 = n3;
               mayor = n1;}
    } else{
     menor1 = n3;
     if(n1 < n2){
            menor2 = n1;
            mayor = n2;
     }
     else{menor2 = n2;
     mayor = n1;}
    }
    int sumaMenores,diferencia;
    sumaMenores = menor1 + menor2;
    diferencia = mayor - menor2;
    System.out.println(" la sauma de los numeros menores es: " +sumaMenores);
          }
          
          System.out.println("La diferencia de los mayores es: " +diferencia);
    
      //fin de codigo
      //Nombre: Erick Mateo Sequeira Centeno
      //Numero de carnet: 2024-1660U
   }
  }
  
      
  
  
  
    }
}
