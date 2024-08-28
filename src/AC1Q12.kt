fun IMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}

fun main() {
    print(IMC(75.0, 1.80)) //chama a função (peso = 75kg e altura = 1.8)
}