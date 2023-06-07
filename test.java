public class test {
    public static void main(String[] args) {
        System.out.println("nihao!");
        //帮我写一个冒泡排序
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //帮我写一个选择排序
        int[] arr1 = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }

        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
    }
}
