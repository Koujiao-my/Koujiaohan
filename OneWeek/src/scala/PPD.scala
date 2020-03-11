object PPD {
  def main(args: Array[String]): Unit = {
    var a=0
    var b=0
    var c=0
    for (i <- 100 until 1000){
      a=i%10
      b=i/10%10
      c=i/100
      if (a*a*a+b*b*b+c*c*c==i){
        println("水仙花数："+i+"\t")
      }
    }
  }
}
