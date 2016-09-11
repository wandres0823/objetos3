/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author adalberto
 */
public class Ncomplejo {
   
    private double real;
    private double imaginario;

    public Ncomplejo(){
       real=0.0;
       imaginario=0.0; 
    } 
    public Ncomplejo(double real,double imaginario){
        this.real=real;
        this.imaginario=imaginario;
       }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }
    public Ncomplejo Sumar(Ncomplejo n2){
        double real,imaginario;
        Ncomplejo res;
        
        real=this.real + n2.real;
        imaginario=this.imaginario + n2.imaginario;
        
        res= new Ncomplejo(real,imaginario);
        return res;
    }
    public Ncomplejo Restar(Ncomplejo n2){
        double real,imaginario;
        Ncomplejo res;
        
        real=this.real - n2.real;
        imaginario=this.imaginario - n2.imaginario;
        
        res= new Ncomplejo(real,imaginario);
        return res;
    }
    public Ncomplejo Multiplicar(Ncomplejo n2){
        double real,imaginario,op,op1,op2,op3;
        Ncomplejo res;
        
        op=this.real * n2.real;
        op1=this.real * n2.imaginario;
        op2=this.imaginario * n2.real;
        op3=this.imaginario * n2.imaginario;
        
        real=op-op3;
        imaginario=op1+op2;
        
        res=new Ncomplejo(real,imaginario);
        return res;
    }
    public Ncomplejo Dividir(Ncomplejo n2){
        double real,imaginario,op,op1,op2,op3,po,po2;
        Ncomplejo res;
        
        op=this.real * n2.real;
        op1=this.real * n2.imaginario;
        op2=this.imaginario * n2.real;
        op3=this.imaginario * n2.imaginario;
        po=(n2.real*n2.real) + (n2.imaginario*n2.imaginario);
        
        real=(op-op3)/po;
        imaginario=(op1+op2)/po;
        
        res=new Ncomplejo(real,imaginario);
        return res;
    }
}
