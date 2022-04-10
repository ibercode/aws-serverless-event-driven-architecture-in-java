package com.ibercode.fulfillment.utils;

import com.google.gson.Gson;
import software.amazon.awssdk.auth.credentials.EnvironmentVariableCredentialsProvider;
import software.amazon.awssdk.core.SdkSystemSetting;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

public class SNSUtils {

    private final Gson GSON = new Gson();
    private static final String TOPIC_ARN = System.getenv("TOPIC_ARN");

    private final SnsClient snsClient = SnsClient.builder()
            .credentialsProvider(EnvironmentVariableCredentialsProvider.create())
            .region(Region.of(System.getenv(SdkSystemSetting.AWS_REGION.environmentVariable())))
            .build();

    public String publishSNSMessage(String message) {

        PublishRequest request = PublishRequest.builder()
                .message(message)
                .topicArn(TOPIC_ARN)
                .build();
        PublishResponse result = snsClient.publish(request);

        return result.messageId();
    }
}
