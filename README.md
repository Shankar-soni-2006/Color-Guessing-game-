# Color-Guessing-game
# 🎨 Java Color Guessing Game

This is a console-based **Color Guessing Game** built using Java. The player has to guess the color randomly chosen by the computer from a list of 10 predefined colors. The player gets 5 attempts to guess it right!

---

## 🧠 Chain of Thoughts (Logic Flow)

1. A list of 10 colors is defined:
Red, Green, Blue, Yellow, Orange, Purple, Pink, Brown, Black, White
2. The system randomly selects one color using Java's `Random` class.
3. The player is prompted to guess the color.
4. If the player's input matches the system's color (case-insensitive):
- The game prints a **winning message** and the number of attempts used.
5. If the guess is incorrect:
- The game displays an error message and the number of **remaining attempts**.
6. If the player uses all 5 attempts without guessing correctly:
- A **"Game Over"** message is shown.

---

## 📁 File Structure

/ColorGuessingGame
└── Main.java # Contains the full game logic
