import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static97 {

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1 aClass2_Sub3_Sub2_Sub1_3;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt2398 = 0;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!ai;")
	public static Class6 aClass6_693 = Static38.method685("Einloggen");

	@OriginalMember(owner = "client!m", name = "h", descriptor = "I")
	public static final int anInt2402 = 50;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "[I")
	public static int[] anIntArray179 = new int[anInt2402];

	@OriginalMember(owner = "client!m", name = "e", descriptor = "I")
	public static int anInt2400 = 0;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
	public static int[] anIntArray180 = new int[anInt2402];

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public static int anInt2401 = 10;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "[I")
	public static int[] anIntArray181 = new int[anInt2402];

	@OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
	public static int[] anIntArray182 = new int[anInt2402];

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array12 = new Class6[anInt2402];

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	public static int anInt2406 = 0;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
	public static int[] anIntArray183 = new int[anInt2402];

	@OriginalMember(owner = "client!m", name = "q", descriptor = "[I")
	public static int[] anIntArray184 = new int[anInt2402];

	@OriginalMember(owner = "client!m", name = "s", descriptor = "[I")
	public static int[] anIntArray185 = new int[anInt2402];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1570() {
		if (Static86.aClass15_1 != null) {
			@Pc(3) Class15 local3 = Static86.aClass15_1;
			synchronized (Static86.aClass15_1) {
				Static86.aClass15_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1571() {
		anIntArray185 = null;
		anIntArray183 = null;
		anIntArray181 = null;
		aClass6_693 = null;
		anIntArray182 = null;
		aClass2_Sub3_Sub2_Sub1_3 = null;
		anIntArray180 = null;
		aClass6Array12 = null;
		anIntArray179 = null;
		anIntArray184 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
	public static void method1572(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static162.method2602(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static42.aClass36_2.anApplet1 != null) {
				@Pc(106) Class11 local106 = Static42.aClass36_2.method1116(new URL(Static42.aClass36_2.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static139.anInt3255 + "&u=" + Static65.aLong93 + "&v1=" + Static71.aString4 + "&v2=" + Static71.aString3 + "&e=" + local7));
				while (local106.anInt467 == 0) {
					Static155.method2675(1L);
				}
				if (local106.anInt467 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local106.anObject2;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ai;IIII)V")
	public static void method1573(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class87 local8 = Static72.method1126(arg3, arg1);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray4 != null) {
			@Pc(23) Class2_Sub2 local23 = new Class2_Sub2();
			local23.aClass6_44 = arg0;
			local23.aClass87_1 = local8;
			local23.anInt82 = arg2;
			local23.anObjectArray1 = local8.anObjectArray4;
			Static92.method1505(local23);
		}
		@Pc(43) boolean local43 = true;
		if (local8.anInt4101 > 0) {
			local43 = Static162.method2603(local8);
		}
		if (!local43 || !Static135.method2096(Static179.method2802(local8), arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static66.aClass2_Sub13_Sub1_2.method1455(49);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 2) {
			Static66.aClass2_Sub13_Sub1_2.method1455(230);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 3) {
			Static66.aClass2_Sub13_Sub1_2.method1455(34);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 4) {
			Static66.aClass2_Sub13_Sub1_2.method1455(106);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 5) {
			Static66.aClass2_Sub13_Sub1_2.method1455(190);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 6) {
			Static66.aClass2_Sub13_Sub1_2.method1455(125);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 7) {
			Static66.aClass2_Sub13_Sub1_2.method1455(245);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 8) {
			Static66.aClass2_Sub13_Sub1_2.method1455(132);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 9) {
			Static66.aClass2_Sub13_Sub1_2.method1455(135);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
		if (arg2 == 10) {
			Static66.aClass2_Sub13_Sub1_2.method1455(221);
			Static66.aClass2_Sub13_Sub1_2.method1421(arg3);
			Static66.aClass2_Sub13_Sub1_2.method1428(arg1);
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public static void method1574() {
		Static82.aClass17_11.method509();
		Static34.aClass17_4.method509();
		Static172.aClass17_29.method509();
		Static165.aClass17_27.method509();
		Static34.aClass17_5.method509();
	}
}
