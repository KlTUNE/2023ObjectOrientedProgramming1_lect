package jp.ac.ait.k22121;
import java.util.Map;

public interface IKadai07_5 {
    Map<String, String> searchByCode(String postalCode);
    Map<String, String> searchByAddress(String addressText);
}
