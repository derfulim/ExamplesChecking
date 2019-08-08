public class Main {
    public static void main(String[] args) {

    }
}

class ByteUShift   {

    static public void main(String[] args) {

        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'а', 'b', 'с', 'd', 'e', 'f'};

        byte b = (byte) 0xf1;

        byte c = (byte) (b >> 4);

        byte d = (byte) (b >>> 4);

        byte e = (byte) ((b & 0xff) >> 4);

        System.out.println(" b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);

        System.out.println("b >> 4 =  0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);

        System.out.println("b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);

        System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);

    } }

class OpBitEquals {

    public static void main(String args[]) {

        int a = 1;

        int b = 2;

        int c = 3;

        a |= 4;

        b >>= 1;

        c <<= 1;

        a ^= c;

        System.out.println("a = " + a);

        System.out.println("b = " + b);

        System.out.println("c = " + c);

    } }

     class Test{
         public static void main(String[] args) {
             char c2 = '\u0031';
             char c1 = '1';
             char c3 = 49;
             System.out.println( c1 + c2 + c3);
         }
    }
    class Test2{
         public static void main(String[] args) {
             char c2 = '\u0031';
             char c1 = '1';
             char c3 = 49;
             System.out.println(""+ c1 + c2 + c3);
         }
    }

    class Test3 {
        public static void main(String[] args) {
            int v1 = 1;
            long v2 = 2;
//            v1=v1+v2;
            v1 +=v2;
            System.out.println(v1);

            byte b =1;
//            byte c = b+1;

        }
    }

    class Test4{
        public static void main(String[] args) {
            int x = 1;
            System.out.println("x="+x);
            System.out.println(1+2+"text");
            System.out.println("text"+1+2);
        }
    }

    class Test5{
        public static void main(String[] args) {
            int arr[] =  {0,1,2,3,4};
//            for (int i = 0; i <arr.length ; i++) {
//                for (int j = arr.length-i; j >0 ; j--) {
//                    System.out.print(arr[i]);
//                }
//                System.out.println();

//            for (int i = arr.length; i >0 ; i--) {
//                for (int j = 0; j <i ; j++) {
//                    System.out.print(arr[j]);
//                }
//                System.out.println();
//            }

            for (int i = 0; i <arr.length ; i++) {
                for (int j = i; j <arr.length ; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }

class InsertionSorter {
    public static void main(String[] args) {
        int arr [] = {5,3,7,5,9};
        sort(arr);
        System.out.println(arr);
    }

    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int location = k - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}

class Test6 {
    public static void main(String[] args) {
        System.out.println(-5%2);
    }
    public static boolean oddOrNot(int num) {
      return num % 2 == 1;
    }
}








