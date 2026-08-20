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
