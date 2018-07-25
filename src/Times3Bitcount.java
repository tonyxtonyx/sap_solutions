public class Times3Bitcount {

    public int solution(int[] ints){
        int counter = 0;
        int s = 0;
        for(int i = 0; i < ints.length; i++){
            s += Math.pow(2,ints[i]);
        }

        s = s*3;

        while(s > 0){
            int ostatok = s % 2;
            System.out.println(s);
            if(ostatok == 1)
                counter += 1;
            s -= ostatok;
            s = s/2;
        }
        return counter;
    }
}
