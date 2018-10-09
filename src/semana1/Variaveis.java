package semana1;

/**
 *  Descreva 5 tipos de variaveis  e associe 10 variavel com algum dado compativel com ela.
 *  
 *  Armazene a descrição da variavel em uma variavel e imprima as variaveis no console do seguinte modo:
 *
 *
 *  nomeDaVariavel: + variavelExplicaão + tipoDaVariavel 
 *
 *
 *  Dica: Procure ser simples, Variaveis de ambiente não se aplicam nessa semana.
 *  Dica2: Para mostrar algo no console procure entender o metodo "print"
 *
 */

public class Variaveis {


    public static void main(String[] args) {
String stringDesc="String: Armazena uma cadeia de caracteres. Sua defini��o � String nomeDaString=\"Aqui tem string\";.";
String intDesc="Int: Armazena um valor inteiro. N�o s�o usadas aspas em sua defini��o, assim: \n int dedosDaMinhaMao=5;";
String floatDesc="Float: Armazena n�meros decimais. Quando float recebe um valor n�o flutuante, ir� adequar o tipo. Por isso a melhor forma de se definir um float � acrescentar um f ap�s o n�mero, assim: \n float rotacoesPorMinuto=33.5f; ou float horasTrabalhadas=8f;";
String doubleDesc="Double: Um float aprimorado. Al�m de receber tanto valores inteiros como decimais, possui dupla precis�o. �til para evitar exceptions quando o valor esperado � um int mas um decimal � retornado. \n double minhasCasasDeAluguel=20; double minhaRendaMensal=30803.21;";
String charDesc="Char: Recebe um �nico caractere. Sua defini��o � feita com aspas simples, assim: \n char opicao=\'s';";

System.out.println(stringDesc);
System.out.println(intDesc);
System.out.println(floatDesc);
System.out.println(doubleDesc);
System.out.println(charDesc);

System.out.println("--------");
String nome="Jo�o Lucio";
String empresa="Cognizant";
String mensagem="O rato roeu a roupa do rei de roma";
String poema="Escrevo essa estrofe \n Numa noite estrelada \n Pois isso � um exerc�cio \n Do curso de java";
String conselho="\t indente seu c�digo";
String falatorio="Ouvi dizer que \"Sintaxe Java � mais f�cil que sintaxe de Python\"";
String apresentacao="Muito prazer! Meu nome � " + nome;
String minhasTarefas="Escrever um System.out.println pra cada uma dessas strings";
String oQueVouFazer="Juntar tudo numa string s� e mandar printar";
String aiesta=nome + "\n" + empresa + "\n" + mensagem + "\n" + poema + "\n" + conselho + "\n" + falatorio + "\n" + apresentacao + "\n" + minhasTarefas + "\n" + oQueVouFazer;
System.out.println(aiesta);
System.out.println("--------");
int ladosDeUmaBola=2;
int quantosCarasExistem=1;
int vezesSalarioCaiMinhaConta=150;
int quantasSeraoQuandoAprenderJava=vezesSalarioCaiMinhaConta*3;
int meuVoto=0;
int quantosIntsFaltamPraEuDefinir=4;
int iPhoneAtual=10;
int proximoIPhone=iPhoneAtual++;
int eAgora=quantosIntsFaltamPraEuDefinir--;
int intNaoProcessaNumerosMaioresQue=2147483647;

System.out.println("Por que a bola tem " + ladosDeUmaBola + " lados?");
System.out.println("Deve ser porque s� existe " + quantosCarasExistem + ".");
System.out.println("Que n�o sou eu, mas por m�s, o sal�rio cai " + vezesSalarioCaiMinhaConta + "na minha conta.");
System.out.println("N�o � pouco, mas quando aprender Java, cair� " + quantasSeraoQuandoAprenderJava + " vezes.");
System.out.println("No segundo turno entre 0 e 00, permanecerei com o " + meuVoto + ".");
System.out.println("Espero que essa quantidade toda de ints pra declarar realmente sirvam pra adquirir flu�ncia, ainda faltam " + quantosIntsFaltamPraEuDeclarar + ".");
System.out.println("Tenho um Iphone " + iPhoneAtual + ", mas j� n�o me serve mais. Espero que o " + proximoIphone + " n�o demore.");
System.out.println("E agora? Ainda faltam " + eAgora + "ints...");;
System.out.println("Claro que n�o falta tudo isso. Vamos acabar logo, at� o int no Java tem limite e � " + intNaoProcessaNumerosMaioresQue + ".");
    }
}