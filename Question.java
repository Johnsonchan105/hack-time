public class Question {
  private ArrayList<String> answers;
  private String q;
  public Question (String ques, ArrayList<String> ans, int cor) {
      answers = ans;
      q = ques;
      correctAns = corr;
  }
  public void inquire() {
    //make a modification to answers here
    System.out.println(answers);
  }
  public boolean validAns(SelectionGroup s, string ans) {
    for(int i = 0; i < answers.length(); i++){
      ans = answers[i];
      if (ans.equals(correctAns)) {
        s.score += 10;
        return true;
      }

  }
  s.score -= 10;
  return false;
}
