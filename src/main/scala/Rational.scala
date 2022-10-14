class Rational(x:Int, y:Int){
    /**
      * Constants and properties of the object
      */
    private val m = mcd(x,y)
    def numerator = x / m;
    def denominator = y / m;

    /** 
      * Preconditions and assertions 
      */
    require(y>0, "The denominator must be positive")
    assert(m>0)

    /**
      * Specific functions that finds the
      * maximum multiple common of two integer
      * pass as parameters or basic operations between
      * rationals
      */
    private def mcd(a:Int, b:Int):Int = if(b==0) a else mcd(b,a%b)

    def +(r:Rational): Rational = { new Rational( numerator * r.denominator + denominator * r.numerator, denominator * r.denominator ) } 

    def -(r: Rational ): Rational = {new Rational (numerator *r.denominator - denominator*r.numerator , r.denominator*denominator )}

    def *(r:Rational) = { new Rational( numerator * r.numerator, denominator * r.denominator ) }

    def lessThan(r:Rational) = { numerator*r.denominator < denominator*r.numerator }

    def max(r:Rational) = if(lessThan(r)) r else this
    
    override def toString = s"numerator/denominator "
}