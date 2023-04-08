package developingman.sample_Project.snack;

public class SnackService {
    private static SnackRepository snackRepository;

    public SnackService(SnackRepository snackRepository){
        this.snackRepository = snackRepository;
    }
    public void createSnack(Snack snack){
        snackRepository.postSnack(snack);
    }

    public Snack editSnack(Long snackId, String korName, int price){
        return snackRepository.patchSnack(snackId, korName, price);
    }

    public Snack getSnack(Long snackId){
        return snackRepository.getSnack(snackId);
    }
    public void deleteSnack(Long snackId){
        snackRepository.deleteSnack(snackId);
    }
}
