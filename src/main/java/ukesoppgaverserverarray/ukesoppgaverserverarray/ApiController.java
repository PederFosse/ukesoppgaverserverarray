package ukesoppgaverserverarray.ukesoppgaverserverarray;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {
    private List<Bil> bilRegister = new ArrayList<>();

    @GetMapping("/register")
    public List<Bil> hentRegister(){
        System.out.println("Mottar get request, returnerer bilregister:");
        System.out.println(bilRegister);
        return bilRegister;
    }

    @PostMapping("/register")
    public void registrerBil(Bil bil){
        System.out.println("Mottar POST request legger til bil i arraylist:");
        System.out.println(bil);
        bilRegister.add(bil);
        System.out.println("Bil lagt til i arraylist.");
    }
}
