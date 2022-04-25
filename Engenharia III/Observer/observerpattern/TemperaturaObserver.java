package observerpattern;


public void notify Observer(double Temp) {
	for (Observer ob:observer) {
		ob.update(temp);
	}
}

public void add Observer(Observer ob) {
	observer.add(ob);
}

public void retTemperatura(double novaTemperatura) {
	temperatura = novaTemperatura;
	notify Observer (temperatura);
}