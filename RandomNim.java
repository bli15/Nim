public class RandomNim{
  private int minusPieces;
  public int play(int pieces)
  {
    if (pieces % 3 == 0)
    {
      minusPieces = 2;
    }
    if (pieces % 3 == 2)
    {
      minusPieces = 1;
    }
    if (pieces % 3 == 1)
    {
      minusPieces = 1;
    }
    
    System.out.println("The computer takes "+minusPieces +" piece(s) away!");
    return minusPieces;
  }
  
}

