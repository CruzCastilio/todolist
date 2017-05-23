package controllers

import javax.inject._

import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
    * Create an Action to render an HTML page with a mainpage message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    Ok(views.html.index())
  }

  def taskList = Action {
    Ok(views.html.tasklist())
  }

  /*def showTask(id: Long) = Action {
    Task.findById(id).map { task =>
      Ok(views.html.Task.display(task))
    }.getOrElse(NotFound)
  }*/

  def editTask = TODO

  def addTask = TODO

  def deleteTask = TODO

  def completeTask = TODO
}
