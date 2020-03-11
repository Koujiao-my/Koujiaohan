import util.control.Breaks._
object demo2 {
  def main(args: Array[String]): Unit = {


    //（1）构造第一个循环：循环输出100以内的奇数：不能被2整除的数值（5分）
    for(o<- 1 to 100){
      if (o%2==1){
        println(o)
      }
    }

  //使用while 循环到得到70以内能被7整除的数值，超过70跳出整个循环体终止循环（5分）
    breakable{
      for (i <- 1 to 100){
        if (i%7==0){
          if (i>70){
              break()
          }
          println(i)
        }
      }
    }


    //构造第循环：循环输出100以内的能被3整除的整数，但是9需要跳过【3，6，12.。。。。。】（5分）
    for (j <- 1 to 100){
        if (j%3==0 && j!=9){
          println(j)
        }
    }

    //循环到50时，跳出当前循环，执行下一个循环（5分
    for(a <-1 to 100){
      if (a!=50){
        println(a)
      }
    }


  }
}
