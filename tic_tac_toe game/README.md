# Tic-Tac-Toe

A console-based Tic-Tac-Toe game developed in Java. This project demonstrates core Java concepts including arrays, loops, methods, exception handling, and user input validation.

## Features

* Two-player gameplay (Player X and Player O)
* Input validation for invalid entries
* Exception handling using `InputMismatchException`
* Detection of winning combinations
* Draw detection
* Prevents players from selecting occupied positions
* Simple and user-friendly console interface

## Game Rules

1. The game is played on a 3×3 board.
2. Player X starts the game.
3. Players take turns selecting positions from 1 to 9.
4. A player wins by placing three marks in:

   * A horizontal row
   * A vertical column
   * A diagonal line
5. If all positions are occupied and no player wins, the game ends in a draw.

## Board Layout

```text
1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9
```

## Sample Gameplay

Initial Board:

```text
1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9
```

Player X selects position 1:

```text
X | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9
```

Player O selects position 5:

```text
X | 2 | 3
---------
4 | O | 6
---------
7 | 8 | 9
```

Player X selects position 2:

```text
X | X | 3
---------
4 | O | 6
---------
7 | 8 | 9
```

Player O selects position 8:

```text
X | X | 3
---------
4 | O | 6
---------
7 | O | 9
```

Player X selects position 3:

```text
X | X | X
---------
4 | O | 6
---------
7 | O | 9
```

Output:

```text
Congratulations! Player X wins.
```

## Input Validation

The program handles:

* Non-numeric input
* Numbers outside the range 1-9
* Already occupied positions

Example:

```text
Enter a slot number:
abc

Invalid input; re-enter slot number:
```

```text
Enter a slot number:
15

Invalid input; re-enter slot number:
```

```text
Enter a slot number:
5

Slot already taken; re-enter slot number:
```

## Technologies Used

* Java
* Arrays
* Scanner Class
* Methods
* Loops
* Conditional Statements
* Exception Handling

## How to Run

Compile the program:

```bash
javac TicTacToe.java
```

Run the program:

```bash
java TicTacToe
```

## Learning Objectives

This project was built to practice:

* Java Fundamentals
* Problem Solving
* Arrays
* Loops
* Methods
* Exception Handling
* Game Logic Implementation

## Author

Mohammad Saimon
