class Event
{
    private String name;
    private String date;
    private String time;
    private String desc;

	public Event(String name, String date, String time, String desc) 
    {
		this.name = name;
		this.date = date;
		this.time = time;
		this.desc = desc;
	}

    public void reschedule(String date, String time) 
    {
        this.date = date;
        this.time = time;
    }
}
