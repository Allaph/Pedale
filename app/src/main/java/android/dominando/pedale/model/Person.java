package android.dominando.pedale.model;

/**
 * Created by Absyd on 29/11/2016.
 */

public class Person {

    private String mName;
    private String mAddress;
    private String mCpf;

    public Person(String name, String address, String cpf) {

        this.mName    = name;
        this.mAddress = address;
        this.mCpf     = cpf;

    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getCpf() {
        return mCpf;
    }

}
