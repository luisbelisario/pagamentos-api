package br.com.belisario.pagamentos.dto;

import br.com.belisario.pagamentos.enums.Status;
import br.com.belisario.pagamentos.model.Pagamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class PagamentoDTO {

    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Status status;
    private Long formaDePagamentoId;
    private Long pedidoId;

    public static PagamentoDTO converTo(Pagamento pagamento) {
        PagamentoDTO dto = new PagamentoDTO();
        dto.setId(pagamento.getId());
        dto.setValor(pagamento.getValor());
        dto.setNome(pagamento.getNome());
        dto.setNumero(pagamento.getNumero());
        dto.setExpiracao(pagamento.getExpiracao());
        dto.setCodigo(pagamento.getCodigo());
        dto.setStatus(pagamento.getStatus());
        dto.setFormaDePagamentoId(pagamento.getFormaDePagamentoId());
        dto.setPedidoId(pagamento.getPedidoId());
        return dto;
    }
}
