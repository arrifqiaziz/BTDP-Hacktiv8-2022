package sesi_05;

abstract class Manusia {
	protected abstract void nyanyiLagu();
}

class Cowok extends Manusia {

	@Override
	protected void nyanyiLagu() {
		// TODO Auto-generated method stub
		System.out.println("aa bb cc");
	}
}

class Cewek extends Manusia {

	@Override
	protected void nyanyiLagu() {
		// TODO Auto-generated method stub
		System.out.println("aaaaaaaaaaaaaaaaaaa");
	}
}
