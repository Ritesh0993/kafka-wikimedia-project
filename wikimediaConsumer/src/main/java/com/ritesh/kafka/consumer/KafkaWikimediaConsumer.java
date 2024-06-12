package com.ritesh.kafka.consumer;

import com.ritesh.kafka.consumer.entity.WikimediaData;
import com.ritesh.kafka.consumer.repository.WikimediaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaWikimediaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaWikimediaConsumer.class);

    private WikimediaRepository wikimediaRepository;

    public KafkaWikimediaConsumer(WikimediaRepository wikimediaRepository) {
        this.wikimediaRepository = wikimediaRepository;
    }

    @KafkaListener(topics = "${spring.kafka.topic.name}",
            groupId = "&{spring.kafka.consumer.group-id}")
    public void consume(String eventMessage) {
        LOGGER.info(String.format("Event Message Received -> %s", eventMessage));

        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);

        wikimediaRepository.save(wikimediaData);

    }

}
