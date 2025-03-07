
package tree;

public class BTSImpln {

	void insert(Node root,int value) {
		if(root.data>value) {
			if(root.left==null) {
				System.out.println(value+" had be inserted towards left of "+root.data);
				root.left=new Node(value);}
			else {
				insert(root.left, value);	
			}
		}
		else {
			if(root.right==null) {
				System.out.println(value+" had be inserted towards right of "+root.data);
				root.right=new Node(value);
			}
			else {
				insert(root.right, value);	
			}

		}

	}
	void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data +" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	void postOrder(Node root) {
		if (root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");

		}
	}
	void inOrder(Node root) {
		if (root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);

		}
	}

	
}

