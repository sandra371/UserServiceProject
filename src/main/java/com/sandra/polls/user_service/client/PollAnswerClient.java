package com.sandra.polls.user_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "poll-service", url = "http://localhost:8082")
public interface PollAnswerClient {

    @DeleteMapping("/poll-answers/user/{userId}")
    void deleteAnswersByUserId(@PathVariable("userId") Long userId);
}