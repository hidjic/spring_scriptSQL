package fr.hidjic.clientWebServiceTest2;

import java.net.HttpURLConnection;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.ClientConfig;
import org.springframework.web.client.RestTemplate;

//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try {
        	ClientConfig conf = new ClientConfig();
        	Client c = ClientBuilder.newClient(conf);
        	
        	String url = "http://localhost:8080/webServiceTest2/api/artist/1";
        	
//        	WebTarget t = c.target(url);        	
//        	String res = t.request().accept("application/json").get(Artist.class).toString();

        	RestTemplate rt = new RestTemplate();
        	Artist res = rt.getForObject(url, Artist.class);

        	System.out.println(res);
        	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
}
