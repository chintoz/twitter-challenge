package es.menasoft.twitterchallenge.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private String mail;
    private String alias;
}
