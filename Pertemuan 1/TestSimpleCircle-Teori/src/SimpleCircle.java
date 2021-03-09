public class SimpleCircle {
        double radius=1;

        SimpleCircle(){
        }

        SimpleCircle(double newRadius){
            radius = newRadius;
        }

        double getArea(){
            return radius * radius * Math.PI;
        }

        double setRadius(double newRadius){
            radius = newRadius;
            return 0;
        }
}
