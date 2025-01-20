package ru.goryachev.mockdags;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.ip.tcp.TcpInboundGateway;
import org.springframework.integration.ip.tcp.connection.TcpNetServerConnectionFactory;
import org.springframework.integration.ip.tcp.serializer.ByteArrayElasticRawDeserializer;
import org.springframework.messaging.MessageChannel;

//import org.springframework.integration.ip.tcp.serializer.StringTcpSerializer;

@Configuration
public class TcpServerConfig {

    /**
     * Создаем канал для обработки сообщений inputChannelOne
     * @author Lev Goryachev
     */
    @Bean
    public MessageChannel inputChannelOne() {
        return new DirectChannel();
    }

    /**
     * Создаем фабрику для TCP-соединений
     * @author Lev Goryachev
     */
    @Bean
    public TcpNetServerConnectionFactory connectionFactory() {
        TcpNetServerConnectionFactory factory = new TcpNetServerConnectionFactory(8086); //наш порт сервера для tcp
        //factory.setSerializer(new ByteArrayRawSerializer());  // Сериализатор строк
        factory.setDeserializer(new ByteArrayElasticRawDeserializer()); // Десериализатор строк
        return factory;
    }

    /**
     * оздаем компонент для обработки входящих сообщений через TCP
     * @author Lev Goryachev
     */
    @Bean
    public TcpInboundGateway tcpInboundGateway() {
        TcpInboundGateway gateway = new TcpInboundGateway();
        gateway.setConnectionFactory(connectionFactory());
        gateway.setRequestChannel(inputChannelOne());
        return gateway;
    }
}

