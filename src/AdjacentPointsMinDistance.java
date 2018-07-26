public class AdjacentPointsMinDistance {
    public  int solution(int[] ints){
        int difference = 100000000;

        if(ints.length <= 1){
            return(-2);
        }

        sort(ints,0,ints.length-1);

        for(int i = 1; i <ints.length; i++){
            if(difference >= Math.abs(ints[i] - ints[i-1]))
                difference = Math.abs(ints[i] - ints[i-1]);
            if(difference == 0)
                break;
        }


        return difference >= 100000000 ? -1 : difference;
    }

    public  void merge(int[] ints, int start, int midpoint, int end)
    {
        int n1 = midpoint - start + 1;
        int n2 = end - midpoint;


        int[] Left = new int [n1];
        int[] Right = new int [n2];


        for (int i=0; i<n1; ++i)
            Left[i] = ints[start + i];
        for (int j=0; j<n2; ++j)
            Right[j] = ints[midpoint + 1+ j];



        int i = 0, j = 0;


        int k = start;
        while (i < n1 && j < n2)
        {
            if (Left[i] <= Right[j])
            {
                ints[k] = Left[i];
                i++;
            }
            else
            {
                ints[k] = Right[j];
                j++;
            }
            k++;
        }


        while (i < n1)
        {
            ints[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            ints[k] = Right[j];
            j++;
            k++;
        }
    }


    void  sort(int[] ints, int start, int end)
    {
        if (start < end)
        {

            int medium = (start+end)/2;


            sort(ints, start, medium);
            sort(ints , medium+1, end);

            merge(ints, start, medium, end);
        }
    }
}
