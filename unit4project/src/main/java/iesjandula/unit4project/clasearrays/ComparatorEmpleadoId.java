package iesjandula.unit4project.clasearrays;

public class ComparatorEmpleadoId {
	
	@Override
	public int compare(Empleado o1, Empleado o2) {
		// TODO Auto-generated method stub
		return o1.getId()-(o2.getId());
	}

}
