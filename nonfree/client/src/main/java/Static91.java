import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!s", name = "J", descriptor = "Lclient!fb;")
	public static Class20 aClass20_42;

	@OriginalMember(owner = "client!s", name = "N", descriptor = "I")
	public static int anInt2517;

	@OriginalMember(owner = "client!s", name = "X", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!s", name = "F", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1184 = Static87.method1648("Login server offline)3");

	@OriginalMember(owner = "client!s", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1178 = aClass27_1184;

	@OriginalMember(owner = "client!s", name = "z", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1179 = Static87.method1648("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!s", name = "A", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1180 = Static87.method1648("(U4");

	@OriginalMember(owner = "client!s", name = "B", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1181 = Static87.method1648("Enter amount:");

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1182 = aClass27_1181;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1183 = Static87.method1648("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!s", name = "G", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1185 = Static87.method1648("null");

	@OriginalMember(owner = "client!s", name = "H", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1186 = Static87.method1648("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!s", name = "U", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1190 = Static87.method1648("Loading config )2 ");

	@OriginalMember(owner = "client!s", name = "K", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1187 = aClass27_1190;

	@OriginalMember(owner = "client!s", name = "O", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1188 = Static87.method1648("blaugr-Un:");

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1189 = aClass27_1183;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "I")
	public static int anInt2518 = 0;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	public static volatile int anInt2519 = 0;

	@OriginalMember(owner = "client!s", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1191 = aClass27_1179;

	@OriginalMember(owner = "client!s", name = "ab", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1194 = Static87.method1648("Unexpected server response");

	@OriginalMember(owner = "client!s", name = "Y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1192 = aClass27_1194;

	@OriginalMember(owner = "client!s", name = "Z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1193 = Static87.method1648("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!s", name = "bb", descriptor = "[I")
	public static int[] anIntArray372 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZ)I")
	public static int method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) long local18 = (long) (arg0 + (arg1 << 16));
		return Static2.aClass3_Sub3_Sub16_1 != null && Static2.aClass3_Sub3_Sub16_1.aLong83 == local18 ? Static84.aClass3_Sub11_5.anInt2060 * 99 / (Static84.aClass3_Sub11_5.aByteArray17.length - Static2.aClass3_Sub3_Sub16_1.aByte3) + 1 : 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Lclient!hb;")
	public static Class27 method1731(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static97.method1616(arg0);
		} else if (arg0 < 10000000) {
			return Static98.method1779(new Class27[] { Static97.method1616(arg0 / 1000), Static87.aClass27_1112 });
		} else {
			return Static98.method1779(new Class27[] { Static97.method1616(arg0 / 1000000), Static79.aClass27_405 });
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)I")
	public static int method1732(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
	public static void method1733() {
		aClass27_1193 = null;
		aClass27_1178 = null;
		aClass27_1192 = null;
		aClass27_1184 = null;
		aClass27_1186 = null;
		aClass27_1188 = null;
		aClass27_1183 = null;
		aClass27_1179 = null;
		anIntArray372 = null;
		aClass27_1180 = null;
		aClass27_1182 = null;
		aClass27_1185 = null;
		aClass20_42 = null;
		aClass27_1190 = null;
		aClass27_1191 = null;
		aClass27_1181 = null;
		aClass27_1187 = null;
		aClass27_1189 = null;
		anIntArray371 = null;
		aClass27_1194 = null;
	}
}
