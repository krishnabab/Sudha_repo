# Allmyjavaprojects — Main

This small Java program reads a user's name from standard input, validates it, and prints the name and its reverse.

Files
- `src/Main.java` — main program. Validates input (non-empty, contains a letter, max length 100) and allows up to 3 attempts.

How to build and run (Windows, cmd.exe)

1. Open a Command Prompt and change to the project directory:

```cmd
cd /d C:\Sudha_Projects\Allmyjavaprojects
```

2. Compile the program (creates classes under `out\`):

```cmd
javac -d out src\Main.java
```

3. Run the program:

```cmd
java -cp out Main
```

Example interaction

```
Enter your name: John
Hello, my name is John!
Hello, my name in reverse is nhoJ!
```

Edge cases and validation
- Empty input: the program prompts again up to 3 attempts.
- Input longer than 100 characters: rejected with a message.
- Input with no letters (e.g., "1234" or "!!!"): rejected with a message asking to include at least one letter.
- EOF (Ctrl+Z on Windows) is treated as cancellation and the program exits.

Troubleshooting
- If `javac` is not recognized, make sure a JDK is installed and `javac` is on your PATH. You can download a JDK from AdoptOpenJDK/OpenJDK or Oracle.
- In IntelliJ IDEA (or other JetBrains IDEs) you can run `src/Main.java` directly by creating a run configuration for the `Main` class.

Notes
- Constants: `MAX_ATTEMPTS = 3`, `MAX_LENGTH = 100`. Adjust in `Main.java` if you want different limits.

Next steps (optional)
- Add a small unit test for `readName(Scanner)` by refactoring to make input injectable and testable.
- Add i18n support for messages.
- Trim and normalize whitespace, or allow/disallow certain characters if you want stricter validation.

