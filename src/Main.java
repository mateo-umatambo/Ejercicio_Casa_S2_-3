//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Tarea t1 = new Tarea();
    t1.setTitulo("Diseño de BD");
    t1.setResponsable("Mateo");
    t1.setHorasEstimadas(12.5);
    t1.setCompletada(false);
    /*
    t1.titulo = "Diseño de Base de Datos";
    t1.responsable = "Mateo";
    t1.horasEstimadas = 12.5;
    t1.completada = false;

     */

    Tarea t2 = new Tarea();
    /*
    t2.titulo = "Implementación de API REST";
    t2.responsable = "Carla";
    t2.horasEstimadas = 20.0;
    t2.completada = false;

     */

    Tarea t3 = new Tarea();
    /*
    t3.titulo = "Pruebas Unitarias";
    t3.responsable = "Alejandro";
    t3.horasEstimadas = 8.0;
    t3.completada = false;

     */
    /*

    // Completamos solamente una tarea (tarea1)
    t1.completar();

    // Comprobamos los resultados y la independencia
    t1.mostrarInformacion();
    t2.mostrarInformacion();
    t3.mostrarInformacion();

     */

    System.out.println(t1.getTitulo());
    System.out.println(t1.getResponsable());
    System.out.println(t1.getHorasEstimadas());
    System.out.println(t1.isCompletada());

}
