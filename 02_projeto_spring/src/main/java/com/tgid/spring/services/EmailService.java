package com.tgid.spring.services;

import org.springframework.mail.SimpleMailMessage;

import com.tgid.spring.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
	
}
