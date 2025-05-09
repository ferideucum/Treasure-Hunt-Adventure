# Treasure-Hunt-Adventure

## 1. Introduction
The Treasure Hunt Adventure project is a game built using linked lists and tree data structures. The objective is to roll dice and move a pawn across a map to collect treasures and score points. The game is developed in Java, and a GUI interface is implemented to enhance visual appeal and usability.

## 2. Design
#### General Structure
The GUI design consists of a main menu with options to start the game and view scores, a window for entering the user’s name, three interconnected levels, and a scoreboard section using a Binary Search Tree (BST). The project structure is as follows:
THA │
├── BST.java
├── BstNode.java
├── DLinkedList.java
├── DNode.java
├── LinkedList.java
├── Node.java
├── game.java
├── game2.java
├── game3.java
├── score_table.java
├── start.java
├── userName.java
├── score.txt

#### Data Structures
Each level includes 30 randomly distributed nodes. Level 1 uses a singly linked list, while Level 2 and 3 use a doubly linked list. The scoreboard is implemented using a binary search tree. Users can view the highest and lowest scores. Tree traversal algorithms are used for navigation.

## 3. Implementation Details Menu Operations
The main menu provides two buttons: Start Game and Show Scores. After selecting Start Game, the user enters their name and begins at Level 1.

#### Level 1: Basic Board Movement
- A linked list with 30 nodes is created.
- The pawn moves across the map using setLocation(x, y).
- Each node contains one of three cell types: Trap (0), Empty (1), or Treasure (2).
  - Trap: -5 points
  - Empty: No points
  - Treasure: +10 points
- Movement is determined by rolling a dice, simulated using Math.random to generate values from 1 to 6.
- The player progresses through the nodes, updating their total score with each roll.
- At the end of the level, the score (including level number, name, and score) is saved to score.txt. A prompt asks whether to continue to the next level or return to the main menu.

#### Level 2: Advanced Board with Forward-Backward Movement
- A doubly linked list with 30 nodes is created.
- New cell types are added: Move Forward (3) and Move Backward (4).
- Move Forward: Moves the pawn forward 1–3 steps randomly.Move Backward: Moves the pawn backward 1–3 steps randomly.
- The dice mechanism remains the same.
- At the end of the level, score is saved, and the user is prompted to continue or return.

#### Level 3: Advanced Board with Reset Mechanism
- A doubly linked list with 30 nodes is used.
- A new cell type is added: Reset to Start (5).
- Reset sends the pawn back to the beginning of the board.
- This level adds more complexity and difficulty.
- The scoring and movement system remains consistent with previous levels.
  - At the end, score is saved, and the scoreboard is displayed if the user chooses to proceed.
#### Scoreboard System (Binary Search Tree)
- Implemented using BST.
Displays all players' names, levels, and scores.
- Search button allows users to find specific players.
- FindMin and FindMax functions display highest and lowest scores using traversal.

## 4. File Operations
- Score-saving functions are defined in each level’s class and triggered at the end of each game.
- The scoreboard reads from score.txt to populate the score table. 

## 5. GUI (Graphical User Interface)
- Built entirely on GUI components.
- Two buttons on the main menu, dice buttons in each level, and search/show buttons
on the scoreboard.
- JLabels display node values at the end of each level.
- Each level and menu screen features different background images.
- A visual avatar is used for the pawn.
- Labels for start and finish are given a value of -1 and placed outside the map to
indicate boundaries.

## 6. Issues and Solutions
- Dice mechanism caused problems, resolved by fixing links between nodes and verifying the algorithm.
- Level 3 had a coordinate bug related to the reset function, fixed through iterative debugging.
- Frame transitions were handled using setVisible.
- Logical errors in the game mechanics were resolved through careful system review.

## 7. Conclusion and Evaluation
- After each level, the user is asked whether to continue, with scores being saved accordingly.
- Players can return to the main menu after completing any level.
- Players can view their highest and lowest scores across all levels.
- The three-level structure adds increasing excitement and difficulty to the game.
