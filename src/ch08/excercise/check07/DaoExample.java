package ch08.excercise.check07;

public class DaoExample implements DateAccessObject{
	public static void dbWork(DateAccessObject dao) {
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

class OracleDao implements DateAccessObject {
	@Override
	public void select() {
		System.out.println("DB에서 검색");
	}
	
	@Override
	public void select() {
		System.out.println("DB에서 삽입");
	}
	
	@Override
	public void select() {
		System.out.println("DB에서 수정");
	}
	
	@Override
	public void select() {
		System.out.println("DB에서 삭제");
	}
}

class MySqilDao() {
	dbwork.Oreacle();
}
	

