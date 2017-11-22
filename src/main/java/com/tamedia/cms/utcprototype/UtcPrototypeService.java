package com.tamedia.cms.utcprototype;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UtcPrototypeService {

    @Transactional
    public UtcPrototypeDTO saveUtcPrototype(final Long utcPrototypeId, final UtcPrototypeDTO utcPrototypeDTO) {
        return new UtcPrototypeDTO();
    }

}
