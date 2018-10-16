public class Merge2SortedArray {

    static int [] merge(int []L,int []R){
        int finalArray []=new int[L.length+R.length-2];
        int i=0;
        int j=0;
        for (int k = 0; k < finalArray.length ; k++) {
            if(L[i]<=R[i])
            {
                finalArray[k]=L[i];
                i++;
            }
            else{
                finalArray[k]=R[j];
                j++;
            }
        }
        return finalArray;
    }
    public static void main(String[] args) {

    }
}
