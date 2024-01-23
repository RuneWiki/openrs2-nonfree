import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "Lclient!ai;")
	public static Class7 aClass7_18;

	@OriginalMember(owner = "client!jg", name = "U", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!jg", name = "K", descriptor = "Lclient!eg;")
	public static Class1_Sub9_Sub1 aClass1_Sub9_Sub1_3 = new Class1_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!jg", name = "N", descriptor = "Lclient!kh;")
	private static Class60 aClass60_729 = Static200.method3116("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "Lclient!kh;")
	public static Class60 aClass60_728 = aClass60_729;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
	public static int anInt2254 = -1;

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "Lclient!kh;")
	private static Class60 aClass60_732 = Static200.method3116("Starting 3d library");

	@OriginalMember(owner = "client!jg", name = "P", descriptor = "Lclient!kh;")
	public static Class60 aClass60_730 = aClass60_732;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray34 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "Lclient!kh;")
	public static Class60 aClass60_731 = Static200.method3116("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "[S")
	public static short[] aShortArray25 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public static void method1668() {
		Static77.method1384(false);
		@Pc(10) boolean local10 = true;
		Static78.anInt1882 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static27.aByteArrayArray2.length; local14++) {
			if (Static159.anIntArray457[local14] != -1 && Static27.aByteArrayArray2[local14] == null) {
				Static27.aByteArrayArray2[local14] = Static71.aClass7_Sub1_15.method3242(Static159.anIntArray457[local14], 0);
				if (Static27.aByteArrayArray2[local14] == null) {
					local10 = false;
					Static78.anInt1882++;
				}
			}
			if (Static173.anIntArray491[local14] != -1 && Static12.aByteArrayArray1[local14] == null) {
				Static12.aByteArrayArray1[local14] = Static71.aClass7_Sub1_15.method3232(Static146.anIntArrayArray52[local14], 0, Static173.anIntArray491[local14]);
				if (Static12.aByteArrayArray1[local14] == null) {
					Static78.anInt1882++;
					local10 = false;
				}
			}
		}
		if (!local10) {
			Static21.anInt493 = 1;
			return;
		}
		Static3.anInt70 = 0;
		local10 = true;
		@Pc(123) int local123;
		@Pc(134) int local134;
		for (@Pc(104) int local104 = 0; local104 < Static27.aByteArrayArray2.length; local104++) {
			@Pc(110) byte[] local110 = Static12.aByteArrayArray1[local104];
			if (local110 != null) {
				local123 = (Static193.anIntArray536[local104] >> 8) * 64 - Static128.anInt2813;
				local134 = (Static193.anIntArray536[local104] & 0xFF) * 64 - Static163.anInt3587;
				if (Static63.aBoolean83) {
					local123 = 10;
					local134 = 10;
				}
				local10 &= Static157.method2651(local123, local134, local110);
			}
		}
		if (!local10) {
			Static21.anInt493 = 2;
			return;
		}
		if (Static21.anInt493 != 0) {
			Static199.method3114(Static34.method611(new Class60[] { Static56.aClass60_449, Static192.aClass60_1390 }), true);
		}
		Static84.method1044();
		Static138.method2372();
		Static26.method432();
		for (@Pc(186) int local186 = 0; local186 < 4; local186++) {
			Static153.aClass3Array1[local186].method43();
		}
		@Pc(207) int local207;
		for (local123 = 0; local123 < 4; local123++) {
			for (local134 = 0; local134 < 104; local134++) {
				for (local207 = 0; local207 < 104; local207++) {
					Static209.aByteArrayArrayArray13[local123][local134][local207] = 0;
				}
			}
		}
		Static50.method1424();
		Static84.method1044();
		System.gc();
		Static84.method1044();
		Static77.method1384(true);
		Static192.method3006();
		if (!Static63.aBoolean83) {
			Static192.method3008();
			Static77.method1384(true);
			Static90.method1563();
		}
		if (Static63.aBoolean83) {
			Static137.method3326();
			Static77.method1384(true);
			Static97.method1670();
		}
		Static138.method2372();
		Static77.method1384(true);
		Static84.method1044();
		Static207.method3214(Static153.aClass3Array1);
		Static77.method1384(true);
		Static84.method1044();
		local134 = Static30.anInt722;
		if (Static180.anInt3841 < local134) {
			local134 = Static180.anInt3841;
		}
		if (local134 < Static180.anInt3841 - 1) {
		}
		if (Static148.aBoolean266) {
			Static142.method2445(Static30.anInt722);
		} else {
			Static142.method2445(0);
		}
		Static94.method1626();
		@Pc(320) int local320;
		for (local207 = 0; local207 < 104; local207++) {
			for (local320 = 0; local320 < 104; local320++) {
				Static124.method2105(local320, local207);
			}
		}
		Static84.method1044();
		Static36.method2895();
		Static138.method2372();
		if (Static99.aFrame1 != null) {
			aClass1_Sub9_Sub1_3.method953(198);
			aClass1_Sub9_Sub1_3.method921(1057001181);
		}
		if (!Static63.aBoolean83) {
			@Pc(364) int local364 = (Static36.anInt3891 - 6) / 8;
			@Pc(370) int local370 = (Static134.anInt2900 + 6) / 8;
			@Pc(376) int local376 = (Static36.anInt3891 + 6) / 8;
			local320 = (Static134.anInt2900 - 6) / 8;
			for (@Pc(386) int local386 = local320 - 1; local386 <= local370 + 1; local386++) {
				for (@Pc(392) int local392 = local364 - 1; local392 <= local376 + 1; local392++) {
					if (local320 > local386 || local370 < local386 || local364 > local392 || local376 < local392) {
						Static71.aClass7_Sub1_15.method3218(Static34.method611(new Class60[] { Static10.aClass60_93, Static40.method681(local386), Static161.aClass60_1224, Static40.method681(local392) }));
						Static71.aClass7_Sub1_15.method3218(Static34.method611(new Class60[] { Static83.aClass60_646, Static40.method681(local386), Static161.aClass60_1224, Static40.method681(local392) }));
					}
				}
			}
		}
		Static85.method1486(30);
		Static84.method1044();
		aClass1_Sub9_Sub1_3.method953(213);
		Static51.method969();
	}
}
