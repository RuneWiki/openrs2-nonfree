import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "Lclient!cd;")
	public static Class15 aClass15_7;

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!ed;")
	public static Class27 aClass27_1 = new Class27();

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "[I")
	public static final int[] anIntArray180 = new int[1000];

	@OriginalMember(owner = "client!ja", name = "w", descriptor = "I")
	public static final int anInt1873 = 3353893;

	@OriginalMember(owner = "client!ja", name = "x", descriptor = "I")
	public static int anInt1874 = 0;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_590 = Static181.method2795("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
	public static int anInt1875 = 0;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_591 = Static181.method2795("Please try again)3");

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "Lclient!qe;")
	public static Class83 aClass83_592 = aClass83_591;

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "Lclient!qe;")
	public static Class83 aClass83_593 = aClass83_590;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)Lclient!mh;")
	public static Class2_Sub2_Sub21 method1504(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub2_Sub21 local8 = (Class2_Sub2_Sub21) Static192.aClass86_49.method2643((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static211.aClass28_Sub1_27.method852(0, arg0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class2_Sub2_Sub21();
		@Pc(35) Class2_Sub3 local35 = new Class2_Sub3(local22);
		local35.anInt340 = local35.aByteArray2.length - 2;
		@Pc(46) int local46 = local35.method269();
		@Pc(57) int local57 = local35.aByteArray2.length - local46 - 12 - 2;
		local35.anInt340 = local57;
		@Pc(64) int local64 = local35.method248();
		local8.anInt2730 = local35.method269();
		local8.anInt2737 = local35.method269();
		local8.anInt2729 = local35.method269();
		local8.anInt2734 = local35.method269();
		@Pc(92) int local92 = local35.method260();
		@Pc(103) int local103;
		@Pc(109) int local109;
		if (local92 > 0) {
			local8.aClass63Array1 = new Class63[local92];
			for (local103 = 0; local103 < local92; local103++) {
				local109 = local35.method269();
				@Pc(118) Class63 local118 = new Class63(Static108.method1872(local109));
				local8.aClass63Array1[local103] = local118;
				while (local109-- > 0) {
					@Pc(129) int local129 = local35.method248();
					@Pc(133) int local133 = local35.method248();
					local118.method2115((long) local129, new Class2_Sub10(local133));
				}
			}
		}
		local35.anInt340 = 0;
		local8.aClass83_814 = local35.method236();
		local8.anIntArray273 = new int[local64];
		local103 = 0;
		local8.anIntArray272 = new int[local64];
		local8.aClass83Array47 = new Class83[local64];
		while (local35.anInt340 < local57) {
			local109 = local35.method269();
			if (local109 == 3) {
				local8.aClass83Array47[local103] = local35.method259();
			} else if (local109 >= 100 || local109 == 21 || local109 == 38 || local109 == 39) {
				local8.anIntArray272[local103] = local35.method260();
			} else {
				local8.anIntArray272[local103] = local35.method248();
			}
			local8.anIntArray273[local103++] = local109;
		}
		Static192.aClass86_49.method2647(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
	public static void method1505() {
		Static194.aClass86_50.method2641();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
	public static void method1506() {
		for (@Pc(12) Class2_Sub2_Sub6 local12 = (Class2_Sub2_Sub6) Static81.aClass19_8.method691(); local12 != null; local12 = (Class2_Sub2_Sub6) Static81.aClass19_8.method686()) {
			@Pc(17) Class24_Sub1 local17 = local12.aClass24_Sub1_1;
			if (Static43.anInt1126 != local17.anInt1003 || local17.anInt991 < Static13.anInt386) {
				local12.method3254();
			} else if (Static13.anInt386 >= local17.anInt1015) {
				if (local17.anInt999 > 0) {
					@Pc(43) Class24_Sub4_Sub2 local43 = Static47.aClass24_Sub4_Sub2Array1[local17.anInt999 - 1];
					if (local43 != null && local43.anInt3316 >= 0 && local43.anInt3316 < 13312 && local43.anInt3349 >= 0 && local43.anInt3349 < 13312) {
						local17.method787(Static13.anInt386, local43.anInt3316, local43.anInt3349, Static177.method2711(local43.anInt3316, local17.anInt1003, local43.anInt3349) - local17.anInt994);
					}
				}
				if (local17.anInt999 < 0) {
					@Pc(98) int local98 = -local17.anInt999 - 1;
					@Pc(105) Class24_Sub4_Sub1 local105;
					if (Static138.anInt2924 == local98) {
						local105 = Static54.aClass24_Sub4_Sub1_1;
					} else {
						local105 = Static22.aClass24_Sub4_Sub1Array1[local98];
					}
					if (local105 != null && local105.anInt3316 >= 0 && local105.anInt3316 < 13312 && local105.anInt3349 >= 0 && local105.anInt3349 < 13312) {
						local17.method787(Static13.anInt386, local105.anInt3316, local105.anInt3349, Static177.method2711(local105.anInt3316, local17.anInt1003, local105.anInt3349) - local17.anInt994);
					}
				}
				local17.method782(Static57.anInt1427);
				Static98.method1682(Static43.anInt1126, (int) local17.aDouble4, (int) local17.aDouble8, (int) local17.aDouble3, 60, local17, local17.anInt1008, -1L, false);
			}
		}
	}
}
