package com.github.dockerjava.api.model;

import com.github.dockerjava.api.annotation.FieldName;

/**
 * @since {@link RemoteApiVersion#VERSION_1_24}
 */
public enum SwarmNodeState {

    @FieldName("unknown")
    UNKNOWN,

    @FieldName("down")
    DOWN,

    @FieldName("ready")
    READY,

    @FieldName("disconnected")
    DISCONNECTED
}