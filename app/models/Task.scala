package models

case class Task(number: Int, id: Long, name: String, description: String, creationDate: String, expirationDate: String,
                status: Int, executor: String, assigner: String)

object Task {

  def taskList(): List[Task] = Nil

  def createTask(id: Long, name: String, description: String, creationDate: String, expirationDate: String,
                 executor: String, assigner: String) {}

  def deleteTask(id: Long) {}

  def completeTask(id: Long) {}

  def editTask(id: Long) {}

  def showTask(id: Long) {}

}