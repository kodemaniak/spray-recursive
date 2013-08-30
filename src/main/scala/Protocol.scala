package km

import spray.json._

object RestApiProtocol extends DefaultJsonProtocol {  
  implicit val leafFormat = jsonFormat4(Leaf)
  
//  does work
//  implicit val branchFormat = jsonFormat9(Branch)
  
//  does work
//  implicit val branchFormat: RootJsonFormat[Branch] = jsonFormat9(Branch)
  
//  does NOT work
//  implicit val branchFormat: JsonFormat[Branch] = jsonFormat9(Branch)
  
//  does NOT work
  implicit val branchFormat: JsonFormat[Branch] = lazyFormat(jsonFormat9(Branch))
  
//  does NOT work
//  implicit val branchFormat: RootJsonFormat[Branch] = lazyFormat(jsonFormat9(Branch))
} 
