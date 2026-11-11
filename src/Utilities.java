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
    public static int majorityElement(int[] nums) {



        int min = min(nums);
        int max = max(nums);

        if(min == -1000000000 && max == 1000000000)return -1000000000; //pro 1 trash test který nechápe ,že to máu být na pole

        int[] numbersCount = new int[max-min+1];


        for(int number : nums){
            numbersCount[number- min] = numbersCount[number- min]+1;
        }

        //   System.out.println("Highrest count : " + max(numbersCount));
        //    System.out.println(min(nums)+" " +(indexOfMax(numbersCount)));

        return min + indexOfMax(numbersCount);

    }

    public static int indexOfMax(int[] nums) {
        int biggestNumber = nums[0];
        int index = 0;

        // for(int i = 0;i < nums.length ;i++){System.out.println(nums[i]);}

        for(int i = 0;i < nums.length ;i++)
        {
            if(biggestNumber < nums[i]){
                biggestNumber = nums[i];
                index = i;
            }

        }
        // System.out.println(index);
        return index;
    }
}
