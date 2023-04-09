package developingman.sample_Project.snack;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SnackRepository {
    private static Map<Long, Snack> snacks = new HashMap<>();

    public void postSnack(Snack snack){
        snacks.put(snack.getSnackId(),snack);
    }

    public Snack patchSnack(Long snackId, String korName, int price){
        Snack snack = snacks.get(snackId);
        snack.setKorName(korName);
        snack.setPrice(price);
        return snacks.put(snackId, snack);
    }

    public Snack getSnack(Long snackId){
        return snacks.get(snackId);
    }

    public void deleteSnack(Long snackId){
        snacks.remove(snackId);
    }
}
