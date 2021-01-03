package com.hong.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  10:57 下午 2021/1/2
 */
public class HashMapNotSafe {

    public static void main (String[] args) {
        final Map<Integer, String> map = new HashMap<>();
        // 65 535
        final Integer targetKey = 0b1111_1111_1111_1111;

        final String targetValue = "v";

        new Thread(() -> {
            IntStream.range(0, targetKey).forEach(key -> map.put(key, "someValue"));
        }).start();

        while (true) {
            if (null == map.get(targetKey)) {
                throw new RuntimeException("hashMap is not thread safe");
            }
        }
    }
}
