package com.bootcamp.pos.EzyPOS.util;

import java.util.Random;

public class IdGenerator {
    private final Random RANDOM = new Random();
    private final String RESOURCE="0123456789abcdefghijklmnopqrstuvwxyz";

    public String generateId(int length){
        StringBuilder simpleId = new StringBuilder();
        for (int i = 0; i < length; i++) {
            simpleId.append(RESOURCE.charAt(RANDOM.nextInt(35)));
        }
        return simpleId.toString();
    }
}
