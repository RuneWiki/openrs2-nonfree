import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static90 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Lclient!gd;")
	public static Class27 aClass27_34;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public static int anInt2120;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "Lclient!hd;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "Lclient!ff;")
	public static Class3_Sub1_Sub5_Sub2 aClass3_Sub1_Sub5_Sub2_4;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "[I")
	public static int[] anIntArray277;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public static int anInt2126;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!na;")
	private static Class53 aClass53_1025 = Static109.method1737("glow2:");

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_1026 = Static109.method1737("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "[Lclient!bd;")
	public static Class9[] aClass9Array1 = new Class9[4];

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "Lclient!te;")
	public static Class75 aClass75_60 = new Class75(64);

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Lclient!na;")
	private static Class53 aClass53_1028 = Static109.method1737("To play on this world move to a free area first");

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1027 = aClass53_1028;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
	public static int anInt2123 = 0;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_1029 = aClass53_1025;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_1030 = aClass53_1025;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_1031 = Static109.method1737("Free world");

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	public static void method1464() {
		@Pc(7) int local7 = (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1424 >> 7) + Static80.anInt2029;
		Static48.anInt1301 = 0;
		@Pc(21) int local21 = (Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anInt1427 >> 7) + Static4.anInt145;
		if (local7 >= 3053 && local7 <= 3156 && local21 >= 3056 && local21 <= 3136) {
			Static48.anInt1301 = 1;
		}
		if (local7 >= 3072 && local7 <= 3118 && local21 >= 9492 && local21 <= 9535) {
			Static48.anInt1301 = 1;
		}
		if (Static48.anInt1301 == 1 && local7 >= 3139 && local7 <= 3199 && local21 >= 3008 && local21 <= 3062) {
			Static48.anInt1301 = 0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!vb;I)Lclient!vb;")
	public static Class3_Sub1_Sub15 method1465(@OriginalArg(0) Class3_Sub1_Sub15 arg0) {
		@Pc(11) int local11 = Static21.method386(Static50.method1914(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local11; local20++) {
			arg0 = Static30.method666(arg0.anInt2704);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!na;ZLclient!we;Lclient!na;)[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] method1466(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class53 arg2) {
		@Pc(8) int local8 = arg1.method1504(arg0);
		@Pc(21) int local21 = arg1.method1502(arg2, local8);
		return Static16.method240(arg1, local8, local21);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lclient!na;II)Lclient!na;")
	public static Class53 method1467(@OriginalArg(1) Class53[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg0[local9 + arg1] == null) {
				arg0[local9 + arg1] = Static109.aClass53_1254;
			}
			local7 += arg0[arg1 + local9].anInt1890;
		}
		@Pc(43) int local43 = 0;
		@Pc(46) byte[] local46 = new byte[local7];
		@Pc(62) Class53 local62;
		for (@Pc(53) int local53 = 0; local53 < arg2; local53++) {
			local62 = arg0[arg1 + local53];
			Static127.method202(local62.aByteArray43, 0, local46, local43, local62.anInt1890);
			local43 += local62.anInt1890;
		}
		local62 = new Class53();
		local62.anInt1890 = local7;
		local62.aByteArray43 = local46;
		return local62;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!we;ZLclient!we;)V")
	public static void method1468(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		Static57.aClass62_9 = arg0;
		Static30.aClass62_7 = arg1;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
	public static void method1469() {
		aClass53_1031 = null;
		aClass53_1026 = null;
		aClass75_60 = null;
		aClass53_1029 = null;
		aClass27_34 = null;
		aClass3_Sub1_Sub5_Sub2_4 = null;
		aClass53_1028 = null;
		aClass53_1030 = null;
		aClass9Array1 = null;
		anIntArray277 = null;
		aClass32_1 = null;
		aClass53_1027 = null;
		anIntArray276 = null;
		aClass53_1025 = null;
	}
}
