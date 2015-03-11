import java.util.ArrayList;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		try//intenta
		{
		return (a/b);//devolver división entre a y b
		}
		catch(Exception e)//captura el error
		{
		return 0;//devuelve 0 si b es cero
		}
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		try//intenta
		{
		return arreglo[pos];//devuelve la posición en el arreglo
		}
		catch(Exception e)//captura el error
		{
		return 0;//devuelve cero si la posición es incorrecta
		}
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		try//intenta
		{
		return mi_clase.x;//devuelve la variable x
		}
		catch(NullPointerException e)//captura el error
		{
		return 0;//devuelve 0
		}
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		int cant = 0;
		int prom = 0;
	//creación de variables inicializandolas en cero
		for(Integer numero : mi_lista)//se crea un ciclo para cada numero
		{
			cant = numero+cant;//suma el numero a la cantidad
		}
		prom= cant/mi_lista.size();//divide la cantidad entre el tamaño de la lista
		return prom;//devuelve el promedio
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		int menor = Integer.MAX_VALUE;//se establece como el valor maximo
		for(int c=0;c<mi_lista.size();c++)//contador inicializado en cero, menor que el tamaño de la lista, y sumara de 1 en 1
		{
			if(menor > mi_lista.get(c)) menor=mi_lista.get(c); 
		}
		return menor;//devuelve menor
	}
	
	//Devuelve la cantidad de veces que existe 'str' (dado) en mi_lista (dado)
	static int contar(ArrayList<String> mi_lista, String str)
	{
		int cant=0;//contar inicializado en cero
		int largo = mi_lista.size();//tamaño de la lista
		for(int c=0;c<largo;c++)//contador inicializado en cero, contador menor que el tamaño de la lista, contador hira sumando de 1 en 1
		{
			if(str==mi_lista.get(c)) cant=cant+1;
		}
		return cant;//devuelve
	}
}
