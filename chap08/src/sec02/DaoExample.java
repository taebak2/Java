package sec02;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) { // DataaAccessObject interface에 접근 dao라고 명명
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
}
