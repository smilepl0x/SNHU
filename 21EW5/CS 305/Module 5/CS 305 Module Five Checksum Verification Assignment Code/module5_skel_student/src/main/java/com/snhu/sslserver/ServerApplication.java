package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
    @RequestMapping("/hash")
    public String myHash(){
        String data = "Hello Danny Faught!";
        String hasheddata = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(data.getBytes());
            byte[] sha256data = md.digest();

            StringBuffer sb = new StringBuffer();
            for (byte bytes : sha256data) {
                sb.append(String.format("%02x", bytes & 0xff));
            }
            hasheddata = sb.toString();
        }
        catch (Exception e){
            System.out.println("There was an error digesting the data. " + e);
        }
        return "<p>data:"+data+"<p>Name of Cipher Algorithm Used: SHA-256<p>Checksum: "+hasheddata;       
    }
}
