
package herdarthread;

public class Principal {
public static void main(String args[]) {
Trabalhador severino = new Trabalhador("sapato", 200);
Trabalhador raimundo = new Trabalhador("bota", 200);
Trabalhador jeremias = new Trabalhador("capacete", 200);
severino.start();
raimundo.start();
jeremias.start();
}
}