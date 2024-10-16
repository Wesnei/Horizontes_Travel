package models;

import java.util.Date;

public class Reserva {

    private int id;
    private Date dataReserva;
    private String status;
    private int clienteId;
    private int pacoteId;
    private String clienteCpf;
    private String pacoteNome;

    public Reserva(int id, Date dataReserva, String status, int clienteId, int pacoteId){
        this.id = id;
        this.dataReserva = dataReserva;
        this.status = status;
        this.clienteId = clienteId;
        this.pacoteId = pacoteId;
    }

    public Reserva() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.sql.Date getDataReserva() {
        return (java.sql.Date) dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public int getPacoteId() {
        return pacoteId;
    }

    public void setPacoteId(int pacoteId) {
        this.pacoteId = pacoteId;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getPacoteNome() {
        return pacoteNome;
    }

    public void setPacoteNome(String pacoteNome) {
        this.pacoteNome = pacoteNome;
    }

}
