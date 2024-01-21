import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
	public static int[] anIntArray269;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_941 = Static109.method1737("sl_arrows");

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[1000][];

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_942 = Static109.method1737("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt2070 = 0;

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
	public static int anInt2071 = 0;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Z")
	public static boolean aBoolean78 = false;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_943 = Static109.method1737("Fps:");

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "Lclient!na;")
	private static Class53 aClass53_947 = Static109.method1737("Enter name of player to add to list");

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_944 = aClass53_947;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_945 = Static109.method1737("(U(Y");

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_946 = Static109.method1737("l");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!ff;IB)V")
	public static void method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub5_Sub2 arg2, @OriginalArg(3) int arg3) {
		Static121.aClass27_46.method1540();
		Static73.aClass3_Sub1_Sub5_Sub3_15.method813(0, 0);
		arg2.method733(Static106.aClass53_1220, 55, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method733(Static117.aClass53_1355, 55, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method733(Static43.aClass53_548, 55, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method733(Static82.aClass53_384, 55, 41, 16711680, true);
		}
		if (arg3 == 3) {
			arg2.method733(Static79.aClass53_898, 55, 41, 65535, true);
		}
		arg2.method733(Static108.aClass53_1241, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method733(Static117.aClass53_1355, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method733(Static43.aClass53_548, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method733(Static82.aClass53_384, 184, 41, 16711680, true);
		}
		arg2.method733(Static109.aClass53_1265, 324, 28, 16777215, true);
		if (arg1 == 0) {
			arg2.method733(Static117.aClass53_1355, 324, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg2.method733(Static43.aClass53_548, 324, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg2.method733(Static82.aClass53_384, 324, 41, 16711680, true);
		}
		arg2.method739(Static102.aClass53_1164, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(157) Graphics local157 = Static87.aCanvas1.getGraphics();
			Static121.aClass27_46.method1536(453, local157, 0);
		} catch (@Pc(165) Exception local165) {
			Static87.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1431() {
		Static32.aClass75_29.method1724();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1432() {
		Static55.aBoolean52 = false;
		Static45.aBoolean47 = false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!nb;III)V")
	public static void method1433(@OriginalArg(0) Class3_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
		if (local15 <= 4225 || local15 >= 90000) {
			Static80.method1415(arg2, arg1, arg0);
			return;
		}
		@Pc(35) int local35 = Static50.anInt2790 + Static87.anInt2099 & 0x7FF;
		@Pc(39) int local39 = Class3_Sub1_Sub5_Sub1.anIntArray86[local35];
		@Pc(47) int local47 = local39 * 256 / (Static7.anInt197 + 256);
		@Pc(51) int local51 = Class3_Sub1_Sub5_Sub1.anIntArray84[local35];
		@Pc(59) int local59 = local51 * 256 / (Static7.anInt197 + 256);
		@Pc(70) int local70 = local59 * arg1 - local47 * arg2 >> 16;
		@Pc(81) int local81 = arg1 * local47 + local59 * arg2 >> 16;
		@Pc(87) double local87 = Math.atan2((double) local81, (double) local70);
		@Pc(93) int local93 = (int) (Math.sin(local87) * 63.0D);
		@Pc(99) int local99 = (int) (Math.cos(local87) * 57.0D);
		Static35.aClass3_Sub1_Sub5_Sub4_17.method1349(local93 + 94 - 6, -local99 + -20 + 83, local87);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)V")
	public static void method1434() {
		aClass53_942 = null;
		aClass53_941 = null;
		aClass53_944 = null;
		aClass53_946 = null;
		anIntArray270 = null;
		aClass53_947 = null;
		anIntArray269 = null;
		aClass53_945 = null;
		aClass53_943 = null;
		aByteArrayArray5 = null;
	}
}
