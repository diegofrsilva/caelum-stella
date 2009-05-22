package br.com.caelum.stella.nfe.builder.generated;

import java.util.Calendar;

import br.com.caelum.stella.nfe.builder.generated.enums.FinalidadeDaEmissao;
import br.com.caelum.stella.nfe.builder.generated.enums.FormaDeEmissao;
import br.com.caelum.stella.nfe.builder.generated.enums.FormaDePagamento;
import br.com.caelum.stella.nfe.builder.generated.enums.FormatoDeImpressao;
import br.com.caelum.stella.nfe.builder.generated.enums.ProcessoDeEmissao;
import br.com.caelum.stella.nfe.builder.generated.enums.TipoDoAmbiente;
import br.com.caelum.stella.nfe.builder.generated.enums.TipoDocumentoFiscal;

public final class IdeImplTest {
    @org.junit.Test
    public void testIdeInterface() {
        IdentificacaoDaNFE ide = new IdentificacaoDaNFEImpl()
            .withCodigoUFDoEmitente("abc")
            .withCodigoDaNF(1)
            .withDescricaoDaNaturezaDaOperacao("abc")
            .withFormaDePagamento(FormaDePagamento.A_PRAZO)
            .withModeloDoDocumentoFiscal("abc")
            .withSerie("abc")
            .withNumeroDoDocumentoFiscal("abc")
            .withDataDeEmissao(Calendar.getInstance())
            .withDataDeSaidaOuEntrada(Calendar.getInstance())
            .withTipoDoDocumentoFiscal(TipoDocumentoFiscal.ENTRADA)
            .withCodigoDoMunicipioDeOcorrenciaDoFatoGerador("abc")
            .withInformacoesDaNFReferenciada(new InformacoesDaNFReferenciadaImpl())
            .withFormatoDeImpressao(FormatoDeImpressao.PAISAGEM)
            .withFormaDeEmissao(FormaDeEmissao.CONTINGENCIA)
            .withDigitoVerificadorDaChaveDeAcessoDaNFE("abc")
            .withTipoDoAmbiente(TipoDoAmbiente.HOMOLOGACAO)
            .withFinalidadeDaEmissaoDaNFE(FinalidadeDaEmissao.NFE_AJUSTE)
            .withProcessoDeEmissao(ProcessoDeEmissao.APLICATIVO_CONTRIBUINTE)
            .withVersaoDoAplicativoUsadoNaEmissao("abc");
        assertModelWasFilled(ide);
    }

    private void assertModelWasFilled(final IdentificacaoDaNFE ide) {
        new br.com.caelum.stella.nfe.builder.BuilderTestHelper(ide).assertModelWasFilled();
    }
}