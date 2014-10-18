package resources;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;



import javax.ws.rs.core.Response;

import com.webli.main.Configuration;


@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class testResource {
	private Configuration configuration;
	
	public testResource(Configuration arg0) {
		configuration=arg0;
		
	}
	
	@GET
	@Path("/test")
        public Response sayHello( ) {
		return Response.ok("hgfjhghj").build();
        
    }

}
