package com.github.dockerjava.api.command;

import com.github.dockerjava.api.annotation.FieldName;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 * @author Konstantin Pelykh (kpelykh@gmail.com)
 *
 */
@EqualsAndHashCode
@ToString
public class CreateContainerResponse {

    @FieldName("Id")
    private String id;

    @FieldName("Warnings")
    private String[] warnings;

    public String getId() {
        return id;
    }

    public String[] getWarnings() {
        return warnings;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWarnings(String[] warnings) {
        this.warnings = warnings;
    }
}