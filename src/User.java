public class User {
    public int rank;
    public int progress;
    public User(){
        rank = -8;
        progress = 0;
    }
    public void incProgress(int rank){
        System.out.println("Current rank: " + this.rank + " Current progress: " + progress + " applied rank: " + rank);
        if(rank < -8 || rank >8 || rank ==0){
            throw new IllegalArgumentException("Rank exceeds bounds");
        }
        int d = calculateD(this.rank, rank);
        if(d==0){
            progress = progress+3;
        }
        else if(d>0){
            progress = progress + d*d*10;
        }
        else if (d==-1 || d == -2){
            progress = progress +1;
        }
        if(progress>100){
            changeRank(progress/100);
        }
        System.out.println("Current rank: " + this.rank + " Current progress: " + progress + " applied rank: " + rank);
    }
    private int calculateD(int start, int end){
        int d = start;
        int count=0;
        while (d != end){
            if(d!=0){
                d++;
                count++;
            }
            else if (d==0){
                d++;
            }
        }
        return count;
    }
    private void changeRank(int numberOfRanks){
        if(this.rank == -1){
            this.rank = 0;
            this.rank = this.rank +numberOfRanks;
        }
        else if (this.rank<8){
            this.rank = this.rank +numberOfRanks;
        }
        progress = progress%100;

        if(this.rank>8){
            this.rank = 8;
            this.progress = 0;
        }
    }
    public int getRank(){
        return rank;
    }
    public int getCurrentProgress(){
        return progress;
    }
}

