package com.arturreske.searcher.controller;

import com.arturreske.searcher.dao.PharmacyRepository;
import com.arturreske.searcher.entity.Pharmacy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class MainController {

    @Autowired
    private PharmacyRepository pharmacyRepository;

    @GetMapping("/")
    public String index(Map<String, Object> model){
        return "index";
    }

    @GetMapping("/main")
    public String main(Map<String, Object> model) {
        Iterable<Pharmacy> showAllPharmacies = pharmacyRepository.findAll();
        model.put("pharmacies", showAllPharmacies);
        return "main";
    }

    @PostMapping("/main")
    public String addPharmacy(@RequestParam String name, @RequestParam String url, Map<String, Object> model) {
        Pharmacy newPharmacy = new Pharmacy(name, url);
        pharmacyRepository.save(newPharmacy);

        //TODO fix
        List<Pharmacy> showAllPharmacies = pharmacyRepository.findAll();
        model.put("pharmacies", showAllPharmacies);
        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Pharmacy> pharmacies;
        if (!filter.isBlank()) {
            pharmacies = pharmacyRepository.findByName(filter);
        } else {
            pharmacies = pharmacyRepository.findAll();
        }
        model.put("pharmacies", pharmacies);
        return "main";
    }

}
