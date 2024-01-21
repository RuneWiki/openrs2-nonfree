import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public static int anInt2107;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!we;")
	public static Class62 aClass62_17;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Lclient!ef;")
	public static Class22 aClass22_7;

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Z")
	public static boolean aBoolean81;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!na;")
	private static Class53 aClass53_1005 = Static109.method1737("Ok");

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_1006 = aClass53_1005;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_1007 = Static109.method1737("mapedge");

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public static int anInt2106 = 0;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "Lclient!na;")
	private static Class53 aClass53_1017 = Static109.method1737("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1008 = aClass53_1017;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_1009 = Static109.method1737("(U");

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!na;")
	private static Class53 aClass53_1010 = Static109.method1737("Type");

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Lclient!na;")
	private static Class53 aClass53_1013 = Static109.method1737("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_1011 = aClass53_1013;

	@OriginalMember(owner = "client!pc", name = "s", descriptor = "Lclient!na;")
	private static Class53 aClass53_1012 = Static109.method1737("Please reload this page)3");

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Lclient!na;")
	public static Class53 aClass53_1014 = aClass53_1012;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "Lclient!na;")
	private static Class53 aClass53_1015 = Static109.method1737("Unable to find ");

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "Lclient!na;")
	public static Class53 aClass53_1016 = aClass53_1010;

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_1018 = aClass53_1015;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)Lclient!va;")
	public static Class3_Sub1_Sub14 method1453(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub1_Sub14 local10 = (Class3_Sub1_Sub14) Static79.aClass75_55.method1728((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static16.aClass62_1.method1512(1, arg0);
		local10 = new Class3_Sub1_Sub14();
		if (local27 != null) {
			local10.method1836(arg0, new Class3_Sub7(local27));
		}
		local10.method1831();
		Static79.aClass75_55.method1730(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!na;ILclient!na;Lclient!na;)V")
	public static void method1454(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class53 arg2) {
		Static122.aClass53_1412 = arg2;
		Static122.aClass53_1413 = arg0;
		Static122.aClass53_1408 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIII)V")
	public static void method1455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub19 local10 = (Class3_Sub19) Static94.aClass11_10.method189(); local10 != null; local10 = (Class3_Sub19) Static94.aClass11_10.method187()) {
			if (local10.anInt2872 != -1 || local10.anIntArray418 != null) {
				@Pc(21) int local21 = 0;
				if (arg1 > local10.anInt2885) {
					local21 = arg1 - local10.anInt2885;
				} else if (local10.anInt2883 > arg1) {
					local21 = local10.anInt2883 - arg1;
				}
				if (local10.anInt2878 < arg0) {
					local21 += arg0 - local10.anInt2878;
				} else if (arg0 < local10.anInt2874) {
					local21 += local10.anInt2874 - arg0;
				}
				if (local21 - 64 > local10.anInt2873 || Static56.anInt1508 == 0 || arg3 != local10.anInt2877) {
					if (local10.aClass3_Sub10_Sub3_2 != null) {
						Static36.aClass3_Sub10_Sub1_1.method861(local10.aClass3_Sub10_Sub3_2);
						local10.aClass3_Sub10_Sub3_2 = null;
					}
					if (local10.aClass3_Sub10_Sub3_3 != null) {
						Static36.aClass3_Sub10_Sub1_1.method861(local10.aClass3_Sub10_Sub3_3);
						local10.aClass3_Sub10_Sub3_3 = null;
					}
				} else {
					local21 -= 64;
					if (local21 < 0) {
						local21 = 0;
					}
					@Pc(145) int local145 = (local10.anInt2873 - local21) * Static56.anInt1508 / local10.anInt2873;
					if (local10.aClass3_Sub10_Sub3_2 != null) {
						local10.aClass3_Sub10_Sub3_2.method1618(local145);
					} else if (local10.anInt2872 >= 0) {
						@Pc(166) Class72 local166 = Static133.method1705(Static125.aClass62_Sub1_18, local10.anInt2872);
						if (local166 != null) {
							@Pc(173) Class3_Sub2_Sub1 local173 = local166.method1703().method1717(Static96.aClass14_3);
							@Pc(178) Class3_Sub10_Sub3 local178 = Static132.method1585(local173, local145);
							local178.method1595(-1);
							Static36.aClass3_Sub10_Sub1_1.method862(local178);
							local10.aClass3_Sub10_Sub3_2 = local178;
						}
					}
					if (local10.aClass3_Sub10_Sub3_3 != null) {
						local10.aClass3_Sub10_Sub3_3.method1618(local145);
						if (!local10.aClass3_Sub10_Sub3_3.method1964()) {
							local10.aClass3_Sub10_Sub3_3 = null;
						}
					} else if (local10.anIntArray418 != null && (local10.anInt2876 -= arg2) <= 0) {
						@Pc(226) int local226 = (int) (Math.random() * (double) local10.anIntArray418.length);
						@Pc(234) Class72 local234 = Static133.method1705(Static125.aClass62_Sub1_18, local10.anIntArray418[local226]);
						if (local234 != null) {
							@Pc(241) Class3_Sub2_Sub1 local241 = local234.method1703().method1717(Static96.aClass14_3);
							@Pc(246) Class3_Sub10_Sub3 local246 = Static132.method1585(local241, local145);
							local246.method1595(0);
							Static36.aClass3_Sub10_Sub1_1.method862(local246);
							local10.anInt2876 = (int) ((double) (local10.anInt2881 - local10.anInt2870) * Math.random()) + local10.anInt2870;
							local10.aClass3_Sub10_Sub3_3 = local246;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1456() {
		aClass53_1018 = null;
		aClass53_1009 = null;
		aClass62_17 = null;
		aClass22_7 = null;
		aClass53_1013 = null;
		aClass53_1014 = null;
		aClass53_1012 = null;
		aClass53_1007 = null;
		aClass53_1008 = null;
		aCRC32_2 = null;
		aClass53_1006 = null;
		aClass53_1010 = null;
		aClass53_1011 = null;
		aClass53_1016 = null;
		aClass53_1015 = null;
		aClass53_1005 = null;
		aClass53_1017 = null;
	}
}
