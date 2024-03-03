package unidad3.ejercicios.ingles.problem6;

public enum Account_Type {
		CHECK ("Checking account", false), 
		SAVING ("Savings account", true), 
		CD ("Certificate of deposits account", false);
		
		// Enum attributes
		private String description;
		private boolean isDefault;
				
		// Unsummonable constructor
		private Account_Type(String description, boolean isDefault) {
			this.description = description;
			this.isDefault=isDefault;
		}

		// Getters
		public final String getDescription(){
			return this.description;
			}
		
		public final boolean isDefaulting() {
			return this.isDefault;
		}
	}
