import jaggl.OpenGL;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static96 {

	@OriginalMember(owner = "client!ds", name = "g", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_39 = new Class40(57, 7);

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "[B")
	public static final byte[] aByteArray29 = new byte[520];

	@OriginalMember(owner = "client!ds", name = "t", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_45 = new Class332(20);

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "Lclient!lp;")
	public static final Class188 aClass188_2 = new Class188(13, 0, 1, 0);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!fca;)Lclient!fca;")
	public static Class97 method1494(@OriginalArg(1) Class97 arg0) {
		@Pc(11) Class97 local11 = Static65.method858(arg0);
		if (local11 == null) {
			local11 = arg0.aClass97_4;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILjava/lang/String;ILclient!pea;)Lclient!pc;")
	public static Class241 method1498(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class121_Sub3 arg2) {
		@Pc(6) long local6 = OpenGL.glCreateShaderObjectARB(arg0);
		OpenGL.glShaderSourceARB(local6, arg1);
		OpenGL.glCompileShaderARB(local6);
		OpenGL.glGetObjectParameterivARB(local6, 35713, Static14.anIntArray25, 0);
		if (Static14.anIntArray25[0] == 0) {
			if (Static14.anIntArray25[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local6, 35716, Static14.anIntArray25, 1);
			if (Static14.anIntArray25[1] > 1) {
				@Pc(57) byte[] local57 = new byte[Static14.anIntArray25[1]];
				OpenGL.glGetInfoLogARB(local6, Static14.anIntArray25[1], Static14.anIntArray25, 0, local57, 0);
				System.out.println(new String(local57));
			}
			if (Static14.anIntArray25[0] == 0) {
				OpenGL.glDeleteObjectARB(local6);
				return null;
			}
		}
		return new Class241(arg2, local6, arg0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZILclient!rq;)V")
	public static void method1501(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class29_Sub2_Sub1 arg1) {
		@Pc(11) Class120 local11 = arg1.method7009();
		if (arg1.anInt8582 == 0) {
			arg1.anInt8584 = 0;
			Static44.anInt717 = 0;
			Static149.anInt2647 = -1;
			return;
		}
		if (arg1.anInt8538 != -1 && arg1.anInt8563 == 0) {
			@Pc(42) Class108 local42 = Static31.aClass345_1.method7798(arg1.anInt8538);
			if (arg1.anInt8583 > 0 && local42.anInt2593 == 0) {
				Static44.anInt717 = 0;
				Static149.anInt2647 = -1;
				arg1.anInt8584++;
				return;
			}
			if (arg1.anInt8583 <= 0 && local42.anInt2594 == 0) {
				arg1.anInt8584++;
				Static149.anInt2647 = -1;
				Static44.anInt717 = 0;
				return;
			}
		}
		@Pc(114) Class108 local114;
		@Pc(101) Class237 local101;
		if (arg1.anInt8525 != -1 && Static358.anInt6263 >= arg1.anInt8548) {
			local101 = Static448.aClass117_2.method2317(arg1.anInt8525);
			if (local101.aBoolean443 && local101.anInt6458 != -1) {
				local114 = Static31.aClass345_1.method7798(local101.anInt6458);
				if (arg1.anInt8583 > 0 && local114.anInt2593 == 0) {
					Static149.anInt2647 = -1;
					arg1.anInt8584++;
					Static44.anInt717 = 0;
					return;
				}
				if (arg1.anInt8583 <= 0 && local114.anInt2594 == 0) {
					Static44.anInt717 = 0;
					Static149.anInt2647 = -1;
					arg1.anInt8584++;
					return;
				}
			}
		}
		if (arg1.anInt8525 != -1 && arg1.anInt8548 <= Static358.anInt6263) {
			local101 = Static448.aClass117_2.method2317(arg1.anInt8525);
			if (local101.aBoolean443 && local101.anInt6458 != -1) {
				local114 = Static31.aClass345_1.method7798(local101.anInt6458);
				if (arg1.anInt8583 > 0 && local114.anInt2593 == 0) {
					Static44.anInt717 = 0;
					Static149.anInt2647 = -1;
					arg1.anInt8584++;
					return;
				}
				if (arg1.anInt8583 <= 0 && local114.anInt2594 == 0) {
					arg1.anInt8584++;
					Static149.anInt2647 = -1;
					Static44.anInt717 = 0;
					return;
				}
			}
		}
		@Pc(229) int local229 = arg1.anInt9222;
		@Pc(232) int local232 = arg1.anInt9218;
		@Pc(250) int local250 = arg1.anIntArray661[arg1.anInt8582 - 1] * 512 + arg1.method7008() * 256;
		@Pc(267) int local267 = arg1.anIntArray660[arg1.anInt8582 - 1] * 512 + arg1.method7008() * 256;
		if (local250 > local229) {
			if (local267 > local232) {
				arg1.method6998(10240);
			} else if (local267 < local232) {
				arg1.method6998(14336);
			} else {
				arg1.method6998(12288);
			}
		} else if (local250 >= local229) {
			if (local232 < local267) {
				arg1.method6998(8192);
			} else if (local267 < local232) {
				arg1.method6998(0);
			}
		} else if (local267 > local232) {
			arg1.method6998(6144);
		} else if (local267 < local232) {
			arg1.method6998(2048);
		} else {
			arg1.method6998(4096);
		}
		@Pc(357) byte local357 = arg1.aByteArray110[arg1.anInt8582 - 1];
		if (!arg0 && (local250 - local229 > 1024 || local250 - local229 < -1024 || local267 - local232 > 1024 || local267 - local232 < -1024)) {
			arg1.anInt9218 = local267;
			arg1.anInt9222 = local250;
			arg1.method7007(arg1.anInt8560, false);
			arg1.anInt8582--;
			if (arg1.anInt8583 > 0) {
				arg1.anInt8583--;
			}
			Static44.anInt717 = 0;
			Static149.anInt2647 = -1;
			return;
		}
		@Pc(425) int local425 = 16;
		@Pc(427) boolean local427 = true;
		if (arg1 instanceof Class29_Sub2_Sub1_Sub1) {
			local427 = ((Class29_Sub2_Sub1_Sub1) arg1).aClass257_1.aBoolean497;
		}
		@Pc(444) int local444;
		if (local427) {
			local444 = arg1.anInt8560 - arg1.aClass293_7.anInt7901;
			if (local444 != 0 && arg1.anInt8513 == -1 && arg1.anInt8549 != 0) {
				local425 = 8;
			}
			if (!arg0 && arg1.anInt8582 > 2) {
				local425 = 24;
			}
			if (!arg0 && arg1.anInt8582 > 3) {
				local425 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt8582 > 1) {
				local425 = 24;
			}
			if (!arg0 && arg1.anInt8582 > 2) {
				local425 = 32;
			}
		}
		if (arg1.anInt8584 > 0 && arg1.anInt8582 > 1) {
			local425 = 32;
			arg1.anInt8584--;
		}
		if (local357 == 2) {
			local425 <<= 0x1;
		} else if (local357 == 0) {
			local425 >>= 0x1;
		}
		if (local11.anInt2900 != -1) {
			local425 <<= 0x9;
			if (arg1.anInt8582 == 1) {
				local444 = arg1.anInt8585 * arg1.anInt8585;
				@Pc(574) int local574 = (local250 >= arg1.anInt9222 ? local250 - arg1.anInt9222 : arg1.anInt9222 - local250) << 9;
				@Pc(590) int local590 = (local267 < arg1.anInt9218 ? arg1.anInt9218 - local267 : local267 - arg1.anInt9218) << 9;
				@Pc(597) int local597 = local590 < local574 ? local574 : local590;
				@Pc(604) int local604 = local11.anInt2900 * 2 * local597;
				if (local604 < local444) {
					arg1.anInt8585 /= 2;
				} else if (local444 / 2 > local597) {
					arg1.anInt8585 -= local11.anInt2900;
					if (arg1.anInt8585 < 0) {
						arg1.anInt8585 = 0;
					}
				} else if (local425 > arg1.anInt8585) {
					arg1.anInt8585 += local11.anInt2900;
					if (arg1.anInt8585 > local425) {
						arg1.anInt8585 = local425;
					}
				}
			} else if (arg1.anInt8585 < local425) {
				arg1.anInt8585 += local11.anInt2900;
				if (local425 < arg1.anInt8585) {
					arg1.anInt8585 = local425;
				}
			} else if (arg1.anInt8585 > 0) {
				arg1.anInt8585 -= local11.anInt2900;
				if (arg1.anInt8585 < 0) {
					arg1.anInt8585 = 0;
				}
			}
			local425 = arg1.anInt8585 >> 9;
			if (local425 < 1) {
				local425 = 1;
			}
		}
		Static44.anInt717 = 0;
		if (local250 == local229 && local267 == local232) {
			Static149.anInt2647 = -1;
		} else {
			if (local250 > local229) {
				arg1.anInt9222 += local425;
				Static44.anInt717 |= 0x4;
				if (local250 < arg1.anInt9222) {
					arg1.anInt9222 = local250;
				}
			} else if (local229 > local250) {
				Static44.anInt717 |= 0x8;
				arg1.anInt9222 -= local425;
				if (arg1.anInt9222 < local250) {
					arg1.anInt9222 = local250;
				}
			}
			if (local267 > local232) {
				arg1.anInt9218 += local425;
				Static44.anInt717 |= 0x1;
				if (arg1.anInt9218 > local267) {
					arg1.anInt9218 = local267;
				}
			} else if (local232 > local267) {
				Static44.anInt717 |= 0x2;
				arg1.anInt9218 -= local425;
				if (arg1.anInt9218 < local267) {
					arg1.anInt9218 = local267;
				}
			}
			if (local425 < 32) {
				Static149.anInt2647 = local357;
			} else {
				Static149.anInt2647 = 2;
			}
		}
		if (local250 == arg1.anInt9222 && local267 == arg1.anInt9218) {
			if (arg1.anInt8583 > 0) {
				arg1.anInt8583--;
			}
			arg1.anInt8582--;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([BB)Lclient!xa;")
	public static Class4 method1502(@OriginalArg(0) byte[] arg0) {
		try {
			@Pc(7) Image local7 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(12) MediaTracker local12 = new MediaTracker(Static153.aClient1);
			local12.addImage(local7, 0);
			local12.waitForAll();
			@Pc(22) int local22 = local7.getWidth(Static153.aClient1);
			@Pc(26) int local26 = local7.getHeight(Static153.aClient1);
			@Pc(31) int[] local31 = new int[local26 * local22];
			@Pc(51) PixelGrabber local51 = new PixelGrabber(local7, 0, 0, local22, local26, local31, 0, local22);
			local51.grabPixels();
			return Static176.aClass121_5.method7110(local31, local22, local22, local26);
		} catch (@Pc(63) InterruptedException local63) {
			return null;
		}
	}
}
