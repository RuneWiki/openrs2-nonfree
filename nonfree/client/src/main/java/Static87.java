import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
	public static int anInt1944;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!mr;II)V", line = 50)
	public static void method2001(@OriginalArg(0) Class11_Sub5_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg0.anInt4613 > Class83.anInt2345) {
			Static274.method5114(arg0);
		} else if (arg0.anInt4576 < Class83.anInt2345) {
			Static294.method5549(arg0, false);
			local9 = Static16.anInt4746;
			local7 = Static159.anInt3225;
		} else {
			Static254.method4683(arg0);
		}
		if (arg0.anInt6768 < 128 || arg0.anInt6770 < 128 || Class241.anInt7020 * 128 - 128 <= arg0.anInt6768 || arg0.anInt6770 >= (OutputStream_Sub1.anInt4442 - 1) * 128) {
			arg0.anInt4589 = -1;
			arg0.anInt4613 = 0;
			local7 = -1;
			arg0.anInt4576 = 0;
			local9 = 0;
			arg0.anInt4586 = -1;
			arg0.anInt6768 = arg0.anIntArray316[0] * 128 + arg0.method4329() * 64;
			arg0.anInt6770 = arg0.anIntArray317[0] * 128 + arg0.method4329() * 64;
			arg0.method4332();
		}
		if (Static17.aClass11_Sub5_Sub2_Sub1_3 == arg0 && (arg0.anInt6768 < 1536 || arg0.anInt6770 < 1536 || Class241.anInt7020 * 128 - 1536 <= arg0.anInt6768 || arg0.anInt6770 >= (OutputStream_Sub1.anInt4442 - 12) * 128)) {
			arg0.anInt4586 = -1;
			arg0.anInt4589 = -1;
			local9 = 0;
			local7 = -1;
			arg0.anInt4576 = 0;
			arg0.anInt4613 = 0;
			arg0.anInt6768 = arg0.anIntArray316[0] * 128 + arg0.method4329() * 64;
			arg0.anInt6770 = arg0.anIntArray317[0] * 128 + arg0.method4329() * 64;
			arg0.method4332();
		}
		@Pc(209) int local209 = Static67.method6020(arg0);
		Static93.method2162(local209, local9, local7, arg0);
		Static162.method3316(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZCLjava/lang/String;)I", line = 132)
	public static int method2002(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)Lclient!cj;", line = 162)
	public static Class11_Sub3 method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_3;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 170)
	public static void method2004() {
		Static85.method1962(Class73.aClass145_75);
		Class14.aClass2_Sub4_Sub2_4.method4843(Static135.method2694());
		Class14.aClass2_Sub4_Sub2_4.method4844(Static231.anInt4656);
		Class14.aClass2_Sub4_Sub2_4.method4844(Static161.anInt3295);
		Class14.aClass2_Sub4_Sub2_4.method4843(Static203.aClass177_Sub1_2.anInt4875);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V", line = 201)
	public static void method2005() {
		Static262.method4894(Static86.anInt1912);
	}
}
