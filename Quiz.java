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
    sortGroupsByScore(groups);
    for(int i = 0;i < groups.size(); i++){
      System.out.print("Group number " + (i+1) + " is " + groups[i].name + " with " + groups[i].score + " !");

    }
    //not implemented
  }
  //sorts group by highest to lowest score
  public ArrayList<SelectionGroup> sortGroupsByScore(ArrayList<SelectionGroup> g){
    ArrayList<SelectionGroup> temp = new ArrayList<SelectionGroup>();
    int s = groups.size();
    while(temp.size < s){
      int greatestScore = Integer.MIN_VALUE;
      SelectionGroup group;
      int index = 0;
        for(int i = 0; i < g.size(); i++){
          if(g[i].score > greatestScore){
            group = g[i];
            greatestScore = g[i].score;
            index = i;
          }
        }
      temp.add(group);
      g.remove(index);
    }
  }
  return temp;
}
