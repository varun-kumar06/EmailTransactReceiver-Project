package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailReceiverController {
	
	@Autowired
	ReceiverService service; 
	
    @GetMapping("/receiveemails")
   
    public String receiveEmails() throws Exception {
        service.receiveEmail();
        return "Emails fetched! Check the console.";
    }


}
