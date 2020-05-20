package Lesson3

// деление
def closureDiv = { a, b -> return a / b }

// вычитание
def closureDif = { d, c -> return (d - c) }

// a/b - c
def closureExp = { a, b, c -> return (closureDif(closureDiv(a, b), c)) }

println(closureDiv(10, 2))
println(closureDif(100, 30))
println(closureExp(15, 3, 2))

