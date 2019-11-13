package com.jk.service;

import com.jk.model.DiscussModel;
import org.springframework.stereotype.Component;

@Component
public class gqserviceHystrix implements gqservice{
    @Override
    public String addids(DiscussModel dis) {
        return "错误";
    }
}
