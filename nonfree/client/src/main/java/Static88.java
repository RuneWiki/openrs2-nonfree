import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BIIII)Z")
	public static boolean method4150(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class6_Sub1 local12 = new Class6_Sub1(arg1);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local12.method6487();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(39) int local39;
				while (!local33) {
					local39 = local12.method6445();
					if (local39 == 0) {
						continue label54;
					}
					local31 += local39 - 1;
					@Pc(69) int local69 = local31 & 0x3F;
					@Pc(75) int local75 = local31 >> 6 & 0x3F;
					@Pc(81) int local81 = local12.method6433() >> 2;
					@Pc(86) int local86 = local75 + arg3;
					@Pc(90) int local90 = local69 + arg0;
					if (local86 > 0 && local90 > 0 && local86 < arg4 - 1 && arg2 - 1 > local90) {
						@Pc(117) Class106 local117 = Static448.aClass104_4.method2616(local19);
						if (local81 != 22 || Static291.aClass28_Sub1_1.aBoolean78 || local117.anInt3163 != 0 || local117.anInt3186 == 1 || local117.aBoolean213) {
							local33 = true;
							if (!local117.method2634()) {
								Static252.anInt4606++;
								local7 = false;
							}
						}
					}
				}
				local39 = local12.method6445();
				if (local39 == 0) {
					break;
				}
				local12.method6433();
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
	public static boolean method4151(@OriginalArg(0) int arg0) {
		if (Static234.aBooleanArray17[arg0]) {
			return true;
		} else if (Static378.aClass100_82.method2497(arg0)) {
			@Pc(23) int local23 = Static378.aClass100_82.method2523(arg0);
			if (local23 == 0) {
				Static234.aBooleanArray17[arg0] = true;
				return true;
			}
			if (Static35.aClass239ArrayArray1[arg0] == null) {
				Static35.aClass239ArrayArray1[arg0] = new Class239[local23];
			}
			for (@Pc(42) int local42 = 0; local42 < local23; local42++) {
				if (Static35.aClass239ArrayArray1[arg0][local42] == null) {
					@Pc(61) byte[] local61 = Static378.aClass100_82.method2520(local42, arg0);
					if (local61 != null) {
						@Pc(73) Class239 local73 = Static35.aClass239ArrayArray1[arg0][local42] = new Class239();
						local73.anInt6908 = local42 + (arg0 << 16);
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method5739(new Class6_Sub1(local61));
					}
				}
			}
			Static234.aBooleanArray17[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)I")
	public static int method4155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class145.anIntArray280[arg3 * 8192 / arg0] >> 1;
		return ((65536 - local16) * arg1 >> 16) + (local16 * arg2 >> 16);
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	public static void method4156(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static111.anInt2357 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z")
	public static boolean method4159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZJ)V")
	public static void method4161(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static360.method5332(arg0 - 1L);
			Static360.method5332(1L);
		} else {
			Static360.method5332(arg0);
		}
	}
}
