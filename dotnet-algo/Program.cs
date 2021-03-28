using static System.Console;

WriteLine("Hello World!");

var a = 2;
if (a is 1 or 2 or 3)
    WriteLine(a-1);

int b = 3;
(a, b) = (b, a);
WriteLine((b, a));

int abc(int b = 2) => b * b;
WriteLine(abc());

User user = new()
{
    firstName = "name"
};
if (user is not null or { firstName: "name" })
    WriteLine($"user.firstName- {user.firstName}");

Person person = new(5, 10);
WriteLine(person is { id: > 0 } ? person.id : -1);
var person1 = person with { id = 11 };
WriteLine(person1);

var (id, code) = person;
WriteLine($"code- {code}, id- {id}");

public class User
{
    public string firstName { get; set; }
}
public record Person(int id, int code);
