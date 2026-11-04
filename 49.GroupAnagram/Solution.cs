public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        
        if(strs == null || strs.Length == 0)
        {
            return new List<IList<string>>();
        }

        var anagramGroups = new Dictionary<String, List<String>>();

        foreach(var str in strs)
        {
             char[] chars  = str.ToCharArray();
             Array.Sort(chars );
             var sortedKey = new string(chars);

             if(!anagramGroups.ContainsKey(sortedKey))
            {
                anagramGroups[sortedKey] = new List<string>();
            }

             anagramGroups[sortedKey] .Add(str);

        }

        return new List<IList<string>>(anagramGroups.Values);
    }


}