package br.com.fiap.tech.challenge.bdd.actors;

import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;

public class CloudCredentialProvider {

    private CloudCredentialProvider(){

    }

    public static ProfileCredentialsProvider credentialsProvider() {
        return ProfileCredentialsProvider.create("fiap-postech");
    }

}
