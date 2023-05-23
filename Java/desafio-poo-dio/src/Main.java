import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição do curso");
        curso.setCargaHoraria(8);

        System.out.println(curso);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Apreenda todos os conceitos do Java e construa uma aplicação web do zero!");
        bootcamp.getConteudos().add(curso);

        System.out.println(bootcamp);

        Dev dev = new Dev();
        dev.setNome("João");
        dev.inscreverBootcamp(bootcamp);
        dev.progredir();

        System.out.println(dev);


    }
}