class Coffee(
    var name: String = "",
    var price: Int = 0,
    var iced: Boolean = false,
) {

    val brand: String
        get() {
            return "스타벅스"
        }

    var quantity : Int = 0
        set(value) {
            if (value > 0) { // 수량이 0 이상인 경우에만 할당
                field = value
            }
        }

}

class EmptyClass

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000
    coffee.quantity = 1
    coffee.iced = true

    if (coffee.iced) {
        println("아이스 커피")
    }
    println("${coffee.brand} ${coffee.name} 가격은 ${coffee.price} 수량은 ${coffee.quantity}")
}
