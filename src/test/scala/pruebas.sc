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

derivadaSuma(derivadaSuma(f1,f2),f3)(1)




//val df = derivada(f)
//val dg = derivada(g)
//val df_multi = derivadaMult(f, g)
//val d_div = derivadaDiv(f, g)



