public class Veiculo {
    public int id;
    public String marca;
    public String modelo;
    public Double autonomia;
    public String motorizacao;
    public Double tanque;
    public Double qtd_combustivel;

    public Veiculo(int id,String marca, String modelo, Double autonomia, String motorizacao, Double tanque, Double qtd_combustivel) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.autonomia = autonomia;
        this.motorizacao = motorizacao;
        this.tanque = tanque;
        this.qtd_combustivel = qtd_combustivel;
    }

    public Double getAutonomia(){
        return autonomia;
    }

    public Double getPorcentagemAnatomia(){
        double porcentagemAnatomia= ((getAutonomia() / this.tanque) * 10);
        if(porcentagemAnatomia > 100.0) {
            porcentagemAnatomia = 100.0;
        }
        return porcentagemAnatomia;
    }

    public String getMotorizacao(){
        return motorizacao;
    }

    public String setQtd_combustivel(double abastecer){
        if( this.qtd_combustivel + abastecer > this.tanque){
            return("Não é possível abastecer esse valor, pois ultrapassar a capacidade do tanque do veículo");

        }else{
            this.qtd_combustivel += abastecer;
            return("Abasteceu o veículo: " + this.getId() + " Tipo: " + this.getMotorizacao() + " Tanque mudou de " +  (this.qtd_combustivel - abastecer) +  "L para " + this.qtd_combustivel + "L.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        //return "ID:" + id + " Marca:" + marca + " Modelo: " + modelo + " Autonomia:" + autonomia;
        return "ID:" + id + " Autonomia:" + autonomia;
    }

    public static void main(String[] args) {

    }
}