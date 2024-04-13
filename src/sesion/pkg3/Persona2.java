/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion.pkg3;

/**
 *
 * @author Estudiante
 */
public class Persona2 {
    private PersonaDatosBasicos dataB;
    private PersonaDatosContact dataC;
    private PersonaDatosRegistro dataR;

    public Persona2(PersonaDatosBasicos dataB, PersonaDatosContact dataC, PersonaDatosRegistro dataR) {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;
    }

    /**
     * @return the dataB
     */
    public PersonaDatosBasicos getDataB() {
        return dataB;
    }

    /**
     * @param dataB the dataB to set
     */
    public void setDataB(PersonaDatosBasicos dataB) {
        this.dataB = dataB;
    }

    /**
     * @return the dataC
     */
    public PersonaDatosContact getDataC() {
        return dataC;
    }

    /**
     * @param dataC the dataC to set
     */
    public void setDataC(PersonaDatosContact dataC) {
        this.dataC = dataC;
    }

    /**
     * @return the dataR
     */
    public PersonaDatosRegistro getDataR() {
        return dataR;
    }

    /**
     * @param dataR the dataR to set
     */
    public void setDataR(PersonaDatosRegistro dataR) {
        this.dataR = dataR;
    }
    
    
}
