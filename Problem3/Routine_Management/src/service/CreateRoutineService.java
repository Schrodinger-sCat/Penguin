package service;

import repository.DataRepository;

public interface CreateRoutineService {
    void createRoutine(int dayIndex, int hourIndex, int courseIndex, DataRepository dataRepository);
}
