
string[] strs = ["eat","tea","tan","ate","nat","bat"];

var result = new Solution().GroupAnagrams(strs);

foreach(var dataList in result)
{
    Console.WriteLine("Group start ");
    foreach(var data in dataList)
{
    Console.WriteLine(data);
}

Console.WriteLine("Group end");
    
}

Console.WriteLine("Hello, World!");
