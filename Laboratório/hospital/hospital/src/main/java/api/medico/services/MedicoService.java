package api.medico.services;

import api.medico.models.Medico;
import api.medico.repositories.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MedicoService {

    final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @Transactional
    public Medico save(Medico medico) {
        return medicoRepository.save(medico);
    }


    public List<Medico> findAll() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> findById(UUID id) {
        return medicoRepository.findById(id);
    }

    @Transactional
    public void delete(Medico medico) {
        medicoRepository.delete(medico);
    }


}
