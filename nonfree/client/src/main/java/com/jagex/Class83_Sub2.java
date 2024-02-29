package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aee")
public class Class83_Sub2 extends Class83 {

	@OriginalMember(owner = "client!aee", name = "w", descriptor = "Z")
	boolean aBoolean92;

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "I")
	int anInt488;

	@OriginalMember(owner = "client!aee", name = "q", descriptor = "I")
	int anInt486;

	@OriginalMember(owner = "client!aee", name = "x", descriptor = "I")
	int anInt491;

	@OriginalMember(owner = "client!aee", name = "d", descriptor = "I")
	int anInt487;

	@OriginalMember(owner = "client!aee", name = "p", descriptor = "Lclient!aed;")
	final Class86_Sub1 aClass86_Sub1_2;

	@OriginalMember(owner = "client!aee", name = "l", descriptor = "I")
	final int anInt489;

	@OriginalMember(owner = "client!aee", name = "y", descriptor = "I")
	final int anInt490;

	@OriginalMember(owner = "client!aee", name = "v", descriptor = "Lclient!df;")
	final Interface21 anInterface21_1;

	@OriginalMember(owner = "client!aee", name = "c", descriptor = "Lclient!ks;")
	final Interface37 anInterface37_3;

	@OriginalMember(owner = "client!aee", name = "s", descriptor = "Z")
	final boolean aBoolean93;

	@OriginalMember(owner = "client!aee", name = "r", descriptor = "Z")
	final boolean aBoolean94;

	@OriginalMember(owner = "client!aee", name = "g", descriptor = "Z")
	final boolean aBoolean91;

	@OriginalMember(owner = "client!aee", name = "z", descriptor = "Z")
	final boolean aBoolean95;

	@OriginalMember(owner = "client!aee", name = "<init>", descriptor = "(Lclient!aed;IIZZ)V", line = 30)
	Class83_Sub2(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean92 = false;
		this.anInt488 = 0;
		this.anInt486 = 0;
		this.anInt491 = 0;
		this.anInt487 = 0;
		this.aClass86_Sub1_2 = arg0;
		this.anInt489 = arg1;
		this.anInt490 = arg2;
		if (arg4) {
			@Pc(38) Interface43 local38 = arg0.method20639(arg3 ? Class212.aClass212_18 : Class212.aClass212_24, Class206.aClass206_23, arg1, arg2);
			this.anInterface21_1 = local38.method10636(0);
			this.anInterface37_3 = local38;
		} else {
			this.anInterface37_3 = arg0.method20634(arg3 ? Class212.aClass212_18 : Class212.aClass212_24, Class206.aClass206_23, arg1, arg2);
			this.anInterface21_1 = null;
		}
		this.anInterface37_3.method10618(true, true);
		this.aBoolean93 = this.anInterface37_3.method10631() != arg1;
		this.aBoolean94 = this.anInterface37_3.method10603() != arg2;
		this.aBoolean91 = !this.aBoolean93 && this.anInterface37_3.method10602();
		this.aBoolean95 = !this.aBoolean94 && this.anInterface37_3.method10602();
	}

	@OriginalMember(owner = "client!aee", name = "<init>", descriptor = "(Lclient!aed;II[III)V", line = 50)
	Class83_Sub2(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aBoolean92 = false;
		this.anInt488 = 0;
		this.anInt486 = 0;
		this.anInt491 = 0;
		this.anInt487 = 0;
		this.aClass86_Sub1_2 = arg0;
		this.anInt489 = arg1;
		this.anInt490 = arg2;
		this.anInterface21_1 = null;
		this.anInterface37_3 = arg0.method20693(arg1, arg2, false, arg3, arg4, arg5);
		this.anInterface37_3.method10618(true, true);
		this.aBoolean93 = this.anInterface37_3.method10631() != arg1;
		this.aBoolean94 = this.anInterface37_3.method10603() != arg2;
		this.aBoolean91 = !this.aBoolean93 && this.anInterface37_3.method10602();
		this.aBoolean95 = !this.aBoolean94 && this.anInterface37_3.method10602();
	}

	@OriginalMember(owner = "client!aee", name = "<init>", descriptor = "(Lclient!aed;Lclient!ks;)V", line = 64)
	Class83_Sub2(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Interface37 arg1) {
		this(arg0, arg1, arg1.method10631(), arg1.method10603());
	}

	@OriginalMember(owner = "client!aee", name = "<init>", descriptor = "(Lclient!aed;Lclient!ks;II)V", line = 67)
	Class83_Sub2(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(1) Interface37 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean92 = false;
		this.anInt488 = 0;
		this.anInt486 = 0;
		this.anInt491 = 0;
		this.anInt487 = 0;
		this.aClass86_Sub1_2 = arg0;
		this.anInt489 = arg2;
		this.anInt490 = arg3;
		this.anInterface37_3 = arg1;
		this.anInterface21_1 = null;
		this.aBoolean93 = this.anInterface37_3.method10631() != arg2;
		this.aBoolean94 = this.anInterface37_3.method10603() != arg3;
		this.aBoolean91 = !this.aBoolean93 && this.anInterface37_3.method10602();
		this.aBoolean95 = !this.aBoolean94 && this.anInterface37_3.method10602();
	}

	@OriginalMember(owner = "client!aee", name = "d", descriptor = "(IIIIII)V", line = 80)
	@Override
	public void method18213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface37_3.method10608(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aee", name = "ar", descriptor = "(IIIIII)V", line = 80)
	@Override
	public void method18187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInterface37_3.method10608(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aee", name = "s", descriptor = "(III)V", line = 84)
	@Override
	public void method18176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass86_Sub1_2.method20066(arg0, arg1, this.anInt489, this.anInt490);
		@Pc(16) int[] local16 = new int[this.anInt489 * this.anInt490];
		this.anInterface37_3.method10607(0, 0, this.anInt489, this.anInt490, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18174(0, 0, this.anInt489, this.anInt490, local16, 0, this.anInt489);
	}

	@OriginalMember(owner = "client!aee", name = "ab", descriptor = "(III)V", line = 84)
	@Override
	public void method18217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass86_Sub1_2.method20066(arg0, arg1, this.anInt489, this.anInt490);
		@Pc(16) int[] local16 = new int[this.anInt489 * this.anInt490];
		this.anInterface37_3.method10607(0, 0, this.anInt489, this.anInt490, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18174(0, 0, this.anInt489, this.anInt490, local16, 0, this.anInt489);
	}

	@OriginalMember(owner = "client!aee", name = "aa", descriptor = "(III)V", line = 84)
	@Override
	public void method18202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass86_Sub1_2.method20066(arg0, arg1, this.anInt489, this.anInt490);
		@Pc(16) int[] local16 = new int[this.anInt489 * this.anInt490];
		this.anInterface37_3.method10607(0, 0, this.anInt489, this.anInt490, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18174(0, 0, this.anInt489, this.anInt490, local16, 0, this.anInt489);
	}

	@OriginalMember(owner = "client!aee", name = "ap", descriptor = "(III)V", line = 84)
	@Override
	public void method18182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass86_Sub1_2.method20066(arg0, arg1, this.anInt489, this.anInt490);
		@Pc(16) int[] local16 = new int[this.anInt489 * this.anInt490];
		this.anInterface37_3.method10607(0, 0, this.anInt489, this.anInt490, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt490; local31++) {
				local40 = local31 * this.anInt489;
				for (local42 = 0; local42 < this.anInt489; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method18174(0, 0, this.anInt489, this.anInt490, local16, 0, this.anInt489);
	}

	@OriginalMember(owner = "client!aee", name = "p", descriptor = "(IIII)V", line = 123)
	@Override
	public void method18167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt486 = arg0;
		this.anInt488 = arg1;
		this.anInt487 = arg2;
		this.anInt491 = arg3;
		this.aBoolean92 = this.anInt486 != 0 || this.anInt488 != 0 || this.anInt487 != 0 || this.anInt491 != 0;
	}

	@OriginalMember(owner = "client!aee", name = "aw", descriptor = "(IIII)V", line = 123)
	@Override
	public void method18188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt486 = arg0;
		this.anInt488 = arg1;
		this.anInt487 = arg2;
		this.anInt491 = arg3;
		this.aBoolean92 = this.anInt486 != 0 || this.anInt488 != 0 || this.anInt487 != 0 || this.anInt491 != 0;
	}

	@OriginalMember(owner = "client!aee", name = "c", descriptor = "([I)V", line = 131)
	@Override
	public void method18168(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt486;
		arg0[1] = this.anInt488;
		arg0[2] = this.anInt487;
		arg0[3] = this.anInt491;
	}

	@OriginalMember(owner = "client!aee", name = "az", descriptor = "([I)V", line = 131)
	@Override
	public void method18200(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt486;
		arg0[1] = this.anInt488;
		arg0[2] = this.anInt487;
		arg0[3] = this.anInt491;
	}

	@OriginalMember(owner = "client!aee", name = "bc", descriptor = "([I)V", line = 131)
	@Override
	public void method18220(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt486;
		arg0[1] = this.anInt488;
		arg0[2] = this.anInt487;
		arg0[3] = this.anInt491;
	}

	@OriginalMember(owner = "client!aee", name = "bj", descriptor = "([I)V", line = 131)
	@Override
	public void method18218(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt486;
		arg0[1] = this.anInt488;
		arg0[2] = this.anInt487;
		arg0[3] = this.anInt491;
	}

	@OriginalMember(owner = "client!aee", name = "ba", descriptor = "()I", line = 138)
	@Override
	public int method18210() {
		return this.anInt489;
	}

	@OriginalMember(owner = "client!aee", name = "v", descriptor = "()I", line = 138)
	@Override
	public int method18169() {
		return this.anInt489;
	}

	@OriginalMember(owner = "client!aee", name = "bv", descriptor = "()I", line = 138)
	@Override
	public int method18201() {
		return this.anInt489;
	}

	@OriginalMember(owner = "client!aee", name = "bl", descriptor = "()I", line = 138)
	@Override
	public int method18203() {
		return this.anInt489;
	}

	@OriginalMember(owner = "client!aee", name = "bx", descriptor = "()I", line = 142)
	@Override
	public int method18122() {
		return this.anInt489 + this.anInt486 + this.anInt487;
	}

	@OriginalMember(owner = "client!aee", name = "l", descriptor = "()I", line = 142)
	@Override
	public int method18121() {
		return this.anInt489 + this.anInt486 + this.anInt487;
	}

	@OriginalMember(owner = "client!aee", name = "by", descriptor = "()I", line = 142)
	@Override
	public int method18119() {
		return this.anInt489 + this.anInt486 + this.anInt487;
	}

	@OriginalMember(owner = "client!aee", name = "bd", descriptor = "()I", line = 142)
	@Override
	public int method18120() {
		return this.anInt489 + this.anInt486 + this.anInt487;
	}

	@OriginalMember(owner = "client!aee", name = "y", descriptor = "()I", line = 146)
	@Override
	public int method18171() {
		return this.anInt490;
	}

	@OriginalMember(owner = "client!aee", name = "bb", descriptor = "()I", line = 146)
	@Override
	public int method18204() {
		return this.anInt490;
	}

	@OriginalMember(owner = "client!aee", name = "w", descriptor = "()I", line = 150)
	@Override
	public int method18198() {
		return this.anInt490 + this.anInt488 + this.anInt491;
	}

	@OriginalMember(owner = "client!aee", name = "bw", descriptor = "()I", line = 150)
	@Override
	public int method18180() {
		return this.anInt490 + this.anInt488 + this.anInt491;
	}

	@OriginalMember(owner = "client!aee", name = "ae", descriptor = "()Lclient!df;", line = 154)
	@Override
	public Interface21 method18191() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "client!aee", name = "t", descriptor = "()Lclient!df;", line = 154)
	@Override
	public Interface21 method18173() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "client!aee", name = "at", descriptor = "()Lclient!df;", line = 154)
	@Override
	public Interface21 method18190() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "client!aee", name = "ad", descriptor = "()Lclient!df;", line = 154)
	@Override
	public Interface21 method18172() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "client!aee", name = "ac", descriptor = "()Lclient!df;", line = 154)
	@Override
	public Interface21 method18196() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "client!aee", name = "av", descriptor = "()Lclient!df;", line = 154)
	@Override
	public Interface21 method18189() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "client!aee", name = "q", descriptor = "(IIII[III)V", line = 158)
	@Override
	public void method18174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInterface37_3.method10630(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aee", name = "an", descriptor = "(IIII[III)V", line = 158)
	@Override
	public void method18219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInterface37_3.method10630(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aee", name = "x", descriptor = "(IIII[I[III)V", line = 162)
	@Override
	public void method18175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface37_3.method10623(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aee", name = "au", descriptor = "(IIII[I[III)V", line = 162)
	@Override
	public void method18185(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface37_3.method10623(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aee", name = "ak", descriptor = "(IIII[I[III)V", line = 162)
	@Override
	public void method18170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface37_3.method10623(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aee", name = "ax", descriptor = "(IIII[I[III)V", line = 162)
	@Override
	public void method18199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface37_3.method10623(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aee", name = "ao", descriptor = "(IIII[I[III)V", line = 162)
	@Override
	public void method18184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInterface37_3.method10623(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aee", name = "ah", descriptor = "(IIIII)V", line = 166)
	@Override
	public void method18192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			local9 = arg0 + this.anInt486;
			local14 = arg1 + this.anInt488;
			this.aClass86_Sub1_2.aClass381_3.method28317((float) local9, (float) local14, (float) (local9 + this.anInt489), (float) (local14 + this.anInt490), 0.0F, 0.0F, this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg3);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg4);
		@Pc(55) Class103 local55 = this.aClass86_Sub1_2.aClass103_3;
		local55.anInterface37_19 = this.anInterface37_3;
		local55.method9177(arg2, arg3);
		local9 = arg0 + this.anInt486;
		local14 = arg1 + this.anInt488;
		@Pc(80) float local80 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(87) float local87 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local55.aClass442_52.method28979((float) this.anInt489 * 2.0F / local80, (float) this.anInt490 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass442_52.aFloatArray109[12] = ((float) local9 + this.aClass86_Sub1_2.method20664()) * 2.0F / local80 - 1.0F;
		local55.aClass442_52.aFloatArray109[13] = ((float) local14 + this.aClass86_Sub1_2.method20664()) * 2.0F / local87 - 1.0F;
		local55.aClass442_52.aFloatArray109[14] = -1.0F;
		local55.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local55.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local55.anInt1094 = 0;
		local55.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local55.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "g", descriptor = "(IIIII)V", line = 166)
	@Override
	public void method18177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			local9 = arg0 + this.anInt486;
			local14 = arg1 + this.anInt488;
			this.aClass86_Sub1_2.aClass381_3.method28317((float) local9, (float) local14, (float) (local9 + this.anInt489), (float) (local14 + this.anInt490), 0.0F, 0.0F, this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg3);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg4);
		@Pc(55) Class103 local55 = this.aClass86_Sub1_2.aClass103_3;
		local55.anInterface37_19 = this.anInterface37_3;
		local55.method9177(arg2, arg3);
		local9 = arg0 + this.anInt486;
		local14 = arg1 + this.anInt488;
		@Pc(80) float local80 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(87) float local87 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local55.aClass442_52.method28979((float) this.anInt489 * 2.0F / local80, (float) this.anInt490 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass442_52.aFloatArray109[12] = ((float) local9 + this.aClass86_Sub1_2.method20664()) * 2.0F / local80 - 1.0F;
		local55.aClass442_52.aFloatArray109[13] = ((float) local14 + this.aClass86_Sub1_2.method20664()) * 2.0F / local87 - 1.0F;
		local55.aClass442_52.aFloatArray109[14] = -1.0F;
		local55.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local55.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local55.anInt1094 = 0;
		local55.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local55.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "z", descriptor = "(IILclient!cd;II)V", line = 194)
	@Override
	public void method18197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass86_Sub1_2.method20489();
		@Pc(6) Class103 local6 = this.aClass86_Sub1_2.aClass103_3;
		local6.anInterface37_19 = this.anInterface37_3;
		local6.method9177(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt486;
		@Pc(24) int local24 = arg1 + this.anInt488;
		@Pc(31) float local31 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(38) float local38 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local6.aClass442_52.method28979((float) this.anInt489 * 2.0F / local31, (float) this.anInt490 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass442_52.aFloatArray109[12] = ((float) local19 + this.aClass86_Sub1_2.method20664()) * 2.0F / local31 - 1.0F;
		local6.aClass442_52.aFloatArray109[13] = ((float) local24 + this.aClass86_Sub1_2.method20664()) * 2.0F / local38 - 1.0F;
		local6.aClass442_52.aFloatArray109[14] = -1.0F;
		local6.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local6.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local6.anInt1094 = 0;
		local6.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(131) Interface37 local131 = ((Class90_Sub1) arg2).anInterface37_4;
		local6.anInterface37_20 = local131;
		local6.aClass442_51.method28979(local131.method10600((float) this.anInt489), local131.method10606((float) this.anInt490), 1.0F, 1.0F);
		local6.aClass442_51.aFloatArray109[12] = local131.method10600((float) (local19 - arg3));
		local6.aClass442_51.aFloatArray109[13] = local131.method10606((float) (local24 - arg4));
		local6.method9182();
	}

	@OriginalMember(owner = "client!aee", name = "as", descriptor = "(IILclient!cd;II)V", line = 194)
	@Override
	public void method18193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass86_Sub1_2.method20489();
		@Pc(6) Class103 local6 = this.aClass86_Sub1_2.aClass103_3;
		local6.anInterface37_19 = this.anInterface37_3;
		local6.method9177(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt486;
		@Pc(24) int local24 = arg1 + this.anInt488;
		@Pc(31) float local31 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(38) float local38 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local6.aClass442_52.method28979((float) this.anInt489 * 2.0F / local31, (float) this.anInt490 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass442_52.aFloatArray109[12] = ((float) local19 + this.aClass86_Sub1_2.method20664()) * 2.0F / local31 - 1.0F;
		local6.aClass442_52.aFloatArray109[13] = ((float) local24 + this.aClass86_Sub1_2.method20664()) * 2.0F / local38 - 1.0F;
		local6.aClass442_52.aFloatArray109[14] = -1.0F;
		local6.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local6.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local6.anInt1094 = 0;
		local6.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(131) Interface37 local131 = ((Class90_Sub1) arg2).anInterface37_4;
		local6.anInterface37_20 = local131;
		local6.aClass442_51.method28979(local131.method10600((float) this.anInt489), local131.method10606((float) this.anInt490), 1.0F, 1.0F);
		local6.aClass442_51.aFloatArray109[12] = local131.method10600((float) (local19 - arg3));
		local6.aClass442_51.aFloatArray109[13] = local131.method10606((float) (local24 - arg4));
		local6.method9182();
	}

	@OriginalMember(owner = "client!aee", name = "ay", descriptor = "(IIIIIIII)V", line = 219)
	@Override
	void method18205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			if (this.aBoolean92) {
				arg2 = arg2 * this.anInt489 / this.method18121();
				arg3 = arg3 * this.anInt490 / this.method18198();
				arg0 += this.anInt486 * arg2 / this.anInt489;
				arg1 += this.anInt488 * arg3 / this.anInt490;
			}
			this.aClass86_Sub1_2.aClass381_3.method28317((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface37_3.method10600(0.0F), this.anInterface37_3.method10606(0.0F), this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), this.anInterface37_3, arg5);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(94) Class103 local94 = this.aClass86_Sub1_2.aClass103_3;
		local94.anInterface37_19 = this.anInterface37_3;
		local94.method9177(arg4, arg5);
		if (this.aBoolean92) {
			arg2 = arg2 * this.anInt489 / this.method18121();
			arg3 = arg3 * this.anInt490 / this.method18198();
			arg0 += this.anInt486 * arg2 / this.anInt489;
			arg1 += this.anInt488 * arg3 / this.anInt490;
		}
		@Pc(148) float local148 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(155) float local155 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local94.aClass442_52.method28979((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local148 - 1.0F;
		local94.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local155 - 1.0F;
		local94.aClass442_52.aFloatArray109[14] = -1.0F;
		local94.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local94.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local94.anInt1094 = 0;
		local94.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local94.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "k", descriptor = "(IIIIIIII)V", line = 219)
	@Override
	void method18178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			if (this.aBoolean92) {
				arg2 = arg2 * this.anInt489 / this.method18121();
				arg3 = arg3 * this.anInt490 / this.method18198();
				arg0 += this.anInt486 * arg2 / this.anInt489;
				arg1 += this.anInt488 * arg3 / this.anInt490;
			}
			this.aClass86_Sub1_2.aClass381_3.method28317((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface37_3.method10600(0.0F), this.anInterface37_3.method10606(0.0F), this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), this.anInterface37_3, arg5);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(94) Class103 local94 = this.aClass86_Sub1_2.aClass103_3;
		local94.anInterface37_19 = this.anInterface37_3;
		local94.method9177(arg4, arg5);
		if (this.aBoolean92) {
			arg2 = arg2 * this.anInt489 / this.method18121();
			arg3 = arg3 * this.anInt490 / this.method18198();
			arg0 += this.anInt486 * arg2 / this.anInt489;
			arg1 += this.anInt488 * arg3 / this.anInt490;
		}
		@Pc(148) float local148 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(155) float local155 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local94.aClass442_52.method28979((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local148 - 1.0F;
		local94.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local155 - 1.0F;
		local94.aClass442_52.aFloatArray109[14] = -1.0F;
		local94.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local94.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local94.anInt1094 = 0;
		local94.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local94.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "aq", descriptor = "(IIIIIIII)V", line = 219)
	@Override
	void method18194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			if (this.aBoolean92) {
				arg2 = arg2 * this.anInt489 / this.method18121();
				arg3 = arg3 * this.anInt490 / this.method18198();
				arg0 += this.anInt486 * arg2 / this.anInt489;
				arg1 += this.anInt488 * arg3 / this.anInt490;
			}
			this.aClass86_Sub1_2.aClass381_3.method28317((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface37_3.method10600(0.0F), this.anInterface37_3.method10606(0.0F), this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), this.anInterface37_3, arg5);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(94) Class103 local94 = this.aClass86_Sub1_2.aClass103_3;
		local94.anInterface37_19 = this.anInterface37_3;
		local94.method9177(arg4, arg5);
		if (this.aBoolean92) {
			arg2 = arg2 * this.anInt489 / this.method18121();
			arg3 = arg3 * this.anInt490 / this.method18198();
			arg0 += this.anInt486 * arg2 / this.anInt489;
			arg1 += this.anInt488 * arg3 / this.anInt490;
		}
		@Pc(148) float local148 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(155) float local155 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local94.aClass442_52.method28979((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local148 - 1.0F;
		local94.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local155 - 1.0F;
		local94.aClass442_52.aFloatArray109[14] = -1.0F;
		local94.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local94.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local94.anInt1094 = 0;
		local94.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local94.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "af", descriptor = "(IIIIIIII)V", line = 219)
	@Override
	void method18214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			if (this.aBoolean92) {
				arg2 = arg2 * this.anInt489 / this.method18121();
				arg3 = arg3 * this.anInt490 / this.method18198();
				arg0 += this.anInt486 * arg2 / this.anInt489;
				arg1 += this.anInt488 * arg3 / this.anInt490;
			}
			this.aClass86_Sub1_2.aClass381_3.method28317((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface37_3.method10600(0.0F), this.anInterface37_3.method10606(0.0F), this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), this.anInterface37_3, arg5);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(94) Class103 local94 = this.aClass86_Sub1_2.aClass103_3;
		local94.anInterface37_19 = this.anInterface37_3;
		local94.method9177(arg4, arg5);
		if (this.aBoolean92) {
			arg2 = arg2 * this.anInt489 / this.method18121();
			arg3 = arg3 * this.anInt490 / this.method18198();
			arg0 += this.anInt486 * arg2 / this.anInt489;
			arg1 += this.anInt488 * arg3 / this.anInt490;
		}
		@Pc(148) float local148 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(155) float local155 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local94.aClass442_52.method28979((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local148 - 1.0F;
		local94.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local155 - 1.0F;
		local94.aClass442_52.aFloatArray109[14] = -1.0F;
		local94.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local94.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local94.anInt1094 = 0;
		local94.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local94.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "am", descriptor = "(IIIIIIII)V", line = 219)
	@Override
	void method18195(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			if (this.aBoolean92) {
				arg2 = arg2 * this.anInt489 / this.method18121();
				arg3 = arg3 * this.anInt490 / this.method18198();
				arg0 += this.anInt486 * arg2 / this.anInt489;
				arg1 += this.anInt488 * arg3 / this.anInt490;
			}
			this.aClass86_Sub1_2.aClass381_3.method28317((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface37_3.method10600(0.0F), this.anInterface37_3.method10606(0.0F), this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), this.anInterface37_3, arg5);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(94) Class103 local94 = this.aClass86_Sub1_2.aClass103_3;
		local94.anInterface37_19 = this.anInterface37_3;
		local94.method9177(arg4, arg5);
		if (this.aBoolean92) {
			arg2 = arg2 * this.anInt489 / this.method18121();
			arg3 = arg3 * this.anInt490 / this.method18198();
			arg0 += this.anInt486 * arg2 / this.anInt489;
			arg1 += this.anInt488 * arg3 / this.anInt490;
		}
		@Pc(148) float local148 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(155) float local155 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local94.aClass442_52.method28979((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local148 - 1.0F;
		local94.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local155 - 1.0F;
		local94.aClass442_52.aFloatArray109[14] = -1.0F;
		local94.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local94.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local94.anInt1094 = 0;
		local94.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local94.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "e", descriptor = "(IIIIIII)V", line = 255)
	@Override
	public void method18179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18121();
			@Pc(18) int local18 = this.method18198();
			@Pc(23) int local23 = arg1 + this.anInt488;
			for (local28 = local23 + this.anInt490; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt486;
				for (local41 = local36 + this.anInt489; local41 <= local12; local41 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + this.anInt489), (float) (local23 + this.anInt490), 0.0F, 0.0F, this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt490), 0.0F, 0.0F, (float) local89 / (float) this.anInt489 * this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt490 * this.anInterface37_3.method10610();
				local89 = arg0 + this.anInt486;
				for (local161 = local89 + this.anInt489; local161 <= local12; local161 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + this.anInt489), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt489 * this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
				}
			}
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(250) Class103 local250 = this.aClass86_Sub1_2.aClass103_3;
		local250.anInterface37_19 = this.anInterface37_3;
		local250.method9177(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(272) float local272 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local250.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local250.anInt1094 = 0;
		local250.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(298) boolean local298 = this.aBoolean95 && this.anInt488 == 0 && this.anInt491 == 0;
		@Pc(311) boolean local311 = this.aBoolean91 && this.anInt486 == 0 && this.anInt487 == 0;
		if (local311 & local298) {
			local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
			local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
			local250.aClass442_52.aFloatArray109[14] = -1.0F;
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local250.method9179();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18198();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
			local41 = arg1 + this.anInt488;
			for (local89 = local41 + this.anInt490; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) local161), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18121();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt486;
			for (local89 = local41 + this.anInt489; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local161), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18121();
			local89 = this.method18198();
			local161 = arg1 + this.anInt488;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt490; local206 <= local28; local206 += local89) {
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
				local817 = arg0 + this.anInt486;
				for (local822 = local817 + this.anInt489; local822 <= local36; local822 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local902), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local902 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt486;
				for (local902 = local822 + this.anInt489; local902 <= local36; local902 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local1099), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bi", descriptor = "(IIIIIII)V", line = 255)
	@Override
	public void method18216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18121();
			@Pc(18) int local18 = this.method18198();
			@Pc(23) int local23 = arg1 + this.anInt488;
			for (local28 = local23 + this.anInt490; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt486;
				for (local41 = local36 + this.anInt489; local41 <= local12; local41 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + this.anInt489), (float) (local23 + this.anInt490), 0.0F, 0.0F, this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt490), 0.0F, 0.0F, (float) local89 / (float) this.anInt489 * this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt490 * this.anInterface37_3.method10610();
				local89 = arg0 + this.anInt486;
				for (local161 = local89 + this.anInt489; local161 <= local12; local161 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + this.anInt489), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt489 * this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
				}
			}
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(250) Class103 local250 = this.aClass86_Sub1_2.aClass103_3;
		local250.anInterface37_19 = this.anInterface37_3;
		local250.method9177(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(272) float local272 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local250.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local250.anInt1094 = 0;
		local250.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(298) boolean local298 = this.aBoolean95 && this.anInt488 == 0 && this.anInt491 == 0;
		@Pc(311) boolean local311 = this.aBoolean91 && this.anInt486 == 0 && this.anInt487 == 0;
		if (local311 & local298) {
			local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
			local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
			local250.aClass442_52.aFloatArray109[14] = -1.0F;
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local250.method9179();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18198();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
			local41 = arg1 + this.anInt488;
			for (local89 = local41 + this.anInt490; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) local161), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18121();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt486;
			for (local89 = local41 + this.anInt489; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local161), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18121();
			local89 = this.method18198();
			local161 = arg1 + this.anInt488;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt490; local206 <= local28; local206 += local89) {
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
				local817 = arg0 + this.anInt486;
				for (local822 = local817 + this.anInt489; local822 <= local36; local822 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local902), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local902 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt486;
				for (local902 = local822 + this.anInt489; local902 <= local36; local902 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local1099), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bs", descriptor = "(IIIIIII)V", line = 255)
	@Override
	public void method18207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18121();
			@Pc(18) int local18 = this.method18198();
			@Pc(23) int local23 = arg1 + this.anInt488;
			for (local28 = local23 + this.anInt490; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt486;
				for (local41 = local36 + this.anInt489; local41 <= local12; local41 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + this.anInt489), (float) (local23 + this.anInt490), 0.0F, 0.0F, this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt490), 0.0F, 0.0F, (float) local89 / (float) this.anInt489 * this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt490 * this.anInterface37_3.method10610();
				local89 = arg0 + this.anInt486;
				for (local161 = local89 + this.anInt489; local161 <= local12; local161 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + this.anInt489), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt489 * this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
				}
			}
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(250) Class103 local250 = this.aClass86_Sub1_2.aClass103_3;
		local250.anInterface37_19 = this.anInterface37_3;
		local250.method9177(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(272) float local272 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local250.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local250.anInt1094 = 0;
		local250.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(298) boolean local298 = this.aBoolean95 && this.anInt488 == 0 && this.anInt491 == 0;
		@Pc(311) boolean local311 = this.aBoolean91 && this.anInt486 == 0 && this.anInt487 == 0;
		if (local311 & local298) {
			local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
			local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
			local250.aClass442_52.aFloatArray109[14] = -1.0F;
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local250.method9179();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18198();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
			local41 = arg1 + this.anInt488;
			for (local89 = local41 + this.anInt490; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) local161), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18121();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt486;
			for (local89 = local41 + this.anInt489; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local161), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18121();
			local89 = this.method18198();
			local161 = arg1 + this.anInt488;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt490; local206 <= local28; local206 += local89) {
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
				local817 = arg0 + this.anInt486;
				for (local822 = local817 + this.anInt489; local822 <= local36; local822 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local902), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local902 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt486;
				for (local902 = local822 + this.anInt489; local902 <= local36; local902 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local1099), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bg", descriptor = "(IIIIIII)V", line = 255)
	@Override
	public void method18206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method18121();
			@Pc(18) int local18 = this.method18198();
			@Pc(23) int local23 = arg1 + this.anInt488;
			for (local28 = local23 + this.anInt490; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt486;
				for (local41 = local36 + this.anInt489; local41 <= local12; local41 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + this.anInt489), (float) (local23 + this.anInt490), 0.0F, 0.0F, this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt490), 0.0F, 0.0F, (float) local89 / (float) this.anInt489 * this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt490 * this.anInterface37_3.method10610();
				local89 = arg0 + this.anInt486;
				for (local161 = local89 + this.anInt489; local161 <= local12; local161 += local15) {
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + this.anInt489), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass86_Sub1_2.aClass381_3.method28317((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt489 * this.anInterface37_3.method10611(), local151, this.anInterface37_3, arg5);
				}
			}
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg6);
		@Pc(250) Class103 local250 = this.aClass86_Sub1_2.aClass103_3;
		local250.anInterface37_19 = this.anInterface37_3;
		local250.method9177(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(272) float local272 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local250.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local250.anInt1094 = 0;
		local250.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(298) boolean local298 = this.aBoolean95 && this.anInt488 == 0 && this.anInt491 == 0;
		@Pc(311) boolean local311 = this.aBoolean91 && this.anInt486 == 0 && this.anInt487 == 0;
		if (local311 & local298) {
			local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
			local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
			local250.aClass442_52.aFloatArray109[14] = -1.0F;
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local250.method9179();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method18198();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
			local41 = arg1 + this.anInt488;
			for (local89 = local41 + this.anInt490; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) arg2), this.anInterface37_3.method10606((float) local161), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method18121();
			local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt486;
			for (local89 = local41 + this.anInt489; local89 <= local28; local89 += local36) {
				local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local161), this.anInterface37_3.method10606((float) arg3), 1.0F, 1.0F);
				local250.aClass442_52.method28979((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass442_52.aFloatArray109[12] = ((float) local41 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
				local250.aClass442_52.aFloatArray109[13] = ((float) arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
				local250.aClass442_52.aFloatArray109[14] = -1.0F;
				local250.method9179();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method18121();
			local89 = this.method18198();
			local161 = arg1 + this.anInt488;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt490; local206 <= local28; local206 += local89) {
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
				local817 = arg0 + this.anInt486;
				for (local822 = local817 + this.anInt489; local822 <= local36; local822 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local902), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local902 * 2.0F / local265, (float) this.anInt490 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local817 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt486;
				for (local902 = local822 + this.anInt489; local902 <= local36; local902 += local41) {
					local250.aClass442_52.method28979((float) this.anInt489 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass442_50.method28979(this.anInterface37_3.method10600((float) local1099), this.anInterface37_3.method10606((float) local817), 1.0F, 1.0F);
					local250.aClass442_52.method28979((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass442_52.aFloatArray109[12] = ((float) local822 + this.aClass86_Sub1_2.method20664()) * 2.0F / local265 - 1.0F;
					local250.aClass442_52.aFloatArray109[13] = ((float) local161 + this.aClass86_Sub1_2.method20664()) * 2.0F / local272 - 1.0F;
					local250.aClass442_52.aFloatArray109[14] = -1.0F;
					local250.method9179();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aee", name = "bu", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method18215(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			this.aClass86_Sub1_2.aClass381_3.method28321(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface37_3.method10611(), 0.0F, 0.0F, this.anInterface37_3.method10610(), this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg7);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean92) {
			@Pc(58) float local58 = (float) this.method18121();
			local62 = this.method18198();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt488;
			@Pc(98) float local98 = local86 * (float) this.anInt488;
			@Pc(104) float local104 = local68 * (float) this.anInt486;
			@Pc(110) float local110 = local74 * (float) this.anInt486;
			@Pc(117) float local117 = -local68 * (float) this.anInt487;
			@Pc(124) float local124 = -local74 * (float) this.anInt487;
			@Pc(131) float local131 = -local80 * (float) this.anInt491;
			@Pc(138) float local138 = -local86 * (float) this.anInt491;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class103 local178 = this.aClass86_Sub1_2.aClass103_3;
		local178.anInterface37_19 = this.anInterface37_3;
		local178.method9177(arg6, arg7);
		local62 = this.aClass86_Sub1_2.method19940().method23491();
		local68 = this.aClass86_Sub1_2.method19940().method23493();
		local178.aClass442_52.method28951();
		local178.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[12] = (arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local62 - 1.0F;
		local178.aClass442_52.aFloatArray109[13] = (arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local68 - 1.0F;
		local178.aClass442_52.aFloatArray109[14] = -1.0F;
		local178.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local178.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local178.anInt1094 = 0;
		local178.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local178.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "ai", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method18181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			this.aClass86_Sub1_2.aClass381_3.method28321(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface37_3.method10611(), 0.0F, 0.0F, this.anInterface37_3.method10610(), this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg7);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean92) {
			@Pc(58) float local58 = (float) this.method18121();
			local62 = this.method18198();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt488;
			@Pc(98) float local98 = local86 * (float) this.anInt488;
			@Pc(104) float local104 = local68 * (float) this.anInt486;
			@Pc(110) float local110 = local74 * (float) this.anInt486;
			@Pc(117) float local117 = -local68 * (float) this.anInt487;
			@Pc(124) float local124 = -local74 * (float) this.anInt487;
			@Pc(131) float local131 = -local80 * (float) this.anInt491;
			@Pc(138) float local138 = -local86 * (float) this.anInt491;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class103 local178 = this.aClass86_Sub1_2.aClass103_3;
		local178.anInterface37_19 = this.anInterface37_3;
		local178.method9177(arg6, arg7);
		local62 = this.aClass86_Sub1_2.method19940().method23491();
		local68 = this.aClass86_Sub1_2.method19940().method23493();
		local178.aClass442_52.method28951();
		local178.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[12] = (arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local62 - 1.0F;
		local178.aClass442_52.aFloatArray109[13] = (arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local68 - 1.0F;
		local178.aClass442_52.aFloatArray109[14] = -1.0F;
		local178.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local178.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local178.anInt1094 = 0;
		local178.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local178.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "bf", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method18211(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			this.aClass86_Sub1_2.aClass381_3.method28321(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface37_3.method10611(), 0.0F, 0.0F, this.anInterface37_3.method10610(), this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg7);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean92) {
			@Pc(58) float local58 = (float) this.method18121();
			local62 = this.method18198();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt488;
			@Pc(98) float local98 = local86 * (float) this.anInt488;
			@Pc(104) float local104 = local68 * (float) this.anInt486;
			@Pc(110) float local110 = local74 * (float) this.anInt486;
			@Pc(117) float local117 = -local68 * (float) this.anInt487;
			@Pc(124) float local124 = -local74 * (float) this.anInt487;
			@Pc(131) float local131 = -local80 * (float) this.anInt491;
			@Pc(138) float local138 = -local86 * (float) this.anInt491;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class103 local178 = this.aClass86_Sub1_2.aClass103_3;
		local178.anInterface37_19 = this.anInterface37_3;
		local178.method9177(arg6, arg7);
		local62 = this.aClass86_Sub1_2.method19940().method23491();
		local68 = this.aClass86_Sub1_2.method19940().method23493();
		local178.aClass442_52.method28951();
		local178.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[12] = (arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local62 - 1.0F;
		local178.aClass442_52.aFloatArray109[13] = (arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local68 - 1.0F;
		local178.aClass442_52.aFloatArray109[14] = -1.0F;
		local178.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local178.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local178.anInt1094 = 0;
		local178.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local178.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "bn", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method18212(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			this.aClass86_Sub1_2.aClass381_3.method28321(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface37_3.method10611(), 0.0F, 0.0F, this.anInterface37_3.method10610(), this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg7);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean92) {
			@Pc(58) float local58 = (float) this.method18121();
			local62 = this.method18198();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt488;
			@Pc(98) float local98 = local86 * (float) this.anInt488;
			@Pc(104) float local104 = local68 * (float) this.anInt486;
			@Pc(110) float local110 = local74 * (float) this.anInt486;
			@Pc(117) float local117 = -local68 * (float) this.anInt487;
			@Pc(124) float local124 = -local74 * (float) this.anInt487;
			@Pc(131) float local131 = -local80 * (float) this.anInt491;
			@Pc(138) float local138 = -local86 * (float) this.anInt491;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class103 local178 = this.aClass86_Sub1_2.aClass103_3;
		local178.anInterface37_19 = this.anInterface37_3;
		local178.method9177(arg6, arg7);
		local62 = this.aClass86_Sub1_2.method19940().method23491();
		local68 = this.aClass86_Sub1_2.method19940().method23493();
		local178.aClass442_52.method28951();
		local178.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[12] = (arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local62 - 1.0F;
		local178.aClass442_52.aFloatArray109[13] = (arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local68 - 1.0F;
		local178.aClass442_52.aFloatArray109[14] = -1.0F;
		local178.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local178.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local178.anInt1094 = 0;
		local178.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local178.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "bp", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method18186(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass86_Sub1_2.method20438() != Class369.aClass369_2) {
			this.aClass86_Sub1_2.aClass381_3.method28321(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface37_3.method10611(), 0.0F, 0.0F, this.anInterface37_3.method10610(), this.anInterface37_3.method10611(), this.anInterface37_3.method10610(), this.anInterface37_3, arg7);
			return;
		}
		this.aClass86_Sub1_2.method20489();
		this.aClass86_Sub1_2.method20579(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean92) {
			@Pc(58) float local58 = (float) this.method18121();
			local62 = this.method18198();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt488;
			@Pc(98) float local98 = local86 * (float) this.anInt488;
			@Pc(104) float local104 = local68 * (float) this.anInt486;
			@Pc(110) float local110 = local74 * (float) this.anInt486;
			@Pc(117) float local117 = -local68 * (float) this.anInt487;
			@Pc(124) float local124 = -local74 * (float) this.anInt487;
			@Pc(131) float local131 = -local80 * (float) this.anInt491;
			@Pc(138) float local138 = -local86 * (float) this.anInt491;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class103 local178 = this.aClass86_Sub1_2.aClass103_3;
		local178.anInterface37_19 = this.anInterface37_3;
		local178.method9177(arg6, arg7);
		local62 = this.aClass86_Sub1_2.method19940().method23491();
		local68 = this.aClass86_Sub1_2.method19940().method23493();
		local178.aClass442_52.method28951();
		local178.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass442_52.aFloatArray109[12] = (arg0 + this.aClass86_Sub1_2.method20664()) * 2.0F / local62 - 1.0F;
		local178.aClass442_52.aFloatArray109[13] = (arg1 + this.aClass86_Sub1_2.method20664()) * 2.0F / local68 - 1.0F;
		local178.aClass442_52.aFloatArray109[14] = -1.0F;
		local178.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local178.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local178.anInt1094 = 0;
		local178.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		local178.method9179();
	}

	@OriginalMember(owner = "client!aee", name = "al", descriptor = "(FFFFFFILclient!cd;II)V", line = 475)
	@Override
	void method18183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass86_Sub1_2.method20489();
		@Pc(6) Class103 local6 = this.aClass86_Sub1_2.aClass103_3;
		local6.anInterface37_19 = this.anInterface37_3;
		local6.method9177(1, -1);
		@Pc(21) float local21 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(28) float local28 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local6.aClass442_52.method28951();
		if (this.aBoolean92) {
			@Pc(42) float local42 = (float) this.anInt489 / (float) this.method18121();
			@Pc(50) float local50 = (float) this.anInt490 / (float) this.method18198();
			local6.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * local42;
			local6.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * local42;
			local6.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * local50;
			local6.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * local50;
			local6.aClass442_52.aFloatArray109[12] = (arg0 + (float) this.anInt486) * local42 + this.aClass86_Sub1_2.method20664();
			local6.aClass442_52.aFloatArray109[13] = (arg1 + (float) this.anInt488) * local50 + this.aClass86_Sub1_2.method20664();
		} else {
			local6.aClass442_52.aFloatArray109[0] = arg2 - arg0;
			local6.aClass442_52.aFloatArray109[1] = arg3 - arg1;
			local6.aClass442_52.aFloatArray109[4] = arg4 - arg0;
			local6.aClass442_52.aFloatArray109[5] = arg5 - arg1;
			local6.aClass442_52.aFloatArray109[12] = arg0 + this.aClass86_Sub1_2.method20664();
			local6.aClass442_52.aFloatArray109[13] = arg1 + this.aClass86_Sub1_2.method20664();
		}
		@Pc(179) Class442 local179 = this.aClass86_Sub1_2.aClass442_87;
		local179.method28951();
		local179.aFloatArray109[0] = 2.0F / local21;
		local179.aFloatArray109[5] = 2.0F / local28;
		local179.aFloatArray109[12] = -1.0F;
		local179.aFloatArray109[13] = -1.0F;
		local179.aFloatArray109[14] = -1.0F;
		local6.aClass442_52.method28965(local179);
		local6.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local6.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local6.anInt1094 = 0;
		local6.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(248) Interface37 local248 = ((Class90_Sub1) arg7).anInterface37_4;
		local6.anInterface37_20 = local248;
		local6.aClass442_51.method28951();
		local6.aClass442_51.aFloatArray109[0] = (arg2 - arg0) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[1] = (arg3 - arg1) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[4] = (arg4 - arg0) * local248.method10606(1.0F);
		local6.aClass442_51.aFloatArray109[5] = (arg5 - arg1) * local248.method10606(1.0F);
		local6.aClass442_51.aFloatArray109[12] = (arg0 - (float) arg8) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[13] = (arg1 - (float) arg9) * local248.method10606(1.0F);
		local6.method9182();
	}

	@OriginalMember(owner = "client!aee", name = "bt", descriptor = "(FFFFFFILclient!cd;II)V", line = 475)
	@Override
	void method18208(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass86_Sub1_2.method20489();
		@Pc(6) Class103 local6 = this.aClass86_Sub1_2.aClass103_3;
		local6.anInterface37_19 = this.anInterface37_3;
		local6.method9177(1, -1);
		@Pc(21) float local21 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(28) float local28 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local6.aClass442_52.method28951();
		if (this.aBoolean92) {
			@Pc(42) float local42 = (float) this.anInt489 / (float) this.method18121();
			@Pc(50) float local50 = (float) this.anInt490 / (float) this.method18198();
			local6.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * local42;
			local6.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * local42;
			local6.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * local50;
			local6.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * local50;
			local6.aClass442_52.aFloatArray109[12] = (arg0 + (float) this.anInt486) * local42 + this.aClass86_Sub1_2.method20664();
			local6.aClass442_52.aFloatArray109[13] = (arg1 + (float) this.anInt488) * local50 + this.aClass86_Sub1_2.method20664();
		} else {
			local6.aClass442_52.aFloatArray109[0] = arg2 - arg0;
			local6.aClass442_52.aFloatArray109[1] = arg3 - arg1;
			local6.aClass442_52.aFloatArray109[4] = arg4 - arg0;
			local6.aClass442_52.aFloatArray109[5] = arg5 - arg1;
			local6.aClass442_52.aFloatArray109[12] = arg0 + this.aClass86_Sub1_2.method20664();
			local6.aClass442_52.aFloatArray109[13] = arg1 + this.aClass86_Sub1_2.method20664();
		}
		@Pc(179) Class442 local179 = this.aClass86_Sub1_2.aClass442_87;
		local179.method28951();
		local179.aFloatArray109[0] = 2.0F / local21;
		local179.aFloatArray109[5] = 2.0F / local28;
		local179.aFloatArray109[12] = -1.0F;
		local179.aFloatArray109[13] = -1.0F;
		local179.aFloatArray109[14] = -1.0F;
		local6.aClass442_52.method28965(local179);
		local6.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local6.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local6.anInt1094 = 0;
		local6.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(248) Interface37 local248 = ((Class90_Sub1) arg7).anInterface37_4;
		local6.anInterface37_20 = local248;
		local6.aClass442_51.method28951();
		local6.aClass442_51.aFloatArray109[0] = (arg2 - arg0) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[1] = (arg3 - arg1) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[4] = (arg4 - arg0) * local248.method10606(1.0F);
		local6.aClass442_51.aFloatArray109[5] = (arg5 - arg1) * local248.method10606(1.0F);
		local6.aClass442_51.aFloatArray109[12] = (arg0 - (float) arg8) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[13] = (arg1 - (float) arg9) * local248.method10606(1.0F);
		local6.method9182();
	}

	@OriginalMember(owner = "client!aee", name = "bz", descriptor = "(FFFFFFILclient!cd;II)V", line = 475)
	@Override
	void method18209(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class90 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass86_Sub1_2.method20489();
		@Pc(6) Class103 local6 = this.aClass86_Sub1_2.aClass103_3;
		local6.anInterface37_19 = this.anInterface37_3;
		local6.method9177(1, -1);
		@Pc(21) float local21 = (float) this.aClass86_Sub1_2.method19940().method23491();
		@Pc(28) float local28 = (float) this.aClass86_Sub1_2.method19940().method23493();
		local6.aClass442_52.method28951();
		if (this.aBoolean92) {
			@Pc(42) float local42 = (float) this.anInt489 / (float) this.method18121();
			@Pc(50) float local50 = (float) this.anInt490 / (float) this.method18198();
			local6.aClass442_52.aFloatArray109[0] = (arg2 - arg0) * local42;
			local6.aClass442_52.aFloatArray109[1] = (arg3 - arg1) * local42;
			local6.aClass442_52.aFloatArray109[4] = (arg4 - arg0) * local50;
			local6.aClass442_52.aFloatArray109[5] = (arg5 - arg1) * local50;
			local6.aClass442_52.aFloatArray109[12] = (arg0 + (float) this.anInt486) * local42 + this.aClass86_Sub1_2.method20664();
			local6.aClass442_52.aFloatArray109[13] = (arg1 + (float) this.anInt488) * local50 + this.aClass86_Sub1_2.method20664();
		} else {
			local6.aClass442_52.aFloatArray109[0] = arg2 - arg0;
			local6.aClass442_52.aFloatArray109[1] = arg3 - arg1;
			local6.aClass442_52.aFloatArray109[4] = arg4 - arg0;
			local6.aClass442_52.aFloatArray109[5] = arg5 - arg1;
			local6.aClass442_52.aFloatArray109[12] = arg0 + this.aClass86_Sub1_2.method20664();
			local6.aClass442_52.aFloatArray109[13] = arg1 + this.aClass86_Sub1_2.method20664();
		}
		@Pc(179) Class442 local179 = this.aClass86_Sub1_2.aClass442_87;
		local179.method28951();
		local179.aFloatArray109[0] = 2.0F / local21;
		local179.aFloatArray109[5] = 2.0F / local28;
		local179.aFloatArray109[12] = -1.0F;
		local179.aFloatArray109[13] = -1.0F;
		local179.aFloatArray109[14] = -1.0F;
		local6.aClass442_52.method28965(local179);
		local6.aClass442_50.method28979(this.anInterface37_3.method10600((float) this.anInt489), this.anInterface37_3.method10606((float) this.anInt490), 1.0F, 1.0F);
		local6.anInterface36_9 = this.aClass86_Sub1_2.anInterface36_15;
		local6.anInt1094 = 0;
		local6.aClass113_10 = this.aClass86_Sub1_2.aClass113_17;
		@Pc(248) Interface37 local248 = ((Class90_Sub1) arg7).anInterface37_4;
		local6.anInterface37_20 = local248;
		local6.aClass442_51.method28951();
		local6.aClass442_51.aFloatArray109[0] = (arg2 - arg0) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[1] = (arg3 - arg1) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[4] = (arg4 - arg0) * local248.method10606(1.0F);
		local6.aClass442_51.aFloatArray109[5] = (arg5 - arg1) * local248.method10606(1.0F);
		local6.aClass442_51.aFloatArray109[12] = (arg0 - (float) arg8) * local248.method10600(1.0F);
		local6.aClass442_51.aFloatArray109[13] = (arg1 - (float) arg9) * local248.method10606(1.0F);
		local6.method9182();
	}
}
