
import Model.Materia;
import View.MateriaView;


import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Materia>materias = new ArrayList<Materia>();
        MateriaView materiaView = new MateriaView();

        materiaView.menu(materias);
    }
}