package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;
import med.voll.api.medico.DadosDetalhamentoMedico;

public record DadosDetalhamentoPaciente(String cpf, String nome, String email, String telefone, Endereco endereco) {
    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getCpf(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getEndereco());
    }

}
