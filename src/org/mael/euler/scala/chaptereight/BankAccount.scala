package org.mael.euler.scala.chaptereight

class BankAccount(initialBalance: Double) {
  var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount; balance
  }

  def withdraw(amount: Double) = {
    balance -= amount; balance
  }

}

class SavingsAccount(initialBalance: Double)
  extends BankAccount(initialBalance) {

  private[this] var freeDeposits = 3
  private[this] var freeWithdrawal = 3

  def earnMonthlyInterest(rate: Double) {
    this.freeDeposits = 3
    this.freeWithdrawal = 3
    this.balance *= (1.0 + rate)
  }

  override def deposit(amount: Double) = {
    if (this.freeDeposits > 0)
      this.freeDeposits -= 1
    super.deposit(amount)
  }

  override def withdraw(amount: Double) = {
    if (this.freeWithdrawal > 0)
      this.freeWithdrawal -= 1
    super.deposit(amount)
  }

}