 class testTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();//创建一个默认的tv对象
		tv1.turnOn();
		tv1.setChannel(30);//为这个tv设置一个新频道；
		tv1.setVolume(3);
		TV tv2 = new TV();
		tv2.turnOn();
		tv2.ChannelUP();
		tv2.ChannelUP();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is" +tv1.channel+"and volume level is"
				+tv1.volumeLevel);
		System.out.println("tv2's channel is"+tv2.channel+"and volume level is"
				+ tv2.volumeLevel);
		
	}
 }
	 class TV{
		int channel = 1;
		int volumeLevel = 1;
		boolean on = false;
		
		public TV(){
			
		}
		public void turnOn(){
			on = true;
		}
		public void turnOff(){
			on = false;
		}
		public void setChannel(int newChannel){
			if(on&&newChannel>=1&&newChannel <= 120)
				channel = newChannel;
		}
		public void setVolume(int newVolumeLevel){
			if(on&&newVolumeLevel>=1&&newVolumeLevel<=7)
				volumeLevel = newVolumeLevel;
		}
		public void ChannelDOWN(){
			if(on&&channel>1)
				channel--;
		}
		public void ChannelUP(){
			if(on&&channel<=120)
				channel++;
		}
		public void volumeUp(){
			if(on&&volumeLevel<7)
				volumeLevel++;
		}
		public void volumedown(){
			if(on&&volumeLevel>1)
				volumeLevel--;
		}
	}


