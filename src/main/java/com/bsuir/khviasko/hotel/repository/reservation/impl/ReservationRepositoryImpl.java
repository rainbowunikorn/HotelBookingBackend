package com.bsuir.khviasko.hotel.repository.reservation.impl;

import com.bsuir.khviasko.hotel.entity.Reservation;
import com.bsuir.khviasko.hotel.entity.Room;
import com.bsuir.khviasko.hotel.entity.User;
import com.bsuir.khviasko.hotel.repository.AbstractRepository;
import com.bsuir.khviasko.hotel.repository.reservation.ReservationRepository;

import java.util.List;

public class ReservationRepositoryImpl extends AbstractRepository<Reservation> implements ReservationRepository {
    public ReservationRepositoryImpl() {
        super(Reservation.class, Reservation.RESERVATION_CLASS_NAME);
    }


    @Override
    public double calculateTotalPrice(Room room, Reservation reservation) {
        return reservation.getDuration() * room.getPrice();
    }

    @Override
    public List<Reservation> getUserReservations(User user) {
        return null;
    }
}
