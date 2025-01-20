package ru.goryachev.mockdags;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Service;

/**
 * Сервис работает с TCP соединениями
 * @author Lev Goryachev
 */

@Service
public class TcpConnectorServiceOne {

    /**
     * Сервис слушает канал inputChannelOne - по названию в конфиге
     * @author Lev Goryachev
     */
    @ServiceActivator(inputChannel = "inputChannelOne", async = "true")
    public String handleMessage(String message) {

        Logger logger = LoggerFactory.getLogger(TcpConnectorServiceOne.class);
        logger.info("TCP connector received inputChannelOne..........................................................");
        logger.trace("TCP connector received inputChannelOne trace.........................................................." + message);

        // Логика обработки входящего сообщения
        System.out.println("Получено сообщение: " + message);
        return "Ответ от сервера: " + message;
    }
}
