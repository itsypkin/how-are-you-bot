package com.howareyoubot

import info.mukel.telegram.bots.{Commands, Polling, Utils, TelegramBot}

import scala.util.Random

/**
  * Created by admin on 13/12/15.
  */
object Bot extends TelegramBot(Utils.tokenFromFile("./token")) with Polling with Commands with Answers {

  on("start") { (sender, _) => replyTo(sender) {
      """/how_are_you - could be interesting for someone
        |/whats_up - indeed what is up
        |/what_the_sense_of_living - the main question
      """.stripMargin
    }
  }

  on("how_are_you") { (sender, args) =>  replyTo(sender) {
      println(sender, args)
      oneOf(howAreYouAnswers)
    }
  }

  on("whats_up") { (sender, _) =>  replyTo(sender) { oneOf(whatsUpAnswers) }}

  on("what_the_sense_of_living") { (sender, _) =>  replyTo(sender) { "42" }}
}


trait Answers {
  val howAreYouAnswers = Set("I'm fine thx!", "Everything is good", "Great and you?")

  val whatsUpAnswers = Set("The ceiling is up", "I am good thx", "Go and ask somebody else")


  def oneOf(list: Set[String]): String = Random.shuffle(list).head
}