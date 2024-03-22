import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LojaCarros {
    public List<Veiculo> veiculos = new ArrayList<>();

    public void imprimirVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }

    //Método para listar os 10 veículos com maior/menor autonomia de rodagem.
    public void autonomia(String tipo){
        Collections.sort(veiculos, new Comparator<Veiculo>() {
            @Override
            public int compare(Veiculo v1, Veiculo v2) {
                // Comparando os veículos com base na autonomia
                if(tipo.equals("maior")){
                    return Double.compare(v1.getAutonomia(), v2.getAutonomia());
                }
                if(tipo.equals("maior")){
                    return Double.compare(v2.getAutonomia(), v1.getAutonomia());
                }
                return 0;
            }
        });

        int contador = 0;
        System.out.println("Os 10 veículos de " + tipo + " autonomia.");
        for (Veiculo veiculo : veiculos) {
            if (contador < 10){
                System.out.println(veiculo);
                contador ++;
            }
            else{
                break;
            }
        }
    }

    //Método para listar os veículos movidos a gasolina, diesel, flex ou elétricos.
    public void motorizacao(String motorizacao){
        System.out.println("Veículos abastecidos por combustível - " + motorizacao + ": ");
        for(Veiculo veiculo: veiculos){
            if(motorizacao.equals(veiculo.motorizacao)){
                System.out.println(veiculo);
            }
        }
    }

    //Método para bastecer a frota de acordo com um tipo de combustível e quantidade de combustível informadas.
    public void abastecer(String motorizacao, Double abastecer){
        System.out.println("Abastecendo veículos com motização: " + motorizacao + " || Adição de " + abastecer + "L.");
        for(Veiculo veiculo: veiculos){
            if(veiculo.getMotorizacao().equals(motorizacao)){
                System.out.println(veiculo.setQtd_combustivel(abastecer));
            }
        }
    }

    //Método para listar os veículos com autonomia inferior a uma porcentagem informada
    public void autonomiaInferior(double porcentagemAnatomia){
        System.out.println("Veículos com anatomia inferior a " + porcentagemAnatomia + "%:");
        for(Veiculo veiculo: veiculos){
            if(veiculo.getPorcentagemAnatomia() < porcentagemAnatomia){
                System.out.println(veiculo);
            }
        }
    }

    public static void main(String[] args){

        LojaCarros loja = new LojaCarros();

        Veiculo v1 = new Veiculo(1, "Toyota", "Corolla", 40.0, "gasolina", 50.0, 35.0);
        Veiculo v2 = new Veiculo(2, "Honda", "Civic", 650.0, "gasolina", 48.0, 34.0);
        Veiculo v3 = new Veiculo(3, "Ford", "Fusion", 20.0, "flex", 52.0, 36.0);
        Veiculo v4 = new Veiculo(4, "Chevrolet", "Cruze", 620.0, "flex", 49.0, 33.0);
        Veiculo v5 = new Veiculo(5, "Volkswagen", "Jetta", 610.0, "gasolina", 47.0, 32.0);
        Veiculo v6 = new Veiculo(6, "Hyundai", "Elantra", 590.0, "flex", 46.0, 31.0);
        Veiculo v7 = new Veiculo(7, "Nissan", "Sentra", 630.0, "gasolina", 45.0, 30.0);
        Veiculo v8 = new Veiculo(8, "BMW", "Série 3", 750.0, "gasolina", 55.0, 38.0);
        Veiculo v9 = new Veiculo(9, "Audi", "A4", 740.0, "diesel", 54.0, 37.0);
        Veiculo v10 = new Veiculo(10, "Mercedes-Benz", "Classe A", 780.0, "diesel", 56.0, 39.0);
        Veiculo v11 = new Veiculo(11, "Toyota", "Yaris", 580.0, "flex", 44.0, 29.0);
        Veiculo v12 = new Veiculo(12, "Honda", "Fit", 570.0, "flex", 43.0, 28.0);
        Veiculo v13 = new Veiculo(13, "Ford", "Ka", 550.0, "flex", 42.0, 27.0);
        Veiculo v14 = new Veiculo(14, "Chevrolet", "Onix", 560.0, "flex", 41.0, 26.0);
        Veiculo v15 = new Veiculo(15, "Volkswagen", "Polo", 570.0, "gasolina", 40.0, 25.0);
        Veiculo v16 = new Veiculo(16, "Hyundai", "HB20", 540.0, "flex", 39.0, 24.0);
        Veiculo v17 = new Veiculo(17, "Nissan", "March", 530.0, "gasolina", 24.0, 23.0);
        Veiculo v18 = new Veiculo(18, "BMW", "Série 1", 720.0, "gasolina", 53.0, 36.0);
        Veiculo v19 = new Veiculo(19, "Audi", "A3", 710.0, "diesel", 50.0, 34.0);
        Veiculo v20  = new Veiculo(21, "Tesla", "Model S", 500.0, "elétrico", 0.0, 80.0);

        loja.veiculos.add(v1);
        loja.veiculos.add(v2);
        loja.veiculos.add(v3);
        loja.veiculos.add(v4);
        loja.veiculos.add(v5);
        loja.veiculos.add(v6);
        loja.veiculos.add(v7);
        loja.veiculos.add(v8);
        loja.veiculos.add(v9);
        loja.veiculos.add(v10);
        loja.veiculos.add(v11);
        loja.veiculos.add(v12);
        loja.veiculos.add(v13);
        loja.veiculos.add(v14);
        loja.veiculos.add(v15);
        loja.veiculos.add(v16);
        loja.veiculos.add(v17);
        loja.veiculos.add(v18);
        loja.veiculos.add(v19);
        loja.veiculos.add(v20);

        //10 veículos com menor autonomia de rodagem.
        loja.autonomia("menor");
        System.out.println();
        //10 veículos com maiorr autonomia de rodagem.
        loja.autonomia("maior");
        System.out.println();

        //listar os veículos movidos a gasolina/diesel/flex/eletrico
        loja.motorizacao("gasolina");
        System.out.println();
        loja.motorizacao("diesel");
        System.out.println();
        loja.motorizacao("flex");
        System.out.println();
        loja.motorizacao("elétrico");
        System.out.println();

        //Abastecer a frota de acordo com um tipo de combustível e quantidade de combustível informadas
        loja.abastecer("gasolina", 2.0);
        System.out.println();
        loja.abastecer("diesel", 17.0);
        System.out.println();

        //Listar os veículos com autonomia inferior a porcentagem informada
        loja.autonomiaInferior(80.00);

    }
}

