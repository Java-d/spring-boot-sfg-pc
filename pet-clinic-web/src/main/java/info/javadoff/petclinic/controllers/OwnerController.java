package info.javadoff.petclinic.controllers;


import info.javadoff.petclinic.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @Autowired
    private final OwnerService ownerService;

    @RequestMapping({"/", "", "/index", "/index.html", "/list"})
    public String listOwners(Model model){
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
