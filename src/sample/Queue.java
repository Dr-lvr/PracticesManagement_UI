package sample;

class Queue<T>{
	private Node head;
	private Node tail;
	public boolean empty(){	return head==null;	}
	void Enqueue(Pratica val){
		if(tail==null){
			tail=new Node(null, val);
			head=tail;
		}else{
			tail.next=new Node(null, val);
			tail=tail.next;
		}
	}
	Pratica Dequeue() throws Exception{
		Pratica pivot=head.data;
		if(head==null){
			throw new Exception("Queue is empty!!");
		}else if(head.next!=null){
			head=head.next;
			return pivot;
		}else{
			head = tail;
			tail = null;
			return pivot;
		}
	}
	class Node<T>{
		public Pratica data;
		private Node next;
		public Node(Node next, Pratica data){
			this.next=next;
			this.data=data;
		}
	}
}
