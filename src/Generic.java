//Веремеенко Даниил
public class Generic<T,V,K> {

       private T ob;
     private  V ob2;
     private  K ob3;

        public Generic(T ob, V ob2, K ob3) {
            this.ob = ob;
            this.ob2 = ob2;
            this.ob3 = ob3;
        }

        public T getOb() {
            return ob;
        }

        public void setOb(T ob) {
            this.ob = ob;
        }

        public V getOb2() {
            return ob2;
        }

        public void setOb2(V ob2) {
            this.ob2 = ob2;
        }

        public K getOb3() {
            return ob3;
        }

        public void setOb3(K ob3) {
            this.ob3 = ob3;
        }

    @Override
    public String toString() {
        return
                 "1: " + ob + " 2: "+
                 ob2 + " 3: "  + ob3;
    }
}

