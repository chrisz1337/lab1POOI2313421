public class Main {
    public static void main(String[] args) {
        
        //Instancia
        Fecha fechaHoy = new Fecha();
        fechaHoy.setDia(12);
        fechaHoy.setMes(9);
        fechaHoy.setAño(2023);

        //Salida
        System.out.println("la fecha de hoy es: ");
        fechaHoy.mostrarFecha();
    }
}
