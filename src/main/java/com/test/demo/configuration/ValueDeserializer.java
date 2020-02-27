package com.test.demo.configuration;

import com.test.demo.model.UserProto;
import org.apache.kafka.common.serialization.Deserializer;

public class ValueDeserializer extends Adapter implements Deserializer<UserProto.User> {

    @Override
    public UserProto.User deserialize(String s, byte[] bytes) {

        try {
            return UserProto.User.parseFrom(bytes);
        }catch (Exception e) {
            return null;
        }
    }
}
