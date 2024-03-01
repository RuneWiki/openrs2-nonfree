package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fz")
public final class Class189 {

	@OriginalMember(owner = "client!fz", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString177 = "#";

	@OriginalMember(owner = "client!fz", name = "<init>", descriptor = "()V", line = 6)
	Class189() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!fz", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", line = 11)
	public static final boolean method23978(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!fz", name = "g", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", line = 11)
	public static final boolean method23979(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!fz", name = "l", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", line = 11)
	public static final boolean method23980(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!fz", name = "x", descriptor = "(Lclient!de;B)V", line = 90)
	static void method23986(@OriginalArg(0) Class21 arg0) {
		if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 != -1226077139 * Class2.anInt1 && client.aClass370_1.method26950() != null) {
			Class176.method23413();
			if (Class191.method24062(arg0, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101)) {
				Class2.anInt1 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101 * 510043045;
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "a", descriptor = "(Lclient!ahb;B)V", line = 124)
	static void method23982(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			switch(local3) {
				case 0:
					Class131.anInt3327 = arg0.method20271() * 1653623583;
					Class131.anInt3328 = arg0.method20271() * -559520215;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!fz", name = "c", descriptor = "(Lclient!ahb;IB)V", line = 439)
	static void method23981(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (Class390.aClass569_5 == null) {
			return;
		}
		try {
			Class390.aClass569_5.method32982(0L);
			Class390.aClass569_5.method32984(arg0.aByteArray51, arg1, 24);
		} catch (@Pc(13) Exception local13) {
		}
	}

	@OriginalMember(owner = "client!fz", name = "gk", descriptor = "(J)V", line = 3436)
	static final void method23984(@OriginalArg(0) long arg0) {
		@Pc(3) Class320 local3 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
		@Pc(11) int local11 = client.anInt3075 * -1002831869 + (int) local3.aFloat259;
		@Pc(19) int local19 = client.anInt3077 * -1467006729 + (int) local3.aFloat261;
		if (Class403.anInt4808 * 110680385 - local11 < -2000 || Class403.anInt4808 * 110680385 - local11 > 2000 || Class48.anInt1088 * 1640811813 - local19 < -2000 || Class48.anInt1088 * 1640811813 - local19 > 2000) {
			Class403.anInt4808 = local11 * 2018555585;
			Class48.anInt1088 = local19 * -958888275;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local11 != Class403.anInt4808 * 110680385) {
			local66 = local11 - Class403.anInt4808 * 110680385;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local74 > local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local74 < local66) {
				local74 = local66;
			}
			Class403.anInt4808 += local74 * 2018555585;
		}
		if (Class48.anInt1088 * 1640811813 != local19) {
			local66 = local19 - Class48.anInt1088 * 1640811813;
			local74 = (int) (arg0 * (long) local66 / 320L);
			if (local66 > 0) {
				if (local74 == 0) {
					local74 = 1;
				} else if (local74 > local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = -1;
			} else if (local74 < local66) {
				local74 = local66;
			}
			Class48.anInt1088 += local74 * -958888275;
		}
		client.aFloat238 += (float) arg0 * client.aFloat239 / 6.0F;
		client.aFloat237 += (float) arg0 * client.aFloat240 / 6.0F;
		Class495.method29326();
	}

	@OriginalMember(owner = "client!fz", name = "be", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4319)
	static final void method23985(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 1248498196;
		arg0.anInt3494 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * -1364331407;
		arg0.anInt3543 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -72692815;
		@Pc(39) int local39 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2];
		if (local39 < 0) {
			local39 = 0;
		} else if (local39 > 5) {
			local39 = 5;
		}
		@Pc(59) int local59 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 3];
		if (local59 < 0) {
			local59 = 0;
		} else if (local59 > 5) {
			local59 = 5;
		}
		arg0.aByte124 = (byte) local39;
		arg0.aByte127 = (byte) local59;
		Class223.method24442(arg0);
		Class34_Sub3.method8311(arg1, arg0);
		if (arg0.anInt3492 * -107621169 == 0) {
			Class109.method21948(arg1, arg0, false);
		}
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class64_Sub1.method13113(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!fz", name = "ant", descriptor = "(Lclient!vs;I)V", line = 11507)
	static final void method23983(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
	}
}
