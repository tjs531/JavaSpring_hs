
public class OracleDAO {

	private static OracleDAO dao = null;
	
	private OracleDAO() {}
	
	public static OracleDAO getInstance() {
		if(dao ==null) {
			dao = new OracleDAO();
		}
		
		return dao;
	}
}
