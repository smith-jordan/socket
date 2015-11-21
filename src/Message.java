import java.io.Serializable;

public class Message implements Serializable{
    private static final long serialVersionUID = -2723363051271966964L;
    Integer firstNumber = null;
    Integer secondNumber = null;
    Integer result = null;
    public Message(Integer firstNumber, Integer secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    public Integer getFirstNumber(){
    return firstNumber;
    }
    public Integer getSecondNumber(){
    return secondNumber;
    }
    
    public Integer getResult(){
    return result;
    }
    public void setResult(Integer result){
        this.result = result;
    }
 }
