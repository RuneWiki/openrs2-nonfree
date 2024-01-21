import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "Lclient!sd;")
	public static Class5_Sub2_Sub19 aClass5_Sub2_Sub19_1;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_718 = Static161.method2452("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!li;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_719 = Static161.method2452("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_720 = Static161.method2452("Loaded interfaces");

	@OriginalMember(owner = "client!jg", name = "l", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_721 = Static161.method2452("This computers address has been blocked");

	@OriginalMember(owner = "client!jg", name = "m", descriptor = "Lclient!dc;")
	public static Class20 aClass20_722 = aClass20_719;

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
	public static int anInt1957 = 0;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_723 = Static161.method2452("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!jg", name = "s", descriptor = "Lclient!dc;")
	public static Class20 aClass20_724 = aClass20_720;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!dc;")
	public static Class20 aClass20_725 = aClass20_721;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(JI)V")
	public static void method1506(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (anInt1957 >= 100 && Static60.anInt1348 != 1 || anInt1957 >= 200) {
			Static189.method2824(0, Static192.aClass20_1409, Static215.aClass20_1545);
			return;
		}
		@Pc(33) Class20 local33 = Static160.method2438(arg0).method565();
		for (@Pc(35) int local35 = 0; local35 < anInt1957; local35++) {
			if (Static129.aLongArray29[local35] == arg0) {
				Static189.method2824(0, Static70.method1166(new Class20[] { local33, Static216.aClass20_1548 }), Static215.aClass20_1545);
				return;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < Static50.anInt1082; local79++) {
			if (arg0 == Static168.aLongArray39[local79]) {
				Static189.method2824(0, Static70.method1166(new Class20[] { Static134.aClass20_1016, local33, Static211.aClass20_1519 }), Static215.aClass20_1545);
				return;
			}
		}
		if (local33.method594(Static210.aClass1_Sub2_Sub2_2.aClass20_848)) {
			Static189.method2824(0, Static44.aClass20_337, Static215.aClass20_1545);
			return;
		}
		Static70.aClass20Array7[anInt1957] = local33;
		Static129.aLongArray29[anInt1957] = arg0;
		Static142.anIntArray315[anInt1957] = 0;
		Static178.aClass20Array27[anInt1957] = Static215.aClass20_1545;
		Static24.anIntArray31[anInt1957] = 0;
		Static209.aBooleanArray50[anInt1957] = false;
		anInt1957++;
		Static148.anInt3054 = Static98.anInt2085;
		Static43.aClass5_Sub6_Sub1_2.method3087(92);
		Static43.aClass5_Sub6_Sub1_2.method3037(arg0);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method1507() {
		while (true) {
			if (Static10.aClass5_Sub6_Sub1_1.method3089(Static6.anInt155) >= 11) {
				@Pc(21) int local21 = Static10.aClass5_Sub6_Sub1_1.method3090(11);
				if (local21 != 2047) {
					@Pc(26) boolean local26 = false;
					if (Static6.aClass1_Sub2_Sub2Array1[local21] == null) {
						Static6.aClass1_Sub2_Sub2Array1[local21] = new Class1_Sub2_Sub2();
						local26 = true;
						if (Static57.aClass5_Sub6Array1[local21] != null) {
							Static6.aClass1_Sub2_Sub2Array1[local21].method1752(Static57.aClass5_Sub6Array1[local21]);
						}
					}
					Static7.anIntArray13[Static66.anInt1444++] = local21;
					@Pc(62) Class1_Sub2_Sub2 local62 = Static6.aClass1_Sub2_Sub2Array1[local21];
					local62.anInt2258 = Static177.anInt3533;
					@Pc(70) int local70 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
					if (local70 == 1) {
						Static188.anIntArray395[Static17.anInt347++] = local21;
					}
					@Pc(88) int local88 = Static10.aClass5_Sub6_Sub1_1.method3090(5);
					@Pc(95) int local95 = Static69.anIntArray138[Static10.aClass5_Sub6_Sub1_1.method3090(3)];
					if (local26) {
						local62.anInt2246 = local62.anInt2244 = local95;
					}
					@Pc(108) int local108 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
					@Pc(113) int local113 = Static10.aClass5_Sub6_Sub1_1.method3090(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					if (local113 > 15) {
						local113 -= 32;
					}
					local62.method1744(local113 + Static210.aClass1_Sub2_Sub2_2.anIntArray250[0], local108 == 1, Static210.aClass1_Sub2_Sub2_2.anIntArray253[0] + local88);
					continue;
				}
			}
			Static10.aClass5_Sub6_Sub1_1.method3086();
			return;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1510(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static30.aClass15_1);
		arg0.addMouseMotionListener(Static30.aClass15_1);
		arg0.addFocusListener(Static30.aClass15_1);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IZ)Z")
	public static boolean method1511(@OriginalArg(0) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
