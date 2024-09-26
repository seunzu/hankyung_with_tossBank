package service;

import cafe.Coffee;
import repository.CafeRepository;

import static global.Data.coffees;

// service 유저의 입력으로 나의 로직을 처리하는 곳
// 개발자가 로직을 펼치는 곳
public class CafeService {
    public static CafeService getInstance() {
        if (cafeService == null) {
            cafeService = new CafeService();
        }
        return cafeService;
    }

    private static CafeService cafeService;
    private CafeService() {
        this.cafeRepository = CafeRepository.getInstance();
    }

    private final CafeRepository cafeRepository;

    public void coffeeAdd(String[] strings) {
        // 유저에게 입력 받는 것으로 생성하기 위한 로직
        try {
            // 커피 만들기
            Coffee coffee = Coffee.of(strings);
            // 저장
            coffees.add(coffee);
        } catch (NumberFormatException e) {
            System.out.println("가격 입력 다시");
        } catch (IllegalArgumentException e) {
            System.out.println("타입 입력 다시");
        }
    }
}
