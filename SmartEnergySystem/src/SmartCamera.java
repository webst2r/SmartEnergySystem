import java.time.LocalDateTime;

public class SmartCamera extends SmartDevice{
    private String resolucao;
    private double tamanhoFicheiro;
    private double consumo;


    public SmartCamera(){
        this.resolucao = "";
        this.tamanhoFicheiro = 0.0;
        this.consumo = 0.0;
    }

    public SmartCamera(String id, boolean on, LocalDateTime timeOfTurningOn, String resolucao, double tamanhoFicheiro, double consumo){
        super (id, on, timeOfTurningOn);
        this.resolucao = resolucao;
        this.tamanhoFicheiro = tamanhoFicheiro;
        this.consumo = consumo;
    }

    public SmartCamera(SmartCamera sc){
        super (sc.getID(),sc.getOn(),sc.getTimeOfTurningOn());
        this.resolucao = sc.getResolucao();
        this.tamanhoFicheiro = sc.getTamanhoFicheiro();
        this.consumo = sc.getConsumo();
    }

    public String getResolucao() { return this.resolucao;}
    public double getTamanhoFicheiro() { return this.tamanhoFicheiro; }

    public double getConsumo() { return this.consumo;}

    public SmartCamera clone() {
        return new SmartCamera(this);
    }
}