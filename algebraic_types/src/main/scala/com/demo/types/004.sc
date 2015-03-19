import com.demo.types.{OEmpty, OCons}


val ols = OCons(1, OCons(2, OCons(3, OEmpty)))

ols.map((x:Int) => x * x)

