import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_40 = new Class119(30, 0);

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Lclient!wu;")
	public static final Class3_Sub45 aClass3_Sub45_1 = new Class3_Sub45(0, -1);

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "Lclient!mq;")
	public static Class156 aClass156_3 = null;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZI)Lclient!br;")
	public static Class29 method1671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class29 local7 = new Class29();
		local7.anInt1062 = -1;
		local7.anInt1050 = arg0 + 6;
		local7.anInt1047 = arg1 + 5 + 1;
		local7.anInt1055 = -1;
		local7.anIntArrayArray8 = new int[local7.anInt1050][local7.anInt1047];
		local7.method751();
		return local7;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIII)V")
	public static void method1672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static108.method1849(Static341.anInt5789, arg2, Static309.anInt5495);
		@Pc(17) int local17 = Static108.method1849(Static341.anInt5789, arg1, Static309.anInt5495);
		@Pc(23) int local23 = Static108.method1849(Static452.anInt7626, arg4, Static82.anInt3956);
		@Pc(29) int local29 = Static108.method1849(Static452.anInt7626, arg3, Static82.anInt3956);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static412.method5293(Static262.anIntArrayArray31[local31], arg0, local23, local29);
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public static void method1674() {
		Static234.method3547();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BILclient!ob;)V")
	public static void method1675(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub2_Sub3 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(14) int local14 = 0;
		if (Static253.anInt4787 < arg1.anInt4339) {
			Static424.method5400(arg1);
		} else if (Static253.anInt4787 > arg1.anInt4398) {
			Static401.method5178(arg1, false);
			local7 = Static112.anInt2457;
			local14 = Static159.anInt3197;
		} else {
			Static158.method2543(arg1);
		}
		if (arg1.anInt4318 < 128 || arg1.anInt4321 < 128 || Static40.anInt1089 * 128 - 128 <= arg1.anInt4318 || arg1.anInt4321 >= (Static44.anInt7276 - 1) * 128) {
			arg1.anInt4349 = -1;
			arg1.anInt4398 = 0;
			arg1.anInt4366 = -1;
			arg1.anInt4345 = -1;
			local7 = -1;
			arg1.anInt4339 = 0;
			local14 = 0;
			arg1.anInt4318 = arg1.anIntArray287[0] * 128 + arg1.method3499() * 64;
			arg1.anInt4321 = arg1.anIntArray288[0] * 128 + arg1.method3499() * 64;
			arg1.method3504();
		}
		if (arg1 == Static379.aClass7_Sub2_Sub3_Sub2_2 && (arg1.anInt4318 < 1536 || arg1.anInt4321 < 1536 || Static40.anInt1089 * 128 - 1536 <= arg1.anInt4318 || arg1.anInt4321 >= Static44.anInt7276 * 128 - 1536)) {
			local7 = -1;
			arg1.anInt4349 = -1;
			arg1.anInt4339 = 0;
			arg1.anInt4366 = -1;
			local14 = 0;
			arg1.anInt4398 = 0;
			arg1.anInt4345 = -1;
			arg1.anInt4318 = arg1.anIntArray287[0] * 128 + arg1.method3499() * 64;
			arg1.anInt4321 = arg1.anIntArray288[0] * 128 + arg1.method3499() * 64;
			arg1.method3504();
		}
		@Pc(203) int local203 = Static325.method4384(arg1);
		Static277.method3923(local7, arg1, local203, local14);
		Static109.method1852(arg1);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZILclient!ng;I)V")
	public static void method1676(@OriginalArg(1) int arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) int arg2) {
		Static77.aClass163ArrayArray1[arg2][arg0] = arg1;
	}
}
