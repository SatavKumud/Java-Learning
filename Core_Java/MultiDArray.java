package  Core_Java;
public class MultiDArray {
    public static void main(String[] args) {
//        int [][] flats = new int[2][3];
//        flats [0][0] = 101;
//        flats [0][1] = 102;
//        flats [0][2] = 103;
//
//        flats[1][0] = 21;
//        flats[1][1] = 22;
//        flats[1][2] = 23;
//
//        System.out.println(flats[1][2]);
//        System.out.println(flats[0][0]);
//
//
//        //printing MultiD array using  for loop:
//        for(int i = 0; i<flats.length; i++){ //eah array in multiDarray
//            for(int j = 0; j<flats[i].length; j++){ //e;ements of eahc array
//                System.out.println(flats[i][j]);
//            }
//        }




        //Practice set - 6


        //Q1
//        float[] marks = {45.7f, 54.09f, 23.3f};
//        float sum = 0;
//        for(float ele : marks){
//            sum = sum+ele;
//        }
//        System.out.println("Value of sum of float number is:"+ sum);




        //Q2
//        float[] marks = {45.7f, 54.09f, 23.3f};
//        float num = 15.7f;
//
//        for(int i =0; i<marks.length; i++){
//            if(num == marks[i]){
//                System.out.println(num+" is present in array");
//                break;
//            }
//            else{
//                System.out.println(num+" is not present in the array");
//                break;
//            }
//        }




        //Q3
//        float [] phy = {45.7f, 78.8f, 54.6f, 89.3f};
//        float sum = 0;
//        for(float ele : phy){
//            sum = sum+ele;
//        }
//        System.out.println("Average of marks of the students is: "+ sum/phy.length);


        //Q4
//        int [][] m1 = {{1,3,5},
//                       {2,4,6}};
//
//        int [][] m2 = {{6,7,8},
//                       {9,10,11}};
//
//        int [ ][] result = {{0,0,0},
//                            {0,0,0}};
//
//        for(int i = 0; i<m1.length; i++){  //row number fof times
//            for(int j = 0; j<m1[i].length; j++){ //column number of times
//                result[i][j] = m1[i][j] + m2[i][j];
//            }
//        }
//        //printing results
//        for(int i = 0; i<m1.length; i++){  //row number fof times
//            for(int j = 0; j<m1[i].length; j++){ //column number of times
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println(" ");
//        }


        //Q5  reverse the array (logic = swap a[i] with a[l-1-i])
//        int [] arr = {1,2,3,4,5,6};
//        for(int element : arr){
//            System.out.print(element);
//        }
//
//        int  l = arr.length;
//        int n = Math.floorDiv(l,2);
//
//        for(int i= 0; i<n; i++){
//            int temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        System.out.println(" ");
//        for(int ele: arr){
//            System.out.print(ele);
//        }


        //Q6 array sorted of not (Logic = isSorted = true, arr[i]>arr[i+1] then false )

        int [] arr = {1,2,3,4,555,67};
        boolean isSorted = true;
        for(int i = 0; i<arr.length-1 ; i++){
            if(arr[i]> arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is  sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
