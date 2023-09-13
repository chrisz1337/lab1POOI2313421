public class Fecha {
    // Atributos
    private int dia;
    private int mes;
    private int año;

   // Constructor
   
   public Fecha(){
       this.dia = 0;
       this.mes = 0;
       this.año = 0;
   }
   
   public Fecha(int _dia, int _mes, int _año){
    this.dia = _dia;
    this.mes = _mes;
    this.año = _año;
   } 

   // Metodo
   public void mostrarFecha() {
    System.out.println(this.dia + " / " + this.mes + " / " + this.año);
   }

   // Set & Get

   //dia
   public void setDia(int _dia) {
    this.dia = _dia;
   }

    public int getDia(){
        return this.dia;
    }
    
    //mes
    public void setMes(int _mes) {
    this.mes = _mes;
   }

    public int getMes(){
        return this.mes;
    }

    //año
    public void setAño(int _año) {
    this.año = _año;
   }

    public int getAño(){
        return this.año;
    }
}
