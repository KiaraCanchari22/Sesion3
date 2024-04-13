/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion.pkg3;



/**
 *
 * @author Estudiante
 */
public class SESION3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PERSONA per = new PERSONA();
        per.setNombre("Juan");
        per.setApellido("Diaz");
        per.setDni("00555555");
        per.setDireccion("Av Manzanitas 456");
        per.setTelefono("991847595");
        per.setCorreo("juan.diaz@upn.pe");
        per.setUsuario("juanchis16");
        per.setContraseña("123456");
        per.setEmail("juan.diaz@gmail.com");
        
        
        
        PersonaDatosBasicos dataB = 
                new PersonaDatosBasicos("Juan", "Diaz","00555555");
        PersonaDatosContact dataC  = 
                new PersonaDatosContact("Av Manzanitas 456","991847595","juan.diaz@upn.pe" );
        PersonaDatosRegistro dataR=
                new PersonaDatosRegistro("juanchis16","123456","juan.diaz@gmail.com");
        
        Persona2. per2= new Persona2(dataB,dataC,dataR);
        
        
        PERSONA carlitos = PERSONA.Carlos();
        PERSONA marco = PERSONA.Marcos();
        PERSONA JUANA = PERSONA.Juanita();
    }
    
}
