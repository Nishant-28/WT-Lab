// Given two strings, one is a subsequence if all of the elements of the first string occur in the same order within the second string. They do not have to be contiguous in the second string, but order must be maintained. For example, given the string 'I like cheese', the words ('I', 'cheese') are one possible subsequence of that string. Words are space delimited.

// Given two strings, s and t, where t is a subsequence of s, report the words of s, missing in t (case sensitive), in the order they are missing.

// Example
// s = 'I like cheese'
// t='like'

// Then 'like' is the subsequence, and ['I', 'cheese'] is the list of missing words, in order.

// Function Description

// Complete the function missing Words in the editor below.

// missingWords has the following parameter(s): string s: a sentence of space-separated words string t: a sentence of space-separated words

// Returns :

// string[i]: an array of strings that contains all words in s that are missing from t, in the order they occur within s


#include <bits/stdc++.h>
using namespace std;

vector<string> split_string(string);

// Complete the missingWords function below.
vector<string> missingWords(string s, string t) {
    vector<string> s1;
    vector<string> t1;
    vector<string> ans;
    string temp;
    for(int i=0;i<s.length();i++){
        if(s[i]==' '){
            s1.push_back(temp);
            temp="";
        }
        else{
            temp+=s[i];
        }
    }
    s1.push_back(temp);
    temp="";
    for(int i=0;i<t.length();i++){
        if(t[i]==' '){
            t1.push_back(temp);
            temp="";
        }
        else{
            temp+=t[i];
        }
    }
    t1.push_back(temp);
    int j=0;
    for(int i=0;i<s1.size();i++){
        if(s1[i]==t1[j]){
            j++;
        }
        else{
            ans.push_back(s1[i]);
        }
    }
    return ans;
}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string s;
    getline(cin, s);

    string t;
    getline(cin, t);

    vector<string> result = missingWords(s, t);

    for (int i = 0; i < result.size(); i++) {
        fout << result[i];

        if (i != result.size() - 1) {
            fout << " ";
        }
    }
    
    fout << " ";
    fout << " ";