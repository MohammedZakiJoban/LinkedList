
package javaapplication13;

class Node 

{

    private info data;
    private Node next, prev;

    public Node()
    {
        next = null;
        prev = null;
        data = null;
    }
   
    public Node(info d, Node n, Node p)
    {

       data = d;
       next = n;
        prev = p;

    }

    public void setLinkNext(Node n)
    {
        next = n;
    }

    public void setLinkPrev(Node p)
    {
        prev = p;
    }    
    public Node getLinkNext()
    {
        return next;
    }

    public Node getLinkPrev()
    {
        return prev;
    }

    public void setData(info d)
    {
        data = d;
    }

    public info getData()
    {
        return data;
    }

}