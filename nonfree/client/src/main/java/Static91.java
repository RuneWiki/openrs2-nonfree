import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static91 {

	@OriginalMember(owner = "client!dga", name = "v", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_19 = new Class269(78, 16);

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I[B)Lclient!wga;")
	public static Class2_Sub5_Sub21 method1611(@OriginalArg(1) byte[] arg0) {
		@Pc(7) Class2_Sub5_Sub21 local7 = new Class2_Sub5_Sub21();
		@Pc(12) Class2_Sub34 local12 = new Class2_Sub34(arg0);
		local12.anInt8188 = local12.aByteArray77.length - 2;
		@Pc(23) int local23 = local12.method6884();
		@Pc(34) int local34 = local12.aByteArray77.length - local23 - 2 - 12;
		local12.anInt8188 = local34;
		@Pc(41) int local41 = local12.method6865();
		local7.anInt10116 = local12.method6884();
		local7.anInt10121 = local12.method6884();
		local7.anInt10117 = local12.method6884();
		local7.anInt10119 = local12.method6884();
		@Pc(65) int local65 = local12.method6904();
		@Pc(73) int local73;
		@Pc(78) int local78;
		if (local65 > 0) {
			local7.aClass222Array1 = new Class222[local65];
			for (local73 = 0; local73 < local65; local73++) {
				local78 = local12.method6884();
				@Pc(85) Class222 local85 = new Class222(Static347.method5404(local78));
				local7.aClass222Array1[local73] = local85;
				while (local78-- > 0) {
					@Pc(95) int local95 = local12.method6865();
					@Pc(99) int local99 = local12.method6865();
					local85.method5476(new Class2_Sub15(local99), (long) local95);
				}
			}
		}
		local12.anInt8188 = 0;
		local7.aString102 = local12.method6889();
		local7.anIntArray724 = new int[local41];
		local7.anIntArray725 = new int[local41];
		local7.aStringArray43 = new String[local41];
		local73 = 0;
		while (local34 > local12.anInt8188) {
			local78 = local12.method6884();
			if (local78 == 3) {
				local7.aStringArray43[local73] = local12.method6903().intern();
			} else if (local78 >= 100 || local78 == 21 || local78 == 38 || local78 == 39) {
				local7.anIntArray725[local73] = local12.method6904();
			} else {
				local7.anIntArray725[local73] = local12.method6865();
			}
			local7.anIntArray724[local73++] = local78;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)I")
	public static int method1612() {
		return Static445.anInt7874;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method1615(@OriginalArg(0) Class87 arg0) {
		if (Static68.aClass238_8.method5842() == 0) {
			return;
		}
		@Pc(54) Class2_Sub20 local54;
		if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 0) {
			for (local54 = (Class2_Sub20) Static68.aClass238_8.method5833(); local54 != null; local54 = (Class2_Sub20) Static68.aClass238_8.method5838()) {
				Static570.aClass267_2.method6598(Static573.aClass64_15, local54.anInt2914, local54.anInt2911, false, local54.aBoolean253 ? Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1 : null, false, local54.anInt2909, local54.anInt2913, arg0, arg0, local54.anInt2912);
				local54.method8599();
			}
			Static539.method7534();
			return;
		}
		if (Static15.aClass87_1 == null) {
			@Pc(24) Canvas local24 = new Canvas();
			local24.setSize(36, 32);
			Static15.aClass87_1 = Static73.method1381(local24, Static181.aClass97_52, 0, Static23.anInterface6_1, 0);
			Static475.aClass64_14 = Static15.aClass87_1.method7965(Static15.method322(Static428.aClass97_107, Static616.anInt10014), Static647.method3075(Static594.aClass97_144, Static616.anInt10014));
		}
		for (local54 = (Class2_Sub20) Static68.aClass238_8.method5833(); local54 != null; local54 = (Class2_Sub20) Static68.aClass238_8.method5838()) {
			Static570.aClass267_2.method6598(Static475.aClass64_14, local54.anInt2914, local54.anInt2911, false, local54.aBoolean253 ? Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1 : null, false, local54.anInt2909, local54.anInt2913, arg0, Static15.aClass87_1, local54.anInt2912);
			local54.method8599();
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZZLclient!vg;)V")
	public static void method1616(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class11_Sub1_Sub1_Sub2 arg1) {
		@Pc(7) Class165 local7 = arg1.method2761();
		if (arg1.anInt3296 == 0) {
			Static463.anInt8020 = 0;
			arg1.anInt3295 = 0;
			Static597.anInt9849 = -1;
			return;
		}
		if (arg1.anInt3258 != -1 && arg1.anInt3232 == 0) {
			@Pc(35) Class149 local35 = Static185.aClass303_1.method7201(arg1.anInt3258);
			if (arg1.anInt3294 > 0 && local35.anInt4510 == 0) {
				Static463.anInt8020 = 0;
				arg1.anInt3295++;
				Static597.anInt9849 = -1;
				return;
			}
			if (arg1.anInt3294 <= 0 && local35.anInt4517 == 0) {
				arg1.anInt3295++;
				Static463.anInt8020 = 0;
				Static597.anInt9849 = -1;
				return;
			}
		}
		@Pc(100) Class149 local100;
		@Pc(87) Class69 local87;
		if (arg1.anInt3270 != -1 && arg1.anInt3273 <= Static325.anInt5888) {
			local87 = Static414.aClass356_2.method8213(arg1.anInt3270);
			if (local87.aBoolean152 && local87.anInt1820 != -1) {
				local100 = Static185.aClass303_1.method7201(local87.anInt1820);
				if (arg1.anInt3294 > 0 && local100.anInt4510 == 0) {
					Static463.anInt8020 = 0;
					Static597.anInt9849 = -1;
					arg1.anInt3295++;
					return;
				}
				if (arg1.anInt3294 <= 0 && local100.anInt4517 == 0) {
					arg1.anInt3295++;
					Static463.anInt8020 = 0;
					Static597.anInt9849 = -1;
					return;
				}
			}
		}
		if (arg1.anInt3270 != -1 && Static325.anInt5888 >= arg1.anInt3273) {
			local87 = Static414.aClass356_2.method8213(arg1.anInt3270);
			if (local87.aBoolean152 && local87.anInt1820 != -1) {
				local100 = Static185.aClass303_1.method7201(local87.anInt1820);
				if (arg1.anInt3294 > 0 && local100.anInt4510 == 0) {
					arg1.anInt3295++;
					Static463.anInt8020 = 0;
					Static597.anInt9849 = -1;
					return;
				}
				if (arg1.anInt3294 <= 0 && local100.anInt4517 == 0) {
					Static597.anInt9849 = -1;
					Static463.anInt8020 = 0;
					arg1.anInt3295++;
					return;
				}
			}
		}
		@Pc(211) int local211 = arg1.anInt9925;
		@Pc(214) int local214 = arg1.anInt9929;
		@Pc(231) int local231 = arg1.anIntArray232[arg1.anInt3296 - 1] * 512 + arg1.method2778() * 256;
		@Pc(248) int local248 = arg1.anIntArray233[arg1.anInt3296 - 1] * 512 + arg1.method2778() * 256;
		if (local211 < local231) {
			if (local248 > local214) {
				arg1.method2771(10240);
			} else if (local248 < local214) {
				arg1.method2771(14336);
			} else {
				arg1.method2771(12288);
			}
		} else if (local211 > local231) {
			if (local248 > local214) {
				arg1.method2771(6144);
			} else if (local248 >= local214) {
				arg1.method2771(4096);
			} else {
				arg1.method2771(2048);
			}
		} else if (local214 < local248) {
			arg1.method2771(8192);
		} else if (local248 < local214) {
			arg1.method2771(0);
		}
		@Pc(339) byte local339 = arg1.aByteArray31[arg1.anInt3296 - 1];
		if (!arg0 && (local231 - local211 > 1024 || local231 - local211 < -1024 || local248 - local214 > 1024 || local248 - local214 < -1024)) {
			arg1.anInt9929 = local248;
			arg1.anInt9925 = local231;
			arg1.method2759(arg1.anInt3240, false);
			arg1.anInt3296--;
			Static597.anInt9849 = -1;
			Static463.anInt8020 = 0;
			if (arg1.anInt3294 > 0) {
				arg1.anInt3294--;
			}
			return;
		}
		@Pc(401) int local401 = 16;
		@Pc(403) boolean local403 = true;
		if (arg1 instanceof Class11_Sub1_Sub1_Sub2_Sub2) {
			local403 = ((Class11_Sub1_Sub1_Sub2_Sub2) arg1).aClass236_1.aBoolean517;
		}
		@Pc(421) int local421;
		if (local403) {
			local421 = arg1.anInt3240 - arg1.aClass82_7.anInt2146;
			if (local421 != 0 && arg1.anInt3278 == -1 && arg1.anInt3206 != 0) {
				local401 = 8;
			}
			if (!arg0 && arg1.anInt3296 > 2) {
				local401 = 24;
			}
			if (!arg0 && arg1.anInt3296 > 3) {
				local401 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt3296 > 1) {
				local401 = 24;
			}
			if (!arg0 && arg1.anInt3296 > 2) {
				local401 = 32;
			}
		}
		if (arg1.anInt3295 > 0 && arg1.anInt3296 > 1) {
			local401 = 32;
			arg1.anInt3295--;
		}
		if (local339 == 2) {
			local401 <<= 0x1;
		} else if (local339 == 0) {
			local401 >>= 0x1;
		}
		Static463.anInt8020 = 0;
		if (local7.anInt4912 != -1) {
			local401 <<= 0x9;
			if (arg1.anInt3296 == 1) {
				local421 = arg1.anInt3293 * arg1.anInt3293;
				@Pc(545) int local545 = (local231 >= arg1.anInt9925 ? local231 - arg1.anInt9925 : -local231 + arg1.anInt9925) << 9;
				@Pc(563) int local563 = (local248 >= arg1.anInt9929 ? local248 - arg1.anInt9929 : -local248 + arg1.anInt9929) << 9;
				@Pc(574) int local574 = local563 >= local545 ? local563 : local545;
				@Pc(581) int local581 = local7.anInt4912 * 2 * local574;
				if (local421 > local581) {
					arg1.anInt3293 /= 2;
				} else if (local421 / 2 > local574) {
					arg1.anInt3293 -= local7.anInt4912;
					if (arg1.anInt3293 < 0) {
						arg1.anInt3293 = 0;
					}
				} else if (local401 > arg1.anInt3293) {
					arg1.anInt3293 += local7.anInt4912;
					if (local401 < arg1.anInt3293) {
						arg1.anInt3293 = local401;
					}
				}
			} else if (local401 > arg1.anInt3293) {
				arg1.anInt3293 += local7.anInt4912;
				if (local401 < arg1.anInt3293) {
					arg1.anInt3293 = local401;
				}
			} else if (arg1.anInt3293 > 0) {
				arg1.anInt3293 -= local7.anInt4912;
				if (arg1.anInt3293 < 0) {
					arg1.anInt3293 = 0;
				}
			}
			local401 = arg1.anInt3293 >> 9;
			if (local401 < 1) {
				local401 = 1;
			}
		}
		if (local211 == local231 && local248 == local214) {
			Static597.anInt9849 = -1;
		} else {
			if (local231 > local211) {
				arg1.anInt9925 += local401;
				Static463.anInt8020 |= 0x4;
				if (local231 < arg1.anInt9925) {
					arg1.anInt9925 = local231;
				}
			} else if (local231 < local211) {
				arg1.anInt9925 -= local401;
				Static463.anInt8020 |= 0x8;
				if (arg1.anInt9925 < local231) {
					arg1.anInt9925 = local231;
				}
			}
			if (local401 >= 32) {
				Static597.anInt9849 = 2;
			} else {
				Static597.anInt9849 = local339;
			}
			if (local214 < local248) {
				arg1.anInt9929 += local401;
				Static463.anInt8020 |= 0x1;
				if (local248 < arg1.anInt9929) {
					arg1.anInt9929 = local248;
				}
			} else if (local248 < local214) {
				Static463.anInt8020 |= 0x2;
				arg1.anInt9929 -= local401;
				if (local248 > arg1.anInt9929) {
					arg1.anInt9929 = local248;
				}
			}
		}
		if (arg1.anInt9925 == local231 && arg1.anInt9929 == local248) {
			if (arg1.anInt3294 > 0) {
				arg1.anInt3294--;
			}
			arg1.anInt3296--;
		}
	}
}
