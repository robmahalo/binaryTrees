package binarytrees;

import java.util.Iterator;


public class BinaryTree
{
   //////////////////////////////////////////////
   //            Properties                    //
   //////////////////////////////////////////////
   private BinaryTree myLeftTree;
   private BinaryTree myRightTree;
   private BinaryTree myParent;
   private Object myData;

   //////////////////////////////////////////////
   //            Methods                       //
   //////////////////////////////////////////////
   public BinaryTree()
   {
   	  myData = null;
	  myParent = null;
	  myLeftTree = null;
	  myRightTree = null;
   }

   public BinaryTree(Object o)
   {
   	  myData = o;
	  myParent = null;
	  myLeftTree = null;
	  myRightTree = null;
   }

   public BinaryTree(Object datum, BinaryTree left, BinaryTree right)
   {
      this.setParent(null);
      this.setData(datum);
      this.setLeftTree(left);
      this.setRightTree(right);
   }

   public Iterator iterator()
   {
	   BinaryTreeInOrderIterator inIt;

	   inIt = new BinaryTreeInOrderIterator(this);
	   return inIt;
   }
	
   public boolean hasLeftTree()
   {
      return myLeftTree != null;
   }
  
   public boolean hasRightTree()
   {
      return myRightTree != null;
   }

   public boolean isLeafNode()
   {
      boolean flag;
      flag = false;
      if (null == myRightTree &&
          null == myLeftTree)
      {
         flag = true;
      }
      return flag;
   }
  
   public void setLeftTree(BinaryTree tree)
   {
      if(this.hasLeftTree())
      {
         BinaryTree leftParent = myLeftTree.getParent();
         if (leftParent == this)
         {
            myLeftTree.setParent(null);
         }
      }
      
      myLeftTree = tree;
      if(tree != null)
      {
         tree.setParent(this);
      }
   }

   public void setRightTree(BinaryTree tree)
   {
      if(this.hasRightTree())
      {
         BinaryTree rightParent = myRightTree.getParent();
         if (rightParent == this)
         {
            myRightTree.setParent(null);
         }
      }
      
      myRightTree = tree;
      if(tree != null)
      {
         tree.setParent(this);
      }
   }

   public BinaryTree getLeftTree()
   {
      return myLeftTree;
   }

   public BinaryTree getRightTree()
   {
      return myRightTree;
   }

   public void setParent(BinaryTree tree)
   {
      myParent = tree;
   }

   public BinaryTree getParent()
   {
      return myParent;
   }

   public void setData(Object data)
   {
      myData = data;
   }

   public Object getData()
   {
      return myData;
   }
}