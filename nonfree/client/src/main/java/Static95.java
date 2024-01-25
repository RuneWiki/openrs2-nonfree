import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!df", name = "c", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	public static void method2327() {
		for (@Pc(10) Class6_Sub5_Sub11 local10 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6055(); local10 != null; local10 = (Class6_Sub5_Sub11) Static224.aClass231_5.method6050()) {
			if (local10.anInt3423 > 1) {
				local10.anInt3423 = 0;
				Static263.aClass94_24.method2963(((Class6_Sub5_Sub9) local10.aClass231_2.aClass6_Sub5_60.aClass6_Sub5_66).aLong79, local10);
				local10.aClass231_2.method6049();
			}
		}
		Static223.anInt5025 = 0;
		Static611.anInt10324 = 0;
		Static68.aClass163_14.method4970();
		Static565.aClass380_46.method8751();
		Static224.aClass231_5.method6049();
		Static298.method5094(Static569.aClass6_Sub5_Sub9_3);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([Ljava/lang/Object;Z[J)V")
	public static void method2328(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static184.method3437(arg1, 0, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	public static void method2331(@OriginalArg(0) int arg0) {
		Static67.anInt2304 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static623.anInt10485; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static142.anInt3372; local6++) {
				if (Static26.aClass186ArrayArrayArray1[arg0][local3][local6] == null) {
					Static26.aClass186ArrayArrayArray1[arg0][local3][local6] = new Class186(arg0);
				}
			}
		}
	}
}
