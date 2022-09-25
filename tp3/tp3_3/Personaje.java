package tp3.tp3_3;

public class Personaje {
    private String name;
    private int fuerza;
    private int inteligencia;
    private int destreza;
    
    //CONSTRUCTOR
    public Personaje(String name, int fuerza, int inteligencia, int destreza) {
        this.setName(name);
        this.setFuerza(fuerza);
        this.setInteligencia(inteligencia);
        this.setDestreza(destreza);
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        if(getFuerza()+getDestreza()+getInteligencia()<=50){
            this.destreza = destreza;
        }else this.destreza = 0;    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        if(getFuerza()+getDestreza()+getInteligencia()<=50){
            this.fuerza = fuerza;
        }else this.fuerza = 0;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        if(getFuerza()+getDestreza()+getInteligencia()<=50){
            this.inteligencia = inteligencia;
        }else this.inteligencia = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRol(){
        if((this.fuerza>this.inteligencia)&&(this.fuerza>this.destreza)){
            return getStrenght();
        }else if((this.destreza>this.inteligencia)&&(this.destreza>this.fuerza)){
            return getDexterity();
        }else if((this.inteligencia>this.destreza)&&(this.inteligencia>this.fuerza)){
            return getWizard();
        }else{
            return getHibrid();
        }
    }
    private String getHibrid() {
        return null;
    }

    private String getWizard() {
        return null;
    }

    private String getDexterity() {
        return null;
    }

    public String getStrenght(){
        if(this.destreza>this.inteligencia){
            return "Barbaro";
        }else if(this.destreza<this.inteligencia){
            return "Centinela";
        }else{
            return "Guerrero";
        }
    }
}
