package org.mael.euler.scala

class BankAccount {

  private var balance = 0.0

  def deposit(amount: Double) {
    balance += amount
  }

  def withdraw(amount: Double) {
    balance -= amount
  }

  def currentBalance = balance

}