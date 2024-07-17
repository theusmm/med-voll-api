package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.ValidacaoExcepction;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFunctionamentoClinica implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {

        var dataConsutla = dados.data();
        var domingo = dataConsutla.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsutla.getHour() < 7;
        var depoisDaAberturaDaClinica = dataConsutla.getHour() > 18;

        if (domingo || antesDaAberturaDaClinica || depoisDaAberturaDaClinica) {
            throw new ValidacaoExcepction("Consulta fora do horário de funcionamento da clínica");
        }

    }
}
