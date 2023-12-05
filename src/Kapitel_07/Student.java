package Kapitel_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    // --| Attribute |--
    private String _sName;
    private int _iMNum;
    private LocalDate _oBDate;
    private String _sSProgramm;
    private int _iSemester;
    private static DateTimeFormatter oPattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    // --| Konstruktoren |--
    public Student(){}
    public Student(String sName, int iMNum, LocalDate oBDate, String sProgramm, int iSemester){
        this.setName(sName);
        this.setMNum(iMNum);
        this.setBDate(oBDate);
        this.setProgramm(sProgramm);
        this.setSemester(iSemester);
    }

    // --| Getter |--
    public String getName() {
        return this._sName;
    }
    public int getMNum(){
        return this._iMNum;
    }
    public LocalDate getBDate(){
        return this._oBDate;
    }
    public String getProgramm(){
        return this._sSProgramm;
    }
    public int getSemester(){
        return this._iSemester;
    }

    // --| Setter |--
    public void setName(String sName) {
        this._sName = sName;
    }
    public void setMNum(int iMNum){
        this._iMNum = iMNum;
    }
    public void setBDate(LocalDate oBDate){
        this._oBDate = oBDate;
    }
    public void setProgramm(String sProgramm){
        this._sSProgramm = sProgramm;
    }
    public void setSemester(int iSemester){
        this._iSemester = iSemester;
    }

    // --| Öffentliche Methoden |--
    /**
     * Semester höchzählen, wenn bestanden
     * 
     * @param bPassed
     */
    public void newSem(boolean bPassed){
        this.setSemester((bPassed ? (this.getSemester() + 1) : this.getSemester()));
    }

    /**
     * Studiengang wechseln
     * 
     * @param sProgramm
     */
    public void change(String sProgramm){
        this.setProgramm(sProgramm);
    }

    /**
     * Informationen zum Studenten zurückgeben
     * 
     * @return
     */
    public String getInfo(){
        return "Student: " + this.getName() + 
               "\nMartikelnummer: " + this.getMNum() +
               "\nGeburtstag: " + this.getBDate().format(Student.oPattern) +
               "\nStudiengang: " + this.getProgramm() +
               "\nSemester: " + this.getSemester();
    }
}
