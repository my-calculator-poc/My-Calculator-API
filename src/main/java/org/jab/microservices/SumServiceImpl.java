package org.jab.microservices;

import org.springframework.stereotype.Service;

@Service
public class SumServiceImpl implements SumService {

    @Override
    public Integer sum(SumRequest request) {
        return request.getNumber1() + request.getNumber2();
    }
}
