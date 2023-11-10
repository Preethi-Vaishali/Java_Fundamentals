package api;

public class Response {

			int id = 0;
			String name;
			public Response(int id, String name) {
				this.id = id;
				this.name = name;
				System.out.println("Id = "+ id );
				System.out.println("Name = "+ name );
				}
			public Response(int id) {
				
				this.id = id;
				System.out.println("Constructor Overloaded");
				System.out.println("Id = "+ id );
			}
			public Response() {
				
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			
		}
	


