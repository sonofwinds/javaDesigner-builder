package com.client;

import com.director.Director;
import com.service.Builder;
import com.service.WelcomeBuilder;

public class Client {
public static void main(String[] args) {
	Builder builder = new WelcomeBuilder();
    Director director = new Director(builder);
    director.construct("toAddress@126.com", "fromAddress@126.com");
}
}
