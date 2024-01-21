import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!q", name = "Nc", descriptor = "[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] aClass4_Sub1_Sub2_Sub2Array14;

	@OriginalMember(owner = "client!q", name = "Vc", descriptor = "[Lclient!fa;")
	public static Class4_Sub8[] aClass4_Sub8Array1;

	@OriginalMember(owner = "client!q", name = "Xc", descriptor = "I")
	public static int anInt2523;

	@OriginalMember(owner = "client!q", name = "Yc", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!q", name = "Kc", descriptor = "Lclient!wd;")
	public static Class82 aClass82_8 = new Class82();

	@OriginalMember(owner = "client!q", name = "Oc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_725 = Static60.method1113("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!q", name = "Pc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_726 = Static60.method1113("Hidden)2");

	@OriginalMember(owner = "client!q", name = "Qc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_727 = Static60.method1113("Benutzen");

	@OriginalMember(owner = "client!q", name = "Rc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_728 = Static60.method1113("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!q", name = "Sc", descriptor = "I")
	public static int anInt2522 = -1;

	@OriginalMember(owner = "client!q", name = "Tc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_729 = Static60.method1113("sl_stars");

	@OriginalMember(owner = "client!q", name = "Uc", descriptor = "Lclient!ec;")
	public static Class22 aClass22_730 = Static60.method1113("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!q", name = "Wc", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array19 = new Class22[100];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ILclient!jd;ILclient!dc;)V")
	public static void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1, @OriginalArg(3) Class17 arg2) {
		@Pc(13) Class4_Sub6 local13 = new Class4_Sub6();
		local13.anInt575 = arg1.method719();
		local13.anInt571 = arg1.method725();
		local13.aClass12Array2 = new Class12[local13.anInt575];
		local13.anIntArray63 = new int[local13.anInt575];
		local13.aByteArrayArrayArray2 = new byte[local13.anInt575][][];
		local13.anIntArray64 = new int[local13.anInt575];
		local13.anIntArray65 = new int[local13.anInt575];
		local13.aClass12Array1 = new Class12[local13.anInt575];
		for (@Pc(59) int local59 = 0; local59 < local13.anInt575; local59++) {
			try {
				@Pc(65) int local65 = arg1.method719();
				@Pc(92) String local92;
				@Pc(101) String local101;
				@Pc(105) int local105;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local92 = new String(arg1.method742().method464());
					local101 = new String(arg1.method742().method464());
					local105 = 0;
					if (local65 == 1) {
						local105 = arg1.method725();
					}
					local13.anIntArray65[local59] = local65;
					local13.anIntArray64[local59] = local105;
					local13.aClass12Array1[local59] = arg2.method381(Static39.method624(local92), local101);
				} else if (local65 == 3 || local65 == 4) {
					local92 = new String(arg1.method742().method464());
					local101 = new String(arg1.method742().method464());
					local105 = arg1.method719();
					@Pc(108) String[] local108 = new String[local105];
					for (@Pc(110) int local110 = 0; local110 < local105; local110++) {
						local108[local110] = new String(arg1.method742().method464());
					}
					@Pc(134) byte[][] local134 = new byte[local105][];
					@Pc(147) int local147;
					if (local65 == 3) {
						for (@Pc(141) int local141 = 0; local141 < local105; local141++) {
							local147 = arg1.method725();
							local134[local141] = new byte[local147];
							arg1.method744(local147, local134[local141]);
						}
					}
					@Pc(171) Class[] local171 = new Class[local105];
					local13.anIntArray65[local59] = local65;
					for (local147 = 0; local147 < local105; local147++) {
						local171[local147] = Static39.method624(local108[local147]);
					}
					local13.aClass12Array2[local59] = arg2.method387(local171, local101, Static39.method624(local92));
					local13.aByteArrayArrayArray2[local59] = local134;
				}
			} catch (@Pc(267) ClassNotFoundException local267) {
				local13.anIntArray63[local59] = -1;
			} catch (@Pc(274) SecurityException local274) {
				local13.anIntArray63[local59] = -2;
			} catch (@Pc(281) NullPointerException local281) {
				local13.anIntArray63[local59] = -3;
			} catch (@Pc(288) Exception local288) {
				local13.anIntArray63[local59] = -4;
			} catch (@Pc(295) Throwable local295) {
				local13.anIntArray63[local59] = -5;
			}
		}
		Static93.aClass82_9.method2028(local13);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
	public static void method1617() {
		@Pc(5) Object local5 = Static76.anObject3;
		synchronized (Static76.anObject3) {
			if (Static123.anInt3084 == 0) {
				Static130.aClass17_4.method383(5, new Class73());
			}
			Static123.anInt3084 = 600;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BLclient!ec;)Z")
	public static boolean method1618(@OriginalArg(1) Class22 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static88.anInt2348; local11++) {
			if (arg0.method480(Static58.aClass22Array14[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V")
	public static void method1619() {
		aClass22_726 = null;
		aClass22_729 = null;
		aClass22_725 = null;
		aClass22Array19 = null;
		aClass4_Sub1_Sub2_Sub2Array14 = null;
		aClass4_Sub8Array1 = null;
		aClass82_8 = null;
		aClass22_730 = null;
		aClass22_727 = null;
		aClass22_728 = null;
		aByteArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZI)Lclient!ec;")
	public static Class22 method1620(@OriginalArg(1) int arg0) {
		return Static48.aClass22Array9[arg0].method449() > 0 ? Static44.method856(new Class22[] { Static90.aClass22Array18[arg0], Static95.aClass22_537, Static48.aClass22Array9[arg0] }) : Static90.aClass22Array18[arg0];
	}
}
