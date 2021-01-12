public class MyLinkedList{
 private int size;
 private Node start,end;  

 
 public MyLinkedList(){
   size = 0;
 }


 
 public int size(){
   return size;
 }


 public String get(int index){
 if(index < 0 || index >= size) {
     throw new IndexOutOfBoundsException(" it's out of bounds");}
return getNode(index).getData();
}


	public boolean add(String value) {
		if (size == 0) {
			start = new Node(value);} 
      else 
    if (size == 1) {
			end = new Node(value);
			start.setNext(end);
			end.setPrev(start);}
		 else {
			Node old = end;
			end = new Node(value);
			old.setNext(end);
			end.setPrev(old);}
		size++;
		return true;}



	public String toString(){
		if(size == 0){
			return "[]";}
      
		String result = "[" + start.getData();
		Node temp = start;
		while(temp != end){
			temp = temp.getNext();
			result += ", " + temp.getData();
		}
		return result + "]";
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


public void add(int index, String value) {
  if (index < 0 || index > size()) 
	  throw new IndexOutOfBoundsException();
  if (index == size()) {
    add(value);
    return;
    
  }
  if (index == 0) {
    Node newNode = new Node(value);
    newNode.setNext(start);
    start.setPrev(newNode);
    start = newNode;
    size++;
	  
  } else {
    Node current = getNode(index);
    Node newNode = new Node(value);
    newNode.setNext(current);
    newNode.setPrev(current.getPrev());
    current.getPrev().setNext(newNode);
    current.setPrev(newNode);
   size++;
  }
}


public String toStringReversed() {
  if (size == 0) 
  return "[]";
  
  
  String result = "[";
  Node current = end;
  
  while (current != null) {
    result += current.getData();
    if (current.getPrev() != null) {
      result += ", ";
    }
    
    current = current.getPrev();
  }
  
  result += "]";
  return result;
}

public void extend(MyLinkedList other){
  this.end.setNext(other.start);
  other.start.setPrev(this.end);
  this.end = other.end;
  other.start = null;
  other.end = null;
  this.size +=  other.size();
  other.size = 0;
}


public String remove(int index){
  if(index < 0 || index >= size)
  throw new IndexOutOfBoundsException();
  size--;
  
  if(size()+1 == 1){
    String result = start.getData();
    start = null;
    start = null;
    return result;
  }

  if (index == 0){
    String result = start.getData();
    start = start.getNext();
    start.setPrev(null);
    return result;}

  if (index == size-1){
    String result = end.getData();
    end = end.getPrev();
    end.setNext(null);
    return result;
  } 
  else {
  Node toRemove = getNode(index);
    String result = toRemove.getData();
  toRemove.getNext().setPrev(toRemove.getPrev());
  toRemove.getPrev().setNext(toRemove.getNext());
    return result;
  }
}



 



 
 //Any helper method that returns a Node object MUST BE PRIVATE!
}

