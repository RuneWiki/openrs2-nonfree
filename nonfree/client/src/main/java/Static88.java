import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	public static int anInt2285;

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	public static int anInt2288;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	public static int anInt2290;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "[Lclient!kf;")
	public static Class1_Sub14[] aClass1_Sub14Array1;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "Lclient!id;")
	public static Class34 aClass34_1156 = Static9.method266("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!od", name = "k", descriptor = "Lclient!mc;")
	public static Class48 aClass48_10 = new Class48(512);

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Lclient!qd;")
	public static Class63 aClass63_15 = new Class63(64);

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!id;")
	public static Class34 aClass34_1157 = Static9.method266("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!od", name = "q", descriptor = "Lclient!id;")
	private static Class34 aClass34_1158 = Static9.method266("green:");

	@OriginalMember(owner = "client!od", name = "t", descriptor = "Lclient!id;")
	public static Class34 aClass34_1159 = aClass34_1158;

	@OriginalMember(owner = "client!od", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_1160 = aClass34_1158;

	@OriginalMember(owner = "client!od", name = "v", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BJ)V")
	public static void method1489(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static21.aClass1_Sub19_Sub1_1.method2105(85);
			Static21.aClass1_Sub19_Sub1_1.method2073(arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method1490() {
		Static112.aClass63_21.method1665();
		Static77.aClass63_14.method1665();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method1491() {
		aClass48_10 = null;
		aClass34_1158 = null;
		aClass34_1160 = null;
		aClass34_1156 = null;
		aClass63_15 = null;
		aClass34_1159 = null;
		aClass34_1157 = null;
		aClass1_Sub14Array1 = null;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V")
	public static void method1492() {
		@Pc(5) Class71 local5 = Static122.aClass71_1;
		synchronized (Static122.aClass71_1) {
			Static26.anInt842 = Static116.anInt2803;
			Static39.anInt1143 = Static101.anInt2543;
			Static19.anInt658 = Static17.anInt645;
			Static55.anInt1547 = Static41.anInt1172;
			Static119.anInt2832 = Static76.anInt2060;
			Static118.anInt2830 = Static56.anInt2384;
			Static41.aLong68 = Static116.aLong145;
			Static41.anInt1172 = 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!fd;)I")
	public static int method1493(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg1.anIntArrayArray5 == null || arg0 >= arg1.anIntArrayArray5.length) {
			return -2;
		}
		try {
			@Pc(23) int local23 = 0;
			@Pc(25) int local25 = 0;
			@Pc(27) byte local27 = 0;
			@Pc(32) int[] local32 = arg1.anIntArrayArray5[arg0];
			while (true) {
				@Pc(37) int local37 = local32[local25++];
				@Pc(39) byte local39 = 0;
				@Pc(41) int local41 = 0;
				if (local37 == 0) {
					return local23;
				}
				if (local37 == 15) {
					local39 = 1;
				}
				if (local37 == 16) {
					local39 = 2;
				}
				if (local37 == 1) {
					local41 = Static74.anIntArray229[local32[local25++]];
				}
				if (local37 == 17) {
					local39 = 3;
				}
				if (local37 == 2) {
					local41 = Static36.anIntArray107[local32[local25++]];
				}
				if (local37 == 3) {
					local41 = Static29.anIntArray88[local32[local25++]];
				}
				@Pc(100) int local100;
				@Pc(111) Class1_Sub9 local111;
				@Pc(116) int local116;
				@Pc(129) int local129;
				if (local37 == 4) {
					local100 = local32[local25++] << 16;
					@Pc(107) int local107 = local100 + local32[local25++];
					local111 = Static113.method1814(local107);
					local116 = local32[local25++];
					if (local116 != -1 && (!Static74.method1334(local116).aBoolean107 || Static28.aBoolean177)) {
						for (local129 = 0; local129 < local111.anIntArray108.length; local129++) {
							if (local116 + 1 == local111.anIntArray108[local129]) {
								local41 += local111.anIntArray104[local129];
							}
						}
					}
				}
				if (local37 == 5) {
					local41 = Static39.anIntArray116[local32[local25++]];
				}
				if (local37 == 6) {
					local41 = Class1_Sub1_Sub13.anIntArray343[Static36.anIntArray107[local32[local25++]] - 1];
				}
				if (local37 == 7) {
					local41 = Static39.anIntArray116[local32[local25++]] * 100 / 46875;
				}
				if (local37 == 8) {
					local41 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt253;
				}
				if (local37 == 9) {
					for (local100 = 0; local100 < 25; local100++) {
						if (Static58.aBooleanArray12[local100]) {
							local41 += Static36.anIntArray107[local100];
						}
					}
				}
				if (local37 == 10) {
					local100 = local32[local25++] << 16;
					local100 += local32[local25++];
					local111 = Static113.method1814(local100);
					local116 = local32[local25++];
					if (local116 != -1 && (!Static74.method1334(local116).aBoolean107 || Static28.aBoolean177)) {
						for (local129 = 0; local129 < local111.anIntArray108.length; local129++) {
							if (local116 + 1 == local111.anIntArray108[local129]) {
								local41 = 999999999;
								break;
							}
						}
					}
				}
				if (local37 == 11) {
					local41 = Static112.anInt2683;
				}
				if (local37 == 12) {
					local41 = Static60.anInt1639;
				}
				if (local37 == 13) {
					local100 = Static39.anIntArray116[local32[local25++]];
					@Pc(325) int local325 = local32[local25++];
					local41 = (0x1 << local325 & local100) == 0 ? 0 : 1;
				}
				if (local37 == 14) {
					local100 = local32[local25++];
					local41 = Static67.method1129(local100);
				}
				if (local37 == 18) {
					local41 = Static37.anInt1098 + (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 >> 7);
				}
				if (local37 == 19) {
					local41 = Static121.anInt2871 + (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 >> 7);
				}
				if (local37 == 20) {
					local41 = local32[local25++];
				}
				if (local39 == 0) {
					if (local27 == 0) {
						local23 += local41;
					}
					if (local27 == 1) {
						local23 -= local41;
					}
					if (local27 == 2 && local41 != 0) {
						local23 /= local41;
					}
					if (local27 == 3) {
						local23 *= local41;
					}
					local27 = 0;
				} else {
					local27 = local39;
				}
			}
		} catch (@Pc(430) Exception local430) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public static void method1494() {
		if (!Static1.aBoolean14) {
			return;
		}
		@Pc(11) Class1_Sub9 local11 = Static133.method2109(Static8.anInt436, Static115.anInt2779);
		if (local11 != null && local11.anObjectArray25 != null) {
			@Pc(20) Class1_Sub5 local20 = new Class1_Sub5();
			local20.aClass1_Sub9_3 = local11;
			local20.anObjectArray1 = local11.anObjectArray25;
			Static56.method1567(local20);
		}
		Static1.aBoolean14 = false;
		Static10.method277(local11);
	}
}
