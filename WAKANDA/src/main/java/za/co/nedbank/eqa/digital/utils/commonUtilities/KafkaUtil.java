
package za.co.nedbank.eqa.digital.utils.commonUtilities;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.*;

public class KafkaUtil {


    public static void main(String args[]) {
        String topicName = "test";
        String groupId = "testingTes";
//        String server = "localhost:9092,localhost:9093";
        String server = "polaris-kafka-cp-kafka:9092";

        KafkaUtil kUtil = new KafkaUtil();
        KafkaConsumer<String, String> consumer = kUtil.initialize_kafka_properties(server, groupId);
        String topics = kUtil.getTopics(topicName, groupId, server);

        System.out.println("Found this topic names  :: " + topics + "\n");

        consumer.subscribe(Arrays.asList(topicName));
        Duration timeOut = Duration.ofMillis(3000);
        ConsumerRecords<String, String> records = consumer.poll(timeOut);
        System.out.printf("this count of records exist ::: " + records.count());

//        if (records.count() > 0) {
//            records.forEach(record -> {
//                System.out.println("Record Key " + record.key());
//                System.out.println("Record value " + record.value());
//                System.out.println("Record partition " + record.partition());
//                System.out.println("Record offset " + record.offset());
//            });
//
//            consumer.commitAsync();
//        }
//        else {
//            System.out.println("No message found");
//        }

        consumer.close();


//        for(ConsumerRecord<String, String> record : records){
//            System.out.println("I got here");
//            System.out.printf("found this record ID :: "+record.value());
//        }
    }

    public String getTopics(String topicName, String groupId, String server){
        Collection topicList = null;

        KafkaUtil kUtil = new KafkaUtil();
        KafkaConsumer <String, String> consumer = kUtil.initialize_kafka_properties(server, groupId);

        topicList = consumer.listTopics().keySet();

        return topicList.toString();
    }

    private KafkaConsumer <String, String> initialize_kafka_properties(String server, String groupId){
        Properties props = new Properties();
        props.put("bootstrap.servers", server);
        props.put("group.id", groupId);
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        KafkaConsumer <String, String> consumer = new KafkaConsumer<>(props);

        return consumer;
    }

}

