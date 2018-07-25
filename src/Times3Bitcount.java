public class Times3Bitcount {
    public static void main(String[] args) {

    }

    public int solution(int[] ints){
        int counter = 0;
        int s = 0;
        for(int i = 0; i < ints.length; i++){
            s += Math.pow(2,ints[i]);
        }

        String[] three_n = Integer.toString(3*s,2).split("");

        for (String i:
                three_n) {
            if(i.equals("1")){
                counter += 1;
            }
        }
        return counter;
    }
}
