package io.quarkus;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"msg"})
public class GreetingMsg {

    @JsonProperty("msg")
    public String msg;
}
