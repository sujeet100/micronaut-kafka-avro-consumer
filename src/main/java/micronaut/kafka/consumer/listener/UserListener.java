package micronaut.kafka.consumer.listener;

import GG.MYUSER;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import org.apache.kafka.clients.consumer.ConsumerRecord;

@KafkaListener(offsetReset = OffsetReset.EARLIEST, groupId = "user-avro-consumer")
public class UserListener {

    @Topic("user-topic-avro-new")
    public void receive(ConsumerRecord<String, MYUSER> record) {
        MYUSER user = record.value();
        System.out.println(user.getUSERID());
        System.out.println(user.getNAME());
        System.out.println(user.getAGE());
        System.out.println(user.getCITY());
    }
}
