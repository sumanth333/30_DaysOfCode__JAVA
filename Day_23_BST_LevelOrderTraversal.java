static void levelOrder(Node root)
{
    Queue<Node> queue=new LinkedList<Node>();
    queue.add(root);
    
    while(!queue.isEmpty())
    {
        Node current = queue.poll();;
        
        System.out.print(current.data+" ");
        if(current.left != null)
            queue.offer(current.left);
        if(current.right != null)
            queue.offer(current.right);
      
    }
      
}
