import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble
object q1 extends App{
    printf("Enter the temperature in celcuis:");
    var r=readDouble();
    var result:Double=ctf(r);
    printvalue(result);

    def ctf(r:Double):Double=1.8*r+32;
    
    def printvalue(result:Double)={
      printf("\ntemperature in farenheit is:%f",result);
    }
}