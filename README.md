# Battleship Game (Java)

A simple, terminal-based Battleship game built in Java. The player attempts to locate and sink a randomly placed ship on a 1D board by guessing positions. The game tracks successful hits, misses, and the total number of guesses needed to sink the ship.

## Features

- **Random Ship Placement:** Automatically places a ship at a random location on the board.
- **Interactive Gameplay:** Players enter positions through the terminal to search for the hidden ship.
- **Hit and Miss Detection:** Provides immediate feedback after each guess.
- **Input Validation:** Prevents guesses outside the board boundaries and repeated guesses.
- **Guess Tracking:** Counts the total number of valid guesses made.
- **Win Detection:** Automatically ends the game when every section of the ship has been hit.

## Technologies Used

- **Language:** Java
- **Concepts:** Object-Oriented Programming (OOP), arrays, loops, conditional statements, random number generation, and user input handling.

## How to Play

1. The game creates a board containing 10 positions, numbered `0` through `9`.
2. A ship occupying 3 consecutive positions is randomly placed on the board.
3. The player enters a position to attack.
4. The game responds with `Hit!` or `Miss.`
5. The player continues guessing until all 3 ship positions have been hit.
6. Once the ship is sunk, the game displays the total number of guesses.

### Example Gameplay

```text
Enter a position to guess (0 to 9): 2
Miss.
Enter a position to guess (0 to 9): 5
Hit!
Enter a position to guess (0 to 9): 6
Hit!
Enter a position to guess (0 to 9): 7
Hit!
Congratulations! You've sunk the ship in 4 guesses.
```

## Project Structure

```text
Battleship/
├── Battleship.java
└── Board.java
```

**Battleship.java**
- Contains the main game loop and handles player input.
- Validates guesses and tracks hits, misses, and total guesses.
- Determines when the player has sunk the ship.

**Board.java**
- Initializes the game board using an integer array.
- Randomly places the ship within valid board boundaries.
- Provides methods to access and print the board.

## Getting Started

### Prerequisites
- Java Development Kit (JDK)

### Running the Game

1. Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git
```

2. Navigate to the project directory.

3. Compile the Java files from the directory containing the `Battleship` package folder:

```bash
javac Battleship/*.java
```

4. Run the program:

```bash
java Battleship.Battleship
```

## Future Improvements

- Support multiple ships of different sizes.
- Implement a 2D game board.
- Add a visual representation of hits and misses.
- Introduce difficulty levels and customizable board sizes.
- Implement a computer opponent.
- Add a replay option after completing a game.

## What I Learned

This project helped me practice fundamental Java programming concepts, particularly using arrays to represent game states and applying object-oriented programming to separate game logic from board management. I also gained experience implementing random placement algorithms, validating user input, and managing game progression through loops and conditional statements.
