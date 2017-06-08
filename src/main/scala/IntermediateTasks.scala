/**
  * Created by Administrator on 08/06/2017.
  */
object IntermediateTasks {

  //Intermediate
  //Blackjack
  def blackJackPlay(hand1: Int, hand2: Int): Any = {
    if (hand1 > 21 && hand2 > 21) "Both players Lose!"
    else if (hand1 < 0 || hand2 < 0) "Cheat!"
    else if (hand1 == hand2) "Draw!"
    else if (hand1 < hand2) "Player 1 Wins!"
    else if (hand1 > hand2) "Player 2 Wins!"
    else "Crashed!"
  }

  //Blackjack Tuple Case Mapping
  def blackerJackPlay(hand1: Int, hand2: Int): Any = {
    (hand1, hand2) match {
      case (hand1, hand2) if (hand1 > 21) && (hand2 > 21) => "Both Player Lose"
      case (hand1, hand2) if hand1 < 0 || hand2 < 0 => "Cheat!"
      case (hand1, hand2) if hand1 == hand2 => "Draw!"
      case (hand1, hand2) if hand1 < hand2 => "Player 1 Wins!"
      case (hand1, hand2) if hand1 > hand2 => "Player 2 Wins!"
      case _ => "Crashed!"
    }
  }

  blackJackPlay(12, 12)
  blackJackPlay(22, 22)
  blackJackPlay(10, 1)
  blackJackPlay(1, 10)
  blackJackPlay(100, -5)

  blackerJackPlay(12, 12)
  blackerJackPlay(22, 22)
  blackerJackPlay(10, 1)
  blackerJackPlay(1, 10)
  blackerJackPlay(100, -5)

  //Unique Sum
  def uniqueAdder(value1: Int, value2: Int, value3: Int): Int = {
    if ((value1 == value2) && (value1 == value3)) 0
    else if (value1 == value2) value3
    else if (value2 == value3) value1
    else if (value1 == value3) value2
    else value1 + value2 + value3
  }

  //Unique Sum Tuple Case Mapping
  def uniquerAdder(value1: Int, value2: Int, value3: Int): Int = {
    (value1, value2, value3) match {
      case (value1, value2, value3) if (value1 == value2) && (value1 == value3) => 0
      case (value1, value2, value3) if value1 == value2 => value3
      case (value1, value2, value3) if value2 == value3 => value1
      case (value1, value2, value3) if value1 == value3 => value2
      case _ => value1 + value2 + value3
    }
  }

  uniqueAdder(1, 2, 3)
  uniqueAdder(3, 3, 3)
  uniqueAdder(1, 1, 2)

  uniquerAdder(1, 2, 3)
  uniquerAdder(3, 3, 3)
  uniquerAdder(1, 1, 2)

  //TooHot
  def WayTooHot(heat: Int, isSummer: Boolean): Boolean = {
    if (isSummer)
      if (heat >= 60 && heat <= 100) true
      else false
    else if (heat >= 60 && heat <= 90) true
    else false
  }

  //TooHot Tuple case mapping
  def WayTooHotter(heat: Int, isSummer: Boolean): Boolean = {
    (heat, isSummer) match {
      case (heat, isSummer) if (isSummer) && (heat >= 60 && heat <= 100) => true
      case (heat, isSummer) if (heat >= 60 && heat <= 90) => true
      case _ => false
    }
  }

  WayTooHot(40, true)
  WayTooHot(80, false)
  WayTooHot(99, true)

  WayTooHotter(40, true)
  WayTooHotter(80, false)
  WayTooHotter(99, true)


}
