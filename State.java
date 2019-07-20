
public class State {
	private String stateCode;
	private String stateDescription;
	
	public State(String stateCode, String stateDescription) {		
		this.stateCode = stateCode;
		this.stateDescription = stateDescription;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		stateCode = defineStateCode(stateDescription);		
		this.stateCode = stateCode;
	}

	public String getStateDescription() {
		return stateDescription;
	}

	public void setStateDescription(String stateDescription) {
		this.stateDescription = stateDescription;
	}

	@Override
	public String toString() {
		//String result = "State: " + stateDescription + " - " + stateCode + " "
		return stateCode + "  ";
	}
	
	//================================
	public static String defineStateCode(String str) {		
		String result = "";
		
		switch(str) {
		case "Alabama":
			result = "AL";
			break;
		case "Alaska":
			result = "AK";
			break;
		case "Arizona":
			result = "AZ";	
			break;
		case "Arkansas":
			result = "AR";
			break;
		case "California":
			result = "CA";	
			break;
		case "Colorado":
			result = "CO";
			break;
		case "Connecticut":
			result = "CT";
			break;
		case "Delaware":
			result = "FL";
			break;
		case "District of Columbia":
			result = "DC";
			break;
		case "Florida":
			result = "FL";
			break;
		case "Georgia":
			result = "GA";	
			break;
		case "Hawaii":
			result = "HI";	
			break;
		case "Idaho":
			result = "ID";	
			break;
		case "Illinois":
			result = "IL";
			break;
		case "Indiana":
			result = "IN";
			break;
		case "Iowa":
			result = "IA";
			break;
		case "Kansas":
			result = "KS";
			break;
		case "Kentucky":
			result = "KY";
			break;
		case "Louisiana":
			result = "LA";
			break;
		case "Maine":
			result = "ME";
			break;
		case "Maryland":
			result = "MD";	
			break;
		case "Massachusetts":
			result = "MA";
			break;
		case "Michigan":
			result = "MI";	
			break;
		case "Minnesota":
			result = "MN";
			break;
		case "Mississippi":
			result = "MS";
			break;
		case "Missouri":
			result = "MO";
			break;
		case "Montana":
			result = "MT";	
			break;
		case "Nebraska":
			result = "NE";
			break;
		case "Nevada":
			result = "NV";	
			break;
		case "New Hampshire":
			result = "NH";
			break;
		case "New Jersey":
			result = "NJ";
			break;
		case "New Mexico":
			result = "NM";
			break;
		case "New York":
			result = "NY";
			break;
		case "North Carolina":
			result = "NC";
			break;
		case "North Dakota":
			result = "ND";	
			break;
		case "Ohio":
			result = "OH";
			break;
		case "Oklahoma":
			result = "OK";	
			break;
		case "Oregon":
			result = "OR";
			break;
		case "Pennsylvania":
			result = "PA";	
			break;
		case "Rhode Island":
			result = "RI";
			break;
		case "South Carolina":
			result = "SC";	
			break;
		case "South Dakota":
			result = "SD";
			break;
		case "Tennessee":
			result = "TN";	
			break;
		case "Texas":
			result = "TX";
			break;
		case "Utah":
			result = "UT";	
			break;
		case "Vermont":
			result = "VT";
			break;
		case "Virginia":
			result = "VA";	
			break;
		case "Washington":
			result = "WA";
			break;
		case "West Virginia":
			result = "WV";	
			break;
		case "Wisconsin":
			result = "WI";
			break;
		case "Wyoming":
			result = "WY";	
			break;
		/*case "American Samoa":
			result = "AS";
			break;
		case "Federated States of Micronesia":
			result = "FM";
			break;
		case "Guam":
			result = "GU";
			break;
		case "Marshall Islands":
			result = "MH";
			break;
		case "Northern Mariana Islands":
			result = "MP";
			break;
		case "Palau":
			result = "PW";
			break;
		case "Puerto Rico":
			result = "PR";
			break;
		case "Virgin Islands":
			result = "VI";
			break;*/
		default:
			break;
		}//end switch		
		return result;
	}//end defineStateCode
	
	/*Another idea I had was to load a 2D array with states[i] and states codes[j], and
	 for(i = 0; i < a.size ; i++){
	 	if(stateDefinition == a[i][0]){
	  		code = a[i][1];
	 	}//end if
	 }//end for
	 */
	

}
