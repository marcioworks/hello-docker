package br.com.marcioss.hellodocker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

    @RequestMapping("/hello-docker")
    public HelloDocker greeting(){

//        var hostName=  System.getenv("COMPUTERNAME");
        var hostName=  System.getenv("HOSTNAME");

        return new HelloDocker("Hello DOcker", hostName);
    }


}
