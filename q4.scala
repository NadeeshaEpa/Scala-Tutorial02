import scala.io.StdIn.readInt
import scala.io.StdIn.readDouble
object q1 extends App{
    var price:Double=24.95;
    printf("Enter the number of books:");
    var no=readInt();
    var result:Double=wholecost(no);
    printf("\nThe wholecost is:%f",result);
    
    def bookprice(no:Int):Double=price*no;
    def discount(no:Int):Double=bookprice(no)*40/100;
    def cost(no:Int):Double={
      if(no>50){
        return 0.75*(no-50)+50*3;
      }else{
        return no*3;
      }
    }
    def wholecost(no:Int):Double={
      return bookprice(no)-discount(no)+cost(no);
    }
   
}