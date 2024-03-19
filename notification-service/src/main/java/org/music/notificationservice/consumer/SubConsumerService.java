package org.music.notificationservice.consumer;

import lombok.extern.slf4j.Slf4j;
import org.music.audioservice.event.SongSubscriptionEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SubConsumerService {
    @KafkaListener(topics = "songSubscription", containerFactory = "listenerContainerFactory")
    public void handleSongSubscription(SongSubscriptionEvent songSubscriptionEvent) {
        log.info("Got message <{}> ", songSubscriptionEvent);
        //some email sender logic
    }
}
