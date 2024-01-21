import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array57;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_11;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Lclient!i;")
	public static Class1_Sub1_Sub2_Sub3 aClass1_Sub1_Sub2_Sub3_4;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1329 = Static106.method1849("Click to switch");

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1325 = aClass66_1329;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1326 = Static106.method1849("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1327 = Static106.method1849("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!rb;")
	public static Class60 aClass60_74 = new Class60(64);

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1328 = Static106.method1849("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1330 = aClass66_1328;

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1331 = Static106.method1849("Players");

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1332 = aClass66_1331;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1701() {
		aClass1_Sub1_Sub2_Sub1Array57 = null;
		aClass66_1329 = null;
		aClass66_1330 = null;
		aClass66_1328 = null;
		aClass66_1325 = null;
		aClass66_1327 = null;
		aClass60_74 = null;
		aFrame1 = null;
		aClass66_1326 = null;
		aClass66_1332 = null;
		aClass66_1331 = null;
		aClass1_Sub1_Sub2_Sub3_3 = null;
		anIntArray402 = null;
		aClass1_Sub1_Sub2_Sub3_4 = null;
		aClass1_Sub10_11 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method1702(@OriginalArg(0) Class1_Sub1_Sub1_Sub5 arg0) {
		@Pc(9) int local9 = arg0.anInt1239 - Static22.anInt636;
		arg0.anInt1277 = 0;
		@Pc(23) int local23 = arg0.anInt1258 * 128 + arg0.anInt1248 * 64;
		if (arg0.anInt1272 == 0) {
			arg0.anInt1269 = 1024;
		}
		if (arg0.anInt1272 == 1) {
			arg0.anInt1269 = 1536;
		}
		if (arg0.anInt1272 == 2) {
			arg0.anInt1269 = 0;
		}
		if (arg0.anInt1272 == 3) {
			arg0.anInt1269 = 512;
		}
		arg0.anInt1261 += (local23 - arg0.anInt1261) / local9;
		@Pc(78) int local78 = arg0.anInt1248 * 64 + arg0.anInt1256 * 128;
		arg0.anInt1271 += (local78 - arg0.anInt1271) / local9;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(ZI)Z")
	public static boolean method1706(@OriginalArg(1) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}
}
