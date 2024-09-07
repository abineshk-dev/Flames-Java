# Flames-Java

**Flames-Java** is a fun and classic game designed to predict your relationship status with a friend or partner based on your names. This Java implementation uses a doubly linked circular list to traverse through the possible outcomes in a circular manner, making it efficient and enjoyable to use.

## How to Run

Follow these steps to run the Flames-Java game:

1. **Download the files**: Clone or download the repository to your local machine.
2. **Compile the classes**:
   - First, compile the `Cdlink.java` class:
     ```sh
     javac Cdlink.java
     ```
   - Next, compile the `Flames.java` class:
     ```sh
     javac Flames.java
     ```
3. **Run the game**:
   - Execute the Flames class to start the game:
     ```sh
     java Flames
     ```
   - Enter the names when prompted, and see the result!

## Class Descriptions

### `Cdlink` Class

The `Cdlink` class represents a doubly linked circular list. This data structure is used for:

- **Traversing the FLAMES outcomes**: The circular list allows for efficient traversal in a circular manner, which is crucial for this game.
- **Deleting elements**: Deleting an element from the list is easy and efficient, ensuring smooth gameplay.

### `Flames` Class

The `Flames` class is the main driver of the game. It:

- **Takes input**: Asks the user to input their name and their partner's name.
- **Processes the names**: Converts the names into character arrays, removes common characters, and calculates the remaining character count.
- **Determines the result**: Uses the count to traverse the circular list and find the final relationship status.

## Sample Output

Here is an example of what you might see when running the game:

```sh
Enter Your Name: John
Enter Your Partner's Name: Jane

You And Your Partners Result Is enemy
