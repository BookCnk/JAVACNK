import java.util.Arrays;


//ให้ randomเลข 100 - 200  ให้หาเลขที่หารด้วย 5 หรือ 3 ลงตัว  สร้างเป็น 2 medtod เหมือนเดิม
//out put [55,50,45]
//ข้อสอง  หาผลรวมทั้งหมดของเลขทั้งหมดที่หารด้วย 5 หรือ 3 ลงตัว


public class Ramdom {
    public static void main(String[] args) {
        int[] r1 = random1(6);
        int[] r2 = random2(6);
        System.out.println(Arrays.toString(r1));
        System.out.println(Arrays.toString(findEven(r1)));
        System.out.println(Arrays.toString(r2));
        System.out.println(Arrays.toString(findDivisionBy3Or5(r2)));
    }

    public static int[] random1(int sizeOfArray) {
        int[] rand = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            rand[i] = (int)(Math.random()*(50-1)) + 1;
        }
        return rand;
    }

    public static int[] random2(int sizeOfArray) {
        int[] rand = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            rand[i] = (int)(Math.random()*(200-100)) + 100;
        }
        return rand;
    }

    public static int[] findEven(int[] arr) {
        int count = 0;
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                r[count] = arr[i];
                count++;
            }
        }
        return Arrays.copyOf(r, count);
    }

    public static int[] findDivisionBy3Or5(int[] arr) {
        int count = 0;
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3 == 0 || arr[i]%5 == 0) {
                r[count] = arr[i];
                count++;
            }
        }
        return Arrays.copyOf(r, count);
    }
}
