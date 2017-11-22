package com.tamedia.cms.utcprototype;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class UtcPrototypeDTO {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String funnyStuff;

    @JsonProperty("createdAt")
    @Getter
    @Setter
    private LocalDateTime createdAt;

    @JsonProperty("updateddAt")
    @Getter
    @Setter
    private LocalDateTime updateddAt;

    public UtcPrototypeDTO(Long id, String funnyStuff){
        this.id = id;
        this.funnyStuff = funnyStuff;
        this.createdAt = LocalDateTime.now();
        this.updateddAt = LocalDateTime.now();
    }

}
