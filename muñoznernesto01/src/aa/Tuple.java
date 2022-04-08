package aa;

public class Tuple<X extends Comparable<X>,Y> implements Comparable<Tuple<X,Y>>{

public final X x;
public final Y y;

public Tuple(X x,Y y){

  this.x=x;
  this.y=y;

}
@Override
public String  toString(){
 return "("+this.x.toString()+","+this.y.toString()+")"  ;
}
@Override
public int compareTo(Tuple<X,Y> o){
  return x.compareTo(o.x);

}







}
