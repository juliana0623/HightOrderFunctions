import Derivacion._

val cte = (x: Double) => 3.0
val f1 = (x: Double) => (x * x)
val f2 = (x: Double) => (x)
val f3 = (x: Double) => math.sin(x)
val f4 = (x:Double) => math.tan(x)
val f5 = (x:Double) => math.exp(x)
val f6 = (x:Double) => 1 / x
val f7 = (x:Double) => math.log(x)
val f8 = (x:Double) =>  math.sqrt(x)


derivada(cte)(2)
derivada(f1)(3)
derivada(f2)(2)
derivada(f3)(math.Pi/2)
derivada(f4)(1)
derivada(f5)(0)
derivada(f6)(1)
derivada(f7)(1)
derivada(f8)(4)

derivadaSuma(f2,cte)(5)
derivadaSuma(f1,f6)(2)
derivadaSuma(f8,f5)(-1)
derivadaSuma(f8,f5)(6)
derivadaSuma(f3, derivada(f3))(math.Pi)
derivadaSuma(f3, derivada(derivada(f3)))(math.Pi)
derivadaSuma(f7,f7)(0)
derivadaSuma(f7,f4)(2)
derivadaSuma((x: Double) => (f1(x)*f1(x))+f1(x)*f2(x),(x: Double) => f1(x)+f2(x))(3)
derivadaSuma((x: Double) => f3(f1(x)),(x: Double) =>f4(f6(x)))((math.Pi)/4)

derivadaDiv(cte, f1)(3)
derivadaDiv(f1, cte)(3)
derivadaDiv(cte, cte)(0)
derivadaDiv(f3, f4)(1)
derivadaDiv(f7, f1)(4)
derivadaDiv(f5, f1)(5)
derivadaDiv(f1, f2)(0)
derivadaDiv((x: Double) => f3(f1(x)), (x: Double) => f4(f6(x)))(math.Pi/4)
derivadaDiv(f6, f7)(1)
derivadaDiv(f8, f5)(400)
