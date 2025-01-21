import org.ies.doctors.Cirujano;
import org.ies.doctors.Familia;
import org.ies.doctors.Podologo;


public class Main {
    public static void main(String[] args) {
        String[] pacientes = {"Bob Esponja", "Luis de Gongora", "Mikel San Vicente"  };
        String[] pacientes2 = {"Bob Esponja", "Luis de Gongora", "Mikel San Vicente"  };
        String[] pacientes3 = {"Bob Esponja", "Luis de Gongora", "Mikel San Vicente"  };


        Cirujano cirujano = new Cirujano("Carlos", "Pérez", "12345", pacientes, "Doce de octubre", 5);
        Familia familia = new Familia("Laura", "García", "67890", pacientes2, "San Fermin");
        Podologo podologo = new Podologo("Ana", "López", "11223", pacientes3, "Infanta Elena", "Planta Baja");

        cirujano.showInfo();
        System.out.println("Trabaja en hospital: " + cirujano.trabajaEnHospital());

        familia.showInfo();
        System.out.println("Trabaja en hospital: " + familia.trabajaEnHospital());

        podologo.showInfo();
        System.out.println("Trabaja en hospital: " + podologo.trabajaEnHospital());
    }
}