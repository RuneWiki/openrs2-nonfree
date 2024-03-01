package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
class Class108 implements Comparator {

	// $FF: synthetic field
	@OriginalMember(owner = "client!cc", name = "this$0", descriptor = "Lclient!aem;")
	final Class48_Sub1 this$0;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V", line = 51)
	static void method21942() {
		if (Class232.aClass21_8 != null) {
			Class232.aClass21_8.method17020();
			Class232.aClass21_8 = null;
			Class232.aClass14_9 = null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!de;IIIILclient!dh;SBLclient!wi;I)Lclient!dh;", line = 94)
	public static Class20 method21935(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class20 arg5, @OriginalArg(6) short arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) Class71 arg8) {
		if (arg5 == null) {
			return null;
		}
		@Pc(6) int local6 = 2055;
		if (arg8 != null) {
			local6 |= arg8.method20035();
			local6 &= 0xFFFFFDFF;
		}
		@Pc(27) long local27 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		@Pc(30) Class161 local30 = Class519.aClass161_58;
		@Pc(36) Class20 local36;
		synchronized (Class519.aClass161_58) {
			local36 = (Class20) Class519.aClass161_58.method23219(local27);
		}
		if (local36 == null || arg0.method17117(local36.method5327(), local6) != 0) {
			if (local36 != null) {
				local6 = arg0.method17102(local6, local36.method5327());
			}
			@Pc(67) Class138 local67 = new Class138(4, 2, 2);
			@Pc(69) short local69 = 128;
			@Pc(72) int[] local72 = new int[] { local67.method22958(-local69, 0, -local69), local67.method22958(local69, 0, -local69), local67.method22958(local69, 0, local69), local67.method22958(-local69, 0, local69) };
			local67.method22959(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method22959(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			local67.method22967((short) 1, (short) 2, (short) 0);
			local67.method22967((short) 2, (short) 3, (short) 0);
			local36 = arg0.method17100(local67, local6, Class519.anInt5283 * -359614695, 64, 768);
			@Pc(155) Class161 local155 = Class519.aClass161_58;
			synchronized (Class519.aClass161_58) {
				Class519.aClass161_58.method23222(local36, local27);
			}
		}
		@Pc(171) int local171 = arg5.method5363();
		@Pc(174) int local174 = arg5.method5358();
		@Pc(177) int local177 = arg5.method5450();
		@Pc(180) int local180 = arg5.method5362();
		if (arg8 == null) {
			local36 = local36.method5430((byte) 3, local6, true);
			local36.method5335(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method5333(local174 + local171 >> 1, 0, local177 + local180 >> 1);
		} else {
			local36 = local36.method5430((byte) 3, local6, true);
			local36.method5335(local174 - local171 >> 1, 128, local180 - local177 >> 1);
			local36.method5333(local171 + local174 >> 1, 0, local180 + local177 >> 1);
			arg8.method20077(local36);
		}
		if (arg2 != 0) {
			local36.method5331(arg2);
		}
		if (arg3 != 0) {
			local36.method5482(arg3);
		}
		if (arg4 != 0) {
			local36.method5333(0, arg4, 0);
		}
		return local36;
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!aem;)V", line = 124)
	Class108(@OriginalArg(0) Class48_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "(Lclient!on;Lclient!on;B)I", line = 126)
	int method21930(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!on;Lclient!on;)I", line = 126)
	int method21931(@OriginalArg(0) Class371 arg0, @OriginalArg(1) Class371 arg1) {
		@Pc(3) float local3 = arg0.method27158();
		@Pc(7) float local7 = arg1.method27158();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	public int method21929(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method21930((Class371) arg0, (Class371) arg1);
	}

	@OriginalMember(owner = "client!cc", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method21930((Class371) arg0, (Class371) arg1);
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 134)
	public int method21932(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method21930((Class371) arg0, (Class371) arg1);
	}

	@OriginalMember(owner = "client!cc", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "hm", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method21933(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "ib", descriptor = "(Ljava/lang/Object;)Z", line = 138)
	public boolean method21934(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "ax", descriptor = "(I)Lclient!aml;", line = 1081)
	public static Class3_Sub1_Sub7 method21941() {
		return Class287.aClass3_Sub1_Sub7_3;
	}

	@OriginalMember(owner = "client!cc", name = "ei", descriptor = "(II)Z", line = 1698)
	public static boolean method21938(@OriginalArg(0) int arg0) {
		return arg0 == 18 || arg0 == 11 || arg0 == 3 || arg0 == 12;
	}

	@OriginalMember(owner = "client!cc", name = "ce", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4551)
	static final void method21943(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		arg0.anInt3559 = 1433497693;
		arg0.anInt3476 = -1383761065;
		if (arg0.anInt3509 * 1314053873 != local12) {
			arg0.anInt3509 = local12 * 1584812561;
			Class223.method24442(arg0);
		}
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class60_Sub35.method14626(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!cc", name = "dh", descriptor = "(Lclient!vs;I)V", line = 4588)
	static final void method21940(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class359.method26760(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!cc", name = "abs", descriptor = "(Lclient!vs;I)V", line = 8887)
	static final void method21937(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(14) long local14 = (long) arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(25) long local25 = (long) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(36) long local36 = (long) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (local36 * local14 / local25);
	}

	@OriginalMember(owner = "client!cc", name = "adu", descriptor = "(Lclient!vs;B)V", line = 9380)
	static final void method21939(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(17) Class3_Sub1_Sub18 local17 = Class378.method27247(local13);
		if (local17 != null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt2707 * -384520121;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt2705 * 1545437003;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt2703 * 66614355;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local17.aString117 == null ? "" : local17.aString117;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local17.aString118 == null ? "" : local17.aString118;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local17.aString119 == null ? "" : local17.aString119;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local17.aString120 == null ? "" : local17.aString120;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt2706 * -1879981837;
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local17.aString116 == null ? "" : local17.aString116;
			return;
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = "";
	}

	@OriginalMember(owner = "client!cc", name = "agy", descriptor = "(Lclient!vs;I)V", line = 10137)
	static final void method21936(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		if (Class58_Sub1.aClass581_15 == null) {
			return;
		}
		@Pc(36) Class3 local36 = Class58_Sub1.aClass581_15.method33217((long) local13);
		if (local36 != null && !local28) {
			local36.method33656();
		} else if (local36 == null && local28) {
			local36 = new Class3();
			Class58_Sub1.aClass581_15.method33241(local36, (long) local13);
		}
	}
}
