package ru.valaubr.creational.singleton;

public enum GoodSingletonLikeAJoke {

    INSTANCE(0); //TODO расширь инстанс как пожелаешь

    private Integer value;

    private GoodSingletonLikeAJoke(Integer value) {
        this.value = value;
    }

    public GoodSingletonLikeAJoke getInstance() {
        return INSTANCE;
    }

    public Integer getValue() {
        return value;
    }

    public void incrementValue() {
        value++;
        System.out.println("joke singleton value:" + value);
    }
}
