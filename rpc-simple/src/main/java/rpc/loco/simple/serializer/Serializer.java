package rpc.loco.simple.serializer;

import java.io.IOException;

/**
 * description: 序列化器接口
 * author: Loco.Li
 */
public interface Serializer {

    /**
     * 序列化
     */
    <T> byte[] serialize(T object) throws IOException;

    /**
     * 反序列化
     */
    <T> T deserialize(byte[] bytes, Class<T> type) throws IOException;
}