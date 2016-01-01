import java.util.ArrayList;
import java.util.List;

public class SecretDetective {
    public List<lettersCluster> myLetters = new ArrayList<lettersCluster>();
    public String recoverSecret(char[][] triplets) {
        for(int i =0; i<triplets.length; i++){
            train(triplets[i]);
        }
        return  null;
    }
    private void train(char [] myCharArray){
        for (int i = 0; i <myCharArray.length-1; i++){
            if (!containsLetter(Character.toString(myCharArray[i]))) {
                lettersCluster myLettersCluster = new lettersCluster(Character.toString(myCharArray[i]));
                myLettersCluster.addLeave(Character.toString(myCharArray[i+1]));
                myLetters.add(myLettersCluster);
            }
            else{
                addClusterLeave(Character.toString(myCharArray[i]),Character.toString(myCharArray[i+1]));
            }
        }
        if(!containsLetter(Character.toString(myCharArray[2]))){
            lettersCluster myLettersCluster = new lettersCluster(Character.toString(myCharArray[2]));
            myLetters.add(myLettersCluster);
        }
    }
    private boolean containsLetter (String myLetter){
        for(lettersCluster myItem: myLetters){
            if(myItem.getCentre().equals(myLetter)){
                return true;
            }
        }
        return false;
    }
    private void addClusterLeave (String myCentre, String myLeave){
        for(lettersCluster myItem: myLetters){
            if(myItem.getCentre().equals(myCentre)){
                if(!myItem.containsLeave(myLeave)){
                    myItem.addLeave(myLeave);
                }
            }
        }
    }

    public class lettersCluster{
        private String myCenter;
        private List<String> myLeaves;
        public lettersCluster(String myString){
            myCenter = myString;
            myLeaves = new ArrayList<String>();
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
        public boolean containsLeave(String myLeave){
            if(myLeaves.contains(myLeave)){
                return true;
            }
            return false;
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