package ru.goryachev.mockdags;

/*import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.tcp.TcpInboundGateway;
import org.springframework.integration.tcp.connection.TcpNetServerConnectionFactory;
import org.springframework.integration.core.MessageHandler;
import org.springframework.messaging.MessageChannel;*/

//@Configuration
public class TcpServerConfig {
/*
    // Создаем канал для обработки сообщений
    @Bean
    public MessageChannel tcpInputChannel() {
        return new DirectChannel();
    }

    // Создаем фабрику для TCP-соединений (параметры порта и адреса)
    @Bean
    public TcpNetServerConnectionFactory connectionFactory() {
        return new TcpNetServerConnectionFactory(12345); // порт
    }

    // Создаем компонент для обработки входящих сообщений через TCP
    @Bean
    public TcpInboundGateway tcpInboundGateway() {
        TcpInboundGateway gateway = new TcpInboundGateway();
        gateway.setConnectionFactory(connectionFactory());
        gateway.setRequestChannel(tcpInputChannel());
        return gateway;
    }

    // Обработчик входящих сообщений
    @ServiceActivator(inputChannel = "tcpInputChannel")
    public MessageHandler handler() {
        return message -> {
            System.out.println("Received message: " + message.getPayload());
            // Ответ клиенту (можно настроить обработку ответа)
        };
    }*/
}
