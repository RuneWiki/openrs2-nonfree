import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!rb", name = "sb", descriptor = "Lclient!ba;")
	public static Class2_Sub3 aClass2_Sub3_4;

	@OriginalMember(owner = "client!rb", name = "tb", descriptor = "[Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2[] aClass2_Sub1_Sub2_Sub2Array8;

	@OriginalMember(owner = "client!rb", name = "Ab", descriptor = "Lclient!aa;")
	public static Class2_Sub1_Sub1_Sub1_Sub1 aClass2_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!rb", name = "Fb", descriptor = "Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 aClass2_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!rb", name = "xb", descriptor = "[J")
	public static long[] aLongArray4 = new long[100];

	@OriginalMember(owner = "client!rb", name = "Cb", descriptor = "[Lclient!pa;")
	public static Class2_Sub1_Sub1_Sub5[] aClass2_Sub1_Sub1_Sub5Array1 = new Class2_Sub1_Sub1_Sub5[4];

	@OriginalMember(owner = "client!rb", name = "Eb", descriptor = "[I")
	public static int[] anIntArray288 = new int[128];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!wc;")
	public static Class4 method1550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class4_Sub2");
			@Pc(15) Class4 local15 = (Class4) local11.getDeclaredConstructor().newInstance();
			local15.method1522(arg1, arg2, arg0);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class4_Sub1 local28 = new Class4_Sub1();
			local28.method1522(arg1, arg2, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V")
	public static void method1551(@OriginalArg(1) int arg0) {
		Static76.anInt2062 = arg0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public static void method1552(@OriginalArg(1) int arg0) {
		if (Static8.aClass14_1 == null) {
			return;
		}
		if (Static53.anInt1751 == 0) {
			if (Static103.anInt2605 >= 0) {
				Static103.anInt2605 = arg0;
				Static8.aClass14_1.method1080(arg0, 0);
			}
		} else if (Static2.aByteArray2 != null) {
			Static31.anInt1223 = arg0;
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V")
	public static void method1553() {
		for (@Pc(18) Class2_Sub5 local18 = (Class2_Sub5) Static76.aClass46_7.method1435(); local18 != null; local18 = (Class2_Sub5) Static76.aClass46_7.method1442()) {
			if (local18.anInt907 > 0) {
				local18.anInt907--;
			}
			if (local18.anInt907 != 0) {
				if (local18.anInt909 > 0) {
					local18.anInt909--;
				}
				if (local18.anInt909 == 0 && local18.anInt914 >= 1 && local18.anInt913 >= 1 && local18.anInt914 <= 102 && local18.anInt913 <= 102 && (local18.anInt896 < 0 || Static69.method1822(local18.anInt906, local18.anInt896))) {
					Static87.method1557(local18.anInt913, local18.anInt896, local18.anInt914, local18.anInt906, local18.anInt911, local18.anInt903, local18.anInt897);
					local18.anInt909 = -1;
					if (local18.anInt904 == local18.anInt896 && local18.anInt904 == -1) {
						local18.method1820();
					} else if (local18.anInt896 == local18.anInt904 && local18.anInt911 == local18.anInt902 && local18.anInt906 == local18.anInt912) {
						local18.method1820();
					}
				}
			} else if (local18.anInt904 < 0 || Static69.method1822(local18.anInt912, local18.anInt904)) {
				Static87.method1557(local18.anInt913, local18.anInt904, local18.anInt914, local18.anInt912, local18.anInt902, local18.anInt903, local18.anInt897);
				local18.method1820();
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
	public static void method1554() {
		anIntArray288 = null;
		aClass2_Sub3_4 = null;
		aClass2_Sub1_Sub1_Sub1_Sub1_1 = null;
		aClass2_Sub1_Sub1_Sub5Array1 = null;
		aClass2_Sub1_Sub2_Sub4_6 = null;
		aLongArray4 = null;
		aClass2_Sub1_Sub2_Sub2Array8 = null;
	}
}
