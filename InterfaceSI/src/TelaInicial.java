import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TelaInicial {

    /**
     * @wbp.parser.entryPoint
     */
    public TelaInicial() {

        JFrame j = new JFrame("Bora mecao");
        j.setSize(400,400);

        JTable tabela = new JTable();      

        String[] colunas = {"Marca", "Local"};
        String[][] objetos = {{"LG", "chalé"}};

        DefaultTableModel modelo = (new DefaultTableModel(objetos, colunas){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        });

        tabela.setModel(modelo);

        JScrollPane scroll = new JScrollPane(tabela);
        j.getContentPane().add(scroll);

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);  
    }

    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new TelaInicial());;
    }
}