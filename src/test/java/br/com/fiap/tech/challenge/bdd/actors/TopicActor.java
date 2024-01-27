package br.com.fiap.tech.challenge.bdd.actors;

import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;

import static br.com.fiap.tech.challenge.bdd.util.JsonUtil.asJsonString;

public class TopicActor {

    private TopicActor() {
    }

    public static <T> void publish(String topicName, T message) {
        try (var snsClient = SnsClient.builder()
                .credentialsProvider(CloudCredentialProvider.credentialsProvider())
                .region(Region.US_EAST_1)
                .build()){
            var request = PublishRequest.builder()
                    .message(asJsonString(message))
                    .topicArn(ListTopicActor.getTopicArn(topicName))
                    .build();

            var result = snsClient.publish(request);

            if (!result.sdkHttpResponse().isSuccessful()) {
                throw new RuntimeException(
                        result.sdkHttpResponse()
                                .statusText()
                                .orElse("error posting to sns")
                );
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
