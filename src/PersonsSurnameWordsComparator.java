import java.util.Comparator;

public class PersonsSurnameWordsComparator implements Comparator<Person> {

    protected int maxSurnameWords;

    public PersonsSurnameWordsComparator(int maxSurnameWords) {
        this.maxSurnameWords = maxSurnameWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int result;
        if (o1.countSurnameWords() > this.maxSurnameWords && o2.countSurnameWords() > this.maxSurnameWords) {
            result = 0;
        } else {
            result = Integer.compare(o1.countSurnameWords(), o2.countSurnameWords());
        }

        result = (result == 0) ? Integer.compare(o1.getAge(), o2.getAge()) : result;
        return result;
    }
}
