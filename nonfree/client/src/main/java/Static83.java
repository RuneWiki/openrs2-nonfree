import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
	public static int anInt2320;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Lclient!oc;")
	public static Class34 aClass34_64;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Lclient!we;")
	public static Class68 aClass68_3;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1303 = Static15.method178("Registrierter Benutzer");

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1305 = Static15.method178("From");

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1304 = aClass23_1305;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1306 = Static15.method178("Invalid username or password)3");

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!hb;")
	public static Class1_Sub5_Sub1 aClass1_Sub5_Sub1_3 = new Class1_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
	public static int anInt2321 = 0;

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1307 = aClass23_1306;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1308 = Static15.method178("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1309 = aClass23_1308;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method1458() {
		aClass23_1305 = null;
		aClass1_Sub5_Sub1_3 = null;
		aClass68_3 = null;
		aClass23_1309 = null;
		aClass34_64 = null;
		aClass23_1306 = null;
		aClass23_1304 = null;
		aClass23_1308 = null;
		aClass23_1303 = null;
		aClass23_1307 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLclient!gd;ZLclient!gd;)V")
	public static void method1459(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) Class23 arg2) {
		if (Static54.aBoolean86) {
			Static54.aBoolean86 = false;
			Static114.method1929();
			Static27.method440();
			Static11.method116();
			Static105.method1784();
			Static68.method221(Static62.anInt1905, Static2.anInt2292, Static112.aClass1_Sub1_Sub6_Sub2_14, Static77.anInt2097);
			Static40.method868(-1, Static90.anIntArray325, Static16.anInt335 == -1, Static106.anInt2723);
			Static97.aBoolean120 = true;
			Static12.aBoolean113 = true;
			Static26.aBoolean54 = true;
		}
		@Pc(45) short local45 = 151;
		Static96.method1113();
		@Pc(48) int local48 = local45 - 3;
		Static112.aClass1_Sub1_Sub6_Sub2_14.method832(arg2, 257, 148, 0);
		Static112.aClass1_Sub1_Sub6_Sub2_14.method832(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local48 += 15;
			if (arg0) {
				@Pc(73) int local73 = Static112.aClass1_Sub1_Sub6_Sub2_14.method850(arg1) + 4;
				Static24.method1578(257 - local73 / 2, 152, local73, 11, 0);
			}
			Static112.aClass1_Sub1_Sub6_Sub2_14.method832(arg1, 257, 163, 0);
			Static112.aClass1_Sub1_Sub6_Sub2_14.method832(arg1, 256, 162, 16777215);
		}
		Static60.method1128();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public static void method1460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) long local11 = (long) ((arg1 << 861079632) + arg0);
		@Pc(19) Class1_Sub1_Sub11 local19 = (Class1_Sub1_Sub11) Static107.aClass14_7.method343(local11);
		if (local19 != null) {
			Static75.aClass38_2.method1206(local19);
		}
	}
}
