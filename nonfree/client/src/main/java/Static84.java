import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
	public static int anInt2396;

	@OriginalMember(owner = "client!jg", name = "bb", descriptor = "Lclient!qf;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "Lclient!dd;")
	private static Class13 aClass13_790 = Static161.method2971("glow1:");

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lclient!dd;")
	public static Class13 aClass13_789 = aClass13_790;

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
	public static int anInt2393 = 0;

	@OriginalMember(owner = "client!jg", name = "db", descriptor = "Lclient!dd;")
	public static Class13 aClass13_791 = aClass13_790;

	@OriginalMember(owner = "client!jg", name = "jb", descriptor = "Lclient!ld;")
	public static Class47 aClass47_16 = new Class47(64);

	@OriginalMember(owner = "client!jg", name = "kb", descriptor = "I")
	public static int anInt2404 = 0;

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V")
	public static void method1797() {
		aClass13_789 = null;
		aClass72_1 = null;
		aClass13_790 = null;
		aClass13_791 = null;
		aClass47_16 = null;
	}

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] method1798() {
		@Pc(8) Class1_Sub2_Sub1_Sub3[] local8 = new Class1_Sub2_Sub1_Sub3[Static123.anInt3217];
		for (@Pc(18) int local18 = 0; local18 < Static123.anInt3217; local18++) {
			@Pc(24) Class1_Sub2_Sub1_Sub3 local24 = new Class1_Sub2_Sub1_Sub3();
			local24.anInt356 = Static51.anInt1673;
			local24.anInt354 = Static32.anInt4094;
			local24.anInt355 = Static184.anIntArray449[local18];
			local24.anInt359 = Static130.anIntArray324[local18];
			local24.anInt358 = Static12.anIntArray51[local18];
			local24.anInt357 = Static106.anIntArray285[local18];
			@Pc(56) int local56 = local24.anInt357 * local24.anInt358;
			@Pc(60) byte[] local60 = Static180.aByteArrayArray10[local18];
			local24.anIntArray45 = new int[local56];
			for (@Pc(66) int local66 = 0; local66 < local56; local66++) {
				local24.anIntArray45[local66] = Static104.anIntArray268[local60[local66] & 0xFF];
			}
			local8[local18] = local24;
		}
		Static111.method2163();
		return local8;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIIZ)Lclient!dd;")
	public static Class13 method1799(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(26) int local26 = arg0 / 10;
		@Pc(28) int local28 = 1;
		while (local26 != 0) {
			local28++;
			local26 /= 10;
		}
		@Pc(42) int local42 = local28;
		if (arg0 < 0 || arg1) {
			local42 = local28 + 1;
		}
		@Pc(58) byte[] local58 = new byte[local42];
		if (arg0 < 0) {
			local58[0] = 45;
		} else if (arg1) {
			local58[0] = 43;
		}
		for (@Pc(74) int local74 = 0; local74 < local28; local74++) {
			@Pc(80) int local80 = arg0 % 10;
			arg0 /= 10;
			if (local80 < 0) {
				local80 = -local80;
			}
			if (local80 > 9) {
				local80 += 39;
			}
			local58[local42 - local74 - 1] = (byte) (local80 + 48);
		}
		@Pc(119) Class13 local119 = new Class13();
		local119.aByteArray19 = local58;
		local119.anInt1080 = local42;
		return local119;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!gi;I)V")
	public static void method1800(@OriginalArg(0) Class1_Sub2_Sub2_Sub2 arg0) {
		arg0.aBoolean191 = false;
		@Pc(13) Class1_Sub2_Sub8 local13;
		if (arg0.anInt2593 != -1) {
			local13 = Static142.method2538(arg0.anInt2593);
			if (local13 == null || local13.anIntArray157 == null) {
				arg0.anInt2593 = -1;
			} else {
				arg0.anInt2571++;
				if (local13.anIntArray157.length > arg0.anInt2549 && local13.anIntArray155[arg0.anInt2549] < arg0.anInt2571) {
					arg0.anInt2549++;
					arg0.anInt2571 = 1;
					Static70.method1461(arg0 == Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1, arg0.anInt2596, arg0.anInt2549, arg0.anInt2606, local13);
				}
				if (local13.anIntArray157.length <= arg0.anInt2549) {
					arg0.anInt2571 = 0;
					arg0.anInt2549 = 0;
					Static70.method1461(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1 == arg0, arg0.anInt2596, arg0.anInt2549, arg0.anInt2606, local13);
				}
			}
		}
		if (arg0.anInt2603 != -1 && Static78.anInt2168 >= arg0.anInt2557) {
			if (arg0.anInt2598 < 0) {
				arg0.anInt2598 = 0;
			}
			@Pc(119) int local119 = Static42.method1121(arg0.anInt2603).anInt478;
			if (local119 == -1) {
				arg0.anInt2603 = -1;
			} else {
				@Pc(132) Class1_Sub2_Sub8 local132 = Static142.method2538(local119);
				if (local132 == null || local132.anIntArray157 == null) {
					arg0.anInt2603 = -1;
				} else {
					arg0.anInt2566++;
					if (arg0.anInt2598 < local132.anIntArray157.length && arg0.anInt2566 > local132.anIntArray155[arg0.anInt2598]) {
						arg0.anInt2566 = 1;
						arg0.anInt2598++;
						Static70.method1461(arg0 == Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1, arg0.anInt2596, arg0.anInt2598, arg0.anInt2606, local132);
					}
					if (local132.anIntArray157.length <= arg0.anInt2598) {
						arg0.anInt2603 = -1;
					}
				}
			}
		}
		if (arg0.anInt2553 != -1 && arg0.anInt2585 <= 1) {
			local13 = Static142.method2538(arg0.anInt2553);
			if (local13.anInt1517 == 1 && arg0.anInt2572 > 0 && arg0.anInt2588 <= Static78.anInt2168 && Static78.anInt2168 > arg0.anInt2573) {
				arg0.anInt2585 = 1;
				return;
			}
		}
		if (arg0.anInt2553 != -1 && arg0.anInt2585 == 0) {
			local13 = Static142.method2538(arg0.anInt2553);
			if (local13 == null || local13.anIntArray157 == null) {
				arg0.anInt2553 = -1;
			} else {
				arg0.anInt2551++;
				if (arg0.anInt2590 < local13.anIntArray157.length && local13.anIntArray155[arg0.anInt2590] < arg0.anInt2551) {
					arg0.anInt2590++;
					arg0.anInt2551 = 1;
					Static70.method1461(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1 == arg0, arg0.anInt2596, arg0.anInt2590, arg0.anInt2606, local13);
				}
				if (arg0.anInt2590 >= local13.anIntArray157.length) {
					arg0.anInt2590 -= local13.anInt1520;
					arg0.anInt2580++;
					if (local13.anInt1513 <= arg0.anInt2580) {
						arg0.anInt2553 = -1;
					} else if (arg0.anInt2590 >= 0 && arg0.anInt2590 < local13.anIntArray157.length) {
						Static70.method1461(arg0 == Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1, arg0.anInt2596, arg0.anInt2590, arg0.anInt2606, local13);
					} else {
						arg0.anInt2553 = -1;
					}
				}
				arg0.aBoolean191 = local13.aBoolean107;
			}
		}
		if (arg0.anInt2585 > 0) {
			arg0.anInt2585--;
		}
	}
}
