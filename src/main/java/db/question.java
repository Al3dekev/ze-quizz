package db;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class question {

    @id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    private String question;

    //private int qlink //clé étrangere


    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setQuestion(String question) {
        this.question = question;
    }
}
