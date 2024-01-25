import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "Z")
	public static boolean aBoolean582;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString257 = "Unable to find ";

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!eb;)V")
	public static void method5653(@OriginalArg(1) Class1_Sub7 arg0) {
		if (arg0.aByteArray58.length - arg0.anInt3368 < 1) {
			return;
		}
		@Pc(19) int local19 = arg0.method3141();
		if (local19 < 0 || local19 > 14) {
			return;
		}
		@Pc(49) byte local49;
		if (local19 == 14) {
			local49 = 36;
		} else if (local19 == 13) {
			local49 = 35;
		} else if (local19 == 12) {
			local49 = 34;
		} else if (local19 == 11) {
			local49 = 33;
		} else if (local19 == 10) {
			local49 = 32;
		} else if (local19 == 9) {
			local49 = 31;
		} else if (local19 == 8) {
			local49 = 30;
		} else if (local19 == 7) {
			local49 = 29;
		} else if (local19 == 6) {
			local49 = 28;
		} else if (local19 == 5) {
			local49 = 28;
		} else if (local19 == 4) {
			local49 = 24;
		} else if (local19 == 3) {
			local49 = 23;
		} else if (local19 == 2) {
			local49 = 22;
		} else if (local19 == 1) {
			local49 = 23;
		} else {
			local49 = 19;
		}
		if (arg0.aByteArray58.length - arg0.anInt3368 < local49) {
			return;
		}
		Static210.anInt4175 = arg0.method3141();
		if (Static210.anInt4175 < 1) {
			Static210.anInt4175 = 1;
		} else if (Static210.anInt4175 > 4) {
			Static210.anInt4175 = 4;
		}
		Static88.method1694(arg0.method3141() == 1);
		Static216.aBoolean364 = arg0.method3141() == 1;
		Static217.aBoolean365 = arg0.method3141() == 1;
		Static305.aBoolean515 = arg0.method3141() == 1;
		Static331.anInt6338 = arg0.method3141() == 1 ? 1 : 0;
		Static1.aBoolean14 = arg0.method3141() == 1;
		Static127.aBoolean226 = arg0.method3141() == 1;
		Static264.aBoolean464 = arg0.method3141() == 1;
		Static158.anInt3147 = arg0.method3141();
		if (Static158.anInt3147 > 2) {
			Static158.anInt3147 = 2;
		}
		if (local19 >= 2) {
			Static44.aBoolean87 = arg0.method3141() == 1;
		} else {
			Static44.aBoolean87 = arg0.method3141() == 1;
			arg0.method3141();
		}
		Static8.aBoolean28 = arg0.method3141() == 1;
		Static41.aBoolean83 = arg0.method3141() == 1;
		Static158.anInt3151 = arg0.method3141();
		if (Static158.anInt3151 > 2) {
			Static158.anInt3151 = 2;
		}
		Static123.anInt2389 = Static158.anInt3151;
		Static337.aBoolean564 = arg0.method3141() == 1;
		Static115.anInt2304 = arg0.method3141();
		if (Static115.anInt2304 > 127) {
			Static115.anInt2304 = 127;
		}
		Static211.anInt4208 = arg0.method3141();
		Static8.anInt201 = arg0.method3141();
		if (Static8.anInt201 > 127) {
			Static8.anInt201 = 127;
		}
		if (local19 >= 1) {
			Static176.anInt3649 = arg0.method3115();
			Static114.anInt2288 = arg0.method3115();
		}
		if (local19 >= 3 && local19 < 6) {
			arg0.method3141();
		}
		@Pc(387) int local387;
		if (local19 >= 4) {
			local387 = arg0.method3141();
			if (local387 < 0 || local387 > 2) {
				local387 = 0;
			}
			if (Static157.anInt3131 < 96) {
				local387 = 0;
			}
			Static135.method2613(local387);
		}
		if (local19 >= 5) {
			Static73.anInt1510 = arg0.method3125();
		}
		local387 = 0;
		if (local19 >= 6) {
			Static142.anInt3154 = local387 = arg0.method3141();
		}
		if (Static142.anInt3154 != 1 && Static142.anInt3154 != 2) {
			Static142.anInt3154 = 2;
		}
		if (local19 >= 7) {
			Static166.aBoolean296 = arg0.method3141() == 1;
		}
		if (local19 >= 8) {
			Static102.aBoolean179 = arg0.method3141() == 1;
		}
		if (local19 >= 9) {
			Static75.anInt1518 = arg0.method3141();
		}
		if (Static75.anInt1518 < 0 || Static75.anInt1518 > 3) {
			Static75.anInt1518 = 0;
		}
		if (local19 >= 10) {
			Static344.aBoolean555 = arg0.method3141() != 0;
		}
		if (local19 >= 11) {
			Static268.aBoolean429 = arg0.method3141() != 0;
		}
		if (local19 >= 12) {
			Static331.anInt6338 = arg0.method3141();
		}
		if (Static331.anInt6338 < 0 || Static331.anInt6338 > 2) {
			Static331.anInt6338 = 1;
		}
		if (local19 >= 13) {
			Static71.aBoolean129 = arg0.method3141() == 1;
		}
		if (local19 >= 14) {
			Static335.anInt6377 = arg0.method3141();
		} else if (local387 == 0) {
			Static335.anInt6377 = 2;
		} else {
			Static335.anInt6377 = 1;
		}
		if (Static335.anInt6377 < 0 || Static335.anInt6377 > 3) {
			Static335.anInt6377 = 2;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIBII)V")
	public static void method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static111.anInt2269 = arg3;
		Static311.anInt5995 = arg1;
		Static86.anInt1689 = arg2;
		Static221.anInt4366 = arg0;
	}
}
