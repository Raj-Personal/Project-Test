

public class Test123456
{
    public static void main(String[] args) {

        int d=49;
        char c=(char) d;
                //Character.forDigit(d,0);
        System.out.println("Char"+c+ " "+String.valueOf(c));

       /* int d2= Character.forDigit(c, 10); //Integer.parseInt(String.valueOf(c));
        System.out.println("int"+d2);*/

        char c1 = 'T', c2 = 'z';
        String x="ab";
        // assign the numeric value of c1 to in1 using radix
        int in1 = Character.getNumericValue(c1);//digit(c1, 1);

        String total="";
        for (int i=0;i<x.length();i++)
        {
            char a=x.charAt(i);
            System.out.println("a"+a+ " "+(int)a);
            total+=(int)a;
        }
        System.out.println("total"+total);
        //System.out.println("Numeric value of " + c1 + " in radix 10 is " + in1+"  "+(int)(x.getChars(0,x.length())));


    }
}
