import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	public static int anInt1994;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_21 = new Class181(3, 0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([I[[B[[BI[BBI[I)I")
	public static int method1836(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6) {
		@Pc(14) int local14 = arg0[arg5];
		@Pc(20) int local20 = arg6[arg5] + local14;
		@Pc(24) int local24 = arg0[arg3];
		@Pc(30) int local30 = arg6[arg3] + local24;
		@Pc(32) int local32 = local14;
		if (local24 > local14) {
			local32 = local24;
		}
		@Pc(39) int local39 = local20;
		if (local30 < local20) {
			local39 = local30;
		}
		@Pc(54) int local54 = arg4[arg5] & 0xFF;
		if ((arg4[arg3] & 0xFF) < local54) {
			local54 = arg4[arg3] & 0xFF;
		}
		@Pc(75) byte[] local75 = arg2[arg5];
		@Pc(79) byte[] local79 = arg1[arg3];
		@Pc(84) int local84 = local32 - local14;
		@Pc(89) int local89 = local32 - local24;
		for (@Pc(91) int local91 = local32; local91 < local39; local91++) {
			@Pc(103) int local103 = local79[local89++] + local75[local84++];
			if (local54 > local103) {
				local54 = local103;
			}
		}
		return -local54;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
	public static void method1838() {
		Static206.aClass168_52.anInt5130 = 1;
		Static403.method6315();
		Static450.aBoolean604 = true;
		Static510.aBoolean503 = true;
		Static146.method7207();
		for (@Pc(7264) int local7264 = 0; local7264 < Static83.aClass332Array2.length; local7264++) {
			Static83.aClass332Array2[local7264] = null;
		}
		Static25.aBoolean80 = false;
		Static151.method2919();
		Static47.anInt1291 = (int) (Math.random() * 120.0D) - 60;
		Static416.anInt7786 = (int) (Math.random() * 80.0D) - 40;
		Static146.anInt8629 = (int) (Math.random() * 30.0D) - 20;
		Static379.anInt7108 = (int) (Math.random() * 100.0D) - 50;
		Static433.anInt7916 = (int) (Math.random() * 110.0D) - 55;
		Static412.aFloat175 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Static147.method2693();
		for (@Pc(7333) int local7333 = 0; local7333 < 2048; local7333++) {
			Static239.aClass11_Sub1_Sub1_Sub2Array1[local7333] = null;
		}
		Static208.anInt4409 = 0;
		Static452.anInt8286 = 0;
		Static506.aClass305_36.method7440();
		Static565.aClass211_73.method5179();
		Static409.aClass211_62.method5179();
		Static58.aClass267_2.method6536();
		Static516.aClass305_37.method7440();
		Static532.aClass211_72 = new Class211();
		Static435.aClass234_1.method5835();
		Static299.method4859();
		Static252.anInt5118 = 0;
		Static353.anInt6809 = 0;
		Static169.anInt3872 = 0;
		Static110.anInt2515 = 0;
		Static416.anInt7784 = 0;
		Static49.anInt1348 = 0;
		Static228.anInt4743 = 0;
		Static503.anInt8950 = 0;
		Static367.anInt6943 = 0;
		Static378.anInt7106 = 0;
		for (@Pc(7393) int local7393 = 0; local7393 < Static67.anIntArray106.length; local7393++) {
			if (!Static30.aBooleanArray4[local7393]) {
				Static67.anIntArray106[local7393] = -1;
			}
		}
		if (Static6.anInt302 != -1) {
			Static465.method7168(Static6.anInt302);
		}
		for (@Pc(7423) Class6_Sub48 local7423 = (Class6_Sub48) Static459.aClass305_24.method7445(); local7423 != null; local7423 = (Class6_Sub48) Static459.aClass305_24.method7449()) {
			if (!local7423.method8152()) {
				local7423 = (Class6_Sub48) Static459.aClass305_24.method7445();
				if (local7423 == null) {
					break;
				}
			}
			Static551.method7862(true, false, local7423);
		}
		Static6.anInt302 = -1;
		Static459.aClass305_24 = new Class305(8);
		Static380.method5987();
		Static469.aClass93_15 = null;
		for (@Pc(7463) int local7463 = 0; local7463 < 8; local7463++) {
			Static301.aStringArray31[local7463] = null;
			Static194.aBooleanArray12[local7463] = false;
			Static396.anIntArray529[local7463] = -1;
		}
		Static250.method4403();
		Static474.aBoolean645 = true;
		for (@Pc(7489) int local7489 = 0; local7489 < 100; local7489++) {
			Static429.aBooleanArray27[local7489] = true;
		}
		for (@Pc(7503) int local7503 = 0; local7503 < 6; local7503++) {
			Static572.aClass48Array1[local7503] = new Class48();
		}
		for (@Pc(7517) int local7517 = 0; local7517 < 25; local7517++) {
			Static499.anIntArray785[local7517] = 0;
			Static566.anIntArray824[local7517] = 0;
			Static313.anIntArray767[local7517] = 0;
		}
		Static200.method3771();
		Static399.aBoolean713 = true;
		Static388.aShortArray83 = Static286.aShortArray62 = Static397.aShortArray94 = Static44.aShortArray19 = new short[256];
		Static427.aString115 = Static222.aClass152_71.method4002(Static286.anInt5468);
		Static104.aClass6_Sub6_Sub1_4.aBoolean140 = false;
		Static104.aClass6_Sub6_Sub1_4.aBoolean141 = false;
		Static444.anInt8179 = 0;
		Static480.method7889();
		Static382.method6025();
		Static133.aClass6_Sub47_2 = null;
		Static206.aClass168_52.anInt5130 = 2;
		Static503.aLong217 = 0L;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!rt;B)Ljava/lang/String;")
	public static String method1839(@OriginalArg(0) Class6_Sub42 arg0) {
		return arg0.aString101 == null || arg0.aString101.length() <= 0 ? arg0.aString102 : arg0.aString102 + Static222.aClass152_77.method4002(Static286.anInt5468) + arg0.aString101;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 == arg5) {
			Static259.method4510(arg4, arg2, arg0, arg1, arg5, arg3);
		} else if (arg1 - arg5 >= Static376.anInt7071 && arg1 + arg5 <= Class179_Sub2.lb && Static96.anInt2302 <= arg3 - arg6 && Static289.anInt5545 >= arg6 + arg3) {
			Static120.method2380(arg2, arg4, arg3, arg1, arg0, arg6, arg5);
		} else {
			Static159.method3026(arg1, arg6, arg4, arg5, arg3, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!jo;ILclient!pe;)V")
	public static void method1841(@OriginalArg(0) Class168 arg0, @OriginalArg(2) Class246 arg1) {
		Static475.aClass168_108 = arg0;
		Static206.aClass246_3 = arg1;
		Static256.aString60 = "";
		if (Static389.aString89.startsWith("win")) {
			Static256.aString60 = Static256.aString60 + "windows/";
		} else if (Static389.aString89.startsWith("linux")) {
			Static256.aString60 = Static256.aString60 + "linux/";
		} else if (Static389.aString89.startsWith("mac")) {
			Static256.aString60 = Static256.aString60 + "macos/";
		}
		if (Static206.aClass246_3.aBoolean535) {
			Static256.aString60 = Static256.aString60 + "msjava/";
		} else if (Static389.aString88.startsWith("amd64") || Static389.aString88.startsWith("x86_64")) {
			Static256.aString60 = Static256.aString60 + "x86_64/";
		} else if (Static389.aString88.startsWith("i386") || Static389.aString88.startsWith("i486") || Static389.aString88.startsWith("i586") || Static389.aString88.startsWith("x86")) {
			Static256.aString60 = Static256.aString60 + "x86/";
		} else if (Static389.aString88.startsWith("ppc")) {
			Static256.aString60 = Static256.aString60 + "ppc/";
		} else {
			Static256.aString60 = Static256.aString60 + "universal/";
		}
	}
}
