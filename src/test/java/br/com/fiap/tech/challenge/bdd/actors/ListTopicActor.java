package br.com.fiap.tech.challenge.bdd.actors;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.ListTopicsRequest;
import software.amazon.awssdk.services.sns.model.ListTopicsResponse;
import software.amazon.awssdk.services.sns.model.SnsException;
import software.amazon.awssdk.services.sns.model.Topic;

public class ListTopicActor {

    private ListTopicActor() {
    }

    public static String getTopicArn(String name) {
        try (var snsClient = SnsClient.builder()
                .credentialsProvider(CloudCredentialProvider.credentialsProvider())
                .region(Region.US_EAST_1)
                .build()){
            var request = ListTopicsRequest.builder().build();
            var result = snsClient.listTopics(request);

            return result.topics().stream()
                    .map(Topic::topicArn)
                    .filter(t -> t.endsWith(":" + name))
                    .findFirst()
                    .orElseThrow();
        } catch (SnsException e) {
            throw new RuntimeException(e);
        }
    }
}
