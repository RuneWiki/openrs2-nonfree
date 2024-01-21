import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lclient!ud;")
	public static Class59 aClass59_4;

	@OriginalMember(owner = "client!qe", name = "gb", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!qe", name = "hb", descriptor = "Lclient!aa;")
	public static Class1_Sub1_Sub1_Sub1 aClass1_Sub1_Sub1_Sub1_10;

	@OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lclient!pb;")
	public static Class31 aClass31_30;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
	public static int anInt2238 = -1;

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1206 = Static23.method501("This world is full)3");

	@OriginalMember(owner = "client!qe", name = "V", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1203 = aClass42_1206;

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1204 = Static23.method501("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!qe", name = "Y", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1205 = Static23.method501("mod_icons");

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lclient!kc;")
	public static Class37 aClass37_22 = new Class37(64);

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
	public static int anInt2244 = 0;

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1207 = Static23.method501("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBILclient!v;)V")
	public static void method1532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub8_Sub1_Sub2 arg2) {
		if ((arg0 & 0x40) != 0) {
			arg2.anInt2587 = Static80.aClass1_Sub8_Sub1_2.method1208();
			arg2.anInt2554 = Static80.aClass1_Sub8_Sub1_2.method1206();
		}
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if ((arg0 & 0x20) != 0) {
			local28 = Static80.aClass1_Sub8_Sub1_2.method1216();
			local32 = Static80.aClass1_Sub8_Sub1_2.method1220();
			local36 = Static80.aClass1_Sub8_Sub1_2.method1186();
			@Pc(39) int local39 = Static80.aClass1_Sub8_Sub1_2.anInt1692;
			if (arg2.aClass42_1396 != null && arg2.aClass29_2 != null) {
				@Pc(50) long local50 = arg2.aClass42_1396.method1049();
				@Pc(52) boolean local52 = false;
				if (local32 <= 1) {
					for (@Pc(59) int local59 = 0; local59 < Static1.anInt1; local59++) {
						if (local50 == Static37.aLongArray2[local59]) {
							local52 = true;
							break;
						}
					}
				}
				if (!local52 && Static19.anInt638 == 0) {
					Static79.aClass1_Sub8_2.anInt1692 = 0;
					Static80.aClass1_Sub8_Sub1_2.method1187(Static79.aClass1_Sub8_2.aByteArray24, local36);
					Static79.aClass1_Sub8_2.anInt1692 = 0;
					@Pc(100) Class42 local100 = Static31.method1558(Static79.aClass1_Sub8_2).method1031();
					arg2.aClass42_1380 = local100.method1043();
					arg2.anInt2582 = local28 & 0xFF;
					arg2.anInt2557 = 150;
					arg2.anInt2598 = local28 >> 8;
					if (local32 == 2 || local32 == 3) {
						Static24.method509(Static57.method1822(new Class42[] { Static17.aClass42_318, arg2.aClass42_1396 }), 1, local100);
					} else if (local32 == 1) {
						Static24.method509(Static57.method1822(new Class42[] { Static49.aClass42_696, arg2.aClass42_1396 }), 1, local100);
					} else {
						Static24.method509(arg2.aClass42_1396, 2, local100);
					}
				}
			}
			Static80.aClass1_Sub8_Sub1_2.anInt1692 = local39 + local36;
		}
		if ((arg0 & 0x2) != 0) {
			arg2.aClass42_1380 = Static80.aClass1_Sub8_Sub1_2.method1201();
			if (arg2.aClass42_1380.method1062(0) == 126) {
				arg2.aClass42_1380 = arg2.aClass42_1380.method1051(1);
				Static24.method509(arg2.aClass42_1396, 2, arg2.aClass42_1380);
			} else if (Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1 == arg2) {
				Static24.method509(arg2.aClass42_1396, 2, arg2.aClass42_1380);
			}
			arg2.anInt2557 = 150;
			arg2.anInt2582 = 0;
			arg2.anInt2598 = 0;
		}
		if ((arg0 & 0x80) != 0) {
			local28 = Static80.aClass1_Sub8_Sub1_2.method1199();
			if (local28 == 65535) {
				local28 = -1;
			}
			local32 = Static80.aClass1_Sub8_Sub1_2.method1186();
			if (arg2.anInt2601 == local28 && local28 != -1) {
				local36 = Static30.method574(local28).anInt2331;
				if (local36 == 1) {
					arg2.anInt2607 = 0;
					arg2.anInt2596 = 0;
					arg2.anInt2604 = 0;
					arg2.anInt2570 = local32;
				}
				if (local36 == 2) {
					arg2.anInt2596 = 0;
				}
			} else if (local28 == -1 || arg2.anInt2601 == -1 || Static30.method574(local28).anInt2317 >= Static30.method574(arg2.anInt2601).anInt2317) {
				arg2.anInt2596 = 0;
				arg2.anInt2601 = local28;
				arg2.anInt2570 = local32;
				arg2.anInt2604 = 0;
				arg2.anInt2569 = arg2.anInt2603;
				arg2.anInt2607 = 0;
			}
		}
		if ((arg0 & 0x1) != 0) {
			local28 = Static80.aClass1_Sub8_Sub1_2.method1211();
			@Pc(345) byte[] local345 = new byte[local28];
			@Pc(350) Class1_Sub8 local350 = new Class1_Sub8(local345);
			Static80.aClass1_Sub8_Sub1_2.method1180(local345, local28);
			Static79.aClass1_Sub8Array1[arg1] = local350;
			arg2.method1771(local350);
		}
		if ((arg0 & 0x200) != 0) {
			arg2.anInt2560 = Static80.aClass1_Sub8_Sub1_2.method1208();
			local28 = Static80.aClass1_Sub8_Sub1_2.method1188();
			arg2.anInt2593 = 0;
			arg2.anInt2572 = (local28 & 0xFFFF) + Static27.anInt768;
			arg2.anInt2558 = 0;
			arg2.anInt2605 = local28 >> 16;
			if (Static27.anInt768 < arg2.anInt2572) {
				arg2.anInt2593 = -1;
			}
			if (arg2.anInt2560 == 65535) {
				arg2.anInt2560 = -1;
			}
		}
		if ((arg0 & 0x8) != 0) {
			arg2.anInt2590 = Static80.aClass1_Sub8_Sub1_2.method1208();
			if (arg2.anInt2590 == 65535) {
				arg2.anInt2590 = -1;
			}
		}
		if ((arg0 & 0x400) != 0) {
			arg2.anInt2591 = Static80.aClass1_Sub8_Sub1_2.method1211();
			arg2.anInt2575 = Static80.aClass1_Sub8_Sub1_2.method1211();
			arg2.anInt2571 = Static80.aClass1_Sub8_Sub1_2.method1220();
			arg2.anInt2602 = Static80.aClass1_Sub8_Sub1_2.method1220();
			arg2.anInt2549 = Static80.aClass1_Sub8_Sub1_2.method1208() + Static27.anInt768;
			arg2.anInt2588 = Static80.aClass1_Sub8_Sub1_2.method1206() + Static27.anInt768;
			arg2.anInt2555 = Static80.aClass1_Sub8_Sub1_2.method1220();
			arg2.method1761();
		}
		if ((arg0 & 0x100) != 0) {
			local28 = Static80.aClass1_Sub8_Sub1_2.method1207();
			local32 = Static80.aClass1_Sub8_Sub1_2.method1211();
			arg2.method1757(local32, Static27.anInt768, local28);
			arg2.anInt2586 = Static27.anInt768 + 300;
			arg2.anInt2608 = Static80.aClass1_Sub8_Sub1_2.method1220();
			arg2.anInt2548 = Static80.aClass1_Sub8_Sub1_2.method1207();
		}
		if ((arg0 & 0x10) == 0) {
			return;
		}
		local32 = Static80.aClass1_Sub8_Sub1_2.method1220();
		local36 = Static80.aClass1_Sub8_Sub1_2.method1220();
		arg2.method1757(local36, Static27.anInt768, local32);
		arg2.anInt2586 = Static27.anInt768 + 300;
		arg2.anInt2608 = Static80.aClass1_Sub8_Sub1_2.method1186();
		arg2.anInt2548 = Static80.aClass1_Sub8_Sub1_2.method1186();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!vb;BZ)Z")
	public static boolean method1533(@OriginalArg(0) Class60 arg0, @OriginalArg(2) boolean arg1) {
		Static61.anInt1457 = 20;
		try {
			Static30.aClass14_1 = (Class14) Class.forName("Class14_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(18) Throwable local18) {
			@Pc(22) Interface1 local22 = arg0.method1813();
			if (local22 != null) {
				Static30.aClass14_1 = new Class14_Sub1_Sub2(arg0, local22);
				return true;
			} else if (arg1) {
				Static30.aClass14_1 = new Class14_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V")
	public static void method1534() {
		aClass31_30 = null;
		aClass1_Sub1_Sub1_Sub1_10 = null;
		aClass59_4 = null;
		aClass42_1207 = null;
		aClass42_1205 = null;
		aClass42_1204 = null;
		aClass42_1203 = null;
		aClass37_22 = null;
		anImage4 = null;
		aClass42_1206 = null;
	}

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V")
	public static void method1535() {
		anImage4 = null;
		Static16.aFont1 = null;
		Static69.aFontMetrics1 = null;
	}
}
