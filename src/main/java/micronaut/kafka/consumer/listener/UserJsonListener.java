package micronaut.kafka.consumer.listener;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.messaging.annotation.MessageBody;
import micronaut.kafka.consumer.model.MyUser;

import javax.annotation.Nullable;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class UserJsonListener {

    @Topic("user-topic-json")
    public void receive(@KafkaKey @Nullable String key, @MessageBody MyUser user) {
        System.out.println(user.userId());
        System.out.println(user.name());
        System.out.println(user.age());
        System.out.println(user.city());
    }
}

