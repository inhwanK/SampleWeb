package egovframework.sample.service.impl;

import egovframework.sample.service.SampleService;

public class SampleServiceImple implements SampleService {
	private SampleDAO sampleDAO;
	private String version;
	
	
	public SampleServiceImple() throws Exception{
		System.out.println("===> SampleServiceImple 생성자1");
		//sampleDAO = new SampleDAOJDBC();
	}
	
	public SampleServiceImple(SampleDAO sampleDAO) {
		super();
		System.out.println("===> SampleServiceImple 생성자2");
		this.sampleDAO = sampleDAO;
	}
	

	public SampleServiceImple(SampleDAO sampleDAO, String version) {
		super();
		this.sampleDAO = sampleDAO;
		this.version = version;
	}

	@Override
	public void insertSample() throws Exception{
		System.out.println("SampleService-Sample 등록");
		sampleDAO.insertSample();
	}

	@Override
	public void deleteSample() throws Exception{
		System.out.println("SampleService-Sample 삭제");
		sampleDAO.deleteSample();
	}
	@Override
	public void selectSample() throws Exception{
		System.out.println("SampleService-Sample 조회");
		sampleDAO.selectSample();
	}
	@Override
	public void selectSampleList() throws Exception{
		System.out.println("SampleService-Sample 목록");
		sampleDAO.selectSampleList();
	}
}
