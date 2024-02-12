package com.Exercise6.exercise6;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
public class NameController {

    @GetMapping("/getName")
    @Operation(summary = "restituisce nome inserito")
    @ApiResponses (value = {
            @ApiResponse(responseCode = "200", description = "ok"),
            @ApiResponse(responseCode = "400", description = "bad request")
    })
    public String getName(@RequestParam String name){
        return "Nome: " + name;
    }

    @PostMapping("/postName")
    @Operation(summary = "restituisce nome inserito al contrario")
    @ApiResponses (value = {
            @ApiResponse(responseCode = "200", description = "ok"),
            @ApiResponse(responseCode = "400", description = "bad request")
    })
    public String reverseName(@RequestParam String name) {
        StringBuilder stringReverse = new StringBuilder(name).reverse();
        return "Nome al contrario: " + stringReverse.toString();
    }
}