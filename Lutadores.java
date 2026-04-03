
package projetoufc;


public class Lutadores {
    // ====== VARIÁVEIS =====
    private String nome, nascionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;

    
    // ====== CRONSTRUTOR ========
    public Lutadores(String nome, String nascionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        _definirCategoria();
        
        
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    // ====== DEFINIÇÃO DE VARIÁVEIS ======
    public void _definirCategoria(){
        // Definir a categoria com base em seu peso
        if (this.peso < 52){
            this.categoria = "invárlido";
        } else if (this.peso <= 70){
            this.categoria = "Leve";
        } else if (this.peso <= 73){
            this.categoria = "Médio";
        } else if (this.peso <= 110){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    // ====== SETTERS =======
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // ====== GETTERS ======

    public String getNome() {
        return nome;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getIdade() {
        return idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getPeso() {
        return peso;
    }

    // ======= FUNÇÕES LUTADORES =========
    public void _apresentar(){
        System.out.println(""
                + "NOME do lutador: " + this.nome
                + "\nNASCIONALIDADE do lutador: " + this.nascionalidade
                + "\nIDADE do lutador: " + this.idade
                + "\nALTURA do lutador: " + this.altura
                + "\nPESO do lutador: " + this.peso);
    }
    
    public void _status(){
        System.out.println(""
                + "=====" + this.nome + " ====="
                + "\nQuantidade de VITORIAS: " + this.vitorias
                + "\nQuantidade de DERROTAS: " + this.derrotas
                + "\nQuantiade de EMPATES: " + this.empates);
    }
    
    public void _ganharLuta(){
        this.vitorias++;
    }
    
    public void _perderLuta(){
        this.derrotas++;
    }
    
    public void _empatarLuta(){
        this.empates++;
    }
    
}
