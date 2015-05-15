package com.chalam.greet;

/**
 * Created by chalam on 5/6/15.
 * To model the greeting representation,
 * you create a resource representation class.
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
