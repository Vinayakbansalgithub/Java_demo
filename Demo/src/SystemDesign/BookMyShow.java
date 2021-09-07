package SystemDesign;

public class BookMyShow {

}


//APIs Needed
//
//GetListOfCities()
//GetListOfEventsByCity(CityId)
//GetLocationsByCity(CityId)
//GetLocationsByEventandCity(cityid, eventid)
//GetEventsByLocationandCity(CityId, LocationId)
//GetShowTiming(eventid, locationid)
//GetAvailableSeats(eventid, locationid, showtimeid)
//VarifyUserSelectedSeatsAvailable(eventid, locationid, showtimeid, seats)
//BlockUserSelectedSeats()
//BookUserSelectedSeat()
//GetTimeoutForUserSelectedSeats()
//
//RDBMS Tables
//
//Place (To save the hierarchal data for any given theatre like country, state, city and street)
//Theatre
//Screen
//Tier (tier of seats)
//Seats
//Movie
//Offers
//Ticket
//User