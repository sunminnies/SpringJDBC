package sunmin.spring.dao;

import java.util.List;

import sunmin.spring.vo.SungJuk;

public interface SungJukDAO {
	void insertSungJuk(SungJuk sj);

	List<SungJuk> selectAllSungJuk();

	SungJuk selectOneSungJuk(int sjno);

	void updateSungJuk(SungJuk sj);

	void deleteSungJuk(int sjno);

}
