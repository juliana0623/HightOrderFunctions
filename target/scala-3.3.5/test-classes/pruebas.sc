import Derivacion._

val cte = (x: Double) => 3.0
val f = (x: Double) => (x * x)
val g = (x: Double) => (x * x * x)
val h = (x:Double) => f(x) / g(x)
val j = (x:Double) => g(x) / f(x)

val df = derivada(f)
val dg = derivada(g)
val df_multi = derivadaMult(f, g)
val d_div = derivadaDiv(f, g)



