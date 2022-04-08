package aa;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Practica02 {

 List <Integer> list = new ArrayList<Integer>();

public static List<Integer> concat (List<Integer> A ,List<Integer> B ){

  int len = A.size() + B.size();
          List<Integer> concat = new ArrayList<Integer>(len);
          int position = 0;
          for (int object : A)
          {
              concat.add(position,object);
              position++;
          }
          for (int object : B)
          {
              concat.add(position,object);
              position++;
          }

          return concat;



}



public static List<Integer> repeticiones (List<Integer> A  ){
  List<Integer>aux=new ArrayList<Integer>();;

  for (int i=0 ; i<A.size();i++)  {
    if (!aux.contains(A.get(i))) {
      aux.add(A.get(i));
    }


  }


return aux;





}






  public static void main(String args[]) {




  List<Integer> lista = new ArrayList();
  List<Integer> lista2 = new ArrayList();
  List<Integer> lista3 = new ArrayList();
  List<Integer> listF = new ArrayList();

 Scanner reader = new Scanner(System.in);
 Scanner reader2 = new Scanner(System.in);
 int numero = 0;
 int numero2 =0;

  System.out.println("Ingresa el primer conjunto,0 para salir(0 no se guardara en el conjunto)");

do {
  try{
    numero = reader.nextInt();
    if (numero==0) {
      break;
    }
    lista.add(numero);
  }catch(Exception ime){
    System.out.println("Solo numeros por favor");
    reader.next();

  }
} while (numero!=0);


System.out.println("Ingresa el segundo conjunto,0 para salir(0 no se guardara en el conjunto)");

  do {
    try{
      numero2 = reader.nextInt();
      if(numero2==0){
        break;
      }
      lista2.add(numero2);
    }catch (Exception ime){
      System.out.println("Solo numeros por favor");
      reader.next();

    }
  } while (numero2!=0);



lista=repeticiones(lista);
lista2=repeticiones(lista2);
System.out.println("El primer conjunto es:"+ lista.toString());
System.out.println("El segundo conjunto es:"+lista2.toString());
lista3=concat(lista,lista2);
listF=repeticiones(lista3);
System.out.println(listF.toString());

  }


}
