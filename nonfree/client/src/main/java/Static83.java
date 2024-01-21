import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_11;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "[Lclient!bg;")
	public static Class2_Sub2_Sub3_Sub2[] aClass2_Sub2_Sub3_Sub2Array4;

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
	public static int anInt2156;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "Lclient!sg;")
	public static Class77 aClass77_853 = Static146.method2172("Standort");

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_854 = Static146.method2172(")3");

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!sg;")
	private static Class77 aClass77_856 = Static146.method2172("as it was used to break our rules)3");

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!sg;")
	public static Class77 aClass77_855 = aClass77_856;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ke;BI)Z")
	public static boolean method1516(@OriginalArg(0) Class43 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) byte[] local13 = arg0.method2211(arg1);
		if (local13 == null) {
			return false;
		} else {
			Static20.method453(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIII)I")
	public static int method1517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg2 /= 2;
		}
		if (arg1 > 192) {
			arg2 /= 2;
		}
		if (arg1 > 217) {
			arg2 /= 2;
		}
		if (arg1 > 243) {
			arg2 /= 2;
		}
		return (arg0 / 4 << 10) + (arg2 / 32 << 7) + arg1 / 2;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!qd;I)V")
	public static void method1518(@OriginalArg(0) int arg0, @OriginalArg(1) Class43_Sub1 arg1) {
		if (Static160.aClass2_Sub18_109 == null) {
			Static93.method1682(0, (byte) 0, true, 255, null, 255);
			Static82.aClass43_Sub1Array1[arg0] = arg1;
		} else {
			Static160.aClass2_Sub18_109.anInt3423 = arg0 * 8 + 5;
			@Pc(23) int local23 = Static160.aClass2_Sub18_109.method2382();
			@Pc(27) int local27 = Static160.aClass2_Sub18_109.method2382();
			arg1.method2235(local27, local23);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1519() {
		aClass77_854 = null;
		aByteArrayArray5 = null;
		aClass43_Sub1_11 = null;
		Class42.anIntArray359 = null;
		aClass77_853 = null;
		aClass77_855 = null;
		aClass77_856 = null;
		aClass2_Sub2_Sub3_Sub2Array4 = null;
	}
}
