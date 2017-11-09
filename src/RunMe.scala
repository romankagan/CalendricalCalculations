package com.autoanalytix

import scala.util.{Failure, Try, Success}

object RunMe extends App{


  /*
  def leapYears = Array(3,6,8,11,14,17,0)  //for 19th year the remainder is zero
  def cycleOfYears = 19
  def monthsInCycle = 235

  println("Please enter the year. To exit enter 0000")
  for (inputYear <- io.Source.stdin.getLines) {
    try {
      if(inputYear.toInt==0) System.exit(5150)
      printIfYearIsLeap(inputYear.toInt)
      molad(inputYear.toInt)
    } catch {
      case e:Exception => println("Please enter the numbers only")
    }
  }

  def printIfYearIsLeap(inputYear:Int): Unit ={
    if(isLeapYear(inputYear)){
      println(s"Year:$inputYear is leap")
    }else{
      println(s"Year:$inputYear is not leap")
    }
  }

  def findRemainder(inputYear:Int):Int={
    inputYear % cycleOfYears
  }

  def findWholeNumber(inputYear:Int):Int={
    //val reminder = findRemainder(inputYear)
    inputYear / cycleOfYears
  }

  def isLeapYear(inputYear:Int): Boolean ={
    ! leapYears.filter(_.equals(findRemainder(inputYear))).isEmpty
  }

  def isLeapYear2(reminder:Int): Boolean ={
    ! leapYears.filter(_.equals(reminder)).isEmpty
  }

  def calculateMonths(remainder:Int): Int ={
    var counter = 0
    for( a <- 1 to remainder){
      counter = counter + 12
      if(isLeapYear2(a)){
        counter = counter + 1
      }
      //val ly = isLeapYear2(a)
      //println(s"$a\t$counter\t$ly")
    }
    counter
  }

  def molad(inputYear:Int): Unit ={
    val numberOfCycles = findWholeNumber(inputYear)
    val remainder = findRemainder(inputYear)-1//TODO: fix the boarder case where is 19???
    println("remainder:"+remainder)
    println("number of cycles"+numberOfCycles)
    println("months in whole cycles"+numberOfCycles*monthsInCycle)
    println("months in last cycle"+calculateMonths(remainder))
    println("Total months in last cycle"+calculateMonths(remainder))

    //BaHaRaD - first Tishrei
    //235 months in year cycle
    //number of cycles
    //remainder of years in cycle
    //how many months happened from the beginning of time
    //1,1,2,1....
  }
  */
}
