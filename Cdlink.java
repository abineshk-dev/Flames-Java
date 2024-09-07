public class Cdlink {
cdnode head;
cdnode tail;
Cdlink(){
	head=null;
	tail=null;
}

// creating node
class cdnode {
   cdnode next;
   cdnode prev;
   String data;
	
   cdnode(String val)
   {
	   next=null;
	   prev=null;
	   data=val;   
   }	
}

//inserting values in the list at first position
public void insertatfirst(String val) {
	cdnode newnode=new cdnode(val);
	if(head==null) {
		
		newnode.next=newnode;
		newnode.prev=newnode;
		head=newnode;
		tail=newnode;
	}
	else
		newnode.next=head;
	    newnode.prev=tail;
	    tail.next=newnode;
	    head.prev=newnode;
	    head=newnode;
}

//traversing the list to find the result
public void traverseNew(int val) {
	int count=val;
    cdnode temp=tail;
    for(int j=count;j>0;j--) {
  for(int i=1;i<=count;i++) {
	  temp=temp.next;
  }
   //System.out.println("current node "+temp.data);
   delete(temp.data);
    }
}

//for delete method 
public void deleteatfirst(){
	head=head.next;
	head.prev=tail;
	tail.next=head;	
}

//for delete method
public void deleteatend() {
	tail=tail.prev;
	tail.next=head;
	head.prev=tail;	
}

//displaying the result
public void display() {
	cdnode temp=head;
	do {
		System.out.println("You And Your Partners Result Is "+temp.data);
	    temp=temp.next;
	}while(temp!=head);
}

//for deleting the flames values
public void delete(String val) {
	cdnode temp=head;
	if(val==head.data) {
		deleteatfirst();
		return;}
	if(val==tail.data) {
		deleteatend();
	    return;}
	do {
			if(val==temp.data)
			{
				temp.prev.next=temp.next;
				temp.next.prev=temp.prev;
			}
		temp=temp.next;	
	}while(temp!=head);
}
}
