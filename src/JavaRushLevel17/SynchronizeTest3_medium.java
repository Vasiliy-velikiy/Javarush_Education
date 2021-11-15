package JavaRushLevel17;
/*synchronized существенно замедляет программу, поэтому убери избыточность synchronized внутри методов.\
*
* SynchronizeTest3_medium*/

//исходный вариант
/*    char[] value;
    int count;

    public Solution append(CharSequence s) {
        synchronized (Solution.class) {
            if (s == null) {
                synchronized (this) {
                    s = "null";
                }
            }

            if (s instanceof String) {
                synchronized (this) {
                    return this.append((String) s);
                }
            }

            if (s instanceof Solution) {
                synchronized (this) {
                    return this.appendThis((Solution) s);
                }
            }
        }
        return this.append(s);
    }

    public synchronized Solution appendThis(Solution s) {
        //do something here....
        return this;
    }

    private static final java.io.ObjectStreamField[] serialPersistentFields =
            {
                    new java.io.ObjectStreamField("value", char[].class),
                    new java.io.ObjectStreamField("count", Integer.TYPE),
                    new java.io.ObjectStreamField("shared", Boolean.TYPE),
            };

    private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        java.io.ObjectOutputStream.PutField fields = s.putFields();
        synchronized (fields) {
            fields.put("value", value);
            fields.put("count", count);
            fields.put("shared", false);
        }
        synchronized (s) {
            s.writeFields();
        }
    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
        synchronized (new java.io.IOException()) {
            java.io.ObjectInputStream.GetField fields = s.readFields();
            value = (char[]) fields.get("value", null);
            count = fields.get("count", 0);
        }
    }

    public static void main(String[] args) {

    }
}*/
public class SynchronizeTest3_medium {
    char[] value;
    int count;

    public SynchronizeTest3_medium append(CharSequence s) {

            if (s == null) {

                s = "null";



            if (s instanceof String) {
                return this.append((String) s);
            }

            if (s instanceof SynchronizeTest3_medium) {

                return this.appendThis((SynchronizeTest3_medium) s);

            }
        }
        return this.append(s);
    }

    public synchronized SynchronizeTest3_medium appendThis(SynchronizeTest3_medium s) {
        //do something here....
        return this;
    }

    private static final java.io.ObjectStreamField[] serialPersistentFields =
            {
                    new java.io.ObjectStreamField("value", char[].class),
                    new java.io.ObjectStreamField("count", Integer.TYPE),
                    new java.io.ObjectStreamField("shared", Boolean.TYPE),
            };

    private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        java.io.ObjectOutputStream.PutField fields = s.putFields();

            fields.put("value", value);
            fields.put("count", count);
            fields.put("shared", false);


        s.writeFields();

    }

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {

            java.io.ObjectInputStream.GetField fields = s.readFields();
            value = (char[]) fields.get("value", null);
            count = fields.get("count", 0);
        }


    public static void main(String[] args) {

    }
}