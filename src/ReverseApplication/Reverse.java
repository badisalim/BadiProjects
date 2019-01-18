package ReverseApplication;

import ReverseApplication.ReversNrAndStr;

public class Reverse {

    public void ReversSt(ReversNrAndStr stnumreverse){

        String str0 = String.valueOf("012340");
        Integer num0=Integer.valueOf(56780);
        Integer str1=Integer.valueOf(str0);

        System.out.println("string get: " + stnumreverse.getString());
        StringBuffer scan = new StringBuffer(stnumreverse.getString());
        scan.reverse();
        System.out.println("string get reverse : "+scan);

        System.out.println("number get:  " + stnumreverse.getNumber());

        Integer scan1=new Integer(stnumreverse.getNumber());
        Integer num1=Integer.valueOf(scan1);
       // scan1=scan1.intValue();
        scan1.reverse(num1);
        num1.reverse(scan1);
        //scan1.reverse(scan1);


        System.out.println("number get reversed : "+scan1);

        StringBuffer str3 = new StringBuffer(String.valueOf(str0));
        str3.reverse();
        System.out.println("string of numbers is : "+str1);

        StringBuffer str0000 = new StringBuffer(str0);
        str0000.reverse();
        System.out.println("string of numbers reversed  is : "+str0000);
        System.out.println("number of numbers  is : "+num0);


        StringBuffer scanner2 = new StringBuffer(num0);
        Integer number=Integer.valueOf(num0);

        StringBuffer stt = new StringBuffer(String.valueOf(num0));
        stt.reverse();
        System.out.println("The number of number reversed is: " +stt);

        System.out.println("string of number  multiplyed by 2: " +num1*2);
        System.out.println("string of number  multiplyed by 2: " +str1*2);

    }
}
