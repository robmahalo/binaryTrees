package binarytrees;


import java.util.Vector;

public class BinaryTreeInOrderIterator extends BinaryTreeIterator
{
	public BinaryTreeInOrderIterator(BinaryTree tree)
	{
		super(tree);
	}
	
	public void buildTreeVector(BinaryTree tree)
	{
	   Object datum;
	   Vector vector;
	   
	   vector = this.getTreeVector();
	   if(tree != null)
	   {
		  datum = tree.getData();
		  this.buildTreeVector(tree.getLeftTree());
		  vector.addElement(datum);
		  this.buildTreeVector(tree.getRightTree());
	   }
	}

}