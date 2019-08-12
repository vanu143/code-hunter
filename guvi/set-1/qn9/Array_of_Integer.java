import java.util.*; 
class Array_of_Integer 
{  
static int sumKRepeating(int arr[],int n, int k) 
{ 
int sum = 0; 
Vector<Boolean> visited = new Vector<Boolean>(); 
for (int i = 0; i < n; i++) 
visited.add(false); 
for (int i = 0; i < n; i++) 
{ 
if (visited.get(i) == true) 
continue; 
int count = 1; 
for (int j = i + 1; j < n; j++)  
{          
if (arr[i] == arr[j])  
{ 
count++; 
visited.add(j, true); 
} 
} 
if (count == k) 
sum += arr[i]; 
} 
return sum; 
} 
public static void main(String args[]) 
{ 
int arr[] = { 9, 9, 10, 11,8, 8, 9, 8 }; 
int n = arr.length; 
int k = 3; 
System.out.println(sumKRepeating(arr, n, k)); 
} 
} 
