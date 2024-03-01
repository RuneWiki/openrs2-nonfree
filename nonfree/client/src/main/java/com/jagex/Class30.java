package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public abstract class Class30 {

	@OriginalMember(owner = "client!id", name = "ky", descriptor = "I")
	static int anInt2350;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!ha;")
	final Class23 aClass23_13;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lclient!ha;)V", line = 13)
	Class30(@OriginalArg(0) Class23 arg0) {
		this.aClass23_13 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "p", descriptor = "(Lclient!ny;Lclient!ds;Lclient!di;I)V", line = 52)
	public static void method16448(@OriginalArg(0) Class359 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2) {
		Class134.aClass359_34 = arg0;
		Class395.aClass134_8 = arg1;
		Class451.anInterface11_10 = arg2;
	}

	@OriginalMember(owner = "client!id", name = "j", descriptor = "(Lclient!ahu;Lclient!ahu;IZB)I", line = 157)
	static int method16450(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class63_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		if (arg2 == 1) {
			local7 = arg0.anInt1512 * -191487467;
			local12 = arg1.anInt1512 * -191487467;
			if (!arg3) {
				if (local7 == -1) {
					local7 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local7 - local12;
		} else if (arg2 == 2) {
			return Class306.method25731(arg0.method13053(), arg1.method13053(), Class469.aClass530_2);
		} else if (arg2 == 3) {
			if (arg0.aString51.equals("-")) {
				if (arg1.aString51.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString51.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Class306.method25731(arg0.aString51, arg1.aString51, Class469.aClass530_2);
			}
		} else if (arg2 == 4) {
			return arg0.method13040() ? (arg1.method13040() ? 0 : 1) : (arg1.method13040() ? -1 : 0);
		} else if (arg2 == 5) {
			return arg0.method13043() ? (arg1.method13043() ? 0 : 1) : (arg1.method13043() ? -1 : 0);
		} else if (arg2 == 6) {
			return arg0.method13039() ? (arg1.method13039() ? 0 : 1) : (arg1.method13039() ? -1 : 0);
		} else if (arg2 == 7) {
			return arg0.method13038() ? (arg1.method13038() ? 0 : 1) : (arg1.method13038() ? -1 : 0);
		} else if (arg2 == 8) {
			local7 = arg0.anInt1520 * -39887861;
			local12 = arg1.anInt1520 * -39887861;
			if (arg3) {
				if (local7 == 1000) {
					local7 = -1;
				}
				if (local12 == 1000) {
					local12 = -1;
				}
			} else {
				if (local7 == -1) {
					local7 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local7 - local12;
		} else {
			return arg0.anInt1518 * 107676547 - arg1.anInt1518 * 107676547;
		}
	}

	@OriginalMember(owner = "client!id", name = "aam", descriptor = "(Lclient!vs;I)V", line = 8807)
	static final void method16451(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(14) long local14 = (long) arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(25) long local25 = (long) arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (local14 * local25 / 100L + local14);
	}

	@OriginalMember(owner = "client!id", name = "aun", descriptor = "(Lclient!ahn;Lclient!vs;B)V", line = 12647)
	static final void method16449(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (arg0.aClass136Array21 != null) {
			for (@Pc(14) int local14 = 0; local14 < arg0.aClass136Array21.length; local14++) {
				@Pc(24) Class136 local24 = arg0.aClass136Array21[local14];
				if (local24.aBoolean621) {
					@Pc(38) int local38;
					@Pc(44) int local44;
					if (local24.anInt3403 < local24.anInt3401) {
						local38 = local24.anInt3403 - local24.anInt3404;
						local44 = local24.anInt3404 + local24.anInt3401;
					} else {
						local38 = local24.anInt3401 - local24.anInt3404;
						local44 = local24.anInt3404 + local24.anInt3403;
					}
					@Pc(68) int local68;
					@Pc(74) int local74;
					if (local24.anInt3402 < local24.anInt3400) {
						local68 = local24.anInt3402 - local24.anInt3404;
						local74 = local24.anInt3400 + local24.anInt3404;
					} else {
						local68 = local24.anInt3400 - local24.anInt3404;
						local74 = local24.anInt3402 + local24.anInt3404;
					}
					if (!local1 || local38 < local3) {
						local3 = local38;
					}
					if (!local1 || local68 < local5) {
						local5 = local68;
					}
					if (!local1 || local44 > local7) {
						local7 = local44;
					}
					if (!local1 || local74 > local9) {
						local9 = local74;
					}
					local1 = true;
				}
			}
		}
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = local1 ? 1 : 0;
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = local3;
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = local5;
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = local7;
		arg1.anIntArray496[(arg1.anInt5319 += 312124549) * 960738381 - 1] = local9;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()[D")
	public abstract double[] method16423();

	@OriginalMember(owner = "client!id", name = "e", descriptor = "()Lclient!mh;")
	public abstract Class320 method16424();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Z")
	public abstract boolean method16425();

	@OriginalMember(owner = "client!id", name = "g", descriptor = "(I)Lclient!mh;")
	public abstract Class320 method16426();

	@OriginalMember(owner = "client!id", name = "l", descriptor = "(I)[D")
	public abstract double[] method16427();

	@OriginalMember(owner = "client!id", name = "h", descriptor = "(I)Lclient!agq;")
	public abstract Class3_Sub32 method16428();

	@OriginalMember(owner = "client!id", name = "x", descriptor = "(I)F")
	public abstract float method16429();

	@OriginalMember(owner = "client!id", name = "s", descriptor = "(Lclient!gu;III)V")
	public abstract void method16430(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!id", name = "u", descriptor = "(Lclient!ahb;I)V")
	public abstract void method16431(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!id", name = "y", descriptor = "(F[[[ILclient!ni;II)V")
	public abstract void method16432(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!id", name = "f", descriptor = "(Lclient!ahb;)V")
	public abstract void method16433(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!id", name = "j", descriptor = "()Z")
	public abstract boolean method16434();

	@OriginalMember(owner = "client!id", name = "z", descriptor = "(F[[[ILclient!ni;II)V")
	public abstract void method16435(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!id", name = "i", descriptor = "(Lclient!ahb;)V")
	public abstract void method16436(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!id", name = "n", descriptor = "()Lclient!mh;")
	public abstract Class320 method16437();

	@OriginalMember(owner = "client!id", name = "q", descriptor = "()[D")
	public abstract double[] method16438();

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(F[[[ILclient!ni;II)V")
	public abstract void method16439(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(F[[[ILclient!ni;II)V")
	public abstract void method16440(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!id", name = "m", descriptor = "()Lclient!agq;")
	public abstract Class3_Sub32 method16441();

	@OriginalMember(owner = "client!id", name = "v", descriptor = "()F")
	public abstract float method16442();

	@OriginalMember(owner = "client!id", name = "t", descriptor = "()F")
	public abstract float method16443();

	@OriginalMember(owner = "client!id", name = "w", descriptor = "(Lclient!gu;II)V")
	public abstract void method16444(@OriginalArg(0) Class210 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!id", name = "o", descriptor = "(Lclient!ahb;)V")
	public abstract void method16445(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!id", name = "r", descriptor = "()[D")
	public abstract double[] method16446();

	@OriginalMember(owner = "client!id", name = "p", descriptor = "(F[[[ILclient!ni;III)V")
	public abstract void method16447(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);
}
