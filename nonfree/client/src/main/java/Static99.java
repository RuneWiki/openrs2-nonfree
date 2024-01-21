import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static99 {

	@OriginalMember(owner = "client!ra", name = "pc", descriptor = "Lclient!w;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!ra", name = "sc", descriptor = "Lclient!pf;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!ra", name = "cc", descriptor = "[I")
	public static int[] anIntArray308 = new int[128];

	@OriginalMember(owner = "client!ra", name = "dc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1230 = Static59.method1195("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ra", name = "hc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1231 = Static59.method1195("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ra", name = "nc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1232 = Static59.method1195("(Y<)4col>");

	@OriginalMember(owner = "client!ra", name = "oc", descriptor = "[Lclient!qf;")
	public static Class60[] aClass60Array18 = new Class60[100];

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "(I)V")
	public static void method1973() {
		Static84.aClass17_43.method646();
		Static36.aClass17_20.method646();
		Static8.aClass17_7.method646();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qf;ZLclient!qf;I)V")
	public static void method1974(@OriginalArg(0) Class60 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class60 arg2) {
		if (Static33.aBoolean35) {
			Static100.method1983();
			Static33.aBoolean35 = false;
			Static49.method1054();
			Static86.method1066();
			Static53.method1134();
			Static108.method2041();
			Static65.method1351(Static61.anInt1942, Static27.anInt997, Static20.aClass3_Sub1_Sub2_Sub2_2, Static57.anInt3392);
			Static4.method83(-1, Static119.anInt3242 == -1, Static51.anInt1340, Static22.anIntArray87);
			Static3.aBoolean3 = true;
			Static113.aBoolean112 = true;
			Static104.aBoolean104 = true;
		}
		Static53.method1131();
		@Pc(49) short local49 = 148;
		Static20.aClass3_Sub1_Sub2_Sub2_2.method842(arg0, 256, 147, 16777215, 0);
		if (arg2 != null) {
			@Pc(61) int local61 = local49 + 15;
			if (arg1) {
				@Pc(69) int local69 = Static20.aClass3_Sub1_Sub2_Sub2_2.method848(arg2) + 4;
				Static40.method1893(257 - local69 / 2, 152, local69, 11, 0);
			}
			Static20.aClass3_Sub1_Sub2_Sub2_2.method842(arg2, 256, 162, 16777215, 0);
		}
		Static129.method2298();
	}

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "(B)V")
	public static void method1977() {
		aClass56_1 = null;
		anIntArray308 = null;
		aClass60_1232 = null;
		aClass34_2 = null;
		aClass60Array18 = null;
		aClass60_1231 = null;
		aClass60_1230 = null;
	}
}
