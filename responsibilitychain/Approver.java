public abstract class Approver {
    String name;
    Approver nextApprover;

    public Approver(String name, Approver nextApprover) {
        this.name = name;
        this.nextApprover = nextApprover;
    }

    abstract void processRequest(PurchaseRequest request);
}

//教学主任
class DepartmentApprover extends Approver{

    public DepartmentApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice()<=5000){
            System.out.println( "id=" + request.getId()+"由name="+name+"处理。\n");
        }else {
            nextApprover.processRequest(request);
        }
    }
}

//院长
class CollegeApprover extends Approver{

    public CollegeApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice()<=10000){
            System.out.println( "id=" + request.getId()+"由name="+name+"处理。\n");
        }else {
            nextApprover.processRequest(request);
        }
    }
}

//副校长
class ViceSchoolMasterApprover extends Approver{

    public ViceSchoolMasterApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        if(request.getPrice()<=30000){
            System.out.println( "id=" + request.getId()+"由name="+name+"处理。\n");
        }else {
            nextApprover.processRequest(request);
        }
    }
}

//校长
class SchoolMasterApprover extends Approver{

    public SchoolMasterApprover(String name, Approver nextApprover) {
        super(name, nextApprover);
    }

    @Override
    void processRequest(PurchaseRequest request) {
        System.out.println( "id=" + request.getId()+"由name="+name+"处理。\n");
    }
}