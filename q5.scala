import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble
object q1 extends App{
    printf("Enter the distance at easy pace:");
    var a=readInt();
    printf("\nEnter the distance at tempo pace:");
    var b=readInt();
    var total=easy(a)+tempo(b);
    printf("\nThe total running time is:%d",total);
    
    def easy(x:Int)=8*x;
    def tempo(y:Int)=7*y;
}