package tranning.repetition.hashCod;


//
public class User {

    String name;
    String surname;

    @Override
    public boolean equals(Object obj) {
        if (obj == null || User.class != obj.getClass()) {
            return false;
        }
        User that = (User) obj;
        if (this.name != that.name && this.name != null && !this.name.equals(that.name)) {
            return false;
        }
        if (this.surname != that.surname && this.surname != null && !this.surname.equals(that.surname)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        return result;
    }
}
