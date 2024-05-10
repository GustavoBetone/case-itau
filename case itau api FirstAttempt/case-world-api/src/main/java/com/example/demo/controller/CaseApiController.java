package com.example.demo.controller;

import com.example.demo.dto.ClienteRequest;
import com.example.demo.dto.ClienteResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class CaseApiController {

    private List<ClienteResponse> clientes = new ArrayList<>();

    //CRIAR CLIENTE - POST
    @PostMapping
    public ResponseEntity<ClienteResponse> save(@RequestBody final ClienteRequest request) {

        Integer id = clientes.size();
        var response = new ClienteResponse(id, request.getSaldoconta(), request.getNumconta(), request.getNome());

        clientes.add(response);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    //LER CLIENTE - GET
        @GetMapping
        public ResponseEntity<List<ClienteResponse>> getAll(){
            return ResponseEntity.ok(clientes);
        }

    //LER CLIENTE ESPECIFICO- GET
        @GetMapping("/{numconta}")
        public ResponseEntity<ClienteResponse> findByNdc(@PathVariable("ndc") final long numconta) {

            for(var cliente: clientes) {
                if (cliente.getNumconta() == numconta) {
                    return ResponseEntity.ok(cliente);
                }
            }

            return ResponseEntity.notFound().build();
        }




    //ATUALIZAR CLIENTE - PUT/PATCH



    //DELETAR CLIENTE - DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") final long id){

        //ENCONTRAR
        int index = -1;
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).getId() == id) {
                index = i;
                break;
            }
        }

        //REMOVER
        if (index >= 0) {
            clientes.remove(index);
        }
        return ResponseEntity.noContent().build();
    }














    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
