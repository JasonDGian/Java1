package unidad3.ejercicios.ingles.problem8;

public class TimeHechoPorCarlos {

	private int hour;
	private int minute;
	private int second;

	public TimeHechoPorCarlos() {

	}

	public TimeHechoPorCarlos(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}



	// Modifyin the current one
	public TimeHechoPorCarlos previousSecond() {
		substractASecond(this);
		return this;

	}

	// returning a new object
	// PATRON A CASCADA
	public TimeHechoPorCarlos previousSecondNew() {

		TimeHechoPorCarlos time = new TimeHechoPorCarlos(this.hour, this.minute, this.second);
		substractASecond(time);
		return time;

	}

	private void substractASecond(TimeHechoPorCarlos time) {

		if (time.getSecond() == 0) {

			time.setSecond(59);

			if (time.getMinute() == 0) {
				time.setMinute(59);

				if (time.getHour() == 0) {

					time.setHour(23);
				}
				
				else {time.setHour((getHour()-1));}

			} else {

				time.setMinute(time.getMinute() - 1);

			}

		} else {

			time.setSecond(time.getSecond() - 1);
		}

	}

	private String zeroToTheLeft(int num) {
		String result = "";

		result = String.valueOf(num);

		if (num < 10) {
			result = "0" + result;
		}

		return result;
	}
	
	
	@Override
	public String toString() {
		return zeroToTheLeft(this.hour) + ":" + zeroToTheLeft(minute) + ":" + zeroToTheLeft(second);
	}
	

}