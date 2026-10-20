import com.edu.ec.Citas;
import com.edu.ec.CitasService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Citas c1 = new Citas("Jhon", "DR. Mateo", "17/10/2026", "jhon@uce.edu.ec");
        
        CitasService cs = new CitasService();
        cs.registrarCita(c1);



    }
}
