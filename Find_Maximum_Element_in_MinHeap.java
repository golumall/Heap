
class Find_MaxElement_In_Min_Heap
{
	int []a;
	int count=0;
   
   int findMax(int []a)
   {
      int max=-1;
      for(int i=(this.count)/2;i<this.count;i++)
      {
      	if(a[i]>max)
      		max=a[i];
      }
      return max;
   }
   public static void main(String[] args) {
   		
   		int []a={1,2,3,4,23,5,6};
   		Find_MaxElement_In_Min_Heap hp=new Find_MaxElement_In_Min_Heap();
   		hp.a=a;
   		hp.count=a.length;
       System.out.println("Maximum Element="+hp.findMax(hp.a));


   	}	
}
