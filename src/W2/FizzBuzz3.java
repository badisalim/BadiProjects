package W2;

public class FizzBuzz3 {


            public static void main(String[] args) {



                //  Numbers devided by 3 or 5 or 3and 5

                System.out.println("\nDivided by 3: ");
                for (int i=1; i<50; i++) {
                    if (i%3==0)
                        System.out.print(i +", ");
                }

                System.out.println("\n\nDivided by 5: ");
                for (int i=1; i<50; i++) {
                    if (i%5==0) System.out.print(i +", ");
                }

                System.out.println("\n\nDivided by 3 & 5: ");
                for (int i=1; i<50; i++) {
                    if (i%3==0 && i%5==0) System.out.print(i +", ");
                }
                System.out.println("\n");

                for (int i = 1; i <= 50; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        System.out.printf("\n%d: 3bizz 5buzz",i);
                    } else if (i % 5 == 0) {
                        System.out.printf("\n%d: 5buzz",i);
                    } else if (i % 3 == 0) {
                        System.out.printf("\n%d: 3fizz",i);
                    }
                }
                System.out.printf("\n");



            }
        }


















