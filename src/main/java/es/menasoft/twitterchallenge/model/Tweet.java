package es.menasoft.twitterchallenge.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Tweet {
    private String content;
    private User user;
}
