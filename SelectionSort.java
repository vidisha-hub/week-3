import java.util.*;
class selectionSort{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println(" enter the limit of array");
int n = sc.nextInt();
int[] arr= new int[n];
System.out.println(" enter the element of array");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int min_idx=0 ,j,temp,i;
for(i=0;i<n-1;i++){
min_idx=i;
for(j=i+1;j<n;j++){
if(arr[j]<arr[min_idx]){
min_idx=j;
}
}
temp = arr[min_idx];
arr[min_idx]=arr[i];
arr[i]=temp;
}
for(i=0;i<n;i++)
System.out.println(arr[i]);
}
}
