import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "[Lclient!vd;")
	public static Class5_Sub2_Sub1_Sub4[] aClass5_Sub2_Sub1_Sub4Array1;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "Lclient!df;")
	public static Class5_Sub2_Sub1_Sub1_Sub1 aClass5_Sub2_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
	public static int anInt225;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Lclient!r;")
	private static Class61 aClass61_80 = Static129.method2060("flash1:");

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public static int anInt213 = 0;

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Lclient!r;")
	private static Class61 aClass61_82 = Static129.method2060("Username: ");

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "Lclient!r;")
	public static Class61 aClass61_81 = aClass61_82;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Lclient!ge;")
	public static Class29 aClass29_4 = new Class29(30);

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "Lclient!r;")
	public static Class61 aClass61_83 = aClass61_80;

	@OriginalMember(owner = "client!bb", name = "H", descriptor = "Lclient!r;")
	public static Class61 aClass61_84 = Static129.method2060("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "Lclient!r;")
	public static Class61 aClass61_85 = Static129.method2060("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "Lclient!r;")
	public static Class61 aClass61_86 = aClass61_80;

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!r;")
	public static Class61 aClass61_87 = Static129.method2060("gleiten:");

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "Lclient!r;")
	public static Class61 aClass61_88 = Static129.method2060("<col=ffff00>*V");

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
	public static void method182(@OriginalArg(1) int arg0) {
		@Pc(14) Class5_Sub15 local14 = (Class5_Sub15) Static57.aClass20_6.method656((long) arg0);
		if (local14 != null) {
			local14.method2189();
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public static void method183() {
		aClass61_84 = null;
		aClass61_80 = null;
		aClass5_Sub2_Sub1_Sub4Array1 = null;
		aClass61_82 = null;
		aClass29_4 = null;
		aClass5_Sub2_Sub1_Sub1_Sub1_1 = null;
		aClass61_83 = null;
		aClass61_86 = null;
		aClass61_85 = null;
		aClass61_88 = null;
		aClass61_81 = null;
		aClass61_87 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!ea;I)V")
	public static void method184(@OriginalArg(0) Class5_Sub2_Sub2_Sub3 arg0) {
		arg0.anInt2916 = arg0.anInt2917;
		if (arg0.anInt2885 == 0) {
			arg0.anInt2894 = 0;
			return;
		}
		if (arg0.anInt2903 != -1 && arg0.anInt2904 == 0) {
			@Pc(32) Class5_Sub2_Sub17 local32 = Static106.method1769(arg0.anInt2903);
			if (arg0.anInt2876 > 0 && local32.anInt3232 == 0) {
				arg0.anInt2894++;
				return;
			}
			if (arg0.anInt2876 <= 0 && local32.anInt3226 == 0) {
				arg0.anInt2894++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt2875;
		@Pc(76) int local76 = arg0.anInt2912;
		@Pc(91) int local91 = arg0.anInt2892 * 64 + arg0.anIntArray346[arg0.anInt2885 - 1] * 128;
		@Pc(107) int local107 = arg0.anIntArray350[arg0.anInt2885 - 1] * 128 + arg0.anInt2892 * 64;
		if (local91 - local76 > 256 || local91 - local76 < -256 || local107 - local67 > 256 || local107 - local67 < -256) {
			arg0.anInt2912 = local91;
			arg0.anInt2875 = local107;
			return;
		}
		if (local76 < local91) {
			if (local107 > local67) {
				arg0.anInt2909 = 1280;
			} else if (local107 >= local67) {
				arg0.anInt2909 = 1536;
			} else {
				arg0.anInt2909 = 1792;
			}
		} else if (local91 >= local76) {
			if (local107 > local67) {
				arg0.anInt2909 = 1024;
			} else if (local107 < local67) {
				arg0.anInt2909 = 0;
			}
		} else if (local67 < local107) {
			arg0.anInt2909 = 768;
		} else if (local107 < local67) {
			arg0.anInt2909 = 256;
		} else {
			arg0.anInt2909 = 512;
		}
		@Pc(231) int local231 = arg0.anInt2909 - arg0.anInt2919 & 0x7FF;
		if (local231 > 1024) {
			local231 -= 2048;
		}
		@Pc(240) int local240 = arg0.anInt2914;
		@Pc(242) int local242 = 4;
		if (local231 >= -256 && local231 <= 256) {
			local240 = arg0.anInt2915;
		} else if (local231 >= 256 && local231 < 768) {
			local240 = arg0.anInt2918;
		} else if (local231 >= -768 && local231 <= -256) {
			local240 = arg0.anInt2913;
		}
		if (local240 == -1) {
			local240 = arg0.anInt2915;
		}
		arg0.anInt2916 = local240;
		@Pc(288) boolean local288 = true;
		if (arg0 instanceof Class5_Sub2_Sub2_Sub3_Sub1) {
			local288 = ((Class5_Sub2_Sub2_Sub3_Sub1) arg0).aClass5_Sub2_Sub12_1.aBoolean90;
		}
		if (local288) {
			if (arg0.anInt2919 != arg0.anInt2909 && arg0.anInt2890 == -1 && arg0.anInt2888 != 0) {
				local242 = 2;
			}
			if (arg0.anInt2885 > 2) {
				local242 = 6;
			}
			if (arg0.anInt2885 > 3) {
				local242 = 8;
			}
			if (arg0.anInt2894 > 0 && arg0.anInt2885 > 1) {
				arg0.anInt2894--;
				local242 = 8;
			}
		} else {
			if (arg0.anInt2885 > 1) {
				local242 = 6;
			}
			if (arg0.anInt2885 > 2) {
				local242 = 8;
			}
			if (arg0.anInt2894 > 0 && arg0.anInt2885 > 1) {
				local242 = 8;
				arg0.anInt2894--;
			}
		}
		if (arg0.aBooleanArray15[arg0.anInt2885 - 1]) {
			local242 <<= 0x1;
		}
		if (local107 > local67) {
			arg0.anInt2875 += local242;
			if (arg0.anInt2875 > local107) {
				arg0.anInt2875 = local107;
			}
		} else if (local67 > local107) {
			arg0.anInt2875 -= local242;
			if (arg0.anInt2875 < local107) {
				arg0.anInt2875 = local107;
			}
		}
		if (local76 < local91) {
			arg0.anInt2912 += local242;
			if (local91 < arg0.anInt2912) {
				arg0.anInt2912 = local91;
			}
		} else if (local76 > local91) {
			arg0.anInt2912 -= local242;
			if (local91 > arg0.anInt2912) {
				arg0.anInt2912 = local91;
			}
		}
		if (arg0.anInt2912 == local91 && local107 == arg0.anInt2875) {
			if (arg0.anInt2876 > 0) {
				arg0.anInt2876--;
			}
			arg0.anInt2885--;
		}
		if (local242 >= 8 && arg0.anInt2916 == arg0.anInt2915 && arg0.anInt2906 != -1) {
			arg0.anInt2916 = arg0.anInt2906;
		}
	}
}
