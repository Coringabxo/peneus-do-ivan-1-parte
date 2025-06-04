package dao;
import model.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class VeiculoDao {
private static List<Veiculo> veiculos = new ArrayList<>();
private static int idCounter = 1;

public Veiculo adicionar(Veiculo veiculo) {
veiculo = new Veiculo(idCounter++, veiculo.getModelo(), veiculo.getPlaca(), veiculo.getDono());
veiculos.add(veiculo);
return veiculo; // <<<<<< Adicionado
}

public List<Veiculo> listar() {
return veiculos;
}
}

