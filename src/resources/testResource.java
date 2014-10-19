package resources;



import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import json.QueAns;
import json.Questions;
import json.options;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webli.main.Configuration;


@Path("/root")
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
	@GET
	@Path("/qa")
		public Response sendQA(){
		
			try {
				//String  myString = new JSONObject().put("JSON", "Hello, World!").toString();
				QueAns qa=new QueAns();
				
				ArrayList<Questions> ql  = new ArrayList<>() ;
				for(int i=0;i<2;i++){
				Questions q=new Questions();
				q.setImage_url("img");
				q.setHint("hint");
				options opt= new options();
				opt.setOption_a("a");
				opt.setOption_b("b");
				opt.setOption_c("c");
				opt.setOption_d("d");
				opt.setOption_e("e");
				opt.setOption_f("f");
				q.setOptions(opt);
				q.setQuestion("question");
				q.setSubject_name("sub");
				ql.add(q);
				qa.setPaper_id("paper id");
				qa.setQuestions(ql);
				}
				ObjectMapper om =new ObjectMapper();
				
				return Response.ok(om.writeValueAsString(qa)).build();
			} catch (JsonProcessingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return null;
	
	}
}
