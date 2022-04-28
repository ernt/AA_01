package aa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class longestincreasingSubsequence {

static void toString(Vector<Integer> array){
  for (int x : array)
    System.out.print(x + " ");
  System.out.println( );
}



static void crealista(int array[],int n){
  Vector<Integer> list[] = new Vector[n];
    for (int i = 0; i < list.length; i++)
        list[i] = new Vector<Integer>();

          list[0].add(array[0]);

          for (int i = 1; i < n; i++){
            for (int j = 0; j < i; j++){
      //list[i] = {Max(list[j])} + array[i]
      // where j < i and array[j] < array[i]
          if ((array[i] > array[j]) &&
              (list[i].size() < list[j].size() + 1))
              list[i] = (Vector<Integer>) list[j].clone();
    }


                  list[i].add(array[i]);
  }


      Vector<Integer> maximo = list[0];


  for (Vector<Integer> x : list)
    if (x.size() > maximo.size())
      maximo = x;


  toString(maximo);
}

public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Introduce la longitud del arreglo");
    int n =scan.nextInt();
  System.out.println("Introduce los elementos del arreglo");
    int arrs[]=new int [n];
      for (int i=0;i<n ; i++) {
          arrs[i]=scan.nextInt();
        }
          crealista(arrs, n);
}
}
