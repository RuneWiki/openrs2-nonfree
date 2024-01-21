import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static92 {

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Lclient!c;")
	public static Class10 aClass10_74;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "Lclient!dd;")
	public static Class17 aClass17_13 = new Class17(5);

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
	public static int anInt2281 = 0;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Z")
	public static boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
	public static int anInt2288 = 0;

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "I")
	public static int anInt2289 = 0;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_665 = Static38.method685("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
	public static int anInt2291 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
	public static void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static64.anInt1578 == 2) {
			Static37.method661((Static61.anInt1526 - Static2.anInt66 << 7) + Static167.anInt3924, Static89.anInt2268 * 2, (Static179.anInt4170 - Static176.anInt4061 << 7) + Static176.anInt4102);
			if (Static168.anInt3965 > -1 && Static107.anInt2559 % 20 < 10) {
				Static85.aClass2_Sub3_Sub2_Sub1Array4[0].method280(Static168.anInt3965 + arg1 - 12, arg0 + Static27.anInt709 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1501() {
		@Pc(6) int local6 = Static64.aClass2_Sub13_Sub1_1.method1458(8);
		@Pc(11) int local11;
		if (Static167.anInt3925 > local6) {
			for (local11 = local6; local11 < Static167.anInt3925; local11++) {
				Static36.anIntArray57[Static96.anInt2394++] = Static156.anIntArray358[local11];
			}
		}
		if (local6 > Static167.anInt3925) {
			throw new RuntimeException("gppov1");
		}
		Static167.anInt3925 = 0;
		for (local11 = 0; local11 < local6; local11++) {
			@Pc(59) int local59 = Static156.anIntArray358[local11];
			@Pc(63) Class2_Sub3_Sub5_Sub1_Sub1 local63 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local59];
			@Pc(68) int local68 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
			if (local68 == 0) {
				Static156.anIntArray358[Static167.anInt3925++] = local59;
				local63.anInt2662 = Static107.anInt2559;
			} else {
				@Pc(91) int local91 = Static64.aClass2_Sub13_Sub1_1.method1458(2);
				if (local91 == 0) {
					Static156.anIntArray358[Static167.anInt3925++] = local59;
					local63.anInt2662 = Static107.anInt2559;
					Static144.anIntArray300[Static28.anInt732++] = local59;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local91 == 1) {
						Static156.anIntArray358[Static167.anInt3925++] = local59;
						local63.anInt2662 = Static107.anInt2559;
						local135 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
						local63.method1798(local135, false);
						local145 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
						if (local145 == 1) {
							Static144.anIntArray300[Static28.anInt732++] = local59;
						}
					} else if (local91 == 2) {
						Static156.anIntArray358[Static167.anInt3925++] = local59;
						local63.anInt2662 = Static107.anInt2559;
						local135 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
						local63.method1798(local135, true);
						local145 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
						local63.method1798(local145, true);
						@Pc(197) int local197 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
						if (local197 == 1) {
							Static144.anIntArray300[Static28.anInt732++] = local59;
						}
					} else if (local91 == 3) {
						Static36.anIntArray57[Static96.anInt2394++] = local59;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)Lclient!kc;")
	public static Class2_Sub3_Sub10 method1502(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub10 local8 = (Class2_Sub3_Sub10) Static73.aClass17_8.method505((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(27) byte[] local27 = Static111.aClass10_87.method1605(arg0, 10);
		local8 = new Class2_Sub3_Sub10();
		local8.anInt2012 = arg0;
		if (local27 != null) {
			local8.method1321(new Class2_Sub13(local27));
		}
		local8.method1319();
		if (local8.anInt2040 != -1) {
			local8.method1325(method1502(local8.anInt2033), method1502(local8.anInt2040));
		}
		if (!Static38.aBoolean39 && local8.aBoolean79) {
			local8.aClass6_612 = Static2.aClass6_20;
			local8.aClass6Array10 = null;
			local8.anInt2027 = 0;
			local8.aBoolean78 = false;
			local8.aClass6Array11 = null;
		}
		Static73.aClass17_8.method508((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1503(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static86.aClass15_1);
		arg0.removeFocusListener(Static86.aClass15_1);
		Static76.anInt1827 = -1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public static void method1504() {
		aByteArrayArrayArray5 = null;
		aClass6_665 = null;
		aClass10_74 = null;
		aClass17_13 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ad;)V")
	public static void method1505(@OriginalArg(1) Class2_Sub2 arg0) {
		Static145.method2248(200000, arg0);
	}
}
