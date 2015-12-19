package config.demo;

/**
 * Created by yangjunming on 12/15/15.
 * author: yangjunming@huijiame.com
 */
public class SampleObject {

    private int _intField;

    private String _stringField;

    public int get_intField() {
        return _intField;
    }

    public void set_intField(int _intField) {
        this._intField = _intField;
    }

    public String get_stringField() {
        return _stringField;
    }

    public void set_stringField(String _stringField) {
        this._stringField = _stringField;
    }

    @Override
    public String toString() {
        return "SampleObject{" +
                "_intField=" + _intField +
                ", _stringField='" + _stringField + '\'' +
                '}';
    }
}
