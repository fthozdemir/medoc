import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Node{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=1;
		Node tree=new Node();
	tree.add(12);
	tree.add(13);
	//tree.add(10);
	//tree.add(-12);
	tree.remove(12);
	//tree.add(144);
	//tree.bal();
		
	if(tree.contains(12))	
		System.out.println("var");
	//System.out.println(tree.bul(12).rightchild.getValue());
	}
}
