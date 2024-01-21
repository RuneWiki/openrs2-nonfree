import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static84 {

	@OriginalMember(owner = "client!jg", name = "p", descriptor = "Lclient!vg;")
	public static Class85 aClass85_6;

	@OriginalMember(owner = "client!jg", name = "r", descriptor = "Lclient!db;")
	public static Class2_Sub2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub2_Sub1_Sub1_4;

	@OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
	public static int anInt1796 = 0;

	@OriginalMember(owner = "client!jg", name = "t", descriptor = "Lclient!lf;")
	private static Class49 aClass49_892 = Static32.method683("Ok");

	@OriginalMember(owner = "client!jg", name = "u", descriptor = "Lclient!lf;")
	public static Class49 aClass49_893 = Static32.method683("::errortest");

	@OriginalMember(owner = "client!jg", name = "w", descriptor = "Lclient!lf;")
	public static Class49 aClass49_894 = aClass49_892;

	@OriginalMember(owner = "client!jg", name = "z", descriptor = "Lclient!lf;")
	private static Class49 aClass49_895 = Static32.method683("Prepared visibility map");

	@OriginalMember(owner = "client!jg", name = "A", descriptor = "Lclient!lf;")
	public static Class49 aClass49_896 = aClass49_895;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "Lclient!lf;")
	private static Class49 aClass49_897 = Static32.method683("level)2");

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "Lclient!lf;")
	public static Class49 aClass49_898 = aClass49_897;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
	public static void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int[] local4 = new int[4];
		local4[0] = arg1;
		@Pc(14) int local14 = 1;
		@Pc(17) int[] local17 = new int[4];
		local17[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (Static139.anIntArray280[local23] != arg1) {
				local4[local14] = Static139.anIntArray280[local23];
				local17[local14] = Static111.anIntArray223[local23];
				local14++;
			}
		}
		Static139.anIntArray280 = local4;
		Static111.anIntArray223 = local17;
		method1437(Static139.anIntArray280, 0, Static148.aClass28Array1.length - 1, Static148.aClass28Array1, Static111.anIntArray223);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)I")
	public static int method1435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V")
	public static void method1436() {
		aClass49_897 = null;
		aClass49_895 = null;
		aClass2_Sub2_Sub2_Sub1_Sub1_4 = null;
		aClass49_893 = null;
		aClass49_892 = null;
		aClass49_898 = null;
		aClass85_6 = null;
		aClass49_896 = null;
		aClass49_894 = null;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "([III[Lclient!fd;I[I)V")
	public static void method1437(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28[] arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(8) int local8 = arg1 - 1;
		@Pc(12) int local12 = arg2 + 1;
		@Pc(18) int local18 = (arg2 + arg1) / 2;
		@Pc(22) Class28 local22 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local22;
		while (local8 < local12) {
			@Pc(36) boolean local36 = true;
			@Pc(39) int local39;
			@Pc(53) int local53;
			@Pc(56) int local56;
			do {
				local12--;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg0[local39] == 2) {
						local53 = arg3[local12].anInt1158;
						local56 = local22.anInt1158;
					} else if (arg0[local39] == 1) {
						local56 = local22.anInt1159;
						if (local56 == -1 && arg4[local39] == 1) {
							local56 = 2001;
						}
						local53 = arg3[local12].anInt1159;
						if (local53 == -1 && arg4[local39] == 1) {
							local53 = 2001;
						}
					} else if (arg0[local39] == 3) {
						local56 = local22.aBoolean43 ? 1 : 0;
						local53 = arg3[local12].aBoolean43 ? 1 : 0;
					} else {
						local53 = arg3[local12].anInt1163;
						local56 = local22.anInt1163;
					}
					if (local56 != local53) {
						if ((arg4[local39] != 1 || local56 >= local53) && (arg4[local39] != 0 || local56 <= local53)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			local36 = true;
			do {
				local8++;
				for (local39 = 0; local39 < 4; local39++) {
					if (arg0[local39] == 2) {
						local53 = arg3[local8].anInt1158;
						local56 = local22.anInt1158;
					} else if (arg0[local39] == 1) {
						local56 = local22.anInt1159;
						local53 = arg3[local8].anInt1159;
						if (local56 == -1 && arg4[local39] == 1) {
							local56 = 2001;
						}
						if (local53 == -1 && arg4[local39] == 1) {
							local53 = 2001;
						}
					} else if (arg0[local39] == 3) {
						local53 = arg3[local8].aBoolean43 ? 1 : 0;
						local56 = local22.aBoolean43 ? 1 : 0;
					} else {
						local56 = local22.anInt1163;
						local53 = arg3[local8].anInt1163;
					}
					if (local56 != local53) {
						if ((arg4[local39] != 1 || local56 <= local53) && (arg4[local39] != 0 || local56 >= local53)) {
							local36 = false;
						}
						break;
					}
					if (local39 == 3) {
						local36 = false;
					}
				}
			} while (local36);
			if (local8 < local12) {
				@Pc(337) Class28 local337 = arg3[local8];
				arg3[local8] = arg3[local12];
				arg3[local12] = local337;
			}
		}
		method1437(arg0, arg1, local12, arg3, arg4);
		method1437(arg0, local12 + 1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
	public static void method1438(@OriginalArg(0) int arg0) {
		Static123.anInt2729 = 1000 / arg0;
	}
}
