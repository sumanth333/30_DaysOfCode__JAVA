	public static int getHeight(Node root)
    {
        int leftHeight=0,rightHeight=0;
        if(root.left==null && root.right==null)
            return 0;
        
       else
       {
            if(root.left!= null)
            leftHeight = 1+getHeight(root.left);
            if(root.right != null)
                rightHeight = 1+getHeight(root.right);

            if(leftHeight > rightHeight)
                return leftHeight;
            return rightHeight;
       }
    }
