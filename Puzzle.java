/**
 * The Puzzle class extends Challenge, whereby all common attributes
 * and methods are inherited. It represents the game's puzzle logic.
 */
public class Puzzle extends Challenge {

  /**
   * If the puzzle is solved using an item instead of a text
   * input:
   */
  public void solve(Item item) {
    if (solution == null || item == null) {
      System.out.println("Missing item.");
      return;
    }

    if (solution.startsWith("'") && solution.endsWith("'")) {
      System.out.println("Puzzle requires the magic word, not an item.");
      return;
    }

    if (solution.equalsIgnoreCase(item.getName())) {
      System.out.println("Puzzle solved using the correct item!");
      this.active = false;
    } else {
      System.out.println("Incorrect item used.");
    }
  }

  /**
   * If the puzzle is solved using a single magic word (text input)
   * instead of an item boolean:
   */
  public void solve(String magicWord) {
    if (solution == null || magicWord == null) {
      System.out.println("Missing solution.");
      return;
    }

    if (!(solution.startsWith("'") && solution.endsWith("'"))) {
      System.out.println("This puzzle requires an item, not a magic word.");
      return;
    }

    if (solution.equalsIgnoreCase(magicWord)) {
      System.out.println("Puzzle solved with the magic word!");
      this.active = false;
    } else {
      System.out.println("Sorry, that is not the magic word.");
    }
  }

  /**
   * Print out a string that provides a description for the puzzle.
   * It will describe the puzzle's name, activity status, effects,
   * solution, and target.
   */
  @Override
  public String toString() {
    return "Puzzle{"
        + "name='" + name +
        "', active=" + active +
        ", affects_target=" + affects_target +
        ", affects_player=" + affects_player +
        ", solution='" + solution +
        "', target='" + target + "'}";
  }
}
