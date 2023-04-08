package developingman.sample_Project.snack;

import developingman.sample_Project.DependencyConfig;

public class SnackTest {
    public static void main(String[] args) {
        DependencyConfig dependencyConfig = new DependencyConfig();
        SnackService snackService = dependencyConfig.snackService();

        Snack snack = new Snack(0L, "인디언밥", "indian meal", 1500);
        snackService.createSnack(snack);

        if(snackService.getSnack(0L).getKorName().equals(snack.getKorName())){
            System.out.println(snack.getKorName() + "가 등록되었습니다.");
        }

        snackService.editSnack(0L, "인디언 밥", 3000);

        if(snackService.getSnack(0L).getPrice() == 3000){
            System.out.println(snack.getKorName()+ "의 금액이 정상적으로 변경 되었습니다.");
        }

        snackService.deleteSnack(0L);

        if(snackService.getSnack(0L) == null){
            System.out.println("정상적으로 삭제 되었습니다.");
        }
    }
}
