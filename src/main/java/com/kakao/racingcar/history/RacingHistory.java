package com.kakao.racingcar.history;

import com.kakao.racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RacingHistory {
    private final List<RoundHistory> roundHistories = new ArrayList<>();

    public void logging(int round, List<Car> cars) {
        roundHistories.add(RoundHistory.of(round, cars));
    }

    public Map<Integer, List<CarHistory>> getResult() {
        return roundHistories.stream()
                .collect(Collectors.toMap(RoundHistory::getRound, RoundHistory::getCarHistories));
    }
}
