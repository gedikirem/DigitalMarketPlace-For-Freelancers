package com.freelanciaApp.FreelanciaWorld.model;

abstract public class User {
    public abstract String getName();

    public abstract String getEmail();

    public void setName(String name) {
    }

    public void setEmail(String email) {
    }

    public abstract long getPhoneNumber() ;

    public abstract long setPhoneNumber(String number) ;
}
