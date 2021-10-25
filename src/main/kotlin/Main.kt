fun main(args: Array<String>) {
    var diametroDoCirculo = 0
    var areaDoCirculo = 0.0
    var perimetroDoCirculo = 0.0
    var pi = 3.14
    var raio = 6

    diametroDoCirculo = raio * 2
    areaDoCirculo = pi * (raio * raio)
    perimetroDoCirculo = 2 * pi * raio

    print("O diâmetro do círculo é = ${diametroDoCirculo.toDouble()}")
    print("\nA área do círculo é = $areaDoCirculo")
    print("\nO perímetro do círculo é = $perimetroDoCirculo")



}