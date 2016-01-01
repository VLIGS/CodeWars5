import java.util.List;

public class SecretDetective {

    public String recoverSecret(char[][] triplets) {
        return  null;
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
    }
}