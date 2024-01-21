import java.awt.event.ActionEvent;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "[I")
	public static int[] anIntArray307;

	@OriginalMember(owner = "client!pb", name = "E", descriptor = "[Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2[] aClass1_Sub1_Sub2_Sub2Array9;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!pb", name = "u", descriptor = "Lclient!id;")
	public static Class34 aClass34_1191 = Static9.method266("hitmarks");

	@OriginalMember(owner = "client!pb", name = "D", descriptor = "Lclient!id;")
	private static Class34 aClass34_1197 = Static9.method266("Select");

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_1192 = aClass34_1197;

	@OriginalMember(owner = "client!pb", name = "x", descriptor = "Lclient!id;")
	public static Class34 aClass34_1193 = Static9.method266("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!pb", name = "y", descriptor = "[Lclient!of;")
	public static Class1_Sub19[] aClass1_Sub19Array1 = new Class1_Sub19[2048];

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "Lclient!id;")
	public static Class34 aClass34_1194 = Static9.method266("k");

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_1195 = Static9.method266(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!pb", name = "C", descriptor = "Lclient!id;")
	public static Class34 aClass34_1196 = Static9.method266("::errortest");

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
	public static int anInt2428 = 0;

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
	public static int anInt2429 = 0;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
	public static int anInt2430 = 0;

	@OriginalMember(owner = "client!pb", name = "I", descriptor = "Lclient!id;")
	public static Class34 aClass34_1198 = Static9.method266("Spieler");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
	public static void method1591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub23 local6 = (Class1_Sub23) Static127.aClass38_16.method1034(); local6 != null; local6 = (Class1_Sub23) Static127.aClass38_16.method1038()) {
			if (local6.anInt2883 != -1 || local6.anIntArray356 != null) {
				@Pc(18) int local18 = 0;
				if (arg1 > local6.anInt2872) {
					local18 = arg1 - local6.anInt2872;
				} else if (local6.anInt2874 > arg1) {
					local18 = local6.anInt2874 - arg1;
				}
				if (local6.anInt2869 < arg0) {
					local18 += arg0 - local6.anInt2869;
				} else if (local6.anInt2873 > arg0) {
					local18 += local6.anInt2873 - arg0;
				}
				if (local18 - 64 > local6.anInt2882 || Static66.anInt1753 == 0 || arg2 != local6.anInt2876) {
					if (local6.aClass1_Sub4_Sub3_2 != null) {
						Static30.aClass1_Sub4_Sub4_2.method1903(local6.aClass1_Sub4_Sub3_2);
						local6.aClass1_Sub4_Sub3_2 = null;
					}
					if (local6.aClass1_Sub4_Sub3_3 != null) {
						Static30.aClass1_Sub4_Sub4_2.method1903(local6.aClass1_Sub4_Sub3_3);
						local6.aClass1_Sub4_Sub3_3 = null;
					}
				} else {
					local18 -= 64;
					if (local18 < 0) {
						local18 = 0;
					}
					@Pc(131) int local131 = Static66.anInt1753 * (local6.anInt2882 - local18) / local6.anInt2882;
					if (local6.aClass1_Sub4_Sub3_2 != null) {
						local6.aClass1_Sub4_Sub3_2.method1231(local131);
					} else if (local6.anInt2883 >= 0) {
						@Pc(146) Class72 local146 = Static139.method1828(Static133.aClass35_Sub1_29, local6.anInt2883, 0);
						if (local146 != null) {
							@Pc(153) Class1_Sub17_Sub1 local153 = local146.method1826().method1299(Static110.aClass43_2);
							@Pc(158) Class1_Sub4_Sub3 local158 = Static137.method1235(local153, local131);
							local158.method1239(-1);
							Static30.aClass1_Sub4_Sub4_2.method1905(local158);
							local6.aClass1_Sub4_Sub3_2 = local158;
						}
					}
					if (local6.aClass1_Sub4_Sub3_3 != null) {
						local6.aClass1_Sub4_Sub3_3.method1231(local131);
						if (!local6.aClass1_Sub4_Sub3_3.method2040()) {
							local6.aClass1_Sub4_Sub3_3 = null;
						}
					} else if (local6.anIntArray356 != null && (local6.anInt2879 -= arg3) <= 0) {
						@Pc(198) int local198 = (int) (Math.random() * (double) local6.anIntArray356.length);
						@Pc(206) Class72 local206 = Static139.method1828(Static133.aClass35_Sub1_29, local6.anIntArray356[local198], 0);
						if (local206 != null) {
							@Pc(213) Class1_Sub17_Sub1 local213 = local206.method1826().method1299(Static110.aClass43_2);
							@Pc(218) Class1_Sub4_Sub3 local218 = Static137.method1235(local213, local131);
							local218.method1239(0);
							Static30.aClass1_Sub4_Sub4_2.method1905(local218);
							local6.anInt2879 = (int) (Math.random() * (double) (local6.anInt2875 - local6.anInt2881)) + local6.anInt2881;
							local6.aClass1_Sub4_Sub3_3 = local218;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1593() {
		aClass34_1197 = null;
		aBigInteger1 = null;
		aClass34_1198 = null;
		aClass34_1193 = null;
		aClass1_Sub19Array1 = null;
		aClass1_Sub1_Sub2_Sub2Array9 = null;
		aClass34_1194 = null;
		aClass34_1196 = null;
		aClass34_1192 = null;
		aClass34_1191 = null;
		aClass34_1195 = null;
		anIntArray307 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!dd;Ljava/lang/Object;I)V")
	public static void method1597(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 50 && arg0.anEventQueue1.peekEvent() != null; local15++) {
			Static109.method2037(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
