package com.jk.controller;

import com.jk.model.DiscussModel;
import com.jk.service.DisService;
import com.jk.service.gqservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisController implements gqservice {
    @Autowired
    private DisService  service;

    @Override
    public String addids(DiscussModel discuss) {
        return service.addis(discuss);
    }
}
