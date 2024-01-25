import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!t;")
	public static Class189 aClass189_3;

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "Lclient!vj;")
	public static Class58 aClass58_11;

	@OriginalMember(owner = "client!fe", name = "n", descriptor = "Z")
	public static boolean aBoolean171;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_74 = new Class198(64);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLclient!vq;)V")
	public static void method2105(@OriginalArg(1) Class47 arg0) {
		if (Static252.anInt5147 != Static12.anInt267 && (Static273.aClass128ArrayArrayArray4 != null && Static316.method5214(arg0, Static12.anInt267))) {
			Static252.anInt5147 = Static12.anInt267;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!tj;ILclient!tj;Lclient!vq;)V")
	public static void method2107(@OriginalArg(0) Class193 arg0, @OriginalArg(2) Class193 arg1, @OriginalArg(3) Class47 arg2) {
		Static139.aClass16_3 = Static48.method959(arg1, Static225.anInt4567);
		Static63.aClass51_1 = arg2.method2693(Static139.aClass16_3, Static362.method3088(arg0, Static225.anInt4567));
		Static330.aClass16_7 = Static48.method959(arg1, Static281.anInt5557);
		Static238.aClass51_6 = arg2.method2693(Static330.aClass16_7, Static362.method3088(arg0, Static281.anInt5557));
		Static348.aClass16_8 = Static48.method959(arg1, Static97.anInt2524);
		Static282.aClass51_4 = arg2.method2693(Static348.aClass16_8, Static362.method3088(arg0, Static97.anInt2524));
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method2108(@OriginalArg(1) int arg0) {
		@Pc(16) String local16 = Integer.toString(arg0);
		for (@Pc(21) int local21 = local16.length() - 3; local21 > 0; local21 -= 3) {
			local16 = local16.substring(0, local21) + "," + local16.substring(local21);
		}
		if (local16.length() > 9) {
			return " <col=00ff80>" + local16.substring(0, local16.length() - 8) + Static271.aClass159_283.method4311(Static180.anInt3835) + " (" + local16 + ")</col>";
		} else if (local16.length() > 6) {
			return " <col=ffffff>" + local16.substring(0, local16.length() - 4) + Static52.aClass159_77.method4311(Static180.anInt3835) + " (" + local16 + ")</col>";
		} else {
			return " <col=ffff00>" + local16 + "</col>";
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method2109(@OriginalArg(1) int arg0) {
		Static60.anInt1574 = arg0;
		Static285.anInt5603 = -1;
		Static285.anInt5603 = -1;
		Static95.method2223();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II[B)I")
	public static int method2110(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static98.method2232(0, arg1, arg0);
	}
}
