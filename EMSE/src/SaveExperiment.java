public class SaveExperiment {
    private int codeType;
    private int numberOfBlocks;
    private int result;
    private String experimentNo;
    public SaveExperiment(int codeType,int numberOfblocks, int result, String experimentNo){
        this.codeType=codeType;
        this.numberOfBlocks=numberOfblocks;
        this.result=result;
        this.experimentNo=experimentNo;

    }

    public  int getCodeType() {
        return codeType;
    }

    public  int getResult() {
        return result;
    }

    public  void setResult(int result) {
        this.result = result;
    }

    public  void setCodeType(int codeType) {
        this.codeType = codeType;
    }

    public  int getNumberOfBlocks() {
        return numberOfBlocks;
    }

    public  void setNumberOfBlocks(int numberOfBlocks) {
        this.numberOfBlocks = numberOfBlocks;
    }

    public  String getExperimentNo() {
        return experimentNo;
    }

    public  void setExperimentNo(String experimentNo) {
        this.experimentNo = experimentNo;
    }

    //public  String getExperiment() {return experiment;}

    //public  void setExperiment(String experiment) this.experiment = experiment;}
}
