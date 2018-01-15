package edu.knoldus

import org.apache.log4j.Logger

object CollatzEquation extends App {
  val log = Logger.getLogger(this.getClass)
  val list = List(1)
  val n = 77

  val list1=List()
  log.info(collatzEquation(list,list1,n))

}
