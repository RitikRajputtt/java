import java.util.Scanner;
import java.util.*;
class Stg
{

public static void main(String[]args)
{
String a="technologies";
int v=0;
int r;
int c=0;

for(int i=0;i<a.length();i++)
{
   char ch= a.charAt(i);
   if(ch== 'a' || ch== 'e' || ch=='i' || ch== 'o' || ch=='u')
    {
       v++;
     }

 else if((ch>= 'a'&& ch<= 'z'))
  {
    c++;
}
}
  System.out.println("Number of vowels:"+v);
   System.out.println("Number of consonants:"+ c);
}
}







