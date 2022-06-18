package apuracaoderesultado;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLDocumentController {
Double custo, venda, apuracao;
    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private TextField cxvenda;

    @FXML
    private TextField cxcusto;

    @FXML
    private TextArea cxresult;

    @FXML
    void apurar(ActionEvent event) {
custo=Double.valueOf(cxcusto.getText());
venda=Double.valueOf(cxvenda.getText());
apuracao=venda-custo;
cxresult.setText(VerificaApuracao(apuracao));
        
    }

    void f5f0f0(ActionEvent event) {

    }

    private String VerificaApuracao(Double apuracao) {
        String resultado;
        if (apuracao>0)
            resultado="Conforme apuração: "+apuracao+" a venda é LUCRATIVA.";
        else if (apuracao==0)
            resultado="Conforme apuração: "+apuracao+" a venda EMPATA com o custo.";
        else
            resultado="Conforme apuração: "+apuracao+" a venda resulta em PREJUIZO.";
        return resultado;
    }
}