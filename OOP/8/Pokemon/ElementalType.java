import java.io.*;

interface ElementalType<T> {
	public void displayAura();
	public void specialSkill();
	public T getUniqueID();
	public void setUniqueID(T id);
}