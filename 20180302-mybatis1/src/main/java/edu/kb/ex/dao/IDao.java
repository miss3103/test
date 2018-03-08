package edu.kb.ex.dao;

import java.util.ArrayList;

import edu.kb.ex.dto.ContentDto;

public interface IDao {

	public ArrayList<ContentDto> listDao();

	public void writeDao(String mWriter, String mContent);

	public void deleteDao(int mId);

}
