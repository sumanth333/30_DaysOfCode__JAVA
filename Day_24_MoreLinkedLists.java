public static Node removeDuplicates(Node head) 
{
     Node tempHead = head;
     while(tempHead!=null)
     {
         Node prevNode = tempHead,currentNode = tempHead.next;
         while(currentNode != null)
         {
            if(tempHead.data == currentNode.data)
            {
               currentNode = currentNode.next;
               prevNode.next = currentNode;
            }
            else
            {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
         }
         tempHead = tempHead.next;
     }
     System.gc();
    return head;
}
