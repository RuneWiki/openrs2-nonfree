import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static91 {

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "Lclient!od;")
	public static Class3_Sub1_Sub4_Sub2_Sub1 aClass3_Sub1_Sub4_Sub2_Sub1_3;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "[I")
	public static int[] anIntArray301;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
	public static int anInt2510;

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "Lclient!d;")
	public static Class3_Sub1_Sub5_Sub1_Sub1 aClass3_Sub1_Sub5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Lclient!he;")
	public static Class26 aClass26_1331 = Static6.method100("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "Lclient!he;")
	public static Class26 aClass26_1332 = Static6.method100("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "Lclient!he;")
	public static Class26 aClass26_1333 = Static6.method100("Fertigkeit)2");

	@OriginalMember(owner = "client!pd", name = "N", descriptor = "[I")
	public static int[] anIntArray302 = new int[5];

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "Lclient!nc;")
	public static Class3_Sub14 aClass3_Sub14_13 = null;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)Lclient!he;")
	public static Class26 method1672(@OriginalArg(0) int arg0) {
		return Static29.aClass26Array7[arg0].method839() > 0 ? Static119.method2136(new Class26[] { Static56.aClass26Array13[arg0], Static74.aClass26_1059, Static29.aClass26Array7[arg0] }) : Static56.aClass26Array13[arg0];
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method1673() {
		aClass3_Sub1_Sub4_Sub2_Sub1_3 = null;
		anIntArray302 = null;
		aClass26_1332 = null;
		aClass26_1331 = null;
		aClass3_Sub14_13 = null;
		anIntArray301 = null;
		aClass3_Sub1_Sub5_Sub1_Sub1_1 = null;
		aClass26_1333 = null;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBI)I")
	public static int method1674(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
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
			arg1 = arg1 * (arg0 & 0x7F) / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)I")
	public static int method1675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static74.aByteArrayArrayArray5[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static74.aByteArrayArrayArray5[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
