import java.util.ArrayList;
import java.util.function.Consumer;

public class Node implements MyTreeSet  {

	public Node leftchild;
	public Node rightchild;
	private Integer N;
	private Node temp;
	private Node root,deleted,l;

	@Override
	public  void add(int N) {
		
		if(this.N==null)
			{
				this.N=N; 
			}
		else
			if(N<=this.N){ 
				if(leftchild==null)
				{
					temp=new Node();
					temp.add(N);
					leftchild=temp;
				}
				else
					leftchild.add(N);
			}
			else
			{ if(rightchild==null)
				{
					temp=new Node();
					temp.add(N);
			 		rightchild=temp;
				}
			else
				rightchild.add(N);
			}
				
				
	}



	private void leftchild(int n2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean contains(int el) {
		if(this.N==null)
			return false;
		else if(this.N==el)
			{temp=this; return true; }
		else if(el<this.N)
			 {
				if(leftchild==null) 
					return false; 
				else
					return leftchild.contains(el);
				}
			else
				{
					if(rightchild==null) 
						return false;
				
			        else
			        	return rightchild.contains(el);}
	
	}

	
	public boolean remove(int el) {
		Node tree= new Node();
		tree=this;
	Node prevNode =new Node();
	Node temp=null;
	boolean left=false;
	while(tree.N!=null){
		if(tree.leftchild!=null&&tree.rightchild!=null){
				//çift çocuðu varsa 
		}
		else if(tree.leftchild==null&& tree.rightchild==null){
			//çocuðu yoksa
			tree.N=null;
			return true;
		}
		else if(tree.rightchild!=null){
			// tek sað çocuðu varsa 
			//temp = new Node();
			temp=tree.rightchild;
			tree=temp;
		}
	}
	
	
	return false;
	}

	@Override
	public void traverse(Consumer<Integer> traversal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyTreeSet getRightChild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRightChild(MyTreeSet rightChild) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyTreeSet getLeftChild() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeftChild(MyTreeSet leftChild) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateValue(int el, int el2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		
	return 0;
	}

	@Override
	public ArrayList<Integer> toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getRoot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getValue() {
		
		return N;
	}

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		N=value;
	}

	@Override
	public void setStrategy(String strategy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return"";
	}
	
public void bal()
	{
	
		if(this!=null)
		{System.out.println(this.N);
		if(rightchild!=null)rightchild.bal();
		}
	
	}
public Node root(int m)
{
	temp=this;
	Node t=null;
	while(temp.N!=m)
	{ t=temp;
		if(m<temp.N)
			temp=temp.leftchild;
		else 
			temp=temp.rightchild;
	}
	return t;// eger temp=this ise agacýn köküdür.
}
public Node bul(int m)
{
	temp=this;
	while(temp.N!=m)
	{
		if(m<temp.N)
			temp=temp.leftchild;
		else 
			temp=temp.rightchild;
	}
	return temp;// eger temp=this ise agacýn köküdür.
}
}
