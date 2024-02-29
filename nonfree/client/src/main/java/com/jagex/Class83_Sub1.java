package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public abstract class Class83_Sub1 extends Class83 {

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
	static final int anInt2506 = 8;

	@OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
	static final int anInt2508 = 4;

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
	static int anInt2510;

	@OriginalMember(owner = "client!aea", name = "i", descriptor = "I")
	static int anInt2514;

	@OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
	static final int anInt2515 = 12;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
	static int anInt2516;

	@OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
	static int anInt2518;

	@OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
	static int anInt2519;

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
	static int anInt2520;

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
	static int anInt2521;

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
	static int anInt2522;

	@OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
	static int anInt2524;

	@OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
	static int anInt2525;

	@OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
	static int anInt2526;

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
	static int anInt2527;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "I")
	static int anInt2528;

	@OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
	static int anInt2529;

	@OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
	static int anInt2530;

	@OriginalMember(owner = "client!aea", name = "aj", descriptor = "I")
	static int anInt2531;

	@OriginalMember(owner = "client!aea", name = "ai", descriptor = "I")
	static int anInt2532;

	@OriginalMember(owner = "client!aea", name = "ag", descriptor = "I")
	static int anInt2533 = 0;

	@OriginalMember(owner = "client!aea", name = "al", descriptor = "I")
	static int anInt2534 = 0;

	@OriginalMember(owner = "client!aea", name = "ao", descriptor = "I")
	static int anInt2535 = 0;

	@OriginalMember(owner = "client!aea", name = "ak", descriptor = "I")
	static int anInt2536 = 0;

	@OriginalMember(owner = "client!aea", name = "au", descriptor = "I")
	static int anInt2538 = 0;

	@OriginalMember(owner = "client!aea", name = "ax", descriptor = "I")
	static int anInt2537 = 0;

	@OriginalMember(owner = "client!aea", name = "ar", descriptor = "I")
	static int anInt2517 = 0;

	@OriginalMember(owner = "client!aea", name = "ad", descriptor = "I")
	static int anInt2539 = 0;

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "I")
	int anInt2509;

	@OriginalMember(owner = "client!aea", name = "y", descriptor = "I")
	int anInt2511;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
	int anInt2512;

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "[I")
	int[] anIntArray230;

	@OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
	int anInt2513;

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "Lclient!aeh;")
	Class86_Sub2 aClass86_Sub2_13;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
	int anInt2507;

	@OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
	int anInt2523;

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lclient!aeh;II)V", line = 45)
	Class83_Sub1(@OriginalArg(0) Class86_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass86_Sub2_13 = arg0;
		this.anInt2507 = arg1;
		this.anInt2523 = arg2;
	}

	@OriginalMember(owner = "client!aea", name = "p", descriptor = "(IIII)V", line = 52)
	@Override
	public void method18167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2509 = arg0;
		this.anInt2511 = arg1;
		this.anInt2513 = arg2;
		this.anInt2512 = arg3;
	}

	@OriginalMember(owner = "client!aea", name = "aw", descriptor = "(IIII)V", line = 52)
	@Override
	public void method18188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2509 = arg0;
		this.anInt2511 = arg1;
		this.anInt2513 = arg2;
		this.anInt2512 = arg3;
	}

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "([I)V", line = 59)
	@Override
	public void method18168(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2509;
		arg0[1] = this.anInt2511;
		arg0[2] = this.anInt2513;
		arg0[3] = this.anInt2512;
	}

	@OriginalMember(owner = "client!aea", name = "az", descriptor = "([I)V", line = 59)
	@Override
	public void method18200(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2509;
		arg0[1] = this.anInt2511;
		arg0[2] = this.anInt2513;
		arg0[3] = this.anInt2512;
	}

	@OriginalMember(owner = "client!aea", name = "bj", descriptor = "([I)V", line = 59)
	@Override
	public void method18218(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2509;
		arg0[1] = this.anInt2511;
		arg0[2] = this.anInt2513;
		arg0[3] = this.anInt2512;
	}

	@OriginalMember(owner = "client!aea", name = "bc", descriptor = "([I)V", line = 59)
	@Override
	public void method18220(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2509;
		arg0[1] = this.anInt2511;
		arg0[2] = this.anInt2513;
		arg0[3] = this.anInt2512;
	}

	@OriginalMember(owner = "client!aea", name = "v", descriptor = "()I", line = 66)
	@Override
	public int method18169() {
		return this.anInt2507;
	}

	@OriginalMember(owner = "client!aea", name = "bv", descriptor = "()I", line = 66)
	@Override
	public int method18201() {
		return this.anInt2507;
	}

	@OriginalMember(owner = "client!aea", name = "bl", descriptor = "()I", line = 66)
	@Override
	public int method18203() {
		return this.anInt2507;
	}

	@OriginalMember(owner = "client!aea", name = "ba", descriptor = "()I", line = 66)
	@Override
	public int method18210() {
		return this.anInt2507;
	}

	@OriginalMember(owner = "client!aea", name = "bb", descriptor = "()I", line = 70)
	@Override
	public int method18204() {
		return this.anInt2523;
	}

	@OriginalMember(owner = "client!aea", name = "y", descriptor = "()I", line = 70)
	@Override
	public int method18171() {
		return this.anInt2523;
	}

	@OriginalMember(owner = "client!aea", name = "l", descriptor = "()I", line = 74)
	@Override
	public int method18121() {
		return this.anInt2509 + this.anInt2507 + this.anInt2513;
	}

	@OriginalMember(owner = "client!aea", name = "bd", descriptor = "()I", line = 74)
	@Override
	public int method18120() {
		return this.anInt2509 + this.anInt2507 + this.anInt2513;
	}

	@OriginalMember(owner = "client!aea", name = "by", descriptor = "()I", line = 74)
	@Override
	public int method18119() {
		return this.anInt2509 + this.anInt2507 + this.anInt2513;
	}

	@OriginalMember(owner = "client!aea", name = "bx", descriptor = "()I", line = 74)
	@Override
	public int method18122() {
		return this.anInt2509 + this.anInt2507 + this.anInt2513;
	}

	@OriginalMember(owner = "client!aea", name = "w", descriptor = "()I", line = 78)
	@Override
	public int method18198() {
		return this.anInt2511 + this.anInt2523 + this.anInt2512;
	}

	@OriginalMember(owner = "client!aea", name = "bw", descriptor = "()I", line = 78)
	@Override
	public int method18180() {
		return this.anInt2511 + this.anInt2523 + this.anInt2512;
	}

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "(IIIIIII)V", line = 90)
	@Override
	public void method18179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray230 == null) {
			this.anIntArray230 = new int[4];
		}
		this.aClass86_Sub2_13.method20142(this.anIntArray230);
		this.aClass86_Sub2_13.method20079(this.aClass86_Sub2_13.anInt553 * 1709859847, this.aClass86_Sub2_13.anInt541 * 9823353, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18121();
		@Pc(44) int local44 = this.method18198();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18177(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass86_Sub2_13.method20151(this.anIntArray230[0], this.anIntArray230[1], this.anIntArray230[2], this.anIntArray230[3]);
	}

	@OriginalMember(owner = "client!aea", name = "bg", descriptor = "(IIIIIII)V", line = 90)
	@Override
	public void method18206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray230 == null) {
			this.anIntArray230 = new int[4];
		}
		this.aClass86_Sub2_13.method20142(this.anIntArray230);
		this.aClass86_Sub2_13.method20079(this.aClass86_Sub2_13.anInt553 * 1709859847, this.aClass86_Sub2_13.anInt541 * 9823353, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18121();
		@Pc(44) int local44 = this.method18198();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18177(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass86_Sub2_13.method20151(this.anIntArray230[0], this.anIntArray230[1], this.anIntArray230[2], this.anIntArray230[3]);
	}

	@OriginalMember(owner = "client!aea", name = "bs", descriptor = "(IIIIIII)V", line = 90)
	@Override
	public void method18207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray230 == null) {
			this.anIntArray230 = new int[4];
		}
		this.aClass86_Sub2_13.method20142(this.anIntArray230);
		this.aClass86_Sub2_13.method20079(this.aClass86_Sub2_13.anInt553 * 1709859847, this.aClass86_Sub2_13.anInt541 * 9823353, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18121();
		@Pc(44) int local44 = this.method18198();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18177(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass86_Sub2_13.method20151(this.anIntArray230[0], this.anIntArray230[1], this.anIntArray230[2], this.anIntArray230[3]);
	}

	@OriginalMember(owner = "client!aea", name = "bi", descriptor = "(IIIIIII)V", line = 90)
	@Override
	public void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray230 == null) {
			this.anIntArray230 = new int[4];
		}
		this.aClass86_Sub2_13.method20142(this.anIntArray230);
		this.aClass86_Sub2_13.method20079(this.aClass86_Sub2_13.anInt553 * 1709859847, this.aClass86_Sub2_13.anInt541 * 9823353, arg0 + arg2, arg1 + arg3);
		@Pc(41) int local41 = this.method18121();
		@Pc(44) int local44 = this.method18198();
		@Pc(52) int local52 = (arg2 + local41 - 1) / local41;
		@Pc(60) int local60 = (arg3 + local44 - 1) / local44;
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			@Pc(69) int local69 = local62 * local44;
			for (@Pc(71) int local71 = 0; local71 < local52; local71++) {
				this.method18177(arg0 + local71 * local41, arg1 + local69, arg4, arg5, arg6);
			}
		}
		this.aClass86_Sub2_13.method20151(this.anIntArray230[0], this.anIntArray230[1], this.anIntArray230[2], this.anIntArray230[3]);
	}

	@OriginalMember(owner = "client!aea", name = "ce", descriptor = "(FFFFFF)Z", line = 108)
	boolean method18221(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2509 + this.anInt2507 + this.anInt2513;
		@Pc(17) int local17 = this.anInt2511 + this.anInt2523 + this.anInt2512;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2507 || local17 != this.anInt2523) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2511;
			local65 = local53 * (float) this.anInt2511;
			local71 = local32 * (float) this.anInt2509;
			local77 = local39 * (float) this.anInt2509;
			@Pc(84) float local84 = -local32 * (float) this.anInt2513;
			@Pc(91) float local91 = -local39 * (float) this.anInt2513;
			@Pc(98) float local98 = -local46 * (float) this.anInt2512;
			@Pc(105) float local105 = -local53 * (float) this.anInt2512;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass86_Sub2_13.anInt553 * 1709859847)) {
			local46 = this.aClass86_Sub2_13.anInt553 * 1709859847;
		}
		if (local53 > (float) (this.aClass86_Sub2_13.anInt540 * -1807368365)) {
			local53 = this.aClass86_Sub2_13.anInt540 * -1807368365;
		}
		if (local59 < (float) (this.aClass86_Sub2_13.anInt541 * 9823353)) {
			local59 = this.aClass86_Sub2_13.anInt541 * 9823353;
		}
		if (local65 > (float) (this.aClass86_Sub2_13.anInt542 * 639238427)) {
			local65 = this.aClass86_Sub2_13.anInt542 * 639238427;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2514 = this.aClass86_Sub2_13.anInt547 * 356365251;
		anInt2510 = (int) ((float) ((int) local59 * anInt2514) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2522 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2507 / local71);
		anInt2521 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2523 / local77);
		anInt2529 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2507 / local77);
		anInt2525 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2523 / local71);
		anInt2526 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2527 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2528 = (this.anInt2507 >> 1 << 12) + (anInt2527 * anInt2529 >> 4);
		anInt2524 = (this.anInt2523 >> 1 << 12) + (anInt2527 * anInt2525 >> 4);
		anInt2530 = anInt2526 * anInt2522 >> 4;
		anInt2531 = anInt2526 * anInt2521 >> 4;
		anInt2516 = (int) local46;
		anInt2520 = (int) local53;
		anInt2518 = (int) local59;
		anInt2519 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aea", name = "dz", descriptor = "(FFFFFF)Z", line = 108)
	boolean method18222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt2509 + this.anInt2507 + this.anInt2513;
		@Pc(17) int local17 = this.anInt2511 + this.anInt2523 + this.anInt2512;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt2507 || local17 != this.anInt2523) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt2511;
			local65 = local53 * (float) this.anInt2511;
			local71 = local32 * (float) this.anInt2509;
			local77 = local39 * (float) this.anInt2509;
			@Pc(84) float local84 = -local32 * (float) this.anInt2513;
			@Pc(91) float local91 = -local39 * (float) this.anInt2513;
			@Pc(98) float local98 = -local46 * (float) this.anInt2512;
			@Pc(105) float local105 = -local53 * (float) this.anInt2512;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + (arg2 - arg0);
		local39 = arg3 + (arg5 - arg1);
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) (this.aClass86_Sub2_13.anInt553 * 1709859847)) {
			local46 = this.aClass86_Sub2_13.anInt553 * 1709859847;
		}
		if (local53 > (float) (this.aClass86_Sub2_13.anInt540 * -1807368365)) {
			local53 = this.aClass86_Sub2_13.anInt540 * -1807368365;
		}
		if (local59 < (float) (this.aClass86_Sub2_13.anInt541 * 9823353)) {
			local59 = this.aClass86_Sub2_13.anInt541 * 9823353;
		}
		if (local65 > (float) (this.aClass86_Sub2_13.anInt542 * 639238427)) {
			local65 = this.aClass86_Sub2_13.anInt542 * 639238427;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return false;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return false;
		}
		anInt2514 = this.aClass86_Sub2_13.anInt547 * 356365251;
		anInt2510 = (int) ((float) ((int) local59 * anInt2514) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		anInt2522 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt2507 / local71);
		anInt2521 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt2523 / local77);
		anInt2529 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt2507 / local77);
		anInt2525 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt2523 / local71);
		anInt2526 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		anInt2527 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		anInt2528 = (this.anInt2507 >> 1 << 12) + (anInt2527 * anInt2529 >> 4);
		anInt2524 = (this.anInt2523 >> 1 << 12) + (anInt2527 * anInt2525 >> 4);
		anInt2530 = anInt2526 * anInt2522 >> 4;
		anInt2531 = anInt2526 * anInt2521 >> 4;
		anInt2516 = (int) local46;
		anInt2520 = (int) local53;
		anInt2518 = (int) local59;
		anInt2519 = (int) local65;
		return true;
	}

	@OriginalMember(owner = "client!aea", name = "ai", descriptor = "(FFFFFFIIII)V", line = 190)
	@Override
	void method18181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2532 = arg7;
			if (arg6 != 1) {
				anInt2533 = arg7 >>> 24;
				anInt2534 = 256 - anInt2533;
				if (arg6 == 0) {
					anInt2535 = arg7 >> 16 & 0xFF;
					anInt2536 = arg7 >> 8 & 0xFF;
					anInt2538 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2537 = arg7 >>> 24;
					anInt2517 = 256 - anInt2537;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2517 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2517 & 0xFF0000;
					anInt2539 = (local68 | local76) >>> 8;
				}
			}
			this.method18226(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aea", name = "bn", descriptor = "(FFFFFFIIII)V", line = 190)
	@Override
	void method18212(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2532 = arg7;
			if (arg6 != 1) {
				anInt2533 = arg7 >>> 24;
				anInt2534 = 256 - anInt2533;
				if (arg6 == 0) {
					anInt2535 = arg7 >> 16 & 0xFF;
					anInt2536 = arg7 >> 8 & 0xFF;
					anInt2538 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2537 = arg7 >>> 24;
					anInt2517 = 256 - anInt2537;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2517 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2517 & 0xFF0000;
					anInt2539 = (local68 | local76) >>> 8;
				}
			}
			this.method18226(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aea", name = "bu", descriptor = "(FFFFFFIIII)V", line = 190)
	@Override
	void method18215(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2532 = arg7;
			if (arg6 != 1) {
				anInt2533 = arg7 >>> 24;
				anInt2534 = 256 - anInt2533;
				if (arg6 == 0) {
					anInt2535 = arg7 >> 16 & 0xFF;
					anInt2536 = arg7 >> 8 & 0xFF;
					anInt2538 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2537 = arg7 >>> 24;
					anInt2517 = 256 - anInt2537;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2517 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2517 & 0xFF0000;
					anInt2539 = (local68 | local76) >>> 8;
				}
			}
			this.method18226(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aea", name = "bf", descriptor = "(FFFFFFIIII)V", line = 190)
	@Override
	void method18211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2532 = arg7;
			if (arg6 != 1) {
				anInt2533 = arg7 >>> 24;
				anInt2534 = 256 - anInt2533;
				if (arg6 == 0) {
					anInt2535 = arg7 >> 16 & 0xFF;
					anInt2536 = arg7 >> 8 & 0xFF;
					anInt2538 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2537 = arg7 >>> 24;
					anInt2517 = 256 - anInt2537;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2517 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2517 & 0xFF0000;
					anInt2539 = (local68 | local76) >>> 8;
				}
			}
			this.method18226(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aea", name = "bp", descriptor = "(FFFFFFIIII)V", line = 190)
	@Override
	void method18186(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			anInt2532 = arg7;
			if (arg6 != 1) {
				anInt2533 = arg7 >>> 24;
				anInt2534 = 256 - anInt2533;
				if (arg6 == 0) {
					anInt2535 = arg7 >> 16 & 0xFF;
					anInt2536 = arg7 >> 8 & 0xFF;
					anInt2538 = arg7 & 0xFF;
				} else if (arg6 == 2) {
					anInt2537 = arg7 >>> 24;
					anInt2517 = 256 - anInt2537;
					@Pc(68) int local68 = (arg7 & 0xFF00FF) * anInt2517 & 0xFF00FF00;
					@Pc(76) int local76 = (arg7 & 0xFF00) * anInt2517 & 0xFF0000;
					anInt2539 = (local68 | local76) >>> 8;
				}
			}
			this.method18226(arg6, arg8);
		}
	}

	@OriginalMember(owner = "client!aea", name = "al", descriptor = "(FFFFFFILclient!cd;II)V", line = 215)
	@Override
	void method18183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class90_Sub2 local20 = (Class90_Sub2) arg7;
			this.method18228(local20.anIntArray67, local20.anIntArray68, anInt2516 - arg8, -arg9 - (anInt2519 - anInt2518));
		}
	}

	@OriginalMember(owner = "client!aea", name = "bt", descriptor = "(FFFFFFILclient!cd;II)V", line = 215)
	@Override
	void method18208(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class90_Sub2 local20 = (Class90_Sub2) arg7;
			this.method18228(local20.anIntArray67, local20.anIntArray68, anInt2516 - arg8, -arg9 - (anInt2519 - anInt2518));
		}
	}

	@OriginalMember(owner = "client!aea", name = "bz", descriptor = "(FFFFFFILclient!cd;II)V", line = 215)
	@Override
	void method18209(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub2_13.method4845()) {
			throw new IllegalStateException();
		} else if (this.method18221(arg0, arg1, arg2, arg3, arg4, arg5)) {
			@Pc(20) Class90_Sub2 local20 = (Class90_Sub2) arg7;
			this.method18228(local20.anIntArray67, local20.anIntArray68, anInt2516 - arg8, -arg9 - (anInt2519 - anInt2518));
		}
	}

	@OriginalMember(owner = "client!aea", name = "cj", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18223(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) boolean arg11);

	@OriginalMember(owner = "client!aea", name = "ay", descriptor = "(IIIIIIII)V")
	abstract void method18205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aea", name = "dn", descriptor = "(II)V")
	abstract void method18224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aea", name = "q", descriptor = "(IIII[III)V")
	public abstract void method18174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aea", name = "g", descriptor = "(IIIII)V")
	public abstract void method18177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aea", name = "z", descriptor = "(IILclient!cd;II)V")
	public abstract void method18197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "(IIIIIIII)V")
	abstract void method18178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aea", name = "dm", descriptor = "([I[III)V")
	abstract void method18225(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aea", name = "do", descriptor = "(II)V")
	abstract void method18226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aea", name = "dh", descriptor = "(ZZZIIFIIIIIIZ)V")
	abstract void method18227(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) boolean arg11);

	@OriginalMember(owner = "client!aea", name = "ah", descriptor = "(IIIII)V")
	public abstract void method18192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aea", name = "as", descriptor = "(IILclient!cd;II)V")
	public abstract void method18193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aea", name = "aq", descriptor = "(IIIIIIII)V")
	abstract void method18194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aea", name = "af", descriptor = "(IIIIIIII)V")
	abstract void method18214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aea", name = "am", descriptor = "(IIIIIIII)V")
	abstract void method18195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!aea", name = "dt", descriptor = "([I[III)V")
	abstract void method18228(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aea", name = "dv", descriptor = "(II)V")
	abstract void method18229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aea", name = "da", descriptor = "(II)V")
	abstract void method18230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aea", name = "dy", descriptor = "([I[III)V")
	abstract void method18231(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aea", name = "an", descriptor = "(IIII[III)V")
	public abstract void method18219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!aea", name = "dq", descriptor = "(II)V")
	abstract void method18232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
