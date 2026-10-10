import java.util.HashMap;
public class hashmap {
    public static void main(String[] args)
    {
HashMap<String,Double> foods=new HashMap<> ();
foods.put("Mutton",1000.0);
foods.put("fish",500.0);
foods.put("crabs",700.0);
foods.put("Prawn",1000.0);
//foods.put("fish",2000.0); this overwrites previous keyvalue pair
//System.out.println(foods);
//System.out.println(foods.get("fish")); if we get value (500.0) the output is null and even the key name is wrong will get null
//keys must be unique and values can be  duplicates
//foods.remove("Prawn");
//System.out.println(foods.containsKey("Fish"));can also contains.Value
//System.out.println(foods.size());
for(String key:foods.keySet())
{
    System.out.print(key +" ");

}
System.out.println();
for(Double value:foods.values())
{
    System.out.print(value+ " ");

}
System.out.println();
for(var all:foods.entrySet())
{
    System.out.print(all+ "  & ");

}
    }
}
