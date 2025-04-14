

## 📘 Java Quiz Game

A console-based multiple-choice **Quiz Game** developed in **Java**, featuring:

- 🧠 10 Java programming questions  
- ⏱️ Timer for each question (10 seconds)  
- 🏆 Leaderboard saved in a file (`leaderboard.txt`)  
- 📂 Modular structure using OOP concepts  

---

## 🚀 Features

- Java-based CLI interface  
- Multiple choice format (A/B/C/D options)  
- Automatic score calculation  
- Real-time countdown timer using `TimerTask`  
- Persistent leaderboard using file handling

---

## 🛠️ Tech Stack

- Java (JDK 11+)
- OOP Principles
- File I/O
- Java Timer & TimerTask
- VS Code (Recommended IDE)

---

## 🧩 File Structure

```
QuizGame/
├── QuizGame.java              // Main game logic
├── Question.java              // Question model
├── QuestionBank.java          // Stores all questions
├── LeaderboardManager.java    // File-based leaderboard manager
└── leaderboard.txt            // Score storage
```

---

## 💻 How to Run

1. Clone the repo or download ZIP  
2. Open in VS Code  
3. Compile the project:
   ```bash
   javac *.java
   ```
4. Run the game:
   ```bash
   java QuizGame
   ```

---

## 📌 TODO (Future Upgrades)

- [ ] Add GUI using Swing or JavaFX  
- [ ] Load questions from JSON file  
- [ ] Category-based quizzes  
- [ ] Web version with Spring Boot  

---


