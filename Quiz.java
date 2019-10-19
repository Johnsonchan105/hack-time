import java.util.*;

public class Quiz {
  private ArrayList<Question> questions;
  public ArrayList<SelectionGroup> groups;
  public Quiz(ArrayList<Question> q, ArrayList<SelectionGroup> g){
    questions = q;
    Collections.shuffle(questions);
    groups = g;
  }
  public void startQuiz(){
    for(int i = 0;i < question.size(); i++){
      displayQuestion(questions[i]);//not implemented
    }
    //game finished

    displayScores(g);
    //not implemented
  }
}
