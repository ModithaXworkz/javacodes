import java.util.Scanner;
class Squares{

public static void main(String a[]){
int sqr=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to print square values upto the limit");
int  num=sc.nextInt();

for(int i=1;i<num;i++){
  sqr=i*i;
  if(sqr<=num){    
System.out.println(sqr);
 }
}

}

}