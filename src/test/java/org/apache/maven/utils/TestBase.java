package org.apache.maven.utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;

public class TestBase {

    public String getRandomString(int size){
        return RandomStringUtils.randomAlphanumeric(size);

    }


    public  int getRandomInt(){
        return ThreadLocalRandom.current().nextInt( 1, 10 + 1);
    }
}

