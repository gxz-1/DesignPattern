public abstract class Approver {
    String name;
    Approver nextApprover;

    public Approver(String name, Approver nextApprover) {
        this.name = name;
        this.nextApprover = nextApprover;
    }

    abstract void processRequest(PurchaseRequest request);
}

//��ѧ����
class DepartmentApprover extends Approver{

    public DepartmentApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice()<=5000){
            System.out.println( "id=" + request.getId()+"��name="+name+"����\n");
        }else {
            nextApprover.processRequest(request);
        }
    }
}

//Ժ��
class CollegeApprover extends Approver{

    public CollegeApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice()<=10000){
            System.out.println( "id=" + request.getId()+"��name="+name+"����\n");
        }else {
            nextApprover.processRequest(request);
        }
    }
}

//��У��
class ViceSchoolMasterApprover extends Approver{

    public ViceSchoolMasterApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice()<=30000){
            System.out.println( "id=" + request.getId()+"��name="+name+"����\n");
        }else {
            nextApprover.processRequest(request);
        }
    }
}

//У��
class SchoolMasterApprover extends Approver{

    public SchoolMasterApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        System.out.println( "id=" + request.getId()+"��name="+name+"����\n");
    }
}