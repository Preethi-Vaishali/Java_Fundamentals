package Fundamentals;

import java.util.ArrayList;

import api.Response;

public class Arraylist_With_Encapsul {

	public static void main(String[] args) {
		ArrayList<Response> al = new ArrayList<Response>();
		//ArrayList<Response> a = new ArrayList<Response>();
		Response r = new Response();
		Response rr = new Response(2,"Raj");
		al.add(new Response(1,"Ram"));
		al.add(new Response(2));
		al.add(rr);

		r.setId(3);
		r.setName("Karthi");
		al.add(r);
		al.add(new Response(5,"Testing"));
		al.add(2,new Response(4));
		
		al.forEach(t -> {
		 System.out.println("id :"+t.getId()+" name : "+t.getName());
		});
		
	}

}
