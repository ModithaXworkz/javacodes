import java.util.Scanner;
class Prime{

public static void main(String a[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();

for(int i=0;i<num;i++){
 num=num%i;
 if(num==0){ 
   System.out.println("The number is prime");
} 
else{ 
   System.out.println("The number is not prime");
}
}

}


}