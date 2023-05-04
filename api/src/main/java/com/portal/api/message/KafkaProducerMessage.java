package com.portal.api.message;

import com.portal.api.dto2.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerMessage {

    @Autowired
    private KafkaTemplate<String, CarPostDTO> kafkaTemplate; //Injeção de dep do template de envio de mensagem para o kafka
    private final String KAFKA_TOPIC = "car-post-topic"; // Titulo da mensagem para enviar no template

    public void sendMessage(CarPostDTO carPostDTO) {
        kafkaTemplate.send(KAFKA_TOPIC, carPostDTO); // Método de envio utilizando a injeção de dep do kafka
    }

}
