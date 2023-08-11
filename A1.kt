//fun main(args: Array<String>) {
//    var account1 = BankAccount("12","Bhaumik", 1200.00)
//    var account2 = BankAccount("41","Vijay", 1500.00)
//    println("${account1.accountNumber}, ${account1.accountHolderName}, ${account1.balance}")
//    println("${account2.accountNumber}, ${account2.accountHolderName}, ${account2.balance}")
//    account1.deposit(1000.00)
//    account2.deposit(1200.00)
//    println("${account1.accountNumber}, ${account1.accountHolderName}, ${account1.balance}")
//    println("${account2.accountNumber}, ${account2.accountHolderName}, ${account2.balance}")
//    account1.withdraw(200.00)
//    account2.withdraw(4500.00)
//    println("${account1.accountNumber}, ${account1.accountHolderName}, ${account1.balance}")
//    println("${account2.accountNumber}, ${account2.accountHolderName}, ${account2.balance}")
//    account1.getBalance()
//    account2.getBalance()
//}
//
//class BankAccount(val accountNumber: String, val accountHolderName: String, var balance: Double)
//{
//    fun deposit(amount: Double)
//    {
//        balance += amount
//    }
//    fun withdraw(amount: Double)
//    {
//        if(balance>=amount) balance-=amount
//        else println("Insufficient funds in $accountNumber:$accountHolderName")
//    }
//    fun getBalance()
//    {
//        println(balance)
//    }
//}