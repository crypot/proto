package com.exc.config;

public interface KryoContext {
    byte[] ser(Object obj);

    byte[] ser(Object obj, int bufferSize);

    Object des(Class clazz, byte[] serialized);

}
