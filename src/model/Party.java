package model;

public class Party {
	private Kid firstKid;
	
	public Party() {		
	}
	
	public void addKid(String n, int a) {
		Kid newKid = new Kid(n, a);
		if(firstKid == null) {
			firstKid = newKid;
		}
		else if(newKid.getAge()<firstKid.getAge()) {
				firstKid.setPreviousKid(newKid);
				newKid.setNextKid(firstKid);
				firstKid=newKid;
		}else {
				Kid current=firstKid;
				while(current.getNextKid() != null || newKid.getAge()>current.getAge()) {
					current=current.getNextKid();
				}
				newKid.setPreviousKid(current.getPreviousKid());
				newKid.setNextKid(current);
				current.getPreviousKid().setNextKid(newKid);
				current.setPreviousKid(newKid); 
		}
	}

	
	public String patiensInString() {
		String list = "[";
		Kid current = firstKid;
		while(current != null) {
			list += "(" + current.getName() + "), ";
			current = current.getNextKid();
		}
		list += "]";
		return list;
	}
}