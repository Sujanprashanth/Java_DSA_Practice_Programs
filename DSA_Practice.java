Array Code Implementation as ADT:
Program:
class Main {
    int size;
    int capacity;
    int [] arr;

    Main(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }

    public void insert(int index,int element){
        if(index<0||index>size||size>=capacity){
            System.out.println("this is an invalid index");
            return;
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        size++;
    }

    public void get(int index){
        System.out.print(arr[index]);
    }

    public void set(int index,int element){
        arr[index]=element;
    }

    public void search(int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                System.out.println("index: "+i);
                break;
            }
        }
    }

    public void delete(int index){
        if(index<0||index>=size){
            System.out.println("this is an invalid index");
            return;
        }
        for(int i = index ; i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Main arr1 = new Main(5);
        arr1.insert(0,11);
        arr1.insert(1,12);
        arr1.insert(2,13);
        arr1.insert(2,33);

        arr1.get(2);
        arr1.set(2,100);
        arr1.search(12);
        arr1.delete(2);
        arr1.display();        
    }
}

Output:
Insert:
11
12
33
13

Get:
33

Set:
11
12
100
13

Search:
index: 1

Delete:
11
12
13
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Dynamic arrays code:

Program:
class Main {
    int size;
    int capacity;
    int [] arr;

    Main(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=0;
    }

    public void insert(int index,int element){
        if(index<0||index>size){
            System.out.println("this is an invalid index");
            return;
        }
        if(size>=capacity){
            resize();
        }
        for(int i=size;i>index;i--){
            arr[i]=arr[i-1];
        }
        arr[index]=element;
        size++;
    }

    public void get(int index){
        System.out.print(arr[index]);
    }

    public void set(int index,int element){
        arr[index]=element;
    }

    public void search(int element){
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                System.out.println("index: "+i);
                break;
            }
        }
    }

    public void delete(int index){
        if(index<0||index>=size){
            System.out.println("this is an invalid index");
            return;
        }
        for(int i = index ; i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    public void resize(){
        int newcapacity = capacity * 2;
        int [] newarr = new int[newcapacity];
        for(int i=0;i<size;i++){
            newarr[i] = arr[i]; 
        }
        arr=newarr;
        capacity = newcapacity;
    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Main arr1 = new Main(5);
        arr1.insert(0,341);
        arr1.insert(1,92);
        arr1.insert(2,14);
        arr1.insert(3,34);
        arr1.insert(4,349);
        arr1.insert(5,348);
        arr1.display();        
    }
}

Output:
341
92
14
34
349
348
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
LinkedList insert at the begining:
Program:
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head = null;
    void insertAtTheBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
class Main{
    public static void main(String[]args){
        LinkedList lk = new LinkedList();
        lk.insertAtTheBegining(1);
        lk.insertAtTheBegining(2);
        lk.insertAtTheBegining(3);
        lk.display();
    }
}

Output:
3->2->1->null
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
LinkedList insert at the last
Program:
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head = null;
    void insertAtTheBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }
    void insertAtTheEnd(int data){
        if(head==null){
            insertAtTheBegining(data);
        }
        Node temp=head;
        Node newNode1 = new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode1;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
class Main{
    public static void main(String[]args){
        LinkedList lk = new LinkedList();
        lk.insertAtTheBegining(1);
        lk.insertAtTheBegining(2);
        lk.insertAtTheBegining(3);
        lk.insertAtTheEnd(4);
        lk.display();
    }
}

Output:
3->2->1->4->null

Linked list insert at a specific index
Program:
Program:
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head = null;
    void insertAtTheBegining(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
    }
    void insertAtTheEnd(int data){
        if(head==null){
            insertAtTheBegining(data);
        }
        Node temp=head;
        Node newNode1 = new Node(data);
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode1;
    }
    void insertAtIndex(int index,int data){
        if(index<0){
            System.out.println("Invalid index");
            return;
        }
        Node temp=head;
        Node newNode2 = new Node(data);
        for(int i =0;i<index-1;i++){
            temp=temp.next;
        }
        newNode2.next=temp.next;
        temp.next=newNode2;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
class Main{
    public static void main(String[]args){
        LinkedList lk = new LinkedList();
        lk.insertAtTheBegining(1);
        lk.insertAtTheBegining(2);
        lk.insertAtTheBegining(3);
        lk.insertAtTheEnd(4);
        lk.insertAtIndex(2,45);
        lk.display();
    }
}

Output:
3->2->45->1->4->null
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Practice topic linked list:
Program:
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    void insertAtTheBegining(int data){
        Node newNode1 = new Node(data);
        Node temp = head;
        newNode1.next=temp;
        head = newNode1;
    }
    
    void insertAtTheEnd(int data){
        Node newNode2 = new Node(data);
        if(head==null){
            head=newNode2;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode2;
    }
    
    void insertAtIndex(int index,int data){
        Node newNode3 = new Node(data);
        if(index<0){
            System.out.println("Invalid Index");
            return;
        }
        if(index==0){
            insertAtTheBegining(data);
            return;
        }
        
        if(head==null){
            System.out.println("Invalid Index");
            return;
        }
        
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        newNode3.next=temp.next;
        temp.next=newNode3;
    }
    
    void deleteElement(int data){
        Node temp=head;
        if(head==null){
            System.out.print("Invalid Deletion");
            return;
        }
        
        while(temp.next!=null && temp.next.data!=data){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        
    }
    
    void searchElement(int data){
        Node temp=head;
        boolean b = false;
        while(temp!=null){
            if(temp.data!=data){
                b=false;
                temp=temp.next;
            }
            else{
                b=true;
                System.out.println(b);
                return;
            }
        }
    }
    
    void countElement(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("no of nodes:"+count);
    }
    
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}

class Main{
    public static void main(String []args){
        LinkedList lk = new LinkedList();
        lk.insertAtTheBegining(10);
        lk.insertAtTheBegining(20);
        lk.insertAtTheBegining(30);
        lk.insertAtTheEnd(40);
        lk.insertAtTheEnd(50);
        lk.insertAtTheEnd(60);
        lk.insertAtIndex(5,99);
        lk.deleteElement(99);
        lk.searchElement(20);
        lk.countElement();
        lk.display();
    }
}

Outout:
true
no of nodes:6
30->20->10->40->50->60->null
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
Reverse Linked List:
Program:
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ReverseLinkedList{
    Node head = null;
    void insertAtTheEnd(int data){
        Node newNode1 = new Node(data);
        if(head==null){
            head = newNode1;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode1;
    }

    void reverse(){
        Node prev=null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head = prev;
    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
        }
        System.out.print("null");
    }
}
class Main{
    public static void main(String[] args){
        ReverseLinkedList lk = new ReverseLinkedList();
        lk.insertAtTheEnd(10);
        lk.insertAtTheEnd(20);
        lk.insertAtTheEnd(30);
        lk.insertAtTheEnd(40);
        lk.insertAtTheEnd(50);
        lk.reverse();
        lk.display();
    }
}

Output:
Before reverse: 10->20->30->40->50->null
After reverse : 50->40->30->20->10->null
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
DoublyLinkedList:
Program:
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoublyLinkedList{
    Node head = null;
    void insertAtTheBegining(int data){
        Node newNode1 = new Node(data);
        newNode1.next=head;
        if(head!=null){
            head.prev=newNode1;
        }
        head=newNode1;
    }
    
    void insertAtTheEnd(int data){
        Node newNode2 = new Node(data);
        if(head==null){
            head=newNode2;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode2;
        newNode2.prev=temp;
    }
    
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
public class Main
{
	public static void main(String[] args) {
	    DoublyLinkedList dl = new DoublyLinkedList();
	    dl.insertAtTheBegining(10);
	    dl.insertAtTheBegining(20);
	    dl.insertAtTheBegining(30);
	    dl.insertAtTheBegining(40);
	    dl.insertAtTheBegining(50);
	    dl.insertAtTheEnd(60);
	    dl.insertAtTheEnd(70);
	    dl.insertAtTheEnd(80);
	    dl.display();
	}
}

Output:
50<->40<->30<->20<->10<->60<->70<->80<->null
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------    
LinkedList insertAtEnd,insertAtBegining,insertAtIndex,deleteByData,DeleteByIndex,reverse
program:
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head=null;
    void insertAtTheBegining(int data){
        Node newNode1 = new Node(data);
        if(head==null){
            head=newNode1;
            return;
        }
        newNode1.next=head;
        head=newNode1;
    }
    
    void insertAtTheEnd(int data){
        Node temp=head;
        Node newNode2 = new Node(data);
        if(head==null){
            head=newNode2;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode2;
    }
    
    void insertAtIndex(int index,int data){
        int count=0;
        if(index<0){
            System.out.print("Invalid index");
            return;
        }
        Node newNode3 = new Node(data);
        Node temp = head;
        Node temp1 = head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        if(head == null && index>0){
            System.out.print("Invalid index for an empty list");
            return;
        }
        if(index==0 || head == null){
            insertAtTheBegining(data);
            return;
        }
        
        if(index<=count){
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            newNode3.next=temp.next;
            temp.next=newNode3;
        }
        else{
            System.out.println("invalid index size");
            return;
        }
    }
    
    void deleteByData(int data){
        Node temp = head;
        if(head==null){
            System.out.println("No Data is present in this linkedlist");
            return;
        }
        if(head.data==data){
            head=head.next;
            return;
        }
        while(temp.next!=null && temp.next.data!=data){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("No such data is present");
            return;
        }
        else{
            temp.next=temp.next.next;
        }
    }
    
    void deleteByIndex(int index){
        if(head==null){
            System.out.println("No Data is present in this linkedlist");
            return;
        }
        if(index<0){
            System.out.println("invalid index");
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node temp = head;
        Node temp2 = head;
        int count2=0;
        while(temp2!=null){
            count2++;
            temp2=temp2.next;
        }
        if(index<count2){
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        else{
            System.out.println("Index size for deletion is bigger");
            return;
        }
    }
    
    void reverse(){
        Node current = head;
        Node next = null;
        Node prev = null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    
    void display(){
        Node temp=head;
        System.out.print("LinkedList:--->");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
class Main{
    public static void main(String[]args){
        LinkedList lk = new LinkedList();
        lk.insertAtTheBegining(10);
        lk.insertAtTheBegining(20);
        lk.insertAtTheBegining(30);
        lk.insertAtTheBegining(40);
        lk.insertAtTheBegining(50);
        lk.insertAtTheEnd(60);
        lk.insertAtTheEnd(70);
        lk.insertAtTheEnd(80);
        lk.insertAtTheEnd(90);
        lk.insertAtIndex(0,100);
        lk.deleteByData(100);
        lk.deleteByIndex(1);
        lk.reverse();
        lk.display();
    }
}

Output:
1. insertAtTheBegining()
   lk.insertAtTheBegining(100);
   lk.display();
Output:
LinkedList:--->100->50->40->30->20->10->60->70->80->90->null
Logic: New node becomes head.

2. insertAtTheEnd()
   lk.insertAtTheEnd(100);
   lk.display();
Output:
LinkedList:--->50->40->30->20->10->60->70->80->90->100->null
Logic: New node is attached after the last node.

3. insertAtIndex()
Example:
lk.insertAtIndex(2, 100);
lk.display();
Before:
Index:  0   1   2   3   4   5   6   7   8
        ↓   ↓   ↓   ↓   ↓   ↓   ↓   ↓   ↓
        50  40  30  20  10  60  70  80  90

Output:
LinkedList:--->50->40->100->30->20->10->60->70->80->90->null

4. deleteByData()
   Example:
   lk.deleteByData(30);
   lk.display();

Before:
50 -> 40 -> 30 -> 20 -> 10 -> 60 -> 70 -> 80 -> 90

Output:
LinkedList:--->50->40->20->10->60->70->80->90->null
Logic: Find the node before 30, then skip 30.
40 -> 30 -> 20
40 ─────→ 20
	
5. deleteByIndex()
   Example:
   lk.deleteByIndex(2);
   lk.display();

Index:
Index:  0   1   2   3   4   5   6   7   8
        ↓   ↓   ↓   ↓   ↓   ↓   ↓   ↓   ↓
        50  40  30  20  10  60  70  80  90
Index 2 = 30.

Output:
LinkedList:--->50->40->20->10->60->70->80->90->null
	
6. reverse()
   Your current code:
   lk.reverse();
   lk.display();

Starting list:
50 -> 40 -> 30 -> 20 -> 10 -> 60 -> 70 -> 80 -> 90 -> null

Output:
LinkedList:--->90->80->70->60->10->20->30->40->50->null
🧠 Reverse logic
Before:
50 → 40 → 30 → 20 → 10 → 60 → 70 → 80 → 90 → null
	
After:
90 → 80 → 70 → 60 → 10 → 20 → 30 → 40 → 50 → null
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
