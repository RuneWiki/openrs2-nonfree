import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "Lclient!gd;")
	public static Class27 aClass27_33;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public static int anInt2096;

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
	public static int anInt2101;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static final int anInt2089 = 7759444;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!na;")
	private static Class53 aClass53_1002 = Static109.method1737("slide:");

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_998 = aClass53_1002;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_999 = Static109.method1737("Aus");

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	public static int anInt2094 = 0;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	public static int anInt2095 = 0;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!na;")
	public static Class53 aClass53_1000 = aClass53_1002;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean80 = false;

	@OriginalMember(owner = "client!pb", name = "t", descriptor = "Lclient!na;")
	private static Class53 aClass53_1004 = Static109.method1737("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1001 = aClass53_1004;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public static int anInt2099 = 0;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_1003 = Static109.method1737("Stufe)2");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	public static void method1448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static115.aClass3_Sub7_Sub1_3.method662(128);
		Static115.aClass3_Sub7_Sub1_3.method622(arg0);
		Static115.aClass3_Sub7_Sub1_3.method642(arg1);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!vb;)Z")
	public static boolean method1449(@OriginalArg(1) Class3_Sub1_Sub15 arg0) {
		@Pc(2) int local2 = arg0.anInt2712;
		if (Static44.anInt1256 == 2) {
			if (local2 == 201) {
				Static105.anInt2427 = 0;
				Static35.aClass53_478 = Static5.aClass53_79;
				Static68.aBoolean62 = true;
				Static102.anInt2386 = 1;
				Static52.aBoolean50 = true;
				Static35.aClass53_475 = Static35.aClass53_476;
			}
			if (local2 == 202) {
				Static102.anInt2386 = 2;
				Static52.aBoolean50 = true;
				Static35.aClass53_478 = Static41.aClass53_528;
				Static105.anInt2427 = 0;
				Static35.aClass53_475 = Static35.aClass53_476;
				Static68.aBoolean62 = true;
			}
		}
		if (local2 == 205) {
			Static82.anInt940 = 250;
			return true;
		}
		if (local2 == 501) {
			Static52.aBoolean50 = true;
			Static68.aBoolean62 = true;
			Static102.anInt2386 = 4;
			Static35.aClass53_475 = Static35.aClass53_476;
			Static105.anInt2427 = 0;
			Static35.aClass53_478 = Static85.aClass53_944;
		}
		if (local2 == 502) {
			Static35.aClass53_478 = Static119.aClass53_167;
			Static105.anInt2427 = 0;
			Static68.aBoolean62 = true;
			Static102.anInt2386 = 5;
			Static35.aClass53_475 = Static35.aClass53_476;
			Static52.aBoolean50 = true;
		}
		@Pc(103) int local103;
		@Pc(107) int local107;
		if (local2 >= 300 && local2 <= 313) {
			local103 = (local2 - 300) / 2;
			local107 = local2 & 0x1;
			Static81.aClass34_2.method878(local103, local107 == 1);
		}
		if (local2 >= 314 && local2 <= 323) {
			local103 = (local2 - 314) / 2;
			local107 = local2 & 0x1;
			Static81.aClass34_2.method877(local103, local107 == 1);
		}
		if (local2 == 324) {
			Static81.aClass34_2.method876(false);
		}
		if (local2 == 325) {
			Static81.aClass34_2.method876(true);
		}
		if (local2 == 326) {
			Static115.aClass3_Sub7_Sub1_3.method662(114);
			Static81.aClass34_2.method873(Static115.aClass3_Sub7_Sub1_3);
			return true;
		}
		if (local2 == 620) {
			Static101.aBoolean100 = !Static101.aBoolean100;
		}
		if (local2 >= 601 && local2 <= 613) {
			Static86.method1435();
			if (Static35.aClass53_473.method1294() > 0) {
				Static115.aClass3_Sub7_Sub1_3.method662(169);
				Static115.aClass3_Sub7_Sub1_3.method633(Static35.aClass53_473.method1286());
				Static115.aClass3_Sub7_Sub1_3.method625(local2 - 601);
				Static115.aClass3_Sub7_Sub1_3.method625(Static101.aBoolean100 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1450() {
		aClass53_1000 = null;
		aClass53_1003 = null;
		aClass27_33 = null;
		aClass53_1004 = null;
		aClass53_1002 = null;
		aCanvas1 = null;
		aClass53_998 = null;
		aClass53_1001 = null;
		aClass53_999 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I")
	public static int method1451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class3_Sub18 local12 = (Class3_Sub18) Static38.aClass77_4.method1805((long) arg1);
		if (local12 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local12.anIntArray373.length) {
			return local12.anIntArray373[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 method1452() {
		@Pc(7) Class3_Sub1_Sub5_Sub3 local7 = new Class3_Sub1_Sub5_Sub3();
		local7.anInt1168 = Static103.anIntArray321[0];
		local7.anInt1170 = Static32.anIntArray116[0];
		local7.anInt1169 = Static95.anInt2272;
		local7.aByteArray22 = Static7.aByteArrayArray1[0];
		local7.anInt1167 = Static53.anIntArray273[0];
		local7.anInt1172 = Static32.anIntArray117[0];
		local7.anInt1171 = Static39.anInt1179;
		local7.anIntArray132 = Static97.anIntArray312;
		Static68.method1179();
		return local7;
	}
}
