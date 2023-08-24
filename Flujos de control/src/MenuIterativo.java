import javax.swing.JOptionPane;


public class MenuIterativo {
    public static void main(String[] args) {
        int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\tMenu Principal\t"+"\n"+
                                                                    "1. Actualizar"+"\n"+
                                                                    "2. Eliminar"+"\n"+
                                                                    "3. Agregar"+"\n"+
                                                                    "4. Listar"+"\n"+
                                                                    "5. salir"+"\n"+
                                                                    "Selecciona una opcion: "));

            switch (opcion){
                case 1:
                    JOptionPane.showMessageDialog(null,"Actualizado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Agregado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Listando correctamente");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Has seleccionado una opcion invalida vuelve a intentarlo");
                    break;
            }

        }while(opcion != 5);
    }
}
