package linkedlist;

public class Node {
    protected int data;
    protected Node link;
    
    /*Constructor*/
    public Node()
    {
    link = null;
    data = 0;
    }
    
    /*Constructor*/
    public Node (int d, Node n)
    {
    data = d;
    link = n;
    }
    
    /*Function to set link to next Node* *Berfungsi untuk mengatur link ke Node berikutnya*/ 
    public void setLink (Node n)
    {
    link = n;
    }
    
    /*Function to set data to current Node* *Berfungsi untuk mengatur data ke Node saat ini*/
    public void setData (int d)
    {
    data = d;
    }
    
    /*Function to get link to next Node* *Berfungsi untuk mendapatkan link ke Node berikutnya*/
    public Node getLink ()
    {
    return link;
    }
    
    /*Function to get data from current Node* *Berfungsi untuk mendapatkan data dari Node saat ini*/
    public int getData ()
    {
    return data;
    }
}

