import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!et", name = "g", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_120 = new Class92(57, 2);

	@OriginalMember(owner = "client!et", name = "l", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_121 = new Class92(67, 3);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!cu;II)V")
	public static void method4913(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub1_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1.lb && arg0 != -1) {
			@Pc(78) Class131 local78 = Static5.aClass217_1.method5234(arg0);
			@Pc(81) int local81 = local78.anInt3702;
			if (local81 == 1) {
				arg1.anInt6563 = 0;
				arg1.anInt6568 = 1;
				arg1.anInt6551 = 0;
				arg1.anInt6601 = 0;
				arg1.anInt6557 = arg2;
				Static160.method2664(arg1.anInt6563, arg1.anInt7202, false, local78, arg1.anInt7207, arg1.aByte103);
			}
			if (local81 == 2) {
				arg1.anInt6551 = 0;
			}
		} else if (arg0 == -1 || arg1.lb == -1 || Static5.aClass217_1.method5234(arg0).anInt3701 >= Static5.aClass217_1.method5234(arg1.lb).anInt3701) {
			arg1.anInt6568 = 1;
			arg1.lb = arg0;
			arg1.anInt6611 = arg1.anInt6613;
			arg1.anInt6551 = 0;
			arg1.anInt6601 = 0;
			arg1.anInt6557 = arg2;
			arg1.anInt6563 = 0;
			if (arg1.lb != -1) {
				Static160.method2664(arg1.anInt6563, arg1.anInt7202, false, Static5.aClass217_1.method5234(arg1.lb), arg1.anInt7207, arg1.aByte103);
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)Z")
	public static boolean method4914(@OriginalArg(0) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
