public class client {
    public static void main(String[] args) {
        //��ʼ��������
        SchoolMasterApprover li = new SchoolMasterApprover("��У��", null);
        ViceSchoolMasterApprover niu = new ViceSchoolMasterApprover("ţ��У��", li);
        CollegeApprover wang = new CollegeApprover("��Ժ��", niu);
        DepartmentApprover zhang = new DepartmentApprover("������", wang);
        //��������
        PurchaseRequest request = new PurchaseRequest(1, 1, 20010);
        zhang.processRequest(request);
    }
}
