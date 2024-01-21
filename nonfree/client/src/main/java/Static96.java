import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
	public static int anInt2603;

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Lclient!ef;")
	public static Class16 aClass16_116;

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!he;")
	private static Class26 aClass26_1402 = Static6.method100("flash3:");

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "Lclient!nc;")
	public static Class3_Sub14 aClass3_Sub14_14 = null;

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
	public static int anInt2604 = 0;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_1403 = Static6.method100("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
	public static int[] anIntArray310 = new int[5];

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
	public static int[] anIntArray311 = new int[1000];

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_1404 = aClass26_1402;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
	public static int[] anIntArray312 = new int[128];

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "Lclient!he;")
	public static Class26 aClass26_1405 = Static6.method100("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!ec;")
	public static Class17 aClass17_16 = new Class17(4096);

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_1406 = aClass26_1402;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_1407 = Static6.method100("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	public static void method1773() {
		aClass16_116 = null;
		aClass26_1402 = null;
		aClass26_1406 = null;
		anIntArray312 = null;
		anIntArray311 = null;
		aClass26_1405 = null;
		aClass26_1403 = null;
		anIntArray310 = null;
		aClass26_1407 = null;
		aClass17_16 = null;
		aClass26_1404 = null;
		aClass3_Sub14_14 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[Lclient!ac;I[BII)V")
	public static void method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5) {
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < 4; local11++) {
			for (@Pc(15) int local15 = 0; local15 < 64; local15++) {
				for (local19 = 0; local19 < 64; local19++) {
					if (local15 + arg0 > 0 && local15 + arg0 < 103 && arg1 + local19 > 0 && arg1 + local19 < 103) {
						arg2[local11].anIntArrayArray1[local15 + arg0][arg1 + local19] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(91) Class3_Sub11 local91 = new Class3_Sub11(arg4);
		for (local19 = 0; local19 < 4; local19++) {
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
					Static132.method2269(local19, arg0 + local97, arg1 + local101, local91, arg3, arg5, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	public static void method1775() {
		for (@Pc(7) int local7 = 0; local7 < Static19.anInt512; local7++) {
			@Pc(15) int local15 = Static76.anIntArray206[local7];
			@Pc(19) Class3_Sub1_Sub5_Sub1_Sub2 local19 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[local15];
			@Pc(23) int local23 = Static33.aClass3_Sub11_Sub1_2.method981();
			@Pc(31) int local31;
			@Pc(35) int local35;
			if ((local23 & 0x40) != 0) {
				local31 = Static33.aClass3_Sub11_Sub1_2.method988();
				local35 = Static33.aClass3_Sub11_Sub1_2.method1004();
				if (local31 == 65535) {
					local31 = -1;
				}
				if (local31 == local19.anInt2738 && local31 != -1) {
					@Pc(57) int local57 = Static111.method2009(local31).anInt3102;
					if (local57 == 1) {
						local19.anInt2737 = 0;
						local19.anInt2704 = 0;
						local19.anInt2708 = 0;
						local19.anInt2695 = local35;
					}
					if (local57 == 2) {
						local19.anInt2737 = 0;
					}
				} else if (local31 == -1 || local19.anInt2738 == -1 || Static111.method2009(local31).anInt3113 >= Static111.method2009(local19.anInt2738).anInt3113) {
					local19.anInt2738 = local31;
					local19.anInt2704 = 0;
					local19.anInt2737 = 0;
					local19.anInt2695 = local35;
					local19.anInt2708 = 0;
					local19.anInt2706 = local19.anInt2699;
				}
			}
			if ((local23 & 0x80) != 0) {
				local19.aClass26_1479 = Static33.aClass3_Sub11_Sub1_2.method977();
				local19.anInt2719 = 100;
			}
			if ((local23 & 0x8) != 0) {
				local19.anInt2698 = Static33.aClass3_Sub11_Sub1_2.method978();
				local31 = Static33.aClass3_Sub11_Sub1_2.method1006();
				if (local19.anInt2698 == 65535) {
					local19.anInt2698 = -1;
				}
				local19.anInt2711 = 0;
				local19.anInt2705 = Static4.anInt136 + (local31 & 0xFFFF);
				if (local19.anInt2705 > Static4.anInt136) {
					local19.anInt2711 = -1;
				}
				local19.anInt2710 = 0;
				local19.anInt2700 = local31 >> 16;
			}
			if ((local23 & 0x1) != 0) {
				local19.anInt2748 = Static33.aClass3_Sub11_Sub1_2.method988();
				local19.anInt2702 = Static33.aClass3_Sub11_Sub1_2.method974();
			}
			if ((local23 & 0x10) != 0) {
				local31 = Static33.aClass3_Sub11_Sub1_2.method1005();
				local35 = Static33.aClass3_Sub11_Sub1_2.method1004();
				local19.method1879(local31, Static4.anInt136, local35);
				local19.anInt2735 = Static4.anInt136 + 300;
				local19.anInt2725 = Static33.aClass3_Sub11_Sub1_2.method1004();
				local19.anInt2727 = Static33.aClass3_Sub11_Sub1_2.method1005();
			}
			if ((local23 & 0x4) != 0) {
				local19.anInt2749 = Static33.aClass3_Sub11_Sub1_2.method974();
				if (local19.anInt2749 == 65535) {
					local19.anInt2749 = -1;
				}
			}
			if ((local23 & 0x20) != 0) {
				local31 = Static33.aClass3_Sub11_Sub1_2.method981();
				local35 = Static33.aClass3_Sub11_Sub1_2.method1004();
				local19.method1879(local31, Static4.anInt136, local35);
				local19.anInt2735 = Static4.anInt136 + 300;
				local19.anInt2725 = Static33.aClass3_Sub11_Sub1_2.method981();
				local19.anInt2727 = Static33.aClass3_Sub11_Sub1_2.method981();
			}
			if ((local23 & 0x2) != 0) {
				local19.aClass3_Sub1_Sub3_1 = Static115.method2083(Static33.aClass3_Sub11_Sub1_2.method974());
				local19.anInt2714 = local19.aClass3_Sub1_Sub3_1.anInt231;
				local19.anInt2717 = local19.aClass3_Sub1_Sub3_1.anInt229;
				local19.anInt2734 = local19.aClass3_Sub1_Sub3_1.anInt232;
				local19.anInt2707 = local19.aClass3_Sub1_Sub3_1.anInt254;
				local19.anInt2712 = local19.aClass3_Sub1_Sub3_1.anInt227;
				local19.anInt2732 = local19.aClass3_Sub1_Sub3_1.anInt246;
				local19.anInt2728 = local19.aClass3_Sub1_Sub3_1.anInt228;
				local19.anInt2729 = local19.aClass3_Sub1_Sub3_1.anInt249;
				local19.anInt2716 = local19.aClass3_Sub1_Sub3_1.anInt235;
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
	public static void method1776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static73.method1341(arg1)) {
			Static27.method583(arg0, Static49.aClass3_Sub14ArrayArray1[arg1]);
		}
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)Z")
	public static boolean method1777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(28) Class3_Sub1_Sub1 local28 = Static4.method68(arg0);
		return local28.method52(arg1);
	}
}
