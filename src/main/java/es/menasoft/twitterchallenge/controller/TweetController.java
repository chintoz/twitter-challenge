package es.menasoft.twitterchallenge.controller;

import es.menasoft.twitterchallenge.model.Tweet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class TweetController {

    @GetMapping("/listTweets")
    public String listTweets(Model model) {
        // TODO: Make me reactive
        model.addAttribute("tweets", dummyTweets().buffer().blockFirst());
        return "listTweets";
    }

    private Flux<Tweet> dummyTweets() {
        return Flux.just(Tweet.builder().content("Content1").build(), Tweet.builder().content("Content2").build());
    }
}
