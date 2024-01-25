import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dd", name = "N", descriptor = "[Lclient!gfa;")
	public static Class9_Sub1[] aClass9_Sub1Array1;

	@OriginalMember(owner = "client!dd", name = "T", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_39 = new Class298(78, 3);

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z[IIILclient!us;I)Lclient!dea;")
	public static Class34_Sub2_Sub1 method1844(@OriginalArg(1) int[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class43_Sub3 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean689 || Static159.method2855(arg3) && Static159.method2855(arg1)) {
			return new Class34_Sub2_Sub1(arg2, 3553, arg3, arg1, false, arg0);
		} else if (arg2.aBoolean667) {
			return new Class34_Sub2_Sub1(arg2, 34037, arg3, arg1, false, arg0);
		} else {
			return new Class34_Sub2_Sub1(arg2, arg3, arg1, Static114.method2375(arg3), Static114.method2375(arg1), arg0);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)I")
	public static int method1845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
	public static void method1846() {
		if (Static22.aClass281Array1 == null) {
			Static22.aClass281Array1 = Static447.method6261();
			Static458.aClass281_23 = Static22.aClass281Array1[0];
			Static206.aLong118 = Static587.method7753();
		}
		if (Static268.aClass366_1 == null) {
			Static57.method1111();
		}
		@Pc(31) Class281 local31 = Static458.aClass281_23;
		@Pc(34) int local34 = Static451.method6280();
		if (Static458.aClass281_23 == local31) {
			Static89.aString29 = Static458.aClass281_23.aClass33_65.method797(Static131.anInt2839);
			if (Static458.aClass281_23.aBoolean580) {
				Static188.anInt3659 = (Static458.aClass281_23.anInt7369 - Static458.aClass281_23.anInt7365) * local34 / 100 + Static458.aClass281_23.anInt7365;
			}
			if (Static458.aClass281_23.aBoolean579) {
				Static89.aString29 = Static89.aString29 + Static188.anInt3659 + "%";
			}
		} else if (Static458.aClass281_23 == Static447.aClass281_22) {
			Static268.aClass366_1 = null;
			Static113.method2374(3);
		} else {
			Static89.aString29 = local31.aClass33_66.method797(Static131.anInt2839);
			Static188.anInt3659 = local31.anInt7369;
			if (Static458.aClass281_23.aBoolean579) {
				Static89.aString29 = Static89.aString29 + local31.anInt7369 + "%";
			}
			if (Static458.aClass281_23.aBoolean580 || local31.aBoolean580) {
				Static206.aLong118 = Static587.method7753();
			}
		}
		if (Static268.aClass366_1 == null) {
			return;
		}
		Static268.aClass366_1.method7797(Static458.aClass281_23, Static188.anInt3659, Static89.aString29, Static206.aLong118);
		if (Static105.anInterface13Array4 == null) {
			return;
		}
		for (@Pc(134) int local134 = Static317.anInt5751 + 1; local134 < Static105.anInterface13Array4.length; local134++) {
			if (Static105.anInterface13Array4[local134].method5346() >= 100 && local134 - 1 == Static317.anInt5751 && Static246.anInt4542 >= 1 && Static268.aClass366_1.method7795()) {
				try {
					Static105.anInterface13Array4[local134].method5349();
				} catch (@Pc(166) Exception local166) {
					Static105.anInterface13Array4 = null;
					return;
				}
				Static268.aClass366_1.method7796(Static105.anInterface13Array4[local134]);
				Static317.anInt5751++;
				if (Static317.anInt5751 >= Static105.anInterface13Array4.length - 1 && Static105.anInterface13Array4.length > 1) {
					Static317.anInt5751 = Static437.aClass210_1.method4963() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1848(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		for (@Pc(7) int local7 = arg1.indexOf(arg2); local7 != -1; local7 = arg1.indexOf(arg2, arg0.length() + local7)) {
			arg1 = arg1.substring(0, local7) + arg0 + arg1.substring(arg2.length() + local7);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg0; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg3; local16++) {
				if (Static162.anIntArrayArray26[local12][local16] == arg1 && Static316.anIntArrayArray70[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
