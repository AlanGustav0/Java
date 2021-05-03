package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			int number = Integer.parseInt(JOptionPane.showInputDialog("Room number: "));
			Date checkIn = sdf.parse(JOptionPane.showInputDialog("Check-in date (dd/MM/yyyy): "));

			Date checkOut = sdf.parse(JOptionPane.showInputDialog("Check-out date (dd/MM/yyyy): "));

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			JOptionPane.showMessageDialog(null, "Reservation: " + reservation);

			checkIn = sdf.parse(JOptionPane
					.showInputDialog("Enter data to update the reservation: \n" + "Check-in date (dd/MM/yyyy): "));

			checkOut = sdf.parse(JOptionPane
					.showInputDialog("Enter data to update the reservation: \n" + "Check-out date (dd/MM/yyyy): "));

			reservation.updateDates(checkIn, checkOut);

			JOptionPane.showMessageDialog(null, "Reservation: " + reservation);

		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Invalid date format!");

		} catch (DomainException e) {
			JOptionPane.showMessageDialog(null, "Error in Reservation: " + e.getMessage());
		} catch (RuntimeException e) {
			
			JOptionPane.showMessageDialog(null, "Unespected error");
		}

	}

}
