import javax.swing.JButton;


public class bombproperty extends JButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private int bomb;
	public boolean notclick=true;
	
	public bombproperty(){
		super();
	}
		
	public int getBomb() {
		return bomb;
	}
	public void setBomb(int bomb) {
		this.bomb = bomb;
	}
	public boolean isbomb(){
		if(bomb == 1)
				return true;
		else
				return false;
	}
	
	

}
