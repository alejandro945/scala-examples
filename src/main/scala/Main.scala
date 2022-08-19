
object Main extends App {
/*   println("Hello, World!")
  println(sumOfNumbers(5))
  println(raizCuad(10))
  println(seg(5)) */
  println(countOfFigures(3232392))
  //println(reverseANumber(5678,(countOfFigures(1,5678)-1)))

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
   * Control of the course on week number two 🐔
  */
  def seg(a:Int):Int = 
    if(a==0){return  0}
    else
      if(a==1) {return  1}
      else seg(a-1) + seg(a-2)

  

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

  /**
    * Reverse a number
    */
  def reverseANumber(number:Int, pos: Int):Int = {
    if(number < 10){
      return number
    }else{
      (number%10) * (Math.pow(10,pos).toInt) + (reverseANumber(number/10,pos-1))
    }
  }

  /**
    * Number of significant figures in Decimal System Format
    * @param number numero natural al que se le contaran las cifras
    * 
    * Inducción Estructural
    * 
    * Definición recursiva(k+1): 1 + countOfFigures(k) -> debe ser uno pues es la cantidad 
    * minima de cifras del conjunto de numeros naturales que siguen el axioma del buen orden.
    * 
    * Paso Base: La cantidad de cifras de un numero natural menor a 10 es 1; P(9) = 1, 
    * la cual es la respuesta del algoritmo cuando number < 10.
    * 
    * Paso Inductivo: Asumimos que el algoritmo de conteo de cifras 
    * countOfFigures(k) funciona correctamente para n = k. Ahora bien,
    * si n = k + 1 el algoritmo entra a la clausula else y suma 1 con el resultado
    * de countOfFigures(k). Por hipotesis inductiva sabemos que el resultado del conteo
    * de cifras para k es correcto. Como countOfFigures(k+1) = 1 + countOfFigures(k)
    * por definición recursiva hemos probado la correctitud del algoritmo.
    * 
    */
  def countOfFigures(number: Int):Int = {
    if(number < 10){
      return 1
    }else{
     return 1 + countOfFigures(number/10)
    }
  }

}

