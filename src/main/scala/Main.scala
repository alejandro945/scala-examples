object Main extends App {
  println("Hello, World!")
  println(sumOfNumbers(5))
  println(raizCuad(10))


  /**
  * Calculate the sum of the predecesors numbers from an specific one 🐨
  */
  def sumOfNumbers (number: Int): Int = {
    if(number == 1){
        return 1
    }else{
        number + sumOfNumbers(number-1)
    }
  }

  /**
  * Calculate root of x 🐧
  */
  def raizCuad (x: Double ) = {
    def abs(x:Double)=  if(x>0) x else -x
    def train(estim:Double, x: Double) = (estim + x/estim)/2
    def isAGoodTrain(estim: Double, x:Double) = abs(estim*estim - x) < 0.001
    def squareRoot(estim: Double, x: Double): Double = 
      if (isAGoodTrain(estim, x)) estim else squareRoot(train(estim, x), x)
    
    squareRoot(1,x)
  } 
  
}

