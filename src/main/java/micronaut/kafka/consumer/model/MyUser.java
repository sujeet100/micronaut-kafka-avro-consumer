package micronaut.kafka.consumer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import java.util.List;

@Introspected
public record MyUser(String table,
                     @JsonProperty("op_type")
                     String opType,

                     @JsonProperty("primary_keys")
                     List<String> primaryKeys,

                     @JsonProperty("USER_ID")
                     int userId,

                     @JsonProperty("NAME")
                     String name,

                     @JsonProperty("AGE")
                     int age,

                     @JsonProperty("CITY")
                     String city) {

}
