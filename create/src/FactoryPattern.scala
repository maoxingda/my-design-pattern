object FactoryPattern {

    def main(args: Array[String]): Unit = {
        var shape = ShapeFactory.getShape("circle")
        shape.draw()

        shape = ShapeFactory.getShape("rectangle")
        shape.draw()
    }

    object ShapeFactory {
        def getShape(shape: String): Shape = {
            if ("circle" == shape) {
                return new Circle
            } else if ("rectangle" == shape) {
                return new Rectangle
            }
            null
        }
    }

    trait Shape {
        def draw(): Unit
    }

    class Circle extends Shape {
        override def draw(): Unit = println("Circle")
    }

    class Rectangle extends Shape {
        override def draw(): Unit = println("Rectangle")
    }
}
