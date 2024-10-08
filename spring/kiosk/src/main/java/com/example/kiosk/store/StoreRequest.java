package com.example.kiosk.store;

public record StoreRequest(String name, String address, short openTime, short closeTime) {

    public Store toStore() {
        return new Store(name, address, openTime, closeTime);
    }
}
