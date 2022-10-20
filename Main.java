public class Main {
    //Запуск программы по номеру(1 - 10 + аргументы)
    public static void main(String[] args) {
        if (Integer.valueOf(args[0]) == 1) {
            int p1 = remainder(Integer.valueOf(args[1]) , Integer.valueOf(args[2]));
            System.out.println(p1);
        }
        if (Integer.valueOf(args[0]) == 2) {
            double p2 = triArea(Double.valueOf(args[1]) , Double.valueOf(args[2]));
            System.out.println(p2);
        }
        if (Integer.valueOf(args[0]) == 3) {
            int p3 = animals(Integer.valueOf(args[1]) , Integer.valueOf(args[2]),Integer.valueOf(args[3]));
            System.out.println(p3);
        }
        if (Integer.valueOf(args[0]) == 4) {
            boolean p4 = profitableGamble(Double.valueOf(args[1]) , Double.valueOf(args[2]), Double.valueOf(args[3]));
            System.out.println(p4);
        }
        if (Integer.valueOf(args[0]) == 5) {
            String p5 = operation(Double.valueOf(args[1]) , Double.valueOf(args[2]), Double.valueOf(args[3]));
            System.out.println(p5);
        }
        if (Integer.valueOf(args[0]) == 6) {
            int p6 = ctoa(args[1].charAt(0));
            System.out.println(p6);
        }
        if (Integer.valueOf(args[0]) == 7) {
            int p7 = addUpTo(Integer.valueOf(args[1]));
            System.out.println(p7);
        }
        if (Integer.valueOf(args[0]) == 8) {
            int p8 = nextEdge(Integer.valueOf(args[1]) , Integer.valueOf(args[2]));
            System.out.println(p8);
        }
        if (Integer.valueOf(args[0]) == 9) {
            int[] data = new int[args.length-1];
            for (int i = 1; i < args.length;i++) {
                data[i-1] = Integer.valueOf(args[i]);
            }
            int p9 = sumOfCubes(data);
            System.out.println(p9);
        }
        if (Integer.valueOf(args[0]) == 10) {
            boolean p10 = abcmath(Integer.valueOf(args[1]) , Integer.valueOf(args[2]), Integer.valueOf(args[3]));
            System.out.println(p10);
        }
    }
    //#1 остаток от деления
    public static int remainder(int a , int b) {
        int res = a % b;
        return res;
    }
    //#2 площадь треугольника
    public static double triArea(double a, double h) {
        double res = 0.5*a*h;
        return res;
    }
    //#3 количество ног у скота
    public static int animals(int chickens, int cows,int pigs) {
        int res = chickens*2+cows*4+pigs*4;
        return res;
    }
    //#4 
    public static boolean profitableGamble(double prob, double prize, double pay) {
        if ((prob*prize) > pay) {
            return true;
        } else {
            return false;
        }
    }
    //#5
    public static String operation(double a, double b, double n) {
        if (a+b == n) {
            return "addition";
        }
        if (a-b == n) {
            return "subtraction";
        }
        if (a*b == n) {
            return "multiplication";
        }
        if (a/b == n) {
            return "Division";
        } else {
            return "none";
        }
    }
    //#6
    public static int ctoa(char c) {
        int ascii = c;
        return ascii;
    }
    //#7
    public static int addUpTo(int a) {
        int res = 0;
        for (int i = 0; i <= a; i ++) {
            res+=i;
        }
        return res;
    }
    //#8
    public static int nextEdge(int a, int b) {
        return (a+b-1);
    }
    //#9
    public static int sumOfCubes(int[] a) {
        int res = 0;
        for (int i=0 ; i < a.length; i++) {
            res+= a[i]*a[i];
        }
        return res;
    }
    //#10
    public static boolean abcmath(int a, int b, int c) {
        int result = 0;
        for (int i = 0 ;i < b; i ++) {
            result+= a;
        }
        if (a % c == 0) {
            return true;
        }else {
            return false;
        }
    }

}
