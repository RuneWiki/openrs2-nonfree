import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static98 {

	@OriginalMember(owner = "client!ja", name = "P", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array5;

	@OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
	public static int anInt2144;

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "J")
	public static long aLong80;

	@OriginalMember(owner = "client!ja", name = "gb", descriptor = "Lclient!th;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
	public static int anInt2134 = -1;

	@OriginalMember(owner = "client!ja", name = "Y", descriptor = "Lclient!jd;")
	public static Class61 aClass61_36 = new Class61(260);

	@OriginalMember(owner = "client!ja", name = "db", descriptor = "Lclient!jd;")
	public static Class61 aClass61_37 = new Class61(100);

	@OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
	public static int anInt2145 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
	public static void method1663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg1;
		@Pc(5) int local5 = 0;
		Static162.method2605(Static231.anIntArrayArray44[arg2], arg3 - arg1, arg0, arg1 + arg3);
		@Pc(25) int local25 = -arg1;
		@Pc(27) int local27 = -1;
		while (local3 > local5) {
			local5++;
			local27 += 2;
			local25 += local27;
			if (local25 >= 0) {
				local3--;
				local25 -= local3 << 1;
				@Pc(53) int[] local53 = Static231.anIntArrayArray44[local3 + arg2];
				@Pc(57) int local57 = local5 + arg3;
				@Pc(64) int[] local64 = Static231.anIntArrayArray44[arg2 - local3];
				@Pc(69) int local69 = arg3 - local5;
				Static162.method2605(local53, local69, arg0, local57);
				Static162.method2605(local64, local69, arg0, local57);
			}
			@Pc(85) int local85 = arg3 + local3;
			@Pc(91) int[] local91 = Static231.anIntArrayArray44[local5 + arg2];
			@Pc(98) int[] local98 = Static231.anIntArrayArray44[arg2 - local5];
			@Pc(102) int local102 = arg3 - local3;
			Static162.method2605(local91, local102, arg0, local85);
			Static162.method2605(local98, local102, arg0, local85);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	public static void method1665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class89 local3 = Static54.method1094(arg1);
		@Pc(6) int local6 = local3.anInt3396;
		@Pc(9) int local9 = local3.anInt3397;
		@Pc(12) int local12 = local3.anInt3393;
		@Pc(19) int local19 = Class1_Sub3.anIntArray18[local9 - local12];
		if (arg0 < 0 || arg0 > local19) {
			arg0 = 0;
		}
		local19 <<= local12;
		Static1.method54(arg0 << local12 & local19 | ~local19 & Static203.anIntArray12[local6], local6);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V")
	public static void method1668(@OriginalArg(1) int arg0) {
		if (!Static224.method3669(arg0)) {
			return;
		}
		@Pc(14) Class86[] local14 = Static6.aClass86ArrayArray11[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class86 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt3246 = 0;
				local22.anInt3269 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
	public static void method1669() {
		Static204.aLong99 = 0L;
	}
}
