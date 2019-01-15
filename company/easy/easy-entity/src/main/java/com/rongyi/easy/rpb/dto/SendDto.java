package com.rongyi.easy.rpb.dto;

import java.util.List;
import java.util.Set;

public class SendDto extends BaseDto {

	private static final long serialVersionUID = -2747523528086825257L;

	private List<String> fileNameList;

	private String fileName;

	private Set<String> toAddsSet;

	private String[] toCc;

	private String subject;

	public List<String> getFileNameList() {
		return fileNameList;
	}

	public void setFileNameList(List<String> fileNameList) {
		this.fileNameList = fileNameList;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Set<String> getToAddsSet() {
		return toAddsSet;
	}

	public void setToAddsSet(Set<String> toAddsSet) {
		this.toAddsSet = toAddsSet;
	}

	public String[] getToCc() {
		return toCc;
	}

	public void setToCc(String[] toCc) {
		this.toCc = toCc;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
