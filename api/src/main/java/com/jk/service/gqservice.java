package com.jk.service;

import com.jk.model.DiscussModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "provider8086",fallback = gqserviceHystrix.class)
public interface gqservice {
    @PostMapping("discuss")
    String addids(@RequestBody DiscussModel discuss);
}
