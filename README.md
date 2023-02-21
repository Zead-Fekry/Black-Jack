# Black-Jack
the program will be a simplified version of the popular card game Blackjack (without bets). Even if you
are familiar with the game, you should still read the instructions thoroughly.
At the beginning of the game, the 3 players and the dealer are dealt 2 cards each. We see both players’
cards but see only 1 of the dealer’s cards. The aim of the game is to have the sum of the card values
(score) in your hand be 21 (BLACKJACK), or as close to 21 as possible. However, you lose if y ou go
over 21.
The players go first in turns and have two choices: Hit or Stand. HIT means the player wants to pick
another card. You make this move to increase your score. STANDmeans that the player is done picking
new cards (i.e. Hitting) and their turn ends. You do this move when you are comfortable with your score
(e.g. score=19 is very close to 21, picking another card could make you lose the game by going over 21
(Player BUSTED).
When the player’s turn ends, the next player starts to play in turns. If the maximum score of all players is
less than the value of the two cards of the dealer’s then the dealer will win the game and doesn’t need to
hit more cards. Other than that, then the dealer starts hitting until he either scores 21, scores a score bigger
than all of the other players or go over 21 (Dealer BUSTED).
Finally, if more than one player have the same high score then it’s a tie situation (PUSH) , but if only a
single player had the maximum score then that player WINs the game
The strategy is to increase your score by hitting to get close to 21 (but not over), while also taking into
consideration what the dealer’s score could be.
The game can be summarized with the following steps:
1. Deck creation & initial card draw.
a. Create deck
b. Do the initial card draw for the player and the dealer (a total of 4 cards)
c. Remove drawn cards from the deck
2. Player’s turn (repeated 3 times for the 3 players)
a. Hit or Stand
b. Update the player’s score.
3. Dealer’s turn
a. Hit until he either scores 21 (BLACKJACK), a score more than the maximum score of the 3 players
or bust.
4. Make decisions(someone WINS or it’s a PUSH) and end the game.
169519299-42838cd7-8e33-486b-86f0-6d95ad1c2f85.png
![169519299-42838cd7-8e33-486b-86f0-6d95ad1c2f85](https://user-images.githubusercontent.com/77162607/220453507-ea938657-3d4e-45e1-8ad2-de61dee5516b.png)
![169519676-65ea6485-ea2d-41de-9c1a-012e510dd8db](https://user-images.githubusercontent.com/77162607/220453512-5526c12c-0df7-4bce-9adb-5fc4f553f01b.jpg)
![169519657-d6b74e66-71b6-4b6b-ac76-763e89df6f51](https://user-images.githubusercontent.com/77162607/220453513-c7b99a86-0b2e-4717-9ead-531ecf75a536.png)

