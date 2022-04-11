package ru.netology

fun main() {
    val itemPrice = 100
    val discount = 10
    val minDiscount=1000
    val maxDiscount=10000
    val percentDiscount: Double = 0.005
    val regularCustomer: Boolean =true
    val regularDiscount: Double = if(regularCustomer) 0.01 else 0.0
    val itemCount = 100
    val price: Int =itemCount*itemPrice
    println("Покупка $itemCount композиций на сумму $price руб.")
    val haveDiscount: Double = if(price<=maxDiscount) 0.0 else percentDiscount
    val haveDiscount2: Int = if(price<=maxDiscount && price>=minDiscount) discount else 0
    val afterDiscount: Double =price - price * haveDiscount - haveDiscount2
    val rubDiscount:Int = afterDiscount.toInt()
    val kopDiscount=((afterDiscount*100)%100).toInt()
    println("После применения скидки за количество  $rubDiscount  руб. $kopDiscount коп.")
    val afterRegularDiscount =afterDiscount-afterDiscount*regularDiscount
    val rubRegularDiscount:Int = afterRegularDiscount.toInt()
    val kopRegularDiscount=((afterRegularDiscount*100)%100).toInt()
    println("После применения скидки Постоянного покупателя $rubRegularDiscount руб. $kopRegularDiscount коп.")
}
