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

 if (size == 0) {
  start = new Node(value);
  end = new Node(value);
  size++;
  return true;
 }
 else{
end.setNext(new Node(value));
end = end.getNext();
size++;
return true;}}



   public String toString(){
     String result = "[";
     Node current = start;
     for(int i = 0; i < size; i++){
       result += current.getData();
       current = start.getNext();
       if (start.getNext() != null){
         result += ", "
       }
     }
     
     result = result + "]";
     return result;
   }



   
 

 
 public String get(int index){
 if(index < 0 || index >= size) {
     throw new IndexOutOfBoundsException(" it's out of bounds");
 }
 Node current = start;
 for(int i = 0; i < index; i++){
   currrent = currennt.getNext();
 }
 return current.getData();}



 public void add(int index, String value){
   if (index > size) 
   throw new IndexOutOfBoundsException("it is out of bounds");
   
   if (index == size()){
     return add(value);
   }

   if(index == 0){
     Node temp = new Node(value);
     start.setPrev(temp);
     
   }

   }
 


 
 public String set(int index, String value){
   if(index < 0 || index >= size) {
       throw new IndexOutOfBoundsException(" it's out of bounds");
   }
   Node current = getNode(index);
   String result = current.getData();
   current.setData(value);
   return result
   
 }



 private Node getNode(int index) {
    Node current = start;
    for(int i = 0; i < index; ++i) {
        current = current.getNext();
    }
    return current;
}


 



 
 //Any helper method that returns a Node object MUST BE PRIVATE!
}
