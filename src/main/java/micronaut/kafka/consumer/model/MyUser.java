package micronaut.kafka.consumer.model;

import io.micronaut.core.annotation.Introspected;

import java.util.List;

@Introspected
public class MyUser {
    private String table;
    private String op_type;
    private List<String> primary_keys;
    private int USER_ID;
    private String NAME;
    private int AGE;
    private String CITY;

    public MyUser(String table, String op_type, List<String> primary_keys, int USER_ID, String NAME, int AGE, String CITY) {
        this.table = table;
        this.op_type = op_type;
        this.primary_keys = primary_keys;
        this.USER_ID = USER_ID;
        this.NAME = NAME;
        this.AGE = AGE;
        this.CITY = CITY;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getOp_type() {
        return op_type;
    }

    public void setOp_type(String op_type) {
        this.op_type = op_type;
    }

    public List<String> getPrimary_keys() {
        return primary_keys;
    }

    public void setPrimary_keys(List<String> primary_keys) {
        this.primary_keys = primary_keys;
    }

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }
}
