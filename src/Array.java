public class Array {
    public static void main(String[] args) {
        int[] array = new int [8];
        array[0] = 37;
        array [7] = 117;
        for (int i= 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        String[] myArray ={"Hej", "med", "dig"};
        for (int i=0; i< myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        double[] Tal ={3.4, 2.5, 1.2, 6.7};
        System.out.println(Tal[2]);
        System.out.println(Tal.length);
    }
}
