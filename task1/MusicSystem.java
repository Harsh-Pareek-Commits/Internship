package task1;

public class MusicSystem {
	private String mode;
	private String control;
	private boolean oNoFf;
	private String supports[];
    private String songs[]= {"Song 1","Song 2","Song 3","Song 4","Song 5"};
	private String playing;
        
    public void changeMode(String m) {
		if (oNoFf) {
			for (String mm : supports) {
				if (mm.equals(m)) {
					mode = m;
					play();
				}
			}
			if (mode != m) {
				System.out.println("This mode is not supoorted");
			}
		} else {
			System.out.println("Please turn on the music system");
		}

	}
 
    public void play() {
    	System.out.println("The song "+playing+ " is playing." );
    }
    public void pause() {
    	System.out.println("The song "+playing+ " is paused." );
    }
    public void next() {
     for(int i=0;i<songs.length;i++) {
    	 if(playing.equals(songs[i])) {
    		
    		 if (i==((songs.length)-1)) {
    			 playing=songs[0];
    		 }
    		 else {
    			 playing=songs[i+1];
    			 break;
    		 }
    	 }
     }
     System.out.println("Next song is played");
     play();
    }
    public void previous() {
    	for(int i=(songs.length)-1;i>=0;i--) {
       	 if(playing.equals(songs[i])) {
       		 if (i==0) {
       			 playing=songs[((songs.length)-1)];
       		 }
       		 else {
       			 playing=songs[i-1];
       			 break;
       		 }
       	 }
        }	
    	System.out.println("The previous song is played");
    	play();
    }
	public void pressPowerButton() {
		if (oNoFf) {
			oNoFf = false;
		} else {
			oNoFf = true;
			
		}
	}

	public void currentStatus() {
		if (oNoFf) {
			System.out.println();
		}
	}

	public String getMode() {
		
		return mode;
	}

	public MusicSystem(String[] supports) {
		super();
		oNoFf=false;
		playing=songs[0];
		this.supports = supports;
	}

	public String[] getSupports() {
		return supports;
	}

	public void setSupports(String[] supports) {
		this.supports = supports;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public boolean isoNoFf() {
		return oNoFf;
	}

	public void setoNoFf(boolean status) {
		this.oNoFf = status;
	}

	

}
