package DataMining_TAN;

/**
 * ����֮��Ļ���Ϣֵ����ʾ����֮��Ĺ����Դ�С
 * @author lyq
 *
 */
public class AttrMutualInfo implements Comparable<AttrMutualInfo>{
	//����Ϣֵ
	Double value;
	//��������ֵ��
	Node[] nodeArray;
	
	public AttrMutualInfo(double value, Node node1, Node node2){
		this.value = value;
		
		this.nodeArray = new Node[2];
		this.nodeArray[0] = node1;
		this.nodeArray[1] = node2;
	}

	@Override
	public int compareTo(AttrMutualInfo o) {
		// TODO Auto-generated method stub
		return o.value.compareTo(this.value);
	}
	
}
