package co.develhope.FirstAPI03.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/String")
public class StringController {
    @GetMapping("")
    public String getConStr(@RequestParam String alfa, @RequestParam(required = false) String beta){
        return beta != null ? alfa + beta : alfa;
    }
}
