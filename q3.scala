import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble
object q1 extends App{
    printf("Enter the radius:");
    var r=readDouble();
    var result:Double=volume(r);
    printvalue(result);

    def volume(r:Double):Double=3*r*r*r*math.Pi/4;
    
    def printvalue(result:Double)={
      printf("\nVolume of the the sphere is:%f",result);
    }
}