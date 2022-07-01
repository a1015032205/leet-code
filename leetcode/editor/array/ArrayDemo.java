package array;

/**
 * @Author: 秒度
 * @Email: fangxin.md@Gmail.com
 * @Date: 2022-07-01 22:27
 * @Description: 数组创建写法 https://wenku.baidu.com/view/646fd95f158884868762caaedd3383c4bb4cb4cc.html
 */

public class ArrayDemo {
    public static void main(String[] args) {


        int[] arr0 = new int[10];
        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{1, 2};
        int[] arr3 = {1, 2, 3};


        int[][] arr4 = new int[1][2];
        int[][] arr5 = new int[][]{{1, 2}, {2}};
        int[][] arr6 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr7 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        demo(arr6);

    }
    public static void demo(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }


}
