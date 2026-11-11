public class Utilities {
    public static int min(int[] nums) {
        int smallestNumber = nums[0];
        for(int i = 0;i < nums.length ;i++)
        {
            if(smallestNumber > nums[i])
                smallestNumber = nums[i];

        }
        return smallestNumber;
    }
    public static int max(int[] nums) {
        int biggestNumber = nums[0];
        for(int i = 0;i < nums.length ;i++)
        {
            if(biggestNumber < nums[i])
                biggestNumber = nums[i];

        }
        return biggestNumber;
    }
    public static int[] copyInts(int[] input){
        int[] output = new int[input.length];

        for(int i = 0;i <input.length ;i++){
            output[i] = input[i];
        }

        return output;
    }



    public static int[] bubleSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if(array[j] > array[j+1] )
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
