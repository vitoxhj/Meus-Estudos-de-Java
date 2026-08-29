package estudosJava.javacore.Gassociação.domain;

import java.text.Normalizer;

public class Endereco {
    private String estado;
    private String cidade;
    private String cep;
    private String rua;
    private static String[] todosEstados = {
        "Acre","Amapa","Amazonas","Pará","Rondônia","Roraima","Tocantins",
        "Alagoas","Bahia","Ceará","Maranhão","Paraíba","Pernambuco","Piauí","Rio Grande do Norte","Sergipe",
        "Goiás","Mato Grosso","Mato Grosso do Sul","Distrito Federal",
        "Espiríto Santo","Minas Gerais","Rio de Janeiro","São Paulo",
        "Paraná","Rio Grande do Sul","Santa Catarina"
    };

    public String validarEstado(){
        String status = "Estado inexistente ou invalido";
        String estadoClean = this.estado;
        estadoClean = estadoClean.toLowerCase();
        estadoClean = Normalizer.normalize(estadoClean, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]","");
        String arrayClean;
        for (String estado: todosEstados){
            arrayClean = estado.toLowerCase();
            arrayClean = Normalizer.normalize(arrayClean, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]","");
            if (arrayClean.equals(estadoClean)){
                status = estado;
                return status;
            }
        }
        return status;
    }

    
    public Endereco(String estado, String cidade, String cep, String rua) {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.rua = rua;
    }

    public boolean validarFormatoCEP(String cep){
        if (cep == null){
            return false;
        }
        String cepLimpo = cep.replaceAll("\\D","");

        return cepLimpo.matches("\\d{8}");
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public static String[] getTodosEstados() {
        return todosEstados;
    }

    public static void setTodosEstados(String[] todosEstados) {
        Endereco.todosEstados = todosEstados;
    }

    
}
