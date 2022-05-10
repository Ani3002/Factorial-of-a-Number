import java.math.BigInteger;
import java.io.*;
    
    class factorial{  
     public static void main(String args[]) throws IOException
     {  
        File fout = new File("out.txt");
	FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
 








            int j,fact1=1;  
            long number=999999999;//It is the number to calculate factorial    
            
            for(j=1;j<=number;j++)
            {
            BigInteger b = new BigInteger("5"), fact= new BigInteger("1");
            //BigInteger num = new BigInteger("99999");
            long a=j;
            for (BigInteger bi = BigInteger.valueOf(a);
            bi.compareTo(BigInteger.ZERO) > 0;
            bi = bi.subtract(BigInteger.ONE)) 
            {

               //System.out.println(bi);
               fact=fact.multiply(bi);
            }

            System.out.println("Calculating factorial of"+a);//"Factorial of "+a+" is: "+fact);    
            bw.write("Factorial of "+a+" is: "+fact);
            bw.newLine();
            
        } 
    }
    }
    
