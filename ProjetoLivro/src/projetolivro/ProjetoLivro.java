package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("João", 23, "m");
        p[1] = new Pessoa("Pedro", 23, "m");
        
        
        l[0] = new Livro("Aprendendo Java", "Larry", 300, p[0]);
        l[1] = new Livro("POO para iniciantes", "Satoro", 200, p[1]);
        l[2] = new Livro("ALgoritmos", "Tec", 200, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        
        System.out.println(l[1].detalhes());
    }
    
}
