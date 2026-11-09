public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Rocky", 4, "Carlos", "Labrador");
        Gato gato = new Gato("Luna", 3, "Marcela", true);
        Ave ave = new Ave("Pico", 2, "Andrés", 350);
        Conejo conejo = new Conejo("Nube", 1, "Sofía");

        Animal[] animales = {perro, gato, ave, conejo};

        System.out.println("===== FICHAS =====");
        for (Animal animal : animales){
            animal.imprimirFicha();
            System.out.println();
        }

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");

        System.out.println("===== VACUNAS =====");
        System.out.println("Vacunas de Rocky: " + perro.getVacunasAplicadas());
        System.out.println("Vacunas de Luna: " + gato.getVacunasAplicadas());
        System.out.println();

        Clinica clinica = new Clinica("VetCare", "Calle 10 # 5-20");

        Asegurable[] asegurables = {perro, gato, clinica};

        System.out.println("===== PÓLIZAS =====");
        for (Asegurable asegurable : asegurables){
            System.out.println(asegurable.obtenerNumeroPoliza() + " - Prima anual: $" + asegurable.calcularPrimaSeguro());
        }


    }
}