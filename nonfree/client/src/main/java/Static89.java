import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static89 {

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "[[[Lclient!qa;")
	public static Class188[][][] aClass188ArrayArrayArray3;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public static int anInt1891 = 104;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_24 = new Class183(15, 8);

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	public static int anInt1893 = 0;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
	public static int anInt1894 = 0;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_25 = new Class183(4, -1);

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "[[B")
	public static final byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	public static int anInt1900 = 0;

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public static void method1498() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static159.aBooleanArray15[local7] = false;
		}
		Static328.anInt6051 = Static266.anInt5034;
		Static73.anInt1629 = Static29.anInt444;
		Static123.anInt5935 = -1;
		Static67.anInt1509 = Static237.anInt4684;
		Static264.anInt3855 = Static339.anInt6265;
		Static257.anInt4929 = Static145.anInt5345;
		Static198.anInt4108 = 5;
		Static34.anInt593 = Static27.anInt2842;
		Static120.anInt2645 = 0;
		Static296.anInt5530 = -1;
		Static115.anInt2550 = 0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IZ)V")
	public static void method1499(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub7_Sub2 local12 = Static328.method5290(5, arg0);
		local12.method1197();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIZ)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static45.aClass188ArrayArrayArray5 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 | arg1 << 14 | arg0 << 28);
		@Pc(25) Class2_Sub30 local25 = (Class2_Sub30) Static301.aClass243_24.method5967(local19);
		if (local25 == null) {
			Static383.method5999(arg0, arg2, arg1);
			return;
		}
		@Pc(39) Class2_Sub34 local39 = (Class2_Sub34) local25.aClass238_22.method5795();
		if (local39 == null) {
			Static383.method5999(arg0, arg2, arg1);
			return;
		}
		@Pc(53) Class1_Sub4_Sub1 local53 = (Class1_Sub4_Sub1) Static383.method5999(arg0, arg2, arg1);
		if (local53 == null) {
			local53 = new Class1_Sub4_Sub1();
		} else {
			local53.anInt4405 = local53.anInt4411 = -1;
		}
		local53.anInt4403 = local39.anInt5603;
		local53.anInt4402 = local39.anInt5599;
		label44: while (true) {
			@Pc(81) Class2_Sub34 local81 = (Class2_Sub34) local25.aClass238_22.method5799();
			if (local81 == null) {
				break;
			}
			if (local81.anInt5599 != local53.anInt4402) {
				local53.anInt4406 = local81.anInt5603;
				local53.anInt4405 = local81.anInt5599;
				while (true) {
					@Pc(102) Class2_Sub34 local102 = (Class2_Sub34) local25.aClass238_22.method5799();
					if (local102 == null) {
						break label44;
					}
					if (local53.anInt4402 != local102.anInt5599 && local102.anInt5599 != local53.anInt4405) {
						local53.anInt4412 = local102.anInt5603;
						local53.anInt4411 = local102.anInt5599;
					}
				}
			}
		}
		@Pc(150) int local150 = Static36.method2335((arg1 << 7) + 64, arg0, (arg2 << 7) + 64);
		Static290.method4765(arg0, arg2, arg1, local150, local53);
	}
}
