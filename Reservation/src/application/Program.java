package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		int number = Integer.parseInt(JOptionPane.showInputDialog("Room number: "));
		Date checkIn = sdf.parse(JOptionPane.showInputDialog("Check-in date (dd/MM/yyyy): "));
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(JOptionPane.showInputDialog("Check-out date (dd/MM/yyyy): "));

		if (!checkOut.after(checkIn)) {
			JOptionPane.showMessageDialog(null, "Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			JOptionPane.showMessageDialog(null, "Reservation: " + reservation);

			checkIn = sdf.parse(JOptionPane
					.showInputDialog("Enter data to update the reservation: \n" + "Check-in date (dd/MM/yyyy): "));

			checkOut = sdf.parse(JOptionPane
					.showInputDialog("Enter data to update the reservation: \n" + "Check-out date (dd/MM/yyyy): "));

			String error = reservation.updateDates(checkIn, checkOut);
			if (error != null) {
				JOptionPane.showMessageDialog(null, "Error in reservation: " + error);
			} else {
				JOptionPane.showMessageDialog(null, "Reservation: " + reservation);
			}
		}

	}

}
