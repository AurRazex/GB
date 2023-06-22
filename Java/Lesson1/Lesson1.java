package Java.Lesson1;

public class Lesson1 {
    

    public int SumBin(int [][] array) {
        if (array.length != array[0].length) {
            throw new RuntimeException("Массив не квадратный");

        }
        int sum = 0;
        for (int i = 0 ; i < array.length; i++) {
            for (int j = 0 ; j < array.length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1) {
                    throw new RuntimeException("Массив не бинарный " + i + " " + j);
                }
                sum = sum + array[i][j];
            }
            
        }
        return sum;
    }
}
