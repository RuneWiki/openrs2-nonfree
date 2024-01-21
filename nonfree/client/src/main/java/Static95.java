import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!t", name = "ub", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_25;

	@OriginalMember(owner = "client!t", name = "vb", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!t", name = "yb", descriptor = "Lclient!bd;")
	public static Class8 aClass8_24;

	@OriginalMember(owner = "client!t", name = "sb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2518 = Static94.method1596("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!t", name = "Lb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2524 = Static94.method1596("Examine");

	@OriginalMember(owner = "client!t", name = "tb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2519 = aClass1_2524;

	@OriginalMember(owner = "client!t", name = "wb", descriptor = "[I")
	public static int[] anIntArray297 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!t", name = "xb", descriptor = "I")
	public static int anInt2395 = 0;

	@OriginalMember(owner = "client!t", name = "zb", descriptor = "I")
	public static int anInt2396 = 0;

	@OriginalMember(owner = "client!t", name = "Ab", descriptor = "Lclient!a;")
	public static Class1 aClass1_2520 = Static94.method1596(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!t", name = "Bb", descriptor = "I")
	public static int anInt2397 = 0;

	@OriginalMember(owner = "client!t", name = "Db", descriptor = "Z")
	public static boolean aBoolean142 = false;

	@OriginalMember(owner = "client!t", name = "Jb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2523 = Static94.method1596("Friends");

	@OriginalMember(owner = "client!t", name = "Fb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2521 = aClass1_2523;

	@OriginalMember(owner = "client!t", name = "Gb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2522 = Static94.method1596("sideicons");

	@OriginalMember(owner = "client!t", name = "Hb", descriptor = "[I")
	public static int[] anIntArray298 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!t", name = "Kb", descriptor = "I")
	public static int anInt2401 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!t", name = "Mb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2525 = Static94.method1596("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public static void method1610() {
		aClass1_2524 = null;
		aClass2_Sub1_Sub2_Sub2_25 = null;
		aClass1_2523 = null;
		aClass2_Sub1_Sub2_Sub2Array9 = null;
		anIntArray297 = null;
		aClass1_2522 = null;
		aClass1_2518 = null;
		aClass8_24 = null;
		anIntArray298 = null;
		aClass1_2525 = null;
		aClass1_2521 = null;
		aClass1_2520 = null;
		aClass1_2519 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BI)Z")
	public static boolean method1611(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZLclient!nb;)V")
	public static void method1612(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		arg0.aBoolean158 = false;
		@Pc(18) Class2_Sub1_Sub9 local18;
		if (arg0.anInt2708 != -1) {
			local18 = Static4.method192(arg0.anInt2708);
			if (local18 == null || local18.anIntArray147 == null) {
				arg0.anInt2708 = -1;
			} else {
				arg0.anInt2742++;
				if (arg0.anInt2739 < local18.anIntArray147.length && local18.anIntArray144[arg0.anInt2739] < arg0.anInt2742) {
					arg0.anInt2739++;
					arg0.anInt2742 = 1;
				}
				if (local18.anIntArray147.length <= arg0.anInt2739) {
					arg0.anInt2739 = 0;
					arg0.anInt2742 = 0;
				}
			}
		}
		if (arg0.anInt2718 != -1 && arg0.anInt2719 <= Static69.anInt2806) {
			if (arg0.anInt2758 < 0) {
				arg0.anInt2758 = 0;
			}
			@Pc(104) int local104 = Static65.method1339(arg0.anInt2718).anInt1013;
			if (local104 == -1) {
				arg0.anInt2718 = -1;
			} else {
				@Pc(116) Class2_Sub1_Sub9 local116 = Static4.method192(local104);
				if (local116 == null || local116.anIntArray147 == null) {
					arg0.anInt2718 = -1;
				} else {
					arg0.anInt2750++;
					if (local116.anIntArray147.length > arg0.anInt2758 && arg0.anInt2750 > local116.anIntArray144[arg0.anInt2758]) {
						arg0.anInt2750 = 1;
						arg0.anInt2758++;
					}
					if (local116.anIntArray147.length <= arg0.anInt2758 && (arg0.anInt2758 < 0 || local116.anIntArray147.length <= arg0.anInt2758)) {
						arg0.anInt2718 = -1;
					}
				}
			}
		}
		if (arg0.anInt2759 != -1 && arg0.anInt2744 <= 1) {
			local18 = Static4.method192(arg0.anInt2759);
			if (local18.anInt1430 == 1 && arg0.anInt2720 > 0 && arg0.anInt2736 <= Static69.anInt2806 && arg0.anInt2732 < Static69.anInt2806) {
				arg0.anInt2744 = 1;
				return;
			}
		}
		if (arg0.anInt2759 != -1 && arg0.anInt2744 == 0) {
			local18 = Static4.method192(arg0.anInt2759);
			if (local18 == null || local18.anIntArray147 == null) {
				arg0.anInt2759 = -1;
			} else {
				arg0.anInt2738++;
				if (local18.anIntArray147.length > arg0.anInt2730 && local18.anIntArray144[arg0.anInt2730] < arg0.anInt2738) {
					arg0.anInt2730++;
					arg0.anInt2738 = 1;
				}
				if (local18.anIntArray147.length <= arg0.anInt2730) {
					arg0.anInt2730 -= local18.anInt1444;
					arg0.anInt2721++;
					if (local18.anInt1443 <= arg0.anInt2721) {
						arg0.anInt2759 = -1;
					}
					if (arg0.anInt2730 < 0 || arg0.anInt2730 >= local18.anIntArray147.length) {
						arg0.anInt2759 = -1;
					}
				}
				arg0.aBoolean158 = local18.aBoolean71;
			}
		}
		if (arg0.anInt2744 > 0) {
			arg0.anInt2744--;
		}
	}
}
