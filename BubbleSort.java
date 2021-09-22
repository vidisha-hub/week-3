import java.util.*;
class bubbleSort{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the limit of array");
int n = sc. nextInt();
int[] arr = new int[n];
System.out.println(" enter the element of array");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int j,temp;
for(  int i= 0;i<n-1;i++){
for( j=0;j<n-i-1;j++){
if(arr[j]>arr[j+1]){
 temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
for(int i=0;i<n;i++)
System.out.println(arr[i]);
}
}
