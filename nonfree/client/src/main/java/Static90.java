import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static90 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!oa;")
	public static Class7 aClass7_90;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	public static int anInt2998;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 aClass5_Sub1_Sub10_Sub3_57;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
	public static int anInt3004;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1421 = Static38.method736("compass");

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1422 = Static38.method736("@or1@");

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1423 = Static38.method736("(U2");

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1424 = Static38.method736("sch-Utteln:");

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public static int anInt3001 = 0;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1425 = Static38.method736("blinken3:");

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public static int anInt3005 = 0;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method2001() {
		aClass5_Sub1_Sub10_Sub3_57 = null;
		aClass71_1424 = null;
		aClass71_1425 = null;
		aClass71_1421 = null;
		aClass71_1422 = null;
		aClass7_90 = null;
		aClass71_1423 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)Z")
	public static boolean method2003(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B[BZI)V")
	public static void method2005(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static119.aClass11_1 == null) {
			return;
		}
		if (Static118.anInt2916 >= 0) {
			Static119.aClass11_1.method1277();
			Static40.anInt717 = 20;
			Static118.anInt2916 = -1;
			Static9.anInt293 = 0;
			Static9.aByteArray1 = null;
		}
		if (arg0 == null) {
			return;
		}
		if (Static40.anInt717 > 0) {
			Static119.aClass11_1.method1271(arg2);
			Static40.anInt717 = 0;
		}
		Static118.anInt2916 = arg2;
		Static119.aClass11_1.method1272(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
	public static int method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
