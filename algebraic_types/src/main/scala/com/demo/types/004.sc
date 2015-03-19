import com.demo.types.{OEmpty, OCons}


val ols = OCons(1, OCons(2, OCons(3, OEmpty)))

// we took that one parameter and pulled it outside.
ols.map((x:Int) => x * x)

