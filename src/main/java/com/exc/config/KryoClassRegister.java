package com.exc.config;

import com.esotericsoftware.kryo.Kryo;

public interface KryoClassRegister {
     void register(Kryo kryo);

}
