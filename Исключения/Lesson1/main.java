package Java.Lesson1;

public class main {
    public static void main(String[] args) {
        Lesson1 Bin = new Lesson1();
        System.out.println(Bin.SumBin(new int [][] {{1,0,0},{1,1,1},{1,0,0}}));
        System.out.println(Bin.SumBin(new int [][] {{2,0,0},{1,1,1},{1,0,0}}));
        System.out.println(Bin.SumBin(new int [][] {{2,0,0},{1,1,1},{1,0,0},{1,1,1},{1,0,0}}));

        // int [] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        // int [] array1 = null;
        // /*System.out.println(sizeArray(array, 15));*/

        
        // printcodexception(Array(array, 4, 1));
        // printcodexception(Array(array, 4, 11));
        // printcodexception(Array(array, 55, 1));
        // printcodexception(Array(null, 4, 1));
    }



    public static int Array( int [] array, int min) {
        int a = array.length;
        if (a < min) {
            return -1;
        }
        return a;
    }






public static int Array( int [] array, int value, int min){

    if (array == null) {
        return -3;
    }
    if (array.length < min) {
        return -1;
    }
    for (int i = 0; i < array.length; i++) {
        if (array[i] == value) {
            return i;
        }
    }
    return -2;
}


public static void printcodexception(int cod) {
    if (cod == -3){
        System.out.println("Вместо массива пришел null");
    }
    else if (cod == -2){
        System.out.println("Искомый элемент не найден");
    }
    else if (cod == -1){
        System.out.println("Длина массива меньше некоторого заданного минимума");
    } else System.out.println("Индекс =" + cod);
}
}