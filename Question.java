public class Question {
  private ArrayList<String> answers;
  private String q;
  private int correctAns;
  public Question (String ques, ArrayList<String> ans, int cor) {
      answers = ans;
      q = ques;
      correctAns = corr;
  }
  public void inquire() {
    //make a modification to answers here
    System.out.println(answers);
  }
  public boolean validAns(SelectionGroup s, int ans) {
      if (ans == correctAns) {
        s.score += 10;
        return true;
      }
      else {
        s.score-= 10;
        return false;
      }
  }
  
}
