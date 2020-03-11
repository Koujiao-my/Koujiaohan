object demo3 {
  def main(args: Array[String]): Unit = {

    var tuple1=("张三",99,"英语")
    var tuple2=("张三",87,"数学")
    var tuple3=("张三",85,"物理")
    var tuple4=("赵六",58,"英语")
    var tuple5=("赵六",54,"数学")
    var list1=List(tuple1,tuple2,tuple3,tuple4,tuple5)


    for (i<-list1){
      println(list1+"\n")
    }

    var avg=(tuple1._2+tuple2._2+tuple3._2)/3
    println("张三平均成绩："+avg)

    var avg2=(tuple4._2+tuple5._2)/2
    println("赵六平均成绩："+avg+"\n")


    //最高分
    var gao1=tuple1._2
    var gao2=tuple2._2
    var gao3=tuple3._2
    var zgao=0
    if (gao1>gao2 && gao1>gao3){
      println("张三最高分："+gao1+"\t科目："+tuple1._3)
      zgao+=gao1
    }else if (gao2>gao3){
      println("张三最高分："+gao2+"\t科目："+tuple2._3)
      zgao+=gao2
    }else{
      println("张三最高分："+gao3+"\t科目："+tuple3._3)
      zgao+=gao3
    }

    var gao4=tuple4._2
    var gao5=tuple5._2
    var lgao=0
    if (gao4>gao5){
      println("赵六最高分:"+gao4+"\t科目："+tuple4._3)
      lgao+=gao4
    }else{
      println("赵六最高分:"+gao5+"\t科目："+tuple5._3+"\n")
      lgao+=gao5
    }





    //最低分
    var fen1=tuple1._2
    var fen2=tuple2._2
    var fen3=tuple3._2
    var zdi=0
    if (fen1<fen2 && fen1<fen3){
      println("张三最低分："+fen1+"\t科目："+tuple1._3)
      zdi+=fen1
    }else if (fen2<fen3){
      println("张三最低分："+fen2+"\t科目："+tuple2._3)
      zdi+=fen2
    }else{
      println("张三最低分："+fen3+"\t科目："+tuple3._3)
      zdi+=fen3
    }

    var fen4=tuple4._2
    var fen5=tuple5._2
    var ldi=0
    if (fen4<fen5){
      println("赵六最低分:"+fen4+"\t科目："+tuple4._3)
      ldi+=fen4
    }else{
      println("赵六最低分:"+fen5+"\t科目："+tuple5._3+"\n")
      ldi+=fen5
    }



    //最高分
    if (zgao>lgao){
      println("所有学生最高分："+zgao)
    }else{
      println("所有学生最高分："+lgao+"\n")
    }


    //最低分
    if (zdi<ldi){
      println("所有学生最低分："+zdi)
    }else{
      println("所有学生最低分："+ldi+"\n")
    }


    //所有学生平均分数
    var Zavg=(tuple1._2+tuple2._2+tuple3._2+tuple4._2+tuple5._2)/5
    println("所有学生平均分数："+Zavg)


    //求出每个学生合计
    var zSum=tuple1._2+tuple2._2+tuple3._2
    println("张三分数合计："+zSum)
    var lSum=tuple4._2+tuple5._2
    println("赵六分数合计："+lSum)


    //所有学生合计
    println("所有学生合计："+(zSum+lSum))


    /*var list=List(("张三",99,"英语"),("张三",87,"数学"),("张三",85,"物理"),("赵六",58,"英语"),("赵六",54,"数学"))
    println(list)*/

  }
}
