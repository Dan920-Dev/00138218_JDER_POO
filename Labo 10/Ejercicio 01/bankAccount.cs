namespace Ejercicio_01
{
    public class bankAccount
    {
        public readonly string _name;
        public readonly double _currentBalance;

        public bankAccount(string name = "unname", double currentBalance = 0)
        {
            _name = name;
            _currentBalance = currentBalance;
        }
    }
}