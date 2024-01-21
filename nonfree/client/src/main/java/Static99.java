import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!qe", name = "Ab", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!qe", name = "Ob", descriptor = "Z")
	public static boolean aBoolean197;

	@OriginalMember(owner = "client!qe", name = "Ub", descriptor = "Lclient!de;")
	public static Class1_Sub1_Sub4_Sub1 aClass1_Sub1_Sub4_Sub1_45;

	@OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lclient!qc;")
	public static Class1_Sub18 aClass1_Sub18_3 = new Class1_Sub18(8);

	@OriginalMember(owner = "client!qe", name = "Lb", descriptor = "I")
	public static int anInt2441 = 10;

	@OriginalMember(owner = "client!qe", name = "Pb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1203 = Static108.method1915("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!qe", name = "Mb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1202 = aClass39_1203;

	@OriginalMember(owner = "client!qe", name = "Qb", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!qe", name = "Rb", descriptor = "[I")
	public static int[] anIntArray378 = new int[1000];

	@OriginalMember(owner = "client!qe", name = "Sb", descriptor = "I")
	public static int anInt2443 = 0;

	@OriginalMember(owner = "client!qe", name = "Vb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1204 = Static108.method1915("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!qc;B)Lclient!kd;")
	public static Class39 method1757(@OriginalArg(0) Class1_Sub18 arg0) {
		return Static87.method1426(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)Lclient!fe;")
	public static Class1_Sub1_Sub8 method1764(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub1_Sub8 local6 = (Class1_Sub1_Sub8) Static14.aClass33_7.method1038((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static47.aClass62_12.method2008(arg0, 14);
		local6 = new Class1_Sub1_Sub8();
		if (local20 != null) {
			local6.method670(new Class1_Sub18(local20));
		}
		Static14.aClass33_7.method1042(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(BI)V")
	public static void method1766(@OriginalArg(1) int arg0) {
		if (!Static71.method1248(arg0)) {
			return;
		}
		@Pc(14) Class1_Sub1_Sub1[] local14 = Static102.aClass1_Sub1_Sub1ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(27) Class1_Sub1_Sub1 local27 = local14[local16];
			if (local27 != null) {
				local27.anInt98 = 0;
				local27.anInt86 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)V")
	public static void method1767() {
		aByteArrayArrayArray7 = null;
		aClass39_1204 = null;
		aClass39_1203 = null;
		aClass1_Sub18_3 = null;
		aClass39_1202 = null;
		aClass1_Sub1_Sub4_Sub1_45 = null;
		anIntArray378 = null;
	}
}
