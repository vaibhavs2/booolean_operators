import java.util.Scanner;
class bool{

boolean AND(boolean a,boolean b)
{if(a==true)
   { if(b==true)
       return true;}
return false;}
boolean OR(boolean a,boolean b)
{if(a==false)
   {if(b==false)
      return false;}
return true;}

boolean NOT(boolean a){
if(a==true)
return false;
return true;}

boolean XOR(boolean a,boolean b)
{if(a==true)
   if(b==true)
    return false;
     else return true;
if(a==false)
  if(b==false)
    return false;
    else 
      return true;
return false;}}

class NewClass{ static public void main(String args[])
{Scanner sc =new Scanner(System.in);
String a=sc.next();//do input 5 as i have put 5 as string for condition to be true.
String b= sc.next();// input and.
bool ob=new bool();
if(ob.AND(a.equals("5"),b.equals("and")))
System.out.println("And operator is working");
}}
// you can use any of these operator like i used in if statement in NewClass,

