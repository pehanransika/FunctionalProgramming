object Main{

  def areaOfDisk(radius:Double):Double=
    math.Pi * radius * radius
  
  def convertTemp(temperature:Float):Float =
    temperature * 1.8f + 32

  def volSphere(radius:Int):Double =
    4.0/3.0 * math.Pi * radius * radius * radius

  def calTotalCost(copies: Int):Double = {
    val coverPrice =24.95
    val discount =0.4
    val newPrice =coverPrice*(1 - discount)

    val shippingCost=if(copies <= 50)
    {
      3.0
    }
    else
    {
      3.0 +(copies-50)*0.75
    }

    newPrice*copies+shippingCost
  }

  def calTotalTime(easyKM:Int,tempoKM:Int):Int = {
    val easy =8
    val tempo =7
    easy * easyKM + tempo * tempoKM
  }

  def main(args:Array[String]):Unit = {
 
    val diskRadius=5
    val temperature=35.0f
    val sphereRadius=5
    val copies=60
    val easyKM=4
    val tempoKM=3

    val area =areaOfDisk(diskRadius)
    val tempFara =convertTemp(temperature)
    val volume =volSphere(sphereRadius)
    val totalCost =calTotalCost(copies)
    val totalTime =calTotalTime(easyKM,tempoKM)

    println(s"Area = $area")
    println(s"$temperature Celsius is $tempFara in Fahrenheit")
    println(s"Volume = $volume")
    println(s"Total cost = $totalCost")
    println(s"Total Time = $totalTime")
  }
}
