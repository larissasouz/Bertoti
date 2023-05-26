package api.medico.controllers;

import api.medico.dtos.MedicoDto;
import api.medico.models.Medico;
import api.medico.services.MedicoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/medico")
public class MedicoController {

    final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveMedico(@RequestBody @Valid MedicoDto medicoDto) {
        var medico = new Medico();
        BeanUtils.copyProperties(medicoDto, medico);
        return ResponseEntity.status(HttpStatus.CREATED).body(medicoService.save(medico));
    }

    @GetMapping
    public ResponseEntity<List<Medico>> getAllMedico(){
        return ResponseEntity.status(HttpStatus.OK).body(medicoService.findAll());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Object> getOneDvd(@PathVariable(value = "id") UUID id){
        Optional<Medico> medicoModelOptional = medicoService.findById(id);
        if(!medicoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Medico não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(medicoModelOptional.get());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateMedico(@PathVariable(value = "id") UUID id,
                                                     @RequestBody @Valid MedicoDto medicoDto){
        Optional<Medico> medicoModelOptional = medicoService.findById(id);
        if(!medicoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Medico não encontrado!");
        }
        var medico = new Medico();
        BeanUtils.copyProperties(medicoDto, medico);
        medico.setId(medicoModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(medicoService.save(medico));
    }
}
