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

    /**
     * UI method for center grafic object in 1 axis
     *
     * @param objectSize (width or height)
     * @param screenSize (width or height)
     * @return
     */
    public static int toCenter(int objectSize, int screenSize) {
        //  System.out.println(screenSize);
        double one = screenSize / 100.0;
        //  System.out.println(one * 50 - objectSize * one / 2);
        return(int)( one * 50 - objectSize * one / 2) ;
    }

    /**
     * UI method for setting ofset or size of grafic object in 1 axis
     *
     * @param percent What size you want (width or height)
     * @param size (screen size)(width or height)
     * @return
     */
    public static int toPercent(double percent,double size) {
        return (int)(size/100*percent);
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
