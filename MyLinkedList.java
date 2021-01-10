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
			start = new Node(value);

		} else 
    if (size == 1) {
			end = new Node(value);
			start.setNext(end);
			end.setPrev(start);}
      
		 else {
			Node old = end;
			end = new Node(value);
			oldEnd.setNext(end);
			end.setPrev(old);}
		size++;
		return true;
	}



	public String toString(){
		if(size == 0){
			return "[]";}
      
		String result = "[" + start.getData();
		Node temp = start;
		while(temp != end){
			tmp = temp.getNext();
			ret += ", " + temp.getData();
		}
		return result + "]";
	}

   
 



	public void add(int index, String value) {
		if (index < 0 || index > size()) throw new IndexOutOfBoundsException("Index out of bounds");
		if (index == size()) {
			add(value);
			return;
		}
		if (index == 0) {
			Node oldStart = start;
			start = new Node(value);
			start.setNext(oldStart);
			oldStart.setPrev(start);
		} else {
			Node current = getNode(index);
			Node newNode = new Node(value);
			newNode.setNext(current);
			newNode.setPrev(current.getPrev());
			current.getPrev().setNext(newNode);
			current.setPrev(newNode);
		}
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

