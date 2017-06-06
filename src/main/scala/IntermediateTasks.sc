//Intermediate
//Blackjack
def blackJackPlay(hand1 : Int , hand2 :Int): Any={
if (hand1 > 21 && hand2 >21) "Both players Lose!"
else if (hand1 == hand2 ) "Draw!"
else if (hand1 < hand2) "Player 1 Wins!"
else if (hand1 > hand2) "Player 2 Wins!"
  else "Crashed!"
}
blackJackPlay(12,12) ;blackJackPlay(22,22) ;blackJackPlay(10,1) ;blackJackPlay(1,10) ;blackJackPlay(100,55)
