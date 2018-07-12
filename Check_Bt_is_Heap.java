 class Node
 {
 int data;
 Node left,right;
 Node(int data)
 {
 this.data=data;
 left=right=null;
 }
 }
 class Check_Heap
 {
 	Node root;
 	boolean check(Node root)
 	{
 		if(root==null)
 			return true;
 	    check(root.left);
 	    check(root.right);
 	    if(root.left!=null&&root.right!=null)
 	    {
 	    if((root.data<root.left.data&&root.data>root.right.data)||(root.data>root.left.data&&root.data<root.right.data))
 	    	return false;
 	    }
 	    

 	    return true;
 	}
 	public static void main(String[] args) {
 		
 		Check_Heap tree=new Check_Heap();
 		tree.root=new Node(1);
 		tree.root.left=new Node(0);
 		tree.root.right=new Node(3);
 		if(tree.check(tree.root))
 			System.out.println("Heap");
 		else
 			System.out.println("Not Heap");
 	}
 }
