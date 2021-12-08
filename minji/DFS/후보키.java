import java.util.*;
class 후보키 {
    public static int N;
    public static boolean [] visit;
    public static ArrayList<String> list;
    public static ArrayList<List<String>> result;
    public int solution(String[][] relation) {
        int answer = 0;
        visit = new boolean[relation[0].length];
        list = new ArrayList<>();
        result = new ArrayList<>();
        N = relation[0].length;
        for(int i = 1; i <= relation[0].length; i++) {
            dfs(visit, 0, i, "");
        }
        for(int i = 0; i < list.size(); i++){
            HashSet<String> set = new HashSet<>();
            String token[] = list.get(i).split("");
            for(int k = 0; k < relation.length; k++) {
                String temp = "";
                for(int j = 0; j < token.length; j++) {
                    temp = temp + relation[k][Integer.parseInt(token[j])];
                }
                set.add(temp);
            }
            if(set.size() == relation.length) {
                List<String> temp = Arrays.asList(list.get(i).split("")); 
				boolean flag = true;
				for(int j = 0; j < result.size(); j++) {
					if(temp.containsAll(result.get(j))) { 
						flag = false;
						break;
					}
				}
				if(flag) { 
					result.add(temp);
				}
			}
		
         }
        return result.size();
    }
    public static void dfs(boolean[] visit, int idx, int r, String token) {
        if(r == 0) {
            // System.out.println(token);
            list.add(token);
            return;
        }
        for(int i = idx; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                dfs(visit, i, r-1, token+ String.valueOf(i));
                visit[i] = false;
            }
        }
    }
}