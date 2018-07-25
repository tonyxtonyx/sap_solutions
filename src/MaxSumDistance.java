public class MaxSumDistance {
    public static void main(String[] args) {
        int[] ints = {1,9,4,0,0,0,0,10};


    }

    public int solution(int[] ints) {

        int first = 0, second = 0;

        for (int i = 0; i < ints.length ; i++){

            if(first < ints[i]+ i)
                first = ints[i]+ i;

            if(second < ints[i] - i)
                second = ints[i] - i;

        }
        return first + second;
    }
}
