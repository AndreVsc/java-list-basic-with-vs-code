package exemples;

import java.util.HashMap;
import java.util.Map;

public class Perfils {

    private Map<Integer, Perfil> mapPerfils;

    public Perfils() {
        this.mapPerfils = new HashMap<>();
    }

    public void adicionarPerfil(int id, boolean tema, int idade, double altura) {
        Perfil profile = new Perfil(tema, idade, altura);
        mapPerfils.put(id, profile);
    }

    public void excluirPerfil(int id) {
        mapPerfils.remove(id);
    }

    public void pesquisarPerfil(int id) {
        Perfil profile = mapPerfils.get(id);

        if (profile != null) {
            System.err.println("\nPesquisa:");
            System.err.println("\nPerfil #" + id);
            System.out.println("Tema: " + profile.getTema());
            System.out.println("Idade: " + profile.getIdade());
            System.out.println("Altura: " + profile.getAltura());
        } else {
            System.out.println("\nPerfil não encontrado");
        }
    }

    public void listarPerfils() {
        if (mapPerfils.size() != 0) {
            for (Map.Entry<Integer, Perfil> entry : mapPerfils.entrySet()) {
                int id = entry.getKey();
                Perfil profile = entry.getValue();

                System.err.println("\nPerfil #" + id);
                System.out.println(profile.getTema());
                System.out.println(profile.getIdade());
                System.out.println(profile.getAltura());
            }
        }
    }

    public class Perfil {
        private boolean tema;
        private int idade;
        private double altura;

        public Perfil(boolean tema, int idade, double altura) {
            this.tema = tema;
            this.idade = idade;
            this.altura = altura;
        }

        public boolean getTema() {
            return tema;
        }

        public double getAltura() {
            return altura;
        }

        public int getIdade() {
            return idade;
        }

        public void setTema(boolean tema) {
            this.tema = tema;
        }
    }
}
