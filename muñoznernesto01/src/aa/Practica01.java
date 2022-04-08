package aa;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Practica01 {
      int x,y,z,w;
      Tuple<Integer,Integer> tupla ;

     public int cuadrado(int n){
       return n*n;
     }

     public List<Tuple>  desigualdad ( int n ){
       List<Tuple> list =new ArrayList<Tuple>();
       x=0;
       y=0;
       z=1;
       w=2;
       while( this.cuadrado(x)+this.cuadrado(y)< n ) {

         tupla=new Tuple<Integer,Integer>(x,y);
         list.add(tupla);



          if (this.cuadrado(x)+this.cuadrado(z)< n ) {
            tupla=new Tuple<Integer,Integer>(x,z);
            list.add(tupla);
            tupla=new Tuple<Integer,Integer>(z,x);
            list.add(tupla);

          }
          if (this.cuadrado(x)+this.cuadrado(w)< n ) {
            tupla=new Tuple<Integer,Integer>(x,w);
            list.add(tupla);
            tupla=new Tuple<Integer,Integer>(w,x);
            list.add(tupla);

          }
         x++;
         y++;
         z++;
         w++;
       }


       return list;

     }

    public static void main(String args[]) {
      Practica01 prueba ;
      prueba=new Practica01();
      Scanner in = new Scanner(System.in);
      System.out.println("Ingresa n");
      int n = in.nextInt();
      System.out.println(prueba.desigualdad(n));



    }
}
