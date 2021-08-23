## Micronaut Kafka Consumer with Avro and Schema Registry

###References

https://kafka-tutorials.confluent.io/kafka-console-consumer-producer/kafka.html

https://gist.github.com/martinhynar/c6ec4e29c79c78098952c0d5fd787890

https://micronaut-projects.github.io/micronaut-kafka/1.1.1/guide/index.html#kafkaQuickStart




### start Kafka and other components
```shell
docker compose -d up
```
This uses a docker compose file and starts confluent platform
This will start kafka brokers, zookeeper, connect, schema registry etc.

### Create a topic for avro messages
```shell
docker-compose exec broker kafka-topics --create --topic user-topic-avro-new --bootstrap-server broker:9092 --replication-factor 1 --partitions 1

```
This will create a topic for user data.

### start micronaut application
```shell
./gradle run
```

### Send avro records
```shell
docker-compose exec schema-registry bash
kafka-avro-console-producer --topic user-topic-avro-new --bootstrap-server broker:29092 --property value.schema="$(< /opt/app/schema/new-user.avsc)"
```

### Sample avro records
```json
{"table": "GG.MYUSER", "op_type": "I", "primary_keys": ["USER_ID"], "USER_ID": 1, "NAME": "Sujit", "AGE": 22, "CITY": "PUNE"}
```

```json
{"table": "GG.MYUSER", "op_type": "I", "primary_keys": ["USER_ID"], "USER_ID": 2, "NAME": "Will", "AGE": 32, "CITY": "Mumbai"}
```

## For JSon consumer
### Create a topic for json messages
```shell
docker-compose exec broker kafka-topics --create --topic user-topic-json --bootstrap-server broker:9092 --replication-factor 1 --partitions 1

```

### Send json records
```shell
docker-compose exec broker kafka-console-producer  --topic user-topic-json --bootstrap-server broker:9092
```
### Sample json records
```json
{"table": "GG.MYUSER", "op_type": "I", "primary_keys": ["USER_ID"], "USER_ID": 1, "NAME": "Sujit", "AGE": 22, "CITY": "PUNE"}
```

```json
{"table": "GG.MYUSER", "op_type": "I", "primary_keys": ["USER_ID"], "USER_ID": 2, "NAME": "Will", "AGE": 32, "CITY": "Mumbai"}
```
