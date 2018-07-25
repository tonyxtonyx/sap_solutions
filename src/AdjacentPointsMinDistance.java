public class AdjacentPointsMinDistance {
    public static void main(String[] args) {

        int[] ints = {0};


    }

    public int solution(int[] ints){
        int difference = 100000000;

        if(ints.length <= 1){
            return(-2);
        }

        for(int i = 0; i < ints.length; i++) {
            for(int j = i+1; j < ints.length;j++) {
                if(difference > 100000000 || Math.abs(difference) > (Math.abs(ints[i] -ints[j]))){
                    difference = Math.abs(ints[i] -ints[j]);
                }
            }
        }

        return(difference);
    }
}
