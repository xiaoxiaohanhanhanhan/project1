package package1;

import java.math.BigDecimal;

public class TestBigdecimal {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // System.out.println(round(2,2));
    /*    String a="254646464646464646464646464646";
        String b="2.0";
        System.out.println(a.equals(b));
        System.out.println(String.format("%.2f", a));*/
      /*  String a = String.format("%5.2f",123456.556);
        System.out.println(a);
        String a1 = String.format("%8.2f",6.556);
        System.out.println(a1);*/
        
        System.out.println("哈哈哈".hashCode());
        round(2.0,3);
    }
    
   //  方法
     public static BigDecimal round(double v, int scale) {  
        if (scale < 0) {  
         throw new IllegalArgumentException(  
           "The scale must be a positive integer or zero");  
        }  
        BigDecimal b = new BigDecimal(Double.toString(v));  
        BigDecimal ne = new BigDecimal("2");  
        return b.divide(ne, scale, BigDecimal.ROUND_HALF_UP);  
     } 
     
    //
     
}
