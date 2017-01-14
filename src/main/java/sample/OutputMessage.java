package sample;

import java.util.Date;

/*
 * Output message sent to client.
 *
 * @Author Jay Sridhar
 */
public class OutputMessage
{
    private String from;
    private String message;
    private String topic;
    private Date time = new Date();

    public OutputMessage() {}

    public OutputMessage(String from,String message,String topic)
    {
	this.from = from;
	this.message = message;
	this.topic = topic;
    }

    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getTopic()
    {
        return topic;
    }

    public void setTopic(String topic)
    {
        this.topic = topic;
    }

    public Date getTime()
    {
        return time;
    }
}
