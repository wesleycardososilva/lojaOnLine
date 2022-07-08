package com.wesleysilva.loja.entity.listener;

import com.wesleysilva.loja.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

public class RegistrationCompleteEventListener implements
        ApplicationListener<RegistrationCompleteEvent> {
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create the verification token for the User with link
        
        //send  mail to user

    }
}
