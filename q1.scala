import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble
object q1 extends App{
    printf("Enter the radius:");
    var r=readDouble();
    var result:Double=area(r);
    printvalue(result);

    def area(r:Double):Double=r*r*math.Pi;
    
    def printvalue(result:Double)={
      printf("\nArea of the the disk is:%f",result);
    }
}