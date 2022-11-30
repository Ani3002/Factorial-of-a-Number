import java.util.*;
import java.io.*;
import java.math.BigInteger;

class factorial 
{
    public static void main(String args[]) throws IOException 
    {
        File fout = new File("Factorials_Output.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos))) 
        {
            int j;
            Scanner sc = new Scanner(System.in);
            System.out.print ("Enter the number you want facorial of till: ");
            long number=sc.nextLong();
            sc.close();
            for (j = 1; j <= number; j++) 
            {
                BigInteger fact = new BigInteger("1");
                long a = j;
                for (BigInteger bi = BigInteger.valueOf(a); bi.compareTo(BigInteger.ZERO)>0; bi = bi.subtract(BigInteger.ONE)) 
                {
                    fact = fact.multiply(bi);
                }
                System.out.println("Calculating factorial of " + a);
                bw.write("Factorial of " + a + " is: " + fact);
                bw.newLine();
            }
        }
    }
}
