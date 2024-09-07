# Flames-Java

**Flames-Java** is a fun and classic game designed to predict your relationship status with a friend or partner based on their names. This Java implementation uses a doubly linked circular list to traverse through the possible outcomes in a circular manner, making it efficient and enjoyable to use.

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
The `Cdlink` class represents a doubly linked circular list, which is used to traverse the FLAMES outcomes in a circular fashion. This data structure makes it easier to delete elements and continue the traversal smoothly.

- **Node Creation**: Nodes are created to hold each character or word in the game.
- **Insertion**: Nodes are inserted at the first position to maintain the circular nature.
- **Traversal**: The list is traversed to find the result based on the count of unmatched characters.
- **Deletion**: Nodes can be deleted from the head, tail, or any position in the list to refine the outcome.
- **Display**: The final outcome is displayed based on the traversal.

### `Flames` Class
The `Flames` class is the main driver of the game.

- **Input Handling**: It takes two names as input from the user.
- **String Processing**: Converts the names into character arrays and cancels out the common characters by replacing them with "*".
- **Count Calculation**: The remaining characters after cancelling are counted to determine the outcome.
- **Result Calculation**: The count is passed to the `Cdlink` class, which traverses the list to find the final result.

## Example Usage

```sh
Enter Your Name: John
Enter Your Partner's Name: Jane

Output:
You And Your Partner's Result Is: Affection
```
