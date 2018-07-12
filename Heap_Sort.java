import java.util.Scanner;
class Heap_Sort
{
	static int [] a;
	static int n;
	static int left;
	static int right;
	static int largest;

	static void buildHeap(int []a)
	{
		n=a.length-1;
		for(int i=n/2;i>=0;i--)
		{
			
			maxHeap(a,i);
		}
	} 
	static void maxHeap(int [] a,int i)
	{
       left=2*i;
       right=2*i+1;
      
       if(left<=n&&a[left]>a[i])
       	largest=left;
       else
       	largest=i;
       if(right<=n&&a[right]>a[largest])
       	largest=right;
      if(largest!=i)
      {
      	exchange(i,largest);
      	maxHeap(a,largest);
      }


	}
	static void exchange(int i,int j)
	{
		int t=a[j];
		a[j]=a[i];
		a[i]=t;
	}
	static void sort(int []a0)
	{
		a=a0;
		buildHeap(a);
		for(int i=n;i>0;i--)
		{
			exchange(0,i);
			n=n-1;
			maxHeap(a,0);
		}
	}
	 public static void main(String[] args) {
	
	
	int []a1={2,4,5,1,3,45,23,56};
	
	
	sort(a1);
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");	
	}
}
