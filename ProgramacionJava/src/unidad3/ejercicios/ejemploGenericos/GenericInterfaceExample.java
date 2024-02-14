package unidad3.ejercicios.ejemploGenericos;

public interface GenericInterfaceExample<T> {
	T suma(T op1, T op2);

	T resta(T op1, T op2);

	T producto(T op1, T op2);

	T division(T op1, T op2);
}