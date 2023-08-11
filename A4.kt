fun main()
{
    val orderList = mutableListOf<Order>()
    orderList.add(Order(11, "Headphone"     ,3,400.00))
    orderList.add(Order(17, "Microprocessor",1,800.00))
    orderList.add(Order(20, "Stylus"        ,2,325.00))
    orderList.add(Order(53, "Keyboard"      ,1,900.00))
    orderList.add(Order(7 , "Cord"          ,6,200.00))
    orderList.add(Order(42, "USBDrive"      ,3,450.00))
    orderList.add(Order(23, "HardDisk"      ,8,500.00))
    
    println(calculateTotalValue(orderList[2]))
    println(calculateTotalOrderValue(orderList))
    println(findHighestValueOrder(orderList))
}

data class Order(val orderId: Int, var productName: String, var quantity: Int, var unitPrice: Double)

fun calculateTotalValue(order: Order) : Double
{
    return order.quantity*order.unitPrice
}

fun calculateTotalOrderValue(orderList: List<Order>) : Double
{
    return orderList.map{calculateTotalValue(it)}.reduce{sum, cursum -> sum+cursum}
}

fun findHighestValueOrder(orderList: List<Order>): Order?
{
    return orderList.maxByOrNull { calculateTotalValue(it) }
}