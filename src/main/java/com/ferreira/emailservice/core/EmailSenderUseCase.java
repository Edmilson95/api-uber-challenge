package com.ferreira.emailservice.core;
// na camada ''CORE'' ficam as camadas de uso, ou seja, as regras de negócio

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);

}
