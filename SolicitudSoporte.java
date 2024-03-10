class SolicitudSoporte {
    private int id;
    private String descripcion;
    private String cliente;

    public SolicitudSoporte(int id, String descripcion, String cliente) {
        this.id = id;
        this.descripcion = descripcion;
        this.cliente = cliente;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
