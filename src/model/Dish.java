package model;

import java.awt.Color;


public class Dish 
{
	private boolean isDirty;
	private Color color;
	private double total;
	
	
	public Dish(boolean isDirty, Color color, double total)
	{
		this.isDirty = isDirty;
		this.color = color;
		this.total = total;
	}
	
	public boolean isDirty()
	{
		return isDirty;
	}

	public void setIsDirty(boolean IsDirty) 
	{
		this.isDirty = isDirty;
	}
	
	public Color getColor() 
	{
		return color;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public double getTotal() 
	{
		return total;
	}

	public void setTotal(double total) 
	{
		this.total = total;
	}
}
