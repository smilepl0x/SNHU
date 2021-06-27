package com.snhu.sslserver;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.MessageDigest;

@RestController
public class Routes {
    @GetMapping("/hash")
    public String getHash(){
        String data = "Danny Faught, pretend I'm an encrypted file!";
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
        return "<p>data: "+data+"<p>Name of Cipher Algorithm Used: SHA-256<p>Checksum: "+hasheddata;       
    }
}
