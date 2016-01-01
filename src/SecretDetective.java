import java.util.ArrayList;
import java.util.List;

public class SecretDetective {
    private List<lettersCluster> myLetters = new ArrayList<lettersCluster>();
    public String recoverSecret(char[][] triplets) {
        for(int i =0; i<triplets.length; i++){
            train(triplets[i]);
        }
        return  null;
    }
    private void train(char [] myCharArray){
        for (int i = 0; i <myCharArray.length; i++){
            if (!containsLetter(Character.toString(myCharArray[i]))) {
                lettersCluster myLettersCluster = new lettersCluster(Character.toString(myCharArray[i]));
                myLettersCluster.addLeave(Character.toString(myCharArray[i+1]));
            }
            else{
                //add leave
            }
        }
    }
    private boolean containsLetter (String myLetter){
        return true;
    }

    public class lettersCluster{
        private String myCenter;
        private List<String> myLeaves;
        public lettersCluster(String myString){
            myCenter = myString;
        }
        public void addLeave(String myLeave){
            myLeaves.add(myLeave);
        }
        public void removeLeave(String myLeave){
            myLeaves.remove(myLeaves.indexOf(myLeave));
        }
        public String getLeave(String myLeave){
            return myLeaves.get(myLeaves.indexOf(myLeave));
        }
        public String getCentre(){
            return myCenter;
        }
        public boolean isEmpty(){
            if(myLeaves.size()==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
}