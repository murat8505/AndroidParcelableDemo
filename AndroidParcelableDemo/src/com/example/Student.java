package com.example;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable{

	String studName;
	int studId;

	public Student(String studName, int studId) {
		super();
		this.studName = studName;
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		// TODO Auto-generated method stub
		dest.writeString(studName); 
		dest.writeInt(studId); 
	}

	private void readFromParcel(Parcel in) {   
		studName = in.readString();
		studId = in.readInt(); 
	} 

	public Student(Parcel in){
		readFromParcel(in);
	}
	
	public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>() {

		@Override
		public Student createFromParcel(Parcel source) {
			return new Student(source);
		}

		@Override
		public Student[] newArray(int size) {
			return new Student[size];
		}
	};

}
