package com.tamedia.cms.utcprototype;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/utc-prototypes")
public class UtcPrototypeRestController {

    private final UtcPrototypeService utcPrototypeService;

    @Autowired
    public UtcPrototypeRestController(UtcPrototypeService utcPrototypeService){
        this.utcPrototypeService = utcPrototypeService;
    }

    @PostMapping
    public ResponseEntity<UtcPrototypeDTO> createUtcPrototype(@PathVariable Long prototypeId,
                                                              @Valid @RequestBody UtcPrototypeDTO utcPrototypeDTO){
        //UtcPrototypeDTO savedUtcPrototypeDTO = utcPrototypeService.saveUtcPrototype(prototypeId, utcPrototypeDTO);
        UtcPrototypeDTO savedUtcPrototypeDTO = new UtcPrototypeDTO(3L, "pingpong");
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedUtcPrototypeDTO);
    }

}
