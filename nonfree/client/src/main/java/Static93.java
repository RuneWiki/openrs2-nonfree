import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	public static int anInt2723;

	@OriginalMember(owner = "client!kd", name = "Z", descriptor = "[S")
	public static short[] aShortArray48;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
	public static int anInt2725 = 99;

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_758 = Static158.method3034("Continue");

	@OriginalMember(owner = "client!kd", name = "W", descriptor = "[I")
	public static final int[] anIntArray313 = new int[200];

	@OriginalMember(owner = "client!kd", name = "X", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_759 = Static158.method3034("0(U");

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_760 = Static158.method3034("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "Lclient!ob;")
	public static Class60 aClass60_761 = aClass60_758;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIB)V")
	public static void method2180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static64.anInt1962 <= arg5 && Static123.anInt3379 >= arg2 && Static36.anInt1076 <= arg3 && arg4 <= Static117.anInt951) {
			if (arg0 == 1) {
				Static126.method2646(arg3, arg2, arg4, arg1, arg5);
			} else {
				Static177.method3324(arg1, arg3, arg5, arg4, arg0, arg2);
			}
		} else if (arg0 == 1) {
			Static50.method1145(arg2, arg1, arg4, arg3, arg5);
		} else {
			Static136.method2780(arg5, arg3, arg1, arg0, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ud;I)V")
	public static void method2181(@OriginalArg(0) Class2_Sub1_Sub1_Sub3 arg0) {
		arg0.anInt3250 = arg0.anInt3289;
		if (arg0.anInt3254 == 0) {
			arg0.anInt3275 = 0;
			return;
		}
		if (arg0.anInt3270 != -1 && arg0.anInt3280 == 0) {
			@Pc(28) Class2_Sub1_Sub5 local28 = Static103.method2357(arg0.anInt3270);
			if (arg0.anInt3305 > 0 && local28.anInt796 == 0) {
				arg0.anInt3275++;
				return;
			}
			if (arg0.anInt3305 <= 0 && local28.anInt798 == 0) {
				arg0.anInt3275++;
				return;
			}
		}
		@Pc(63) int local63 = arg0.anInt3302;
		@Pc(66) int local66 = arg0.anInt3273;
		@Pc(81) int local81 = arg0.anIntArray371[arg0.anInt3254 - 1] * 128 + arg0.anInt3286 * 64;
		@Pc(96) int local96 = arg0.anIntArray369[arg0.anInt3254 - 1] * 128 + arg0.anInt3286 * 64;
		if (local96 - local63 > 256 || local96 - local63 < -256 || local81 - local66 > 256 || local81 - local66 < -256) {
			arg0.anInt3302 = local96;
			arg0.anInt3273 = local81;
			return;
		}
		if (local96 > local63) {
			if (local66 < local81) {
				arg0.anInt3255 = 1280;
			} else if (local66 > local81) {
				arg0.anInt3255 = 1792;
			} else {
				arg0.anInt3255 = 1536;
			}
		} else if (local96 >= local63) {
			if (local81 > local66) {
				arg0.anInt3255 = 1024;
			} else if (local66 > local81) {
				arg0.anInt3255 = 0;
			}
		} else if (local81 > local66) {
			arg0.anInt3255 = 768;
		} else if (local81 >= local66) {
			arg0.anInt3255 = 512;
		} else {
			arg0.anInt3255 = 256;
		}
		@Pc(221) int local221 = arg0.anInt3255 - arg0.anInt3265 & 0x7FF;
		if (local221 > 1024) {
			local221 -= 2048;
		}
		@Pc(229) int local229 = 4;
		@Pc(232) int local232 = arg0.anInt3278;
		if (local221 >= -256 && local221 <= 256) {
			local232 = arg0.anInt3258;
		} else if (local221 >= 256 && local221 < 768) {
			local232 = arg0.anInt3268;
		} else if (local221 >= -768 && local221 <= -256) {
			local232 = arg0.anInt3279;
		}
		@Pc(271) boolean local271 = true;
		if (local232 == -1) {
			local232 = arg0.anInt3258;
		}
		arg0.anInt3250 = local232;
		if (arg0 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
			local271 = ((Class2_Sub1_Sub1_Sub3_Sub2) arg0).aClass2_Sub1_Sub2_1.aBoolean6;
		}
		if (local271) {
			if (arg0.anInt3265 != arg0.anInt3255 && arg0.anInt3291 == -1 && arg0.anInt3260 != 0) {
				local229 = 2;
			}
			if (arg0.anInt3254 > 2) {
				local229 = 6;
			}
			if (arg0.anInt3254 > 3) {
				local229 = 8;
			}
			if (arg0.anInt3275 > 0 && arg0.anInt3254 > 1) {
				arg0.anInt3275--;
				local229 = 8;
			}
		} else {
			if (arg0.anInt3254 > 1) {
				local229 = 6;
			}
			if (arg0.anInt3254 > 2) {
				local229 = 8;
			}
			if (arg0.anInt3275 > 0 && arg0.anInt3254 > 1) {
				arg0.anInt3275--;
				local229 = 8;
			}
		}
		if (arg0.aBooleanArray13[arg0.anInt3254 - 1]) {
			local229 <<= 0x1;
		}
		if (local81 > local66) {
			arg0.anInt3273 += local229;
			if (local81 < arg0.anInt3273) {
				arg0.anInt3273 = local81;
			}
		} else if (local81 < local66) {
			arg0.anInt3273 -= local229;
			if (arg0.anInt3273 < local81) {
				arg0.anInt3273 = local81;
			}
		}
		if (local229 >= 8 && arg0.anInt3250 == arg0.anInt3258 && arg0.anInt3277 != -1) {
			arg0.anInt3250 = arg0.anInt3277;
		}
		if (local63 < local96) {
			arg0.anInt3302 += local229;
			if (local96 < arg0.anInt3302) {
				arg0.anInt3302 = local96;
			}
		} else if (local96 < local63) {
			arg0.anInt3302 -= local229;
			if (arg0.anInt3302 < local96) {
				arg0.anInt3302 = local96;
			}
		}
		if (arg0.anInt3302 == local96 && arg0.anInt3273 == local81) {
			if (arg0.anInt3305 > 0) {
				arg0.anInt3305--;
			}
			arg0.anInt3254--;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!t;Ljava/lang/Object;B)V")
	public static void method2182(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 50 && arg0.anEventQueue1.peekEvent() != null; local16++) {
			Static85.method1993(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
	public static void method2183() {
		@Pc(10) int local10 = Static139.aClass2_Sub3_Sub1_32.method246(8);
		@Pc(19) int local19;
		if (local10 < Static166.anInt4101) {
			for (local19 = local10; local19 < Static166.anInt4101; local19++) {
				Static181.anIntArray475[Static122.anInt3358++] = Static169.anIntArray458[local19];
			}
		}
		if (Static166.anInt4101 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static166.anInt4101 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(61) int local61 = Static169.anIntArray458[local19];
			@Pc(65) Class2_Sub1_Sub1_Sub3_Sub1 local65 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[local61];
			@Pc(70) int local70 = Static139.aClass2_Sub3_Sub1_32.method246(1);
			if (local70 == 0) {
				Static169.anIntArray458[Static166.anInt4101++] = local61;
				local65.anInt3299 = Static20.anInt580;
			} else {
				@Pc(93) int local93 = Static139.aClass2_Sub3_Sub1_32.method246(2);
				if (local93 == 0) {
					Static169.anIntArray458[Static166.anInt4101++] = local61;
					local65.anInt3299 = Static20.anInt580;
					Static113.anIntArray361[Static148.anInt3844++] = local61;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local93 == 1) {
						Static169.anIntArray458[Static166.anInt4101++] = local61;
						local65.anInt3299 = Static20.anInt580;
						local135 = Static139.aClass2_Sub3_Sub1_32.method246(3);
						local65.method2559(local135, false);
						local145 = Static139.aClass2_Sub3_Sub1_32.method246(1);
						if (local145 == 1) {
							Static113.anIntArray361[Static148.anInt3844++] = local61;
						}
					} else if (local93 == 2) {
						Static169.anIntArray458[Static166.anInt4101++] = local61;
						local65.anInt3299 = Static20.anInt580;
						local135 = Static139.aClass2_Sub3_Sub1_32.method246(3);
						local65.method2559(local135, true);
						local145 = Static139.aClass2_Sub3_Sub1_32.method246(3);
						local65.method2559(local145, true);
						@Pc(199) int local199 = Static139.aClass2_Sub3_Sub1_32.method246(1);
						if (local199 == 1) {
							Static113.anIntArray361[Static148.anInt3844++] = local61;
						}
					} else if (local93 == 3) {
						Static181.anIntArray475[Static122.anInt3358++] = local61;
					}
				}
			}
		}
	}
}
