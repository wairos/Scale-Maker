package scalemaker;

/**
 *
 * @author waire
 */
public class Make {
    // Calls lowerNote() and raiseNote() on specific elements in the Key StringArray to form the desired scale. 
    // Then Prints to Console.
     public static void minorScale(String[] key) {
        System.out.println(key[0] +" "+ key[1] +" "+ LowerAndRaise.lowerNote(key[2]) +" "+ key[3] +" "+ key[4] +" "+ LowerAndRaise.lowerNote(key[5]) +" "+ LowerAndRaise.lowerNote(key[6]));
    }
    public static void majorScale(String[] key) {
        System.out.println(key[0] +" "+ key[1] +" "+ key[2] +" "+ key[3] +" "+ key[4] +" "+ key[5] +" "+ key[6]);
    }
    public static void dorianScale(String[] key) {
        System.out.println(key[0] +" "+ key[1] +" "+ LowerAndRaise.lowerNote(key[2]) +" "+ key[3] +" "+ key[4] +" "+ key[5] +" "+ LowerAndRaise.lowerNote(key[6]));
    }
    public static void phrygianScale(String[] key) {
        System.out.println(key[0] +" "+ LowerAndRaise.lowerNote(key[1]) +" "+ LowerAndRaise.lowerNote(key[2]) +" "+ key[3] +" "+ key[4] +" "+ LowerAndRaise.lowerNote(key[5]) +" "+ LowerAndRaise.lowerNote(key[6]));
    }
    public static void lydianScale(String[] key) {
        System.out.println(key[0] +" "+ key[1] +" "+ key[2] +" "+ LowerAndRaise.raiseNote(key[3]) +" "+ key[4] +" "+ key[5] +" "+ key[6]);
    }
    public static void mixolydianScale(String[] key) {
        String scale = (key[0] +" "+ key[1] +" "+ key[2] +" "+ key[3] +" "+ key[4] +" "+ key[5] +" "+ LowerAndRaise.lowerNote(key[6]));
        System.out.println(scale);
    }
     public static void harmonicMinorScale(String[] key) {
        System.out.println(key[0] +" "+ key[1] +" "+ LowerAndRaise.lowerNote(key[2]) +" "+ key[3] +" "+ key[4] +" "+ LowerAndRaise.lowerNote(key[5]) +" "+ key[6]);
    }
      public static void locrianScale(String[] key) {
        System.out.println(key[0] +" "+ LowerAndRaise.lowerNote(key[1]) +" "+ LowerAndRaise.lowerNote(key[2]) +" "+ key[3] +" "+ LowerAndRaise.lowerNote(key[4]) +" "+ LowerAndRaise.lowerNote(key[5]) +" "+ LowerAndRaise.lowerNote(key[6]));
    }
      public static void minorPentatonicScale(String[] key) {
          System.out.println( key[0] +" "+ LowerAndRaise.lowerNote(key[2]) +" "+ key[3] +" "+ key[4] +" "+ LowerAndRaise.lowerNote(key[6]));
      }
      public static void majorPentatonicScale(String[] key){
          System.out.println( key[0] +" "+ key[1] +" "+ key[2] +" "+ key[4] +" "+ key[5]);
      }
    
}
