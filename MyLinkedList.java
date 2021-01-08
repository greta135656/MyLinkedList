public class MyLinkedList{
 private int size;
 private Node start,end;  

 
 public MyLinkedList(){
   size = 0;
 }


 
 public int size(){
   return size;
 }

 
 public boolean add(String value){
if(size==0){
 start = new Node(value);}
else if (size == 1){
  end = new Node(value);
  end.setPrev(start);
  end.setData(value);
  start.setNext(end);
}
else{
  Node oldEnd = end;
  end = new Node(value);
  oldEnd.setNext(end);
  end.setPrev(oldEnd);
}
size++;
return true;
	}


   
 

 
 public String get(int index){
 if(index < 0 || index >= size) {
     throw new IndexOutOfBoundsException(" it's out of bounds");
 }
return getNode(index).getData();
}



 public void add(int index, String value){
   if(index < 0 || index >= size) {
       throw new IndexOutOfBoundsException(" it's out of bounds");
   }

   if (index == size()){
      add(value);
   }

   if (index == 0) {
   Node old = start;
   start = new Node(value);
   start.setNext(old);
   old.setPrev(start);}

   else{
 Node current = start;
 Node NN = new Node(value);
NN.setPrev(current.getPrev());
 NN.setNext(current);
 current.getPrev().setNext(NN);
 current.setPrev(NN);}
 
 size++;


     
   }
   

   
 


 
 public String set(int index, String value){
   if(index < 0 || index >= size) {
       throw new IndexOutOfBoundsException(" it's out of bounds");
   }
   Node current = start;
   for(int i = 0; i < index;i++){
   current = current.getNext();
   }

   String result = current.getData();
   current.setData(value);
   return result;
 }



 private Node getNode(int index) {
   if(index < 0 || index >= size) 
       throw new IndexOutOfBoundsException(" it's out of bounds");
    Node current = start;
    for(int i = 0; i < index; ++i) {
        current = current.getNext();
    }
    return current;
}


    public String toString(){
        Node current = start;
        String toString = "";
        while(current!= null)
	{
            toString += current.getData();
            current = current.getNext();
		
            if(current!=null)
	    {
                toString+=", ";
	    }}
        return "[" + toString + "]";
    }
}

