package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        String cpf,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
