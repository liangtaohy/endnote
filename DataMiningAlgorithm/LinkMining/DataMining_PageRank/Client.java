package DataMining_PageRank;

/**
 * PageRank������ҳ��Ҫ��/�����㷨
 * @author lyq
 *
 */
public class Client {
	public static void main(String[] args){
		String filePath = "C:\\Users\\lyq\\Desktop\\icon\\input.txt";
		
		PageRankTool tool = new PageRankTool(filePath);
		tool.printPageRankValue();
	}
}
