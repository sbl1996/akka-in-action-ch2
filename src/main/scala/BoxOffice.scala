object BoxOffice {
  // POST /events/:name { "tickets": :tickets }
  case class CreateEvent(name: String, tickets: Int)
  // GET  /events/:name
  case class GetEvent(name: String)
  // GET  /events 
  case object GetEvents
  // POST /events/:event/tickets { "tickets": :tickets }
  case class GetTickets(event: String, tickets: Int)
  // DELETE /events/:name
  case class CancelEvent(name: String)

  case class Event(name: String, tickets: Int)
  case class Events(events: Vector[Event])
}