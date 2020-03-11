import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object demo {
  def main(args: Array[String]): Unit = {
    //使用Spark框架在IDEA里面实现wordcount程序

    //创建Spark的配置对象
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("Wordcount")
    //获得上下文环境对象
    val sc: SparkContext = new SparkContext(conf)
    //在上下文环境中获取文件
    //从文件中读取内容，一行一行的字符串
    val lineRDD: RDD[String] = sc.textFile("input")
    //将一行一行的字符串切分成单词
    val wordRDD: RDD[String] = lineRDD.flatMap(line=>line.split(" "))
    //将单词转换成：word=>(word,1),方便统计
    val wordOneRDD: RDD[(String, Int)] = wordRDD.map(word=>(word,1))
    //使用spark特有的方法进行聚合
    val wordSumRDD: RDD[(String, Int)] = wordOneRDD.reduceByKey((x, y)=>{x+y})
    //将统计结果采集出来
    val result: Array[(String, Int)] = wordSumRDD.collect()
    //将结果打印到控制台
    result.foreach(println)
    //释放资源
    sc.stop()


  }
}
