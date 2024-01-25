import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "Lclient!fa;")
	public static Interface9 anInterface9_1;

	@OriginalMember(owner = "client!af", name = "c", descriptor = "I")
	public static int anInt273;

	@OriginalMember(owner = "client!af", name = "g", descriptor = "I")
	public static int anInt277;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString2 = null;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIILclient!cu;Lclient!cu;)V")
	public static void method234(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub1_Sub3 arg3, @OriginalArg(4) Class11_Sub1_Sub3 arg4) {
		@Pc(4) Class360 local4 = Static570.method7679(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass11_Sub1_Sub3_1 = arg3;
		local4.aClass11_Sub1_Sub3_2 = arg4;
		@Pc(19) int local19 = Static310.aClass129Array5 == Static150.aClass129Array4 ? 1 : 0;
		if (!arg3.method7209()) {
			Static176.aClass11_Sub1ArrayArray1[local19][Static275.anIntArray276[local19]++] = arg3;
		} else if (arg3.method7217()) {
			Static267.aClass11_Sub1ArrayArray2[local19][Static512.anIntArray540[local19]++] = arg3;
		} else {
			Static319.aClass11_Sub1ArrayArray3[local19][Static420.anIntArray440[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7209()) {
			if (arg4.method7217()) {
				Static267.aClass11_Sub1ArrayArray2[local19][Static512.anIntArray540[local19]++] = arg4;
				return;
			}
			Static319.aClass11_Sub1ArrayArray3[local19][Static420.anIntArray440[local19]++] = arg4;
			return;
		}
		Static176.aClass11_Sub1ArrayArray1[local19][Static275.anIntArray276[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!jba;I)Lclient!jba;")
	public static Class1_Sub6_Sub2 method235(@OriginalArg(0) Class1_Sub6_Sub2 arg0) {
		@Pc(19) Class1_Sub6_Sub2 local19 = arg0 == null ? new Class1_Sub6_Sub2() : new Class1_Sub6_Sub2(arg0);
		local19.method3505();
		return local19;
	}
}
