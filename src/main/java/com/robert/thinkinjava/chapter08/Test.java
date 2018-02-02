package com.robert.thinkinjava.chapter08;

public class Test {
    public static void main(String[] args) {
        int[] result = new int[]{12, 34, 53, 63, 78, 90, 123, 142, 180, 200, 210, 400, 530, 800};
        int element = 800;
//        int index = getNumIndexByRecursion(result, element, 0, result.length - 1);
        int index = getNumIndexByLoop(result, element);
        if (index != -1) {
            System.out.println("找到的位置：" + index);
        } else {
            System.out.println("没有找到");
        }
    }

    /**
     * 递归查找
     *
     * @param result 要查找的列表
     * @param i      目标
     * @param start  在列表的起始位置
     * @param end    在列表的终止位置
     * @return 返回index，如果没有找到则返回-1
     */
    public static int getNumIndexByRecursion(int[] result, int i, int start, int end) {
        if (end >= start) {
            int middle = (end + start) / 2;
            Integer current = result[middle];
            if (i == current) {
                return middle + 1;
            } else if (i > current) {
                return getNumIndexByRecursion(result, i, middle + 1, end);
            } else {
                return getNumIndexByRecursion(result, i, start, middle - 1);
            }
        }
        return -1;
    }

    /**
     * 循环查找
     *
     * @param result 要查找的列表
     * @param i      目标
     * @return 返回index，如果没有找到则返回-1
     */
    public static int getNumIndexByLoop(int[] result, int i) {
        int start = 0;
        int end = result.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (i == result[mid]) {
                return mid + 1;
            } else if (i > result[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
