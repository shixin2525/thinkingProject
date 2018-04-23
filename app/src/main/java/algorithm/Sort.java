package algorithm;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by shixin-pc on 2018/4/11.
 * 排序算法
 */

public class Sort {
    /**
     * 冒泡
     */
    public static void bubble(int[] arr) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {//-1是为了下面可以+1，和下一个比较
                if (arr[j] > arr[j + 1]) {//升序
                    int tag = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tag;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Log.e("tag", "bubble:" + Arrays.toString(arr) + ",time:" + time + "ms");
    }

    /**
     * 选择排序
     * 每一轮的一个值去和所有值比较，然后记录下标，用以交换位置
     * （每一轮选出一个最大或最小的值）
     */
    public static void choice(int[] arr) {
        long startTime = System.currentTimeMillis();
        int tag;
        for (int i = 0; i < arr.length; i++) {
            tag = i;//记录当前轮这个值的下标
            for (int j = i + 1; j < arr.length; j++) {//i+1是因为不要自己和自己比较,且已经比较过的就不再比较了
                if (arr[tag] > arr[j]) {
                    tag = j;
                }
            }
            if (tag != i) {
                int a = arr[tag];
                arr[tag] = arr[i];
                arr[i] = a;
            }
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        Log.e("tag", "choice:" + Arrays.toString(arr) + ",time:" + time + "ms");
    }

    /**
     * 插入排序
     * 从左边开始，每下一个数和左边的所有数进行比较,就好比摸牌，摸一张马上和前面所有的数字比较并选择位置,再摸一张又重复操作
     */
    public static void insert(int[] arr) {
        int i,j;
        for ( i = 1; i < arr.length; i++) {
            int tab = arr[i];
            for (j = i; j > 0 && arr[j - 1] > tab; j--) {
                arr[j]=arr[j-1];
            }
            arr[j]=tab;
        }
        Log.e("tag",Arrays.toString(arr));
    }


}


















