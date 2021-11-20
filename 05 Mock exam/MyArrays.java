public class MyArrays
{
    public static int max(int[] array) {
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > res) {
                res = array[i];
            }
        }
        return res;
    }
    
    public static int odd(int[] array) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                res++;
            }
        }
        return res;
    }
}
