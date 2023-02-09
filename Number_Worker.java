// Class made as a helper to fix the issue with json.simple (conversion numbers like 64.2, 96.4 to type double but 68 to type long)
public class Number_Worker {
    public double changeToDouble(Object obj)
    {
        double result=0;
        if (obj instanceof Long)
        {
            Long temp = (Long)obj;
            result = temp.doubleValue();
        }
        else result = (double)obj;
        return result;
    }
}
