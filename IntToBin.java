import java.util.Scanner;

class IntToBin{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number to convert to binary:");
int num=sc.nextInt();
getBinary(num);
}

public static void getBinary(int num){
int bin[]=new int[40];
int index=0;
while(num>0){
bin[index++]=num%2;
num=num/2;
}
for(int i=index-1;i>=0;i--){
System.out.print(bin[i]);
}

}

}