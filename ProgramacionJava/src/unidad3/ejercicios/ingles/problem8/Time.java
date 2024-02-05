package unidad3.ejercicios.ingles.problem8;

public class Time {
	
	// Enums
	
	// Static attributes
	
	// Static Block
	
	// Atributes
	
	private int hour;
	private int minute;
	private int second;
	
	// Constructors
	
	public Time(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	// Static & Final Methods
	
	// Getters
	
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	
	// Setters
	
	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	// Functionals
	
	public void setTime(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
	public Time nextSecond() {
		
		Time newTime = new Time(this.getHour(),this.getMinute(),this.getSecond());		
		/* if segundos 59 ->	entonces segundos 0
		 * 								\-> if minutos 59 entonces minutos 0
		 * 													\->  if horas 23 entonces 0
		 * 														else nada
		 * 								else minutos +1
		 * else segundos +1
		 */
		
		if (this.getSecond()==59) {
			newTime.setSecond(0);
			
			//infremento minutos
			if(this.getMinute()==59) {
				
				newTime.setMinute(0);
				
				if(this.getHour()==23) { newTime.setHour(0); }
				
				else { newTime.setHour(this.getHour()+1); }
				
			}
			
			else { newTime.setMinute(this.getMinute()+1); }
		}
		
		else { newTime.setSecond(this.getSecond()+1); }
		
		// Returns new modified time item.
		return newTime;
	}

	public Time previousSecond() {
		Time newTime = new Time(this.getHour(),this.getMinute(),this.getSecond());		
		/* if segundos 59 ->	entonces segundos 0
		 * 								\-> if minutos 59 entonces minutos 0
		 * 													\->  if horas 23 entonces 0
		 * 														else nada
		 * 								else minutos +1
		 * else segundos +1
		 */
		
		if (this.getSecond()==0) {
			newTime.setSecond(59);
			
			//infremento minutos
			if(this.getMinute()==0) {
				
				newTime.setMinute(59);
				
				if(this.getHour()==0) { newTime.setHour(23); }
				
				else { newTime.setHour(this.getHour()-1); }
				
			}
			
			else { newTime.setMinute(this.getMinute()-1); }
		}
		
		else { newTime.setSecond(this.getSecond()-1); }
		
		// Returns new modified time item.
		return newTime;
	}

	private String zeroToTheLeft(int num) {
		String result = "";

		result = String.valueOf(num);

		if (num < 10) {
			result = "0" + result;
		}

		return result;
	}
	
	//Overrides
	
	@Override
	public String toString() {
		return zeroToTheLeft(this.hour) + ":" + zeroToTheLeft(minute) + ":" + zeroToTheLeft(second);
	}
	
	
	
	
}
