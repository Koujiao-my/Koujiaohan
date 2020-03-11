import scala.io.StdIn

object TestRikao {
  def main(args: Array[String]): Unit = {
    println("请输入一个数：")
    var sc : Int=StdIn.readInt()
    println(sc+"的阶乘："+digui(sc))

  }
  def digui(n : Long): Long ={
    if (n==1){
      return 1
    }else{
      return n * digui(n-1)
    }
  }
}
