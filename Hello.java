class Point{
    int x;
    String y;

    public Point(int x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + ((y == null) ? 0 : y.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (x != other.x)
            return false;
        if (y == null) {
            if (other.y != null)
                return false;
        } else if (!y.equals(other.y))
            return false;
        return true;
    }
}
class Hello{
    public static void main(String[] args) {
        /* Reflexivity */
        Point p1 = new Point(1,"2");
        System.out.println(p1.equals(p1));      //true

        /* Symmetry */
        Point p1 = new Point(1,"2");
        Point p2 = new Point(1,"2");
        System.out.println(p1.equals(p2));      //true
        System.out.println(p2.equals(p1));      //true

        /* Transitivity */
        Point p1 = new Point(1, "2");
        Point p2 = new Point(1, "2");
        Point p3 = new Point(1, "2");
        System.out.println(p1.equals(p2));      //true
        System.out.println(p2.equals(p3));      //true
        System.out.println(p1.equals(p3));      //true

        /* Consistency */
        Point p1 = new Point(1, "2");
        Point p2 = new Point(1, "2");
        System.out.println(p1.equals(p2));      //true
        p1.x = 3;
        System.out.println(p1.equals(p2));      //changing value should return false
        p1.x = 1;
        System.out.println(p1.equals(p2));      //assign back to same value before should return true

        /* Non-nullity */
        Point p1 = new Point(1, "2");
        System.out.println(p1.equals(null));    //false
    }
}