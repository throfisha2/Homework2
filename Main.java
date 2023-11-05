import java.util.Arrays;

public class Main
{
    public static void main (String[] args)
    {
        //ввод данных
        int temp;
        int[] array = {4,5,8,3,0,2,6,1};

        //Сортировка перемешиванием (шейкерная сортировка)
        int left = 0;
        int right = array.length - 1;

        do {

            for (int i = left; i < right; i++)
            {
                // поиск максимального значения
                if (array[i] > array[i + 1])
                {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--;

            for (int i = right; i > left; i--)
            {
                // поиск минимального значения
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++;
        }
        while (left < right);

        // вывод массива
        System.out.print("Массив: "+ Arrays.toString(array));
    }
}