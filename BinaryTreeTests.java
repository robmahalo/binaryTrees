package binarytrees;



import java.util.Iterator;

public class BinaryTreeTests
{
    public static void main(String[] args)
    {
        new BinaryTreeTests();
    }
    
    public BinaryTreeTests()
    {
    	this.binarySearchTest();
    }
    
    public void binarySearchTest()
    {
    	BinarySearchTree tree;
    	
    	tree = new BinarySearchTree();
    	
		tree.insert(new Integer(6));
		tree.insert(new Integer(46));
		tree.insert(new Integer(9));
		tree.insert(new Integer(-16));
		tree.insert(new Integer(6));
		tree.insert(new Integer(3));
		
		Object object;
		String str, expression;

		Iterator it;
		it = tree.iterator();

		// In order is the default iterator for a BinarySearchTree;
		// BinaryExpressionTrees can have either pre-, post- ore in-order
		// iterators.
		expression = "";
		while(it.hasNext())
		{
			object = it.next();
			str = " " + object.toString() + " ";
			expression += str;
		}
		System.out.println("In Order:" + expression + "\n");

    }  
}