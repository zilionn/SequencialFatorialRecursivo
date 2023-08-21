package controller;

public class SequencialController {

	public SequencialController() {
		super();
	}
	public double sequencial(int num) {
		if (num == 1) {
			return 1;
		}
		return 1 / fat(num) + sequencial(num - 1);
	}
	public int fat(int x) {
		if (x == 1) {
			return 1;
		}
		return x * fat(x - 1);
	}
}
