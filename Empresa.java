public class Empresa {
    //Atributos
      private long nitEmpresa;
      private String nombreEmpresa;
      private String direccionEmpresa;
      private String telefonoEmpresa;
      //Constructor
      public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, long nitEmpresa) {
         this.nitEmpresa = nitEmpresa;
         this.nombreEmpresa = nombreEmpresa;
         this.direccionEmpresa = direccionEmpresa;
         this.telefonoEmpresa = telefonoEmpresa;         
      }
  
      //Métodos

  
      //Getters y Setters
      public long getNitEmpresa() {
          return nitEmpresa;
      }
  
      public void setNitEmpresa(long nitEmpresa) {
          this.nitEmpresa = nitEmpresa;
      }
  
      public String getNombreEmpresa() {
          return nombreEmpresa;
      }
  
      public void setNombreEmpresa(String nombreEmpresa) {
          this.nombreEmpresa = nombreEmpresa;
      }
  
      public String getDireccionEmpresa() {
          return direccionEmpresa;
      }
  
      public void setDireccionEmpresa(String direccionEmpresa) {
          this.direccionEmpresa = direccionEmpresa;
      }

      public String getTelefonoEmpresa() {
          return telefonoEmpresa;
      }
  
      public void setTelefonoEmpresa(String telefonoEmpresa) {
         this.telefonoEmpresa = telefonoEmpresa; 
      }
  }
