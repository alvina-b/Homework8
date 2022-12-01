public class Main {
    public static void main(String[] args) {
        //Задача 1, 2
        System.out.println("   Задача 1,2");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
             for (int a = 0; a < weight.length ; a++) {
                 if (a < weight.length - 1) {
                     System.out.print(weight[a] + ", ");
                 } else {
                     System.out.println(weight[a]);
                 }
             }
        float[] num = {1.57f, 7.654f, 9.986f};
         for (int b = 0; b < num.length; b++){
             if (b < num.length - 1) {
                 System.out.print(num[b] + ", ");
             } else {
                 System.out.println(num[b]);
             }
         }

        int[] memory = {5, 7, 9, 0, 16, 0};
        for (int i = 0; i < memory.length; i++) {
             if (i < memory.length - 1) {
                System.out.print(memory[i] + ", ");
            } else {
                System.out.println(memory[i]);
            }
        }

        //Задача 3
        System.out.println("   Задача 3");
        for (int a = weight.length - 1; a >= 0; a--) {
            if (a > 0) {
                System.out.print(weight[a] + ", ");
            } else {
                System.out.println(weight[a]);
            }
        }
        for (int b = num.length - 1; b >= 0; b--) {
                if (b > 0) {
                    System.out.print(num[b] + ", ");
                } else {
                    System.out.println(num[b]);
                }
        }
        for (int i = memory.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(memory[i] + ", ");
            } else {
                System.out.println(memory[i]);
            }
        }
    // Задача 4
        System.out.println("  Задача 4");
        for (int a = 0; a < weight.length; a++) {
            if (a % 2 == 0) {
                System.out.print(weight[a] + 1 + ", ");
            }
        }

    }
}