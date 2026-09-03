import java.util.ArrayList;
import java.util.Scanner;

public class BaseDados {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void createUsers() {

        Funcionario funcionario = new Funcionario(
                "birobiro",
                "676.676.676-67",
                "birobirogames@gmail.com",
                "atendente"
        );

        Funcionario funcionario1 = new Funcionario(
                "sheyla",
                "123.123.123-98",
                "sheylinha123@gmail.com",
                "manutenção e limpeza"
        );

        Funcionario funcionario2 = new Funcionario(
                "Alisson",
                "231.126.321-88",
                "alissonrochavidal@gmail.com",
                "Professor"
        );

        addUser(funcionario);
        addUser(funcionario1);
        addUser(funcionario2);


        Aluno aluno = new Aluno(
                "Damião",
                "256.032.007-97",
                "damionplays@gmail.com",
                "logistica",
                "1º ano"
        );

        Aluno aluno2 = new Aluno(
                "Shaulin",
                "769.000.542-76",
                "shaulimatadordeporco@gmail.com",
                "moer canã",
                "3º ano"
        );

        Aluno aluno3 = new Aluno(
                "Robertinho",
                "769.223.546-09",
                "roberzinho@gmail.com",
                "cabeleleiro",
                "2º ano"
        );

        addUser(aluno);
        addUser(aluno2);
        addUser(aluno3);
    }

    // Recebe um objeto do tipo Usuario
    public static void addUser(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void cadastrarUsuario() {

        System.out.println("Funcionário ou Aluno?");
        String opcao = scanner.nextLine();

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Email:");
        String email = scanner.nextLine();

        if (opcao.equalsIgnoreCase("Funcionário")) {

            System.out.println("Cargo:");
            String cargo = scanner.nextLine();

            Usuario usuario = new Funcionario(
                    nome,
                    cpf,
                    email,
                    cargo
            );

            addUser(usuario);

            System.out.println("Funcionário cadastrado com sucesso!");

        } else if (opcao.equalsIgnoreCase("Aluno")) {

            System.out.println("Curso:");
            String curso = scanner.nextLine();

            System.out.println("Turma:");
            String turma = scanner.nextLine();

            Usuario usuario = new Aluno(
                    nome,
                    cpf,
                    email,
                    curso,
                    turma
            );

            addUser(usuario);

            System.out.println("Aluno cadastrado com sucesso!");

        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void listarUsuarios() {

        if (usuarios.isEmpty()) {
            System.out.println("Não existe usuário cadastrado na base!");
            return;
        }

        for (Usuario usuario : usuarios) {

            System.out.println("-------------------------");

            if (usuario instanceof Funcionario funcionario) {

                System.out.println("Tipo: Funcionário");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCPF());
                System.out.println("Email: " + funcionario.getEmail());
                System.out.println("Cargo: " + funcionario.getCargo());

            } else if (usuario instanceof Aluno aluno) {

                System.out.println("Tipo: Aluno");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("CPF: " + aluno.getCPF());
                System.out.println("Email: " + aluno.getEmail());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Turma: " + aluno.getTurma());
            }
        }

        System.out.println("-------------------------");
    }
}
