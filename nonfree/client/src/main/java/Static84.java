import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "B")
	public static byte aByte5;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!uf;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
	public static int anInt2252 = 0;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "Lclient!ec;")
	public static Class22 aClass22_638 = Static60.method1113("<col=00ff80>");

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
	public static int anInt2255 = 0;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
	public static int[] anIntArray257 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	private static void method1491() {
		Static78.aClass33_26.method1003();
		Static41.aClass33_17.method1003();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public static void method1492(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub19 local12 = (Class4_Sub19) Static30.aClass81_4.method2010((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray273.length; local17++) {
				local12.anIntArray273[local17] = -1;
				local12.anIntArray272[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!ec;Lclient!ea;ZILclient!ec;B)V")
	public static void method1493(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(4) Class22 arg2) {
		@Pc(8) int local8 = arg1.method592(arg2);
		@Pc(14) int local14 = arg1.method606(arg0, local8);
		Static130.method2009(arg1, local8, 255, local14);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	public static void method1494() {
		Static50.method969();
		Static132.method2033();
		Static42.method581();
		Static41.method753();
		Static66.method1155();
		Static52.method1000();
		Static96.method1607();
		method1491();
		Static14.method277();
		Static44.method864();
		Static96.method1612();
		Static7.method132();
		((Class75) Static6.anInterface2_1).method1850();
		Static43.aClass33_18.method1003();
		Static76.aClass20_Sub1_48.method605();
		Static33.aClass20_Sub1_22.method605();
		Static55.aClass20_Sub1_29.method605();
		Static1.aClass20_Sub1_1.method605();
		Static112.aClass20_Sub1_70.method605();
		Static103.aClass20_Sub1_66.method605();
		Static124.aClass20_Sub1_77.method605();
		Static26.aClass20_Sub1_25.method605();
		Static68.aClass20_Sub1_14.method605();
		Static59.aClass20_Sub1_43.method605();
		Static80.aClass20_Sub1_55.method605();
		Static80.aClass20_Sub1_54.method605();
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
	public static void method1495(@OriginalArg(0) int arg0) {
		if (arg0 == -1 && !Static93.aBoolean223) {
			Static56.method1033();
		} else if (arg0 != -1 && Static10.anInt209 != arg0 && Static133.anInt3152 != 0 && !Static93.aBoolean223) {
			Static72.method1187(Static103.aClass20_Sub1_66, Static133.anInt3152, 0, arg0);
		}
		Static10.anInt209 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	public static void method1496() {
		aClass22_638 = null;
		anIntArray257 = null;
		anImage4 = null;
		aClass31_1 = null;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
	public static void method1497() {
		for (@Pc(13) Class4_Sub1_Sub3_Sub7 local13 = (Class4_Sub1_Sub3_Sub7) Static132.aClass82_14.method2025(); local13 != null; local13 = (Class4_Sub1_Sub3_Sub7) Static132.aClass82_14.method2023()) {
			if (local13.anInt2815 != Static37.anInt895 || local13.aBoolean251) {
				local13.method1999();
			} else if (local13.anInt2817 <= Static117.anInt2877) {
				local13.method1822(Static46.anInt1293);
				if (local13.aBoolean251) {
					local13.method1999();
				} else {
					Static134.aClass77_1.method1950(local13.anInt2815, local13.anInt2827, local13.anInt2831, local13.anInt2830, 60, local13, 0, -1, false);
				}
			}
		}
	}
}
