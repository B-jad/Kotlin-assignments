//fun main(){
//    var account1 = SavingsAccount("12","Bhaumik", 800.00)
//    var account2 = CheckingAccount("41","Vijay", 1500.00)
//    println("${account1.accountNumber}, ${account1.accountHolderName}, ${account1.balance}")
//    println("${account2.accountNumber}, ${account2.accountHolderName}, ${account2.balance}")
//    account1.deposit(100.00)
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
//interface BankAccount {
//
//    fun deposit(amount: Double)
//    fun withdraw(amount: Double)
//    fun getBalance()
//}
//
//class SavingsAccount (val accountNumber: String, val accountHolderName: String, var balance: Double, val interestRate: Double = 2.5) :BankAccount{
//    override fun deposit(amount: Double) {
//        balance +=amount
//    }
//
//    override fun withdraw(amount: Double) {
//        var deduction = if(balance > 1000) 0.00; else 0.02*amount;
//        if(balance>=(amount+deduction)) balance-=(amount+deduction);
//        else println("Insufficient funds in $accountNumber:$accountHolderName")
//    }
//
//    override fun getBalance() {
//        println(balance)
//    }
//}
//
//class CheckingAccount (val accountNumber: String, val accountHolderName: String, var balance: Double, val overDraftLimit: Double = 500.00) :BankAccount{
//    override fun deposit(amount: Double) {
//        balance +=amount
//    }
//
//    override fun withdraw(amount: Double) {
//        var deduction = if(balance > amount) 0.00; else 50.00;
//        var afterDeduction = balance - amount - deduction
//        if(afterDeduction>=(-1)*overDraftLimit) balance=afterDeduction;
//        else println("Overdraft limit reached in $accountNumber:$accountHolderName")
//    }
//
//    override fun getBalance() {
//        println(balance)
//    }
//}
