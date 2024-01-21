import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static94 {

	@OriginalMember(owner = "client!td", name = "Hb", descriptor = "I")
	public static int anInt2426;

	@OriginalMember(owner = "client!td", name = "Ib", descriptor = "Lclient!w;")
	public static Class15 aClass15_35;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
	public static int anInt2408 = 0;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "Lclient!va;")
	public static Class61 aClass61_958 = Static88.method1421("Icons redrawn");

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "Lclient!mc;")
	public static Class40 aClass40_2 = new Class40();

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "Lclient!va;")
	private static Class61 aClass61_959 = Static88.method1421("flash1:");

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "Lclient!va;")
	public static Class61 aClass61_960 = aClass61_959;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "Lclient!va;")
	private static Class61 aClass61_963 = Static88.method1421("Drop");

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "Lclient!va;")
	public static Class61 aClass61_961 = aClass61_963;

	@OriginalMember(owner = "client!td", name = "sb", descriptor = "Lclient!va;")
	public static Class61 aClass61_962 = Static88.method1421(" )2> @cya@");

	@OriginalMember(owner = "client!td", name = "Fb", descriptor = "Lclient!va;")
	private static Class61 aClass61_965 = Static88.method1421("Loading wordpack )2 ");

	@OriginalMember(owner = "client!td", name = "Cb", descriptor = "Lclient!va;")
	public static Class61 aClass61_964 = aClass61_965;

	@OriginalMember(owner = "client!td", name = "Lb", descriptor = "Lclient!va;")
	private static Class61 aClass61_967 = Static88.method1421("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!td", name = "Jb", descriptor = "Lclient!va;")
	public static Class61 aClass61_966 = aClass61_967;

	@OriginalMember(owner = "client!td", name = "Kb", descriptor = "[B")
	public static byte[] aByteArray16 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!td", name = "Mb", descriptor = "[I")
	public static int[] anIntArray318 = new int[50];

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Lclient!ud;")
	public static Class10_Sub1_Sub15 method1491(@OriginalArg(1) int arg0) {
		@Pc(10) Class10_Sub1_Sub15 local10 = (Class10_Sub1_Sub15) Static54.aClass29_39.method644((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static64.aClass11_45.method203(10, arg0);
		local10 = new Class10_Sub1_Sub15();
		local10.anInt2530 = arg0;
		if (local20 != null) {
			local10.method1573(new Class10_Sub10(local20));
		}
		local10.method1575();
		if (local10.anInt2518 != -1) {
			local10.method1571(method1491(local10.anInt2518), method1491(local10.anInt2523));
		}
		if (!Static96.aBoolean113 && local10.aBoolean118) {
			local10.aClass61_1029 = Static35.aClass61_412;
			local10.anInt2544 = 0;
			local10.aClass61Array13 = null;
			local10.aClass61Array14 = null;
		}
		Static54.aClass29_39.method649(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(I)[Lclient!m;")
	public static Class10_Sub1_Sub1_Sub2[] method1492() {
		@Pc(13) Class10_Sub1_Sub1_Sub2[] local13 = new Class10_Sub1_Sub1_Sub2[Static100.anInt2658];
		for (@Pc(15) int local15 = 0; local15 < Static100.anInt2658; local15++) {
			@Pc(24) Class10_Sub1_Sub1_Sub2 local24 = local13[local15] = new Class10_Sub1_Sub1_Sub2();
			local24.anInt1568 = Static1.anInt4;
			local24.anInt1565 = Static22.anInt740;
			local24.anInt1569 = Static96.anIntArray321[local15];
			local24.anInt1567 = Static54.anIntArray158[local15];
			local24.anInt1570 = Static88.anIntArray306[local15];
			local24.anInt1566 = Static71.anIntArray207[local15];
			local24.anIntArray173 = Static25.anIntArray80;
			local24.aByteArray5 = Static47.aByteArrayArray8[local15];
		}
		Static1.method5();
		return local13;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILclient!rc;[BI[Lclient!cb;)V")
	public static void method1493(@OriginalArg(1) int arg0, @OriginalArg(2) Class54 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class12[] arg4) {
		@Pc(6) Class10_Sub10 local6 = new Class10_Sub10(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local6.method1136();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local6.method1136();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(52) int local52 = local27 >> 6 & 0x3F;
				@Pc(56) int local56 = local27 >> 12;
				@Pc(60) int local60 = local6.method1111();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(72) int local72 = local46 + arg0;
				@Pc(76) int local76 = local52 + arg3;
				if (local76 > 0 && local72 > 0 && local76 < 103 && local72 < 103) {
					@Pc(90) int local90 = local56;
					@Pc(92) Class12 local92 = null;
					if ((Static21.aByteArrayArrayArray4[1][local76][local72] & 0x2) == 2) {
						local90 = local56 - 1;
					}
					if (local90 >= 0) {
						local92 = arg4[local90];
					}
					Static56.method823(local76, local92, local68, local12, local56, arg1, local64, local72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!va;)Z")
	public static boolean method1495(@OriginalArg(1) Class61 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static6.anInt70; local11++) {
			if (arg0.method1594(Static106.aClass61Array15[local11])) {
				return true;
			}
		}
		return arg0.method1594(Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass61_699);
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
	public static void method1496() {
		aClass61_958 = null;
		aClass61_961 = null;
		aClass61_964 = null;
		aClass61_960 = null;
		aClass61_959 = null;
		anIntArray318 = null;
		aClass61_963 = null;
		aClass61_965 = null;
		aClass61_962 = null;
		aClass61_967 = null;
		aByteArray16 = null;
		aClass61_966 = null;
		aClass40_2 = null;
		aClass15_35 = null;
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "(B)I")
	public static int method1497() {
		return Static51.anInt1420++;
	}
}
