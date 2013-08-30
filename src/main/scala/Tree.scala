package km

case class Leaf(
    metric: String,
    tags: Map[String, String],
    tsuid: String,
    displayName: String
  )

case class Branch(
    branchId: String,
    branchUrl: String,
    treeId: Int,
    treeUrl: String,
    displayName: String,
    leaves: Seq[Leaf],
    branches: Seq[String],
    path: Map[String, String],
    depth: Int
  )
  