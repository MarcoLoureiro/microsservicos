package com.portal.api.controller;

import com.portal.api.dto2.CarPostDTO;
import com.portal.api.message.KafkaProducerMessage;
import com.portal.api.service.CarPostStoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarPostController {

    @Autowired
    private CarPostStoreServiceImpl carPostStoreService;

    @Autowired
    private KafkaProducerMessage kafkaProducerMessage;


    @PostMapping("/post")
    public ResponseEntity postCarForSale(@RequestBody CarPostDTO carPostDTO) {
        kafkaProducerMessage.sendMessage(carPostDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/posts")
    public ResponseEntity<List<CarPostDTO>> gerCarSales() {
        return ResponseEntity.status(HttpStatus.FOUND).body(carPostStoreService.getCarForSales());
    }

    @PutMapping("/{id}")
    public ResponseEntity changeCarForSale(@RequestBody CarPostDTO carPostDTO, @PathVariable("id") String id) {
        carPostStoreService.changeForSale(carPostDTO, id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteCarForSale(@PathVariable("id") String id) {
        carPostStoreService.removeCarForSale(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
