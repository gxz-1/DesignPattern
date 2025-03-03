public class client {
    public static void main(String[] args) {
        //初始化责任链
        SchoolMasterApprover li = new SchoolMasterApprover("李校长", null);
        ViceSchoolMasterApprover niu = new ViceSchoolMasterApprover("牛副校长", li);
        CollegeApprover wang = new CollegeApprover("王院长", niu);
        DepartmentApprover zhang = new DepartmentApprover("张主任", wang);
        //创建请求
        PurchaseRequest request = new PurchaseRequest(1, 1, 20010);
        zhang.processRequest(request);
    }
}
