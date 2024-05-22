package com.example.demo.api;

import com.example.demo.entity.SinhVien;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.Map;


@RestController
public class HomeApi {
    @GetMapping("/getInformation")
    public ResponseEntity<?> doGetInformation(@RequestParam("ten")String name,@RequestParam("tuoi")String age){
        Map<String,String> result= new HashMap<String,String>();
        result.put("ten",name);
        result.put("tuoi",age);
        result.put("Lớp", "java5");
        return ResponseEntity.ok(result);

    }
    @GetMapping("/getInformationWithPathVariable/{name}")
    public ResponseEntity<?> doGetInformationWithPathVariable(@PathVariable String name){

        return ResponseEntity.ok(name);

    }
    @GetMapping("/getSinhVienInformation")
    public ResponseEntity<?> doGetSinhVienInformation(SinhVien sinhVien){
        Map<String,Object> result = new HashMap<>();//tạo map
        result.put("message","Call api success");//set map
        result.put("status",true);
        result.put("data", sinhVien);
        return ResponseEntity.ok(result);
    }
    @PostMapping("/postSinhVienInformation")
    public ResponseEntity<?> doPostSinhVienInformation(@Valid @RequestBody SinhVien sinhVien){
        Map<String,Object> resultt= new HashMap<>();
        resultt.put("message","Call api success");
        resultt.put("status",true);
        resultt.put("data", sinhVien);
        return ResponseEntity.ok(resultt);
    }
}
