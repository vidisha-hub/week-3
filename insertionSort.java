import java.util.*;
class insertionSort{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the limit of array");
int n = sc.nextInt();
int [] arr = new int[n];
System.out.println(" enter the limit of array");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int i,j,temp;
for(i=1;i<n;i++){
temp=arr[i];
j=i-1;
while((j>-1) && (arr[j]>temp))
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=temp;
}
for(i=0;i<n;i++)
System.out.println(arr[i]);
}
}
