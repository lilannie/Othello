# Othello
Artificial Intelligence Othello Game Player 

Learning Adversarial Searches
AI Agent uses Alpha Beta Pruning 

Use of heuristic function during beginning to middle game. 
Use a brute-force function when there are very little spaces left in the board

This project includes:

1. An evaluation function which takes a state of the game as input and returns a number by evaluating the state.
2. A move generator function which takes a state as input and returns a list of legal moves at that state.
3. Using the above two functions, create an alpha-beta game playing agent which takes the current state as input and returns a move/action which is to be made by your player.

Write a main function which does the following:

o Output the 8x8 board matrix by printing in the console.
o Take two integers which are the co-ordinates of a move from the user. o Update the board with the user’s move.
o Take an action by passing the state to the alpha-beta search.
o Update the board with the agent’s move.
  Repeat the steps until the board is filled or there is no legal move for any player.
