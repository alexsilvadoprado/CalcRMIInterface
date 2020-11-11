package interfaces;

import java.rmi.*;

public interface Operators extends Remote
{
	public double soma(double valorX, double valorY) throws RemoteException;
	public double subtracao(double valorX, double valorY) throws RemoteException;
	public double multiplicacao(double valorX, double valorY) throws RemoteException;
	public double divisao(double valorX, double valorY) throws RemoteException;
}
