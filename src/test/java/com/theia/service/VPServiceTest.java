/*******************************************************************************
 * Copyright (C) 2021-2022 CERTH
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package com.theia.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import java.util.HashMap;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//class VPServiceTest {
//
//    @Autowired
//    VPService vpService;
//
//    @Test
//    void vulnerabilityPrediction() {
//        String url = "https://github.com/spring-projects/spring-mvc-showcase";
//        String language = "java";
//
//        HashMap<String, Double> vp = this.vpService.vulnerabilityPrediction(url, language);
//        assertFalse(vp.keySet().isEmpty(), "Result completed!");
//        for(String key: vp.keySet()){
//            assertFalse(vp.get(key).isNaN(), "Proper flag values!");
//        }
//    }
//}