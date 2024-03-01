package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aan")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!aan", name = "s", descriptor = "I")
	int anInt99;

	@OriginalMember(owner = "client!aan", name = "l", descriptor = "I")
	final int anInt100;

	@OriginalMember(owner = "client!aan", name = "g", descriptor = "Lclient!da;")
	final Interface10 anInterface10_1;

	@OriginalMember(owner = "client!aan", name = "j", descriptor = "Z")
	final boolean aBoolean23;

	@OriginalMember(owner = "client!aan", name = "a", descriptor = "Lclient!ic;")
	final Interface20 anInterface20_2;

	@OriginalMember(owner = "client!aan", name = "x", descriptor = "Z")
	boolean aBoolean24;

	@OriginalMember(owner = "client!aan", name = "p", descriptor = "Lclient!abv;")
	final Class21_Sub3 aClass21_Sub3_1;

	@OriginalMember(owner = "client!aan", name = "n", descriptor = "Z")
	final boolean aBoolean25;

	@OriginalMember(owner = "client!aan", name = "y", descriptor = "I")
	int anInt101;

	@OriginalMember(owner = "client!aan", name = "b", descriptor = "I")
	int anInt102;

	@OriginalMember(owner = "client!aan", name = "c", descriptor = "Z")
	final boolean aBoolean26;

	@OriginalMember(owner = "client!aan", name = "z", descriptor = "Z")
	final boolean aBoolean27;

	@OriginalMember(owner = "client!aan", name = "u", descriptor = "I")
	int anInt103;

	@OriginalMember(owner = "client!aan", name = "h", descriptor = "I")
	final int anInt104;

	@OriginalMember(owner = "client!aan", name = "<init>", descriptor = "(Lclient!abv;IIZZ)V", line = 30)
	Class6_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean24 = false;
		this.anInt99 = 0;
		this.anInt103 = 0;
		this.anInt101 = 0;
		this.anInt102 = 0;
		this.aClass21_Sub3_1 = arg0;
		this.anInt100 = arg1;
		this.anInt104 = arg2;
		if (arg4) {
			@Pc(38) Interface29 local38 = arg0.method17510(arg3 ? Class121.aClass121_17 : Class121.aClass121_18, Class127.aClass127_23, arg1, arg2);
			this.anInterface10_1 = local38.method8963(0);
			this.anInterface20_2 = local38;
		} else {
			this.anInterface20_2 = arg0.method17504(arg3 ? Class121.aClass121_17 : Class121.aClass121_18, Class127.aClass127_23, arg1, arg2);
			this.anInterface10_1 = null;
		}
		this.anInterface20_2.method8951(true, true);
		this.aBoolean26 = this.anInterface20_2.method8961() != arg1;
		this.aBoolean27 = this.anInterface20_2.method8931() != arg2;
		this.aBoolean23 = !this.aBoolean26 && this.anInterface20_2.method8934();
		this.aBoolean25 = !this.aBoolean27 && this.anInterface20_2.method8934();
	}

	@OriginalMember(owner = "client!aan", name = "<init>", descriptor = "(Lclient!abv;II[III)V", line = 50)
	Class6_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aBoolean24 = false;
		this.anInt99 = 0;
		this.anInt103 = 0;
		this.anInt101 = 0;
		this.anInt102 = 0;
		this.aClass21_Sub3_1 = arg0;
		this.anInt100 = arg1;
		this.anInt104 = arg2;
		this.anInterface10_1 = null;
		this.anInterface20_2 = arg0.method17507(arg1, arg2, false, arg3, arg4, arg5);
		this.anInterface20_2.method8951(true, true);
		this.aBoolean26 = this.anInterface20_2.method8961() != arg1;
		this.aBoolean27 = this.anInterface20_2.method8931() != arg2;
		this.aBoolean23 = !this.aBoolean26 && this.anInterface20_2.method8934();
		this.aBoolean25 = !this.aBoolean27 && this.anInterface20_2.method8934();
	}

	@OriginalMember(owner = "client!aan", name = "<init>", descriptor = "(Lclient!abv;Lclient!ic;)V", line = 64)
	Class6_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Interface20 arg1) {
		this(arg0, arg1, arg1.method8961(), arg1.method8931());
	}

	@OriginalMember(owner = "client!aan", name = "<init>", descriptor = "(Lclient!abv;Lclient!ic;II)V", line = 67)
	Class6_Sub2(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Interface20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean24 = false;
		this.anInt99 = 0;
		this.anInt103 = 0;
		this.anInt101 = 0;
		this.anInt102 = 0;
		this.aClass21_Sub3_1 = arg0;
		this.anInt100 = arg2;
		this.anInt104 = arg3;
		this.anInterface20_2 = arg1;
		this.anInterface10_1 = null;
		this.aBoolean26 = this.anInterface20_2.method8961() != arg2;
		this.aBoolean27 = this.anInterface20_2.method8931() != arg3;
		this.aBoolean23 = !this.aBoolean26 && this.anInterface20_2.method8934();
		this.aBoolean25 = !this.aBoolean27 && this.anInterface20_2.method8934();
	}

	@OriginalMember(owner = "client!aan", name = "ak", descriptor = "(IIIIII)V", line = 80)
	@Override
	public void method16809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass21_Sub3_1.method17051(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method903(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aan", name = "u", descriptor = "(IIIIII)V", line = 80)
	@Override
	public void method16795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass21_Sub3_1.method17051(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method903(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aan", name = "aa", descriptor = "(IIIIII)V", line = 80)
	@Override
	public void method16803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass21_Sub3_1.method17051(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method903(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aan", name = "y", descriptor = "(III)V", line = 88)
	@Override
	public void method16780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass21_Sub3_1.method17051(arg0, arg1, this.anInt100, this.anInt104);
		@Pc(16) int[] local16 = new int[this.anInt100 * this.anInt104];
		this.anInterface20_2.method8949(0, 0, this.anInt100, this.anInt104, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method903(0, 0, this.anInt100, this.anInt104, local16, 0, this.anInt100);
	}

	@OriginalMember(owner = "client!aan", name = "aj", descriptor = "(III)V", line = 88)
	@Override
	public void method16806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass21_Sub3_1.method17051(arg0, arg1, this.anInt100, this.anInt104);
		@Pc(16) int[] local16 = new int[this.anInt100 * this.anInt104];
		this.anInterface20_2.method8949(0, 0, this.anInt100, this.anInt104, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method903(0, 0, this.anInt100, this.anInt104, local16, 0, this.anInt100);
	}

	@OriginalMember(owner = "client!aan", name = "ah", descriptor = "(III)V", line = 88)
	@Override
	public void method16804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass21_Sub3_1.method17051(arg0, arg1, this.anInt100, this.anInt104);
		@Pc(16) int[] local16 = new int[this.anInt100 * this.anInt104];
		this.anInterface20_2.method8949(0, 0, this.anInt100, this.anInt104, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method903(0, 0, this.anInt100, this.anInt104, local16, 0, this.anInt100);
	}

	@OriginalMember(owner = "client!aan", name = "an", descriptor = "(III)V", line = 88)
	@Override
	public void method16805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int[] local9 = this.aClass21_Sub3_1.method17051(arg0, arg1, this.anInt100, this.anInt104);
		@Pc(16) int[] local16 = new int[this.anInt100 * this.anInt104];
		this.anInterface20_2.method8949(0, 0, this.anInt100, this.anInt104, local16, 0);
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(42) int local42;
		if (arg2 == 0) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF0000) << 8;
				}
			}
		} else if (arg2 == 1) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF00) << 16;
				}
			}
		} else if (arg2 == 2) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] & 0xFF) << 24;
				}
			}
		} else if (arg2 == 3) {
			for (local31 = 0; local31 < this.anInt104; local31++) {
				local40 = local31 * this.anInt100;
				for (local42 = 0; local42 < this.anInt100; local42++) {
					local16[local40 + local42] = local16[local40 + local42] & 0xFFFFFF | (local9[local40 + local42] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method903(0, 0, this.anInt100, this.anInt104, local16, 0, this.anInt100);
	}

	@OriginalMember(owner = "client!aan", name = "p", descriptor = "(IIII)V", line = 127)
	@Override
	public void method16775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt103 = arg0;
		this.anInt99 = arg1;
		this.anInt102 = arg2;
		this.anInt101 = arg3;
		this.aBoolean24 = this.anInt103 != 0 || this.anInt99 != 0 || this.anInt102 != 0 || this.anInt101 != 0;
	}

	@OriginalMember(owner = "client!aan", name = "bk", descriptor = "(IIII)V", line = 127)
	@Override
	public void method16832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt103 = arg0;
		this.anInt99 = arg1;
		this.anInt102 = arg2;
		this.anInt101 = arg3;
		this.aBoolean24 = this.anInt103 != 0 || this.anInt99 != 0 || this.anInt102 != 0 || this.anInt101 != 0;
	}

	@OriginalMember(owner = "client!aan", name = "bt", descriptor = "(IIII)V", line = 127)
	@Override
	public void method16831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt103 = arg0;
		this.anInt99 = arg1;
		this.anInt102 = arg2;
		this.anInt101 = arg3;
		this.aBoolean24 = this.anInt103 != 0 || this.anInt99 != 0 || this.anInt102 != 0 || this.anInt101 != 0;
	}

	@OriginalMember(owner = "client!aan", name = "ap", descriptor = "([I)V", line = 135)
	@Override
	public void method16815(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt103;
		arg0[1] = this.anInt99;
		arg0[2] = this.anInt102;
		arg0[3] = this.anInt101;
	}

	@OriginalMember(owner = "client!aan", name = "al", descriptor = "([I)V", line = 135)
	@Override
	public void method16798(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt103;
		arg0[1] = this.anInt99;
		arg0[2] = this.anInt102;
		arg0[3] = this.anInt101;
	}

	@OriginalMember(owner = "client!aan", name = "ao", descriptor = "([I)V", line = 135)
	@Override
	public void method16814(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt103;
		arg0[1] = this.anInt99;
		arg0[2] = this.anInt102;
		arg0[3] = this.anInt101;
	}

	@OriginalMember(owner = "client!aan", name = "a", descriptor = "([I)V", line = 135)
	@Override
	public void method16776(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt103;
		arg0[1] = this.anInt99;
		arg0[2] = this.anInt102;
		arg0[3] = this.anInt101;
	}

	@OriginalMember(owner = "client!aan", name = "g", descriptor = "()I", line = 142)
	@Override
	public int method16782() {
		return this.anInt100;
	}

	@OriginalMember(owner = "client!aan", name = "au", descriptor = "()I", line = 142)
	@Override
	public int method16817() {
		return this.anInt100;
	}

	@OriginalMember(owner = "client!aan", name = "ab", descriptor = "()I", line = 142)
	@Override
	public int method16816() {
		return this.anInt100;
	}

	@OriginalMember(owner = "client!aan", name = "ay", descriptor = "()I", line = 142)
	@Override
	public int method16818() {
		return this.anInt100;
	}

	@OriginalMember(owner = "client!aan", name = "l", descriptor = "()I", line = 146)
	@Override
	public int method16772() {
		return this.anInt100 + this.anInt103 + this.anInt102;
	}

	@OriginalMember(owner = "client!aan", name = "am", descriptor = "()I", line = 146)
	@Override
	public int method16771() {
		return this.anInt100 + this.anInt103 + this.anInt102;
	}

	@OriginalMember(owner = "client!aan", name = "ar", descriptor = "()I", line = 146)
	@Override
	public int method16773() {
		return this.anInt100 + this.anInt103 + this.anInt102;
	}

	@OriginalMember(owner = "client!aan", name = "h", descriptor = "()I", line = 150)
	@Override
	public int method16787() {
		return this.anInt104;
	}

	@OriginalMember(owner = "client!aan", name = "ag", descriptor = "()I", line = 150)
	@Override
	public int method16819() {
		return this.anInt104;
	}

	@OriginalMember(owner = "client!aan", name = "x", descriptor = "()I", line = 154)
	@Override
	public int method16779() {
		return this.anInt104 + this.anInt99 + this.anInt101;
	}

	@OriginalMember(owner = "client!aan", name = "ae", descriptor = "()I", line = 154)
	@Override
	public int method16821() {
		return this.anInt104 + this.anInt99 + this.anInt101;
	}

	@OriginalMember(owner = "client!aan", name = "ad", descriptor = "()I", line = 154)
	@Override
	public int method16781() {
		return this.anInt104 + this.anInt99 + this.anInt101;
	}

	@OriginalMember(owner = "client!aan", name = "ai", descriptor = "()Lclient!da;", line = 158)
	@Override
	public Interface10 method16820() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!aan", name = "s", descriptor = "()Lclient!da;", line = 158)
	@Override
	public Interface10 method16835() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!aan", name = "as", descriptor = "()Lclient!da;", line = 158)
	@Override
	public Interface10 method16807() {
		return this.anInterface10_1;
	}

	@OriginalMember(owner = "client!aan", name = "cl", descriptor = "(IIII[III)V", line = 162)
	void method903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInterface20_2.method8935(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aan", name = "az", descriptor = "(IIIII)V", line = 166)
	@Override
	public void method16812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			local9 = arg0 + this.anInt103;
			local14 = arg1 + this.anInt99;
			this.aClass21_Sub3_1.aClass266_3.method25238((float) local9, (float) local14, (float) (local9 + this.anInt100), (float) (local14 + this.anInt104), 0.0F, 0.0F, this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg3);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg4);
		@Pc(55) Class31 local55 = this.aClass21_Sub3_1.aClass31_3;
		local55.anInterface20_18 = this.anInterface20_2;
		local55.method8274(arg2, arg3);
		local9 = arg0 + this.anInt103;
		local14 = arg1 + this.anInt99;
		@Pc(80) float local80 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(87) float local87 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local55.aClass328_51.method26050((float) this.anInt100 * 2.0F / local80, (float) this.anInt104 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass328_51.aFloatArray106[12] = ((float) local9 + this.aClass21_Sub3_1.method17577()) * 2.0F / local80 - 1.0F;
		local55.aClass328_51.aFloatArray106[13] = ((float) local14 + this.aClass21_Sub3_1.method17577()) * 2.0F / local87 - 1.0F;
		local55.aClass328_51.aFloatArray106[14] = -1.0F;
		local55.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local55.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local55.anInt884 = 0;
		local55.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local55.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "c", descriptor = "(IIIII)V", line = 166)
	@Override
	public void method16794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			local9 = arg0 + this.anInt103;
			local14 = arg1 + this.anInt99;
			this.aClass21_Sub3_1.aClass266_3.method25238((float) local9, (float) local14, (float) (local9 + this.anInt100), (float) (local14 + this.anInt104), 0.0F, 0.0F, this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg3);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg4);
		@Pc(55) Class31 local55 = this.aClass21_Sub3_1.aClass31_3;
		local55.anInterface20_18 = this.anInterface20_2;
		local55.method8274(arg2, arg3);
		local9 = arg0 + this.anInt103;
		local14 = arg1 + this.anInt99;
		@Pc(80) float local80 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(87) float local87 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local55.aClass328_51.method26050((float) this.anInt100 * 2.0F / local80, (float) this.anInt104 * 2.0F / local87, 1.0F, 1.0F);
		local55.aClass328_51.aFloatArray106[12] = ((float) local9 + this.aClass21_Sub3_1.method17577()) * 2.0F / local80 - 1.0F;
		local55.aClass328_51.aFloatArray106[13] = ((float) local14 + this.aClass21_Sub3_1.method17577()) * 2.0F / local87 - 1.0F;
		local55.aClass328_51.aFloatArray106[14] = -1.0F;
		local55.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local55.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local55.anInt884 = 0;
		local55.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local55.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "av", descriptor = "(IILclient!ch;II)V", line = 194)
	@Override
	public void method16810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub3_1.method17549();
		@Pc(6) Class31 local6 = this.aClass21_Sub3_1.aClass31_3;
		local6.anInterface20_18 = this.anInterface20_2;
		local6.method8274(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt103;
		@Pc(24) int local24 = arg1 + this.anInt99;
		@Pc(31) float local31 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(38) float local38 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local6.aClass328_51.method26050((float) this.anInt100 * 2.0F / local31, (float) this.anInt104 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass328_51.aFloatArray106[12] = ((float) local19 + this.aClass21_Sub3_1.method17577()) * 2.0F / local31 - 1.0F;
		local6.aClass328_51.aFloatArray106[13] = ((float) local24 + this.aClass21_Sub3_1.method17577()) * 2.0F / local38 - 1.0F;
		local6.aClass328_51.aFloatArray106[14] = -1.0F;
		local6.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local6.anInt884 = 0;
		local6.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(131) Interface20 local131 = ((Class5_Sub1) arg2).anInterface20_1;
		local6.anInterface20_19 = local131;
		local6.aClass328_52.method26050(local131.method8932((float) this.anInt100), local131.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.aClass328_52.aFloatArray106[12] = local131.method8932((float) (local19 - arg3));
		local6.aClass328_52.aFloatArray106[13] = local131.method8933((float) (local24 - arg4));
		local6.method8272();
	}

	@OriginalMember(owner = "client!aan", name = "z", descriptor = "(IILclient!ch;II)V", line = 194)
	@Override
	public void method16785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub3_1.method17549();
		@Pc(6) Class31 local6 = this.aClass21_Sub3_1.aClass31_3;
		local6.anInterface20_18 = this.anInterface20_2;
		local6.method8274(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt103;
		@Pc(24) int local24 = arg1 + this.anInt99;
		@Pc(31) float local31 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(38) float local38 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local6.aClass328_51.method26050((float) this.anInt100 * 2.0F / local31, (float) this.anInt104 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass328_51.aFloatArray106[12] = ((float) local19 + this.aClass21_Sub3_1.method17577()) * 2.0F / local31 - 1.0F;
		local6.aClass328_51.aFloatArray106[13] = ((float) local24 + this.aClass21_Sub3_1.method17577()) * 2.0F / local38 - 1.0F;
		local6.aClass328_51.aFloatArray106[14] = -1.0F;
		local6.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local6.anInt884 = 0;
		local6.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(131) Interface20 local131 = ((Class5_Sub1) arg2).anInterface20_1;
		local6.anInterface20_19 = local131;
		local6.aClass328_52.method26050(local131.method8932((float) this.anInt100), local131.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.aClass328_52.aFloatArray106[12] = local131.method8932((float) (local19 - arg3));
		local6.aClass328_52.aFloatArray106[13] = local131.method8933((float) (local24 - arg4));
		local6.method8272();
	}

	@OriginalMember(owner = "client!aan", name = "aq", descriptor = "(IILclient!ch;II)V", line = 194)
	@Override
	public void method16802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass21_Sub3_1.method17549();
		@Pc(6) Class31 local6 = this.aClass21_Sub3_1.aClass31_3;
		local6.anInterface20_18 = this.anInterface20_2;
		local6.method8274(1, -1);
		@Pc(19) int local19 = arg0 + this.anInt103;
		@Pc(24) int local24 = arg1 + this.anInt99;
		@Pc(31) float local31 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(38) float local38 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local6.aClass328_51.method26050((float) this.anInt100 * 2.0F / local31, (float) this.anInt104 * 2.0F / local38, 1.0F, 1.0F);
		local6.aClass328_51.aFloatArray106[12] = ((float) local19 + this.aClass21_Sub3_1.method17577()) * 2.0F / local31 - 1.0F;
		local6.aClass328_51.aFloatArray106[13] = ((float) local24 + this.aClass21_Sub3_1.method17577()) * 2.0F / local38 - 1.0F;
		local6.aClass328_51.aFloatArray106[14] = -1.0F;
		local6.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local6.anInt884 = 0;
		local6.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(131) Interface20 local131 = ((Class5_Sub1) arg2).anInterface20_1;
		local6.anInterface20_19 = local131;
		local6.aClass328_52.method26050(local131.method8932((float) this.anInt100), local131.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.aClass328_52.aFloatArray106[12] = local131.method8932((float) (local19 - arg3));
		local6.aClass328_52.aFloatArray106[13] = local131.method8933((float) (local24 - arg4));
		local6.method8272();
	}

	@OriginalMember(owner = "client!aan", name = "e", descriptor = "(IIIIIIII)V", line = 219)
	@Override
	void method16846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			if (this.aBoolean24) {
				arg2 = arg2 * this.anInt100 / this.method16772();
				arg3 = arg3 * this.anInt104 / this.method16779();
				arg0 += this.anInt103 * arg2 / this.anInt100;
				arg1 += this.anInt99 * arg3 / this.anInt104;
			}
			this.aClass21_Sub3_1.aClass266_3.method25238((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface20_2.method8932(0.0F), this.anInterface20_2.method8933(0.0F), this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), this.anInterface20_2, arg5);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg6);
		@Pc(94) Class31 local94 = this.aClass21_Sub3_1.aClass31_3;
		local94.anInterface20_18 = this.anInterface20_2;
		local94.method8274(arg4, arg5);
		if (this.aBoolean24) {
			arg2 = arg2 * this.anInt100 / this.method16772();
			arg3 = arg3 * this.anInt104 / this.method16779();
			arg0 += this.anInt103 * arg2 / this.anInt100;
			arg1 += this.anInt99 * arg3 / this.anInt104;
		}
		@Pc(148) float local148 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(155) float local155 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local94.aClass328_51.method26050((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local148 - 1.0F;
		local94.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local155 - 1.0F;
		local94.aClass328_51.aFloatArray106[14] = -1.0F;
		local94.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local94.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local94.anInt884 = 0;
		local94.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local94.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "ax", descriptor = "(IIIIIIII)V", line = 219)
	@Override
	void method16811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			if (this.aBoolean24) {
				arg2 = arg2 * this.anInt100 / this.method16772();
				arg3 = arg3 * this.anInt104 / this.method16779();
				arg0 += this.anInt103 * arg2 / this.anInt100;
				arg1 += this.anInt99 * arg3 / this.anInt104;
			}
			this.aClass21_Sub3_1.aClass266_3.method25238((float) arg0, (float) arg1, (float) (arg0 + arg2), (float) (arg1 + arg3), this.anInterface20_2.method8932(0.0F), this.anInterface20_2.method8933(0.0F), this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), this.anInterface20_2, arg5);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg6);
		@Pc(94) Class31 local94 = this.aClass21_Sub3_1.aClass31_3;
		local94.anInterface20_18 = this.anInterface20_2;
		local94.method8274(arg4, arg5);
		if (this.aBoolean24) {
			arg2 = arg2 * this.anInt100 / this.method16772();
			arg3 = arg3 * this.anInt104 / this.method16779();
			arg0 += this.anInt103 * arg2 / this.anInt100;
			arg1 += this.anInt99 * arg3 / this.anInt104;
		}
		@Pc(148) float local148 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(155) float local155 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local94.aClass328_51.method26050((float) arg2 * 2.0F / local148, (float) arg3 * 2.0F / local155, 1.0F, 1.0F);
		local94.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local148 - 1.0F;
		local94.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local155 - 1.0F;
		local94.aClass328_51.aFloatArray106[14] = -1.0F;
		local94.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local94.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local94.anInt884 = 0;
		local94.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local94.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "d", descriptor = "(IIIIIII)V", line = 255)
	@Override
	public void method16790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method16772();
			@Pc(18) int local18 = this.method16779();
			@Pc(23) int local23 = arg1 + this.anInt99;
			for (local28 = local23 + this.anInt104; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt103;
				for (local41 = local36 + this.anInt100; local41 <= local12; local41 += local15) {
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local36, (float) local23, (float) (local36 + this.anInt100), (float) (local23 + this.anInt104), 0.0F, 0.0F, this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt104), 0.0F, 0.0F, (float) local89 / (float) this.anInt100 * this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt104 * this.anInterface20_2.method8939();
				local89 = arg0 + this.anInt103;
				for (local161 = local89 + this.anInt100; local161 <= local12; local161 += local15) {
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local89, (float) local23, (float) (local89 + this.anInt100), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface20_2.method8938(), local151, this.anInterface20_2, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt100 * this.anInterface20_2.method8938(), local151, this.anInterface20_2, arg5);
				}
			}
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg6);
		@Pc(250) Class31 local250 = this.aClass21_Sub3_1.aClass31_3;
		local250.anInterface20_18 = this.anInterface20_2;
		local250.method8274(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(272) float local272 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local250.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local250.anInt884 = 0;
		local250.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(298) boolean local298 = this.aBoolean25 && this.anInt99 == 0 && this.anInt101 == 0;
		@Pc(311) boolean local311 = this.aBoolean23 && this.anInt103 == 0 && this.anInt102 == 0;
		if (local311 & local298) {
			local250.aClass328_51.method26050((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
			local250.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
			local250.aClass328_51.aFloatArray106[14] = -1.0F;
			local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) arg2), this.anInterface20_2.method8933((float) arg3), 1.0F, 1.0F);
			local250.method8270();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method16779();
			local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) arg2), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
			local41 = arg1 + this.anInt99;
			for (local89 = local41 + this.anInt104; local89 <= local28; local89 += local36) {
				local250.aClass328_51.method26050((float) arg2 * 2.0F / local265, (float) this.anInt104 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) arg2), this.anInterface20_2.method8933((float) local161), 1.0F, 1.0F);
				local250.aClass328_51.method26050((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method16772();
			local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt103;
			for (local89 = local41 + this.anInt100; local89 <= local28; local89 += local36) {
				local250.aClass328_51.method26050((float) this.anInt100 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) local161), this.anInterface20_2.method8933((float) arg3), 1.0F, 1.0F);
				local250.aClass328_51.method26050((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method16772();
			local89 = this.method16779();
			local161 = arg1 + this.anInt99;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt104; local206 <= local28; local206 += local89) {
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
				local817 = arg0 + this.anInt103;
				for (local822 = local817 + this.anInt100; local822 <= local36; local822 += local41) {
					local250.aClass328_51.method26050((float) this.anInt100 * 2.0F / local265, (float) this.anInt104 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local817 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) local902), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
					local250.aClass328_51.method26050((float) local902 * 2.0F / local265, (float) this.anInt104 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local817 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt103;
				for (local902 = local822 + this.anInt100; local902 <= local36; local902 += local41) {
					local250.aClass328_51.method26050((float) this.anInt100 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local822 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) local1099), this.anInterface20_2.method8933((float) local817), 1.0F, 1.0F);
					local250.aClass328_51.method26050((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local822 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aan", name = "aw", descriptor = "(IIIIIII)V", line = 255)
	@Override
	public void method16823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(89) int local89;
		@Pc(161) int local161;
		@Pc(206) int local206;
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			@Pc(8) int local8 = arg1 + arg3;
			@Pc(12) int local12 = arg0 + arg2;
			@Pc(15) int local15 = this.method16772();
			@Pc(18) int local18 = this.method16779();
			@Pc(23) int local23 = arg1 + this.anInt99;
			for (local28 = local23 + this.anInt104; local28 <= local8; local28 += local18) {
				local36 = arg0 + this.anInt103;
				for (local41 = local36 + this.anInt100; local41 <= local12; local41 += local15) {
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local36, (float) local23, (float) (local36 + this.anInt100), (float) (local23 + this.anInt104), 0.0F, 0.0F, this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg5);
					local36 += local15;
				}
				if (local36 < local12) {
					local89 = local12 - local36;
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local36, (float) local23, (float) (local36 + local89), (float) (local23 + this.anInt104), 0.0F, 0.0F, (float) local89 / (float) this.anInt100 * this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg5);
				}
				local23 += local18;
			}
			if (local23 < local8) {
				local36 = local8 - local23;
				@Pc(151) float local151 = (float) local36 / (float) this.anInt104 * this.anInterface20_2.method8939();
				local89 = arg0 + this.anInt103;
				for (local161 = local89 + this.anInt100; local161 <= local12; local161 += local15) {
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local89, (float) local23, (float) (local89 + this.anInt100), (float) (local23 + local36), 0.0F, 0.0F, this.anInterface20_2.method8938(), local151, this.anInterface20_2, arg5);
					local89 += local15;
				}
				if (local89 < local12) {
					local206 = local12 - local89;
					this.aClass21_Sub3_1.aClass266_3.method25238((float) local89, (float) local23, (float) (local89 + local206), (float) (local23 + local36), 0.0F, 0.0F, (float) local206 / (float) this.anInt100 * this.anInterface20_2.method8938(), local151, this.anInterface20_2, arg5);
				}
			}
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg6);
		@Pc(250) Class31 local250 = this.aClass21_Sub3_1.aClass31_3;
		local250.anInterface20_18 = this.anInterface20_2;
		local250.method8274(arg4, arg5);
		@Pc(265) float local265 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(272) float local272 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local250.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local250.anInt884 = 0;
		local250.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(298) boolean local298 = this.aBoolean25 && this.anInt99 == 0 && this.anInt101 == 0;
		@Pc(311) boolean local311 = this.aBoolean23 && this.anInt103 == 0 && this.anInt102 == 0;
		if (local311 & local298) {
			local250.aClass328_51.method26050((float) arg2 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
			local250.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
			local250.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
			local250.aClass328_51.aFloatArray106[14] = -1.0F;
			local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) arg2), this.anInterface20_2.method8933((float) arg3), 1.0F, 1.0F);
			local250.method8270();
		} else if (local311) {
			local28 = arg1 + arg3;
			local36 = this.method16779();
			local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) arg2), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
			local41 = arg1 + this.anInt99;
			for (local89 = local41 + this.anInt104; local89 <= local28; local89 += local36) {
				local250.aClass328_51.method26050((float) arg2 * 2.0F / local265, (float) this.anInt104 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) arg2), this.anInterface20_2.method8933((float) local161), 1.0F, 1.0F);
				local250.aClass328_51.method26050((float) arg2 * 2.0F / local265, (float) local161 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
			}
		} else if (local298) {
			local28 = arg0 + arg2;
			local36 = this.method16772();
			local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) arg3), 1.0F, 1.0F);
			local41 = arg0 + this.anInt103;
			for (local89 = local41 + this.anInt100; local89 <= local28; local89 += local36) {
				local250.aClass328_51.method26050((float) this.anInt100 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
				local41 += local36;
			}
			if (local41 < local28) {
				local161 = local28 - local41;
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) local161), this.anInterface20_2.method8933((float) arg3), 1.0F, 1.0F);
				local250.aClass328_51.method26050((float) local161 * 2.0F / local265, (float) arg3 * 2.0F / local272, 1.0F, 1.0F);
				local250.aClass328_51.aFloatArray106[12] = ((float) local41 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
				local250.aClass328_51.aFloatArray106[13] = ((float) arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
				local250.aClass328_51.aFloatArray106[14] = -1.0F;
				local250.method8270();
			}
		} else {
			local28 = arg1 + arg3;
			local36 = arg0 + arg2;
			local41 = this.method16772();
			local89 = this.method16779();
			local161 = arg1 + this.anInt99;
			@Pc(817) int local817;
			@Pc(822) int local822;
			@Pc(902) int local902;
			for (local206 = local161 + this.anInt104; local206 <= local28; local206 += local89) {
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
				local817 = arg0 + this.anInt103;
				for (local822 = local817 + this.anInt100; local822 <= local36; local822 += local41) {
					local250.aClass328_51.method26050((float) this.anInt100 * 2.0F / local265, (float) this.anInt104 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local817 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
					local817 += local41;
				}
				if (local817 < local36) {
					local902 = local36 - local817;
					local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) local902), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
					local250.aClass328_51.method26050((float) local902 * 2.0F / local265, (float) this.anInt104 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local817 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
				}
				local161 += local89;
			}
			if (local161 < local28) {
				local817 = local28 - local161;
				local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) local817), 1.0F, 1.0F);
				local822 = arg0 + this.anInt103;
				for (local902 = local822 + this.anInt100; local902 <= local36; local902 += local41) {
					local250.aClass328_51.method26050((float) this.anInt100 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local822 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
					local822 += local41;
				}
				if (local822 < local36) {
					@Pc(1099) int local1099 = local36 - local822;
					local250.aClass328_53.method26050(this.anInterface20_2.method8932((float) local1099), this.anInterface20_2.method8933((float) local817), 1.0F, 1.0F);
					local250.aClass328_51.method26050((float) local1099 * 2.0F / local265, (float) local817 * 2.0F / local272, 1.0F, 1.0F);
					local250.aClass328_51.aFloatArray106[12] = ((float) local822 + this.aClass21_Sub3_1.method17577()) * 2.0F / local265 - 1.0F;
					local250.aClass328_51.aFloatArray106[13] = ((float) local161 + this.aClass21_Sub3_1.method17577()) * 2.0F / local272 - 1.0F;
					local250.aClass328_51.aFloatArray106[14] = -1.0F;
					local250.method8270();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aan", name = "k", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method16799(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			this.aClass21_Sub3_1.aClass266_3.method25239(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface20_2.method8938(), 0.0F, 0.0F, this.anInterface20_2.method8939(), this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg7);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean24) {
			@Pc(58) float local58 = (float) this.method16772();
			local62 = this.method16779();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt99;
			@Pc(98) float local98 = local86 * (float) this.anInt99;
			@Pc(104) float local104 = local68 * (float) this.anInt103;
			@Pc(110) float local110 = local74 * (float) this.anInt103;
			@Pc(117) float local117 = -local68 * (float) this.anInt102;
			@Pc(124) float local124 = -local74 * (float) this.anInt102;
			@Pc(131) float local131 = -local80 * (float) this.anInt101;
			@Pc(138) float local138 = -local86 * (float) this.anInt101;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class31 local178 = this.aClass21_Sub3_1.aClass31_3;
		local178.anInterface20_18 = this.anInterface20_2;
		local178.method8274(arg6, arg7);
		local62 = this.aClass21_Sub3_1.method17037().method21390();
		local68 = this.aClass21_Sub3_1.method17037().method21391();
		local178.aClass328_51.method26042();
		local178.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[12] = (arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local62 - 1.0F;
		local178.aClass328_51.aFloatArray106[13] = (arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local68 - 1.0F;
		local178.aClass328_51.aFloatArray106[14] = -1.0F;
		local178.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local178.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local178.anInt884 = 0;
		local178.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local178.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "bp", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method16826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			this.aClass21_Sub3_1.aClass266_3.method25239(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface20_2.method8938(), 0.0F, 0.0F, this.anInterface20_2.method8939(), this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg7);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean24) {
			@Pc(58) float local58 = (float) this.method16772();
			local62 = this.method16779();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt99;
			@Pc(98) float local98 = local86 * (float) this.anInt99;
			@Pc(104) float local104 = local68 * (float) this.anInt103;
			@Pc(110) float local110 = local74 * (float) this.anInt103;
			@Pc(117) float local117 = -local68 * (float) this.anInt102;
			@Pc(124) float local124 = -local74 * (float) this.anInt102;
			@Pc(131) float local131 = -local80 * (float) this.anInt101;
			@Pc(138) float local138 = -local86 * (float) this.anInt101;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class31 local178 = this.aClass21_Sub3_1.aClass31_3;
		local178.anInterface20_18 = this.anInterface20_2;
		local178.method8274(arg6, arg7);
		local62 = this.aClass21_Sub3_1.method17037().method21390();
		local68 = this.aClass21_Sub3_1.method17037().method21391();
		local178.aClass328_51.method26042();
		local178.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[12] = (arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local62 - 1.0F;
		local178.aClass328_51.aFloatArray106[13] = (arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local68 - 1.0F;
		local178.aClass328_51.aFloatArray106[14] = -1.0F;
		local178.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local178.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local178.anInt884 = 0;
		local178.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local178.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "bw", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method16825(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			this.aClass21_Sub3_1.aClass266_3.method25239(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface20_2.method8938(), 0.0F, 0.0F, this.anInterface20_2.method8939(), this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg7);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean24) {
			@Pc(58) float local58 = (float) this.method16772();
			local62 = this.method16779();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt99;
			@Pc(98) float local98 = local86 * (float) this.anInt99;
			@Pc(104) float local104 = local68 * (float) this.anInt103;
			@Pc(110) float local110 = local74 * (float) this.anInt103;
			@Pc(117) float local117 = -local68 * (float) this.anInt102;
			@Pc(124) float local124 = -local74 * (float) this.anInt102;
			@Pc(131) float local131 = -local80 * (float) this.anInt101;
			@Pc(138) float local138 = -local86 * (float) this.anInt101;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class31 local178 = this.aClass21_Sub3_1.aClass31_3;
		local178.anInterface20_18 = this.anInterface20_2;
		local178.method8274(arg6, arg7);
		local62 = this.aClass21_Sub3_1.method17037().method21390();
		local68 = this.aClass21_Sub3_1.method17037().method21391();
		local178.aClass328_51.method26042();
		local178.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[12] = (arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local62 - 1.0F;
		local178.aClass328_51.aFloatArray106[13] = (arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local68 - 1.0F;
		local178.aClass328_51.aFloatArray106[14] = -1.0F;
		local178.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local178.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local178.anInt884 = 0;
		local178.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local178.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "bd", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method16827(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			this.aClass21_Sub3_1.aClass266_3.method25239(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface20_2.method8938(), 0.0F, 0.0F, this.anInterface20_2.method8939(), this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg7);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean24) {
			@Pc(58) float local58 = (float) this.method16772();
			local62 = this.method16779();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt99;
			@Pc(98) float local98 = local86 * (float) this.anInt99;
			@Pc(104) float local104 = local68 * (float) this.anInt103;
			@Pc(110) float local110 = local74 * (float) this.anInt103;
			@Pc(117) float local117 = -local68 * (float) this.anInt102;
			@Pc(124) float local124 = -local74 * (float) this.anInt102;
			@Pc(131) float local131 = -local80 * (float) this.anInt101;
			@Pc(138) float local138 = -local86 * (float) this.anInt101;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class31 local178 = this.aClass21_Sub3_1.aClass31_3;
		local178.anInterface20_18 = this.anInterface20_2;
		local178.method8274(arg6, arg7);
		local62 = this.aClass21_Sub3_1.method17037().method21390();
		local68 = this.aClass21_Sub3_1.method17037().method21391();
		local178.aClass328_51.method26042();
		local178.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[12] = (arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local62 - 1.0F;
		local178.aClass328_51.aFloatArray106[13] = (arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local68 - 1.0F;
		local178.aClass328_51.aFloatArray106[14] = -1.0F;
		local178.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local178.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local178.anInt884 = 0;
		local178.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local178.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "ac", descriptor = "(FFFFFFIIII)V", line = 425)
	@Override
	void method16850(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (this.aClass21_Sub3_1.method17453() != Class248.aClass248_2) {
			this.aClass21_Sub3_1.aClass266_3.method25239(arg0, arg1, arg2, arg3, arg4, arg5, arg2 + arg4 - arg0, arg3 + arg5 - arg1, 0.0F, 0.0F, this.anInterface20_2.method8938(), 0.0F, 0.0F, this.anInterface20_2.method8939(), this.anInterface20_2.method8938(), this.anInterface20_2.method8939(), this.anInterface20_2, arg7);
			return;
		}
		this.aClass21_Sub3_1.method17549();
		this.aClass21_Sub3_1.method17469(arg8);
		@Pc(62) float local62;
		@Pc(68) float local68;
		if (this.aBoolean24) {
			@Pc(58) float local58 = (float) this.method16772();
			local62 = this.method16779();
			local68 = (arg2 - arg0) / local58;
			@Pc(74) float local74 = (arg3 - arg1) / local58;
			@Pc(80) float local80 = (arg4 - arg0) / local62;
			@Pc(86) float local86 = (arg5 - arg1) / local62;
			@Pc(92) float local92 = local80 * (float) this.anInt99;
			@Pc(98) float local98 = local86 * (float) this.anInt99;
			@Pc(104) float local104 = local68 * (float) this.anInt103;
			@Pc(110) float local110 = local74 * (float) this.anInt103;
			@Pc(117) float local117 = -local68 * (float) this.anInt102;
			@Pc(124) float local124 = -local74 * (float) this.anInt102;
			@Pc(131) float local131 = -local80 * (float) this.anInt101;
			@Pc(138) float local138 = -local86 * (float) this.anInt101;
			arg0 = arg0 + local104 + local92;
			arg1 = arg1 + local110 + local98;
			arg2 = arg2 + local117 + local92;
			arg3 = arg3 + local124 + local98;
			arg4 = arg4 + local104 + local131;
			arg5 = arg5 + local110 + local138;
		}
		@Pc(178) Class31 local178 = this.aClass21_Sub3_1.aClass31_3;
		local178.anInterface20_18 = this.anInterface20_2;
		local178.method8274(arg6, arg7);
		local62 = this.aClass21_Sub3_1.method17037().method21390();
		local68 = this.aClass21_Sub3_1.method17037().method21391();
		local178.aClass328_51.method26042();
		local178.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * 2.0F / local62;
		local178.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * 2.0F / local68;
		local178.aClass328_51.aFloatArray106[12] = (arg0 + this.aClass21_Sub3_1.method17577()) * 2.0F / local62 - 1.0F;
		local178.aClass328_51.aFloatArray106[13] = (arg1 + this.aClass21_Sub3_1.method17577()) * 2.0F / local68 - 1.0F;
		local178.aClass328_51.aFloatArray106[14] = -1.0F;
		local178.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local178.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local178.anInt884 = 0;
		local178.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		local178.method8270();
	}

	@OriginalMember(owner = "client!aan", name = "af", descriptor = "(FFFFFFILclient!ch;II)V", line = 475)
	@Override
	void method16801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass21_Sub3_1.method17549();
		@Pc(6) Class31 local6 = this.aClass21_Sub3_1.aClass31_3;
		local6.anInterface20_18 = this.anInterface20_2;
		local6.method8274(1, -1);
		@Pc(21) float local21 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(28) float local28 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local6.aClass328_51.method26042();
		if (this.aBoolean24) {
			@Pc(42) float local42 = (float) this.anInt100 / (float) this.method16772();
			@Pc(50) float local50 = (float) this.anInt104 / (float) this.method16779();
			local6.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * local42;
			local6.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * local42;
			local6.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * local50;
			local6.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * local50;
			local6.aClass328_51.aFloatArray106[12] = (arg0 + (float) this.anInt103) * local42 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = (arg1 + (float) this.anInt99) * local50 + this.aClass21_Sub3_1.method17577();
		} else {
			local6.aClass328_51.aFloatArray106[0] = arg2 - arg0;
			local6.aClass328_51.aFloatArray106[1] = arg3 - arg1;
			local6.aClass328_51.aFloatArray106[4] = arg4 - arg0;
			local6.aClass328_51.aFloatArray106[5] = arg5 - arg1;
			local6.aClass328_51.aFloatArray106[12] = arg0 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = arg1 + this.aClass21_Sub3_1.method17577();
		}
		@Pc(179) Class328 local179 = this.aClass21_Sub3_1.aClass328_86;
		local179.method26042();
		local179.aFloatArray106[0] = 2.0F / local21;
		local179.aFloatArray106[5] = 2.0F / local28;
		local179.aFloatArray106[12] = -1.0F;
		local179.aFloatArray106[13] = -1.0F;
		local179.aFloatArray106[14] = -1.0F;
		local6.aClass328_51.method26046(local179);
		local6.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local6.anInt884 = 0;
		local6.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(248) Interface20 local248 = ((Class5_Sub1) arg7).anInterface20_1;
		local6.anInterface20_19 = local248;
		local6.aClass328_52.method26042();
		local6.aClass328_52.aFloatArray106[0] = (arg2 - arg0) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[1] = (arg3 - arg1) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[4] = (arg4 - arg0) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[5] = (arg5 - arg1) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[12] = (arg0 - (float) arg8) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[13] = (arg1 - (float) arg9) * local248.method8933(1.0F);
		local6.method8272();
	}

	@OriginalMember(owner = "client!aan", name = "bm", descriptor = "(FFFFFFILclient!ch;II)V", line = 475)
	@Override
	void method16829(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass21_Sub3_1.method17549();
		@Pc(6) Class31 local6 = this.aClass21_Sub3_1.aClass31_3;
		local6.anInterface20_18 = this.anInterface20_2;
		local6.method8274(1, -1);
		@Pc(21) float local21 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(28) float local28 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local6.aClass328_51.method26042();
		if (this.aBoolean24) {
			@Pc(42) float local42 = (float) this.anInt100 / (float) this.method16772();
			@Pc(50) float local50 = (float) this.anInt104 / (float) this.method16779();
			local6.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * local42;
			local6.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * local42;
			local6.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * local50;
			local6.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * local50;
			local6.aClass328_51.aFloatArray106[12] = (arg0 + (float) this.anInt103) * local42 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = (arg1 + (float) this.anInt99) * local50 + this.aClass21_Sub3_1.method17577();
		} else {
			local6.aClass328_51.aFloatArray106[0] = arg2 - arg0;
			local6.aClass328_51.aFloatArray106[1] = arg3 - arg1;
			local6.aClass328_51.aFloatArray106[4] = arg4 - arg0;
			local6.aClass328_51.aFloatArray106[5] = arg5 - arg1;
			local6.aClass328_51.aFloatArray106[12] = arg0 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = arg1 + this.aClass21_Sub3_1.method17577();
		}
		@Pc(179) Class328 local179 = this.aClass21_Sub3_1.aClass328_86;
		local179.method26042();
		local179.aFloatArray106[0] = 2.0F / local21;
		local179.aFloatArray106[5] = 2.0F / local28;
		local179.aFloatArray106[12] = -1.0F;
		local179.aFloatArray106[13] = -1.0F;
		local179.aFloatArray106[14] = -1.0F;
		local6.aClass328_51.method26046(local179);
		local6.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local6.anInt884 = 0;
		local6.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(248) Interface20 local248 = ((Class5_Sub1) arg7).anInterface20_1;
		local6.anInterface20_19 = local248;
		local6.aClass328_52.method26042();
		local6.aClass328_52.aFloatArray106[0] = (arg2 - arg0) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[1] = (arg3 - arg1) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[4] = (arg4 - arg0) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[5] = (arg5 - arg1) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[12] = (arg0 - (float) arg8) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[13] = (arg1 - (float) arg9) * local248.method8933(1.0F);
		local6.method8272();
	}

	@OriginalMember(owner = "client!aan", name = "bs", descriptor = "(FFFFFFILclient!ch;II)V", line = 475)
	@Override
	void method16828(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass21_Sub3_1.method17549();
		@Pc(6) Class31 local6 = this.aClass21_Sub3_1.aClass31_3;
		local6.anInterface20_18 = this.anInterface20_2;
		local6.method8274(1, -1);
		@Pc(21) float local21 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(28) float local28 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local6.aClass328_51.method26042();
		if (this.aBoolean24) {
			@Pc(42) float local42 = (float) this.anInt100 / (float) this.method16772();
			@Pc(50) float local50 = (float) this.anInt104 / (float) this.method16779();
			local6.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * local42;
			local6.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * local42;
			local6.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * local50;
			local6.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * local50;
			local6.aClass328_51.aFloatArray106[12] = (arg0 + (float) this.anInt103) * local42 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = (arg1 + (float) this.anInt99) * local50 + this.aClass21_Sub3_1.method17577();
		} else {
			local6.aClass328_51.aFloatArray106[0] = arg2 - arg0;
			local6.aClass328_51.aFloatArray106[1] = arg3 - arg1;
			local6.aClass328_51.aFloatArray106[4] = arg4 - arg0;
			local6.aClass328_51.aFloatArray106[5] = arg5 - arg1;
			local6.aClass328_51.aFloatArray106[12] = arg0 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = arg1 + this.aClass21_Sub3_1.method17577();
		}
		@Pc(179) Class328 local179 = this.aClass21_Sub3_1.aClass328_86;
		local179.method26042();
		local179.aFloatArray106[0] = 2.0F / local21;
		local179.aFloatArray106[5] = 2.0F / local28;
		local179.aFloatArray106[12] = -1.0F;
		local179.aFloatArray106[13] = -1.0F;
		local179.aFloatArray106[14] = -1.0F;
		local6.aClass328_51.method26046(local179);
		local6.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local6.anInt884 = 0;
		local6.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(248) Interface20 local248 = ((Class5_Sub1) arg7).anInterface20_1;
		local6.anInterface20_19 = local248;
		local6.aClass328_52.method26042();
		local6.aClass328_52.aFloatArray106[0] = (arg2 - arg0) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[1] = (arg3 - arg1) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[4] = (arg4 - arg0) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[5] = (arg5 - arg1) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[12] = (arg0 - (float) arg8) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[13] = (arg1 - (float) arg9) * local248.method8933(1.0F);
		local6.method8272();
	}

	@OriginalMember(owner = "client!aan", name = "bf", descriptor = "(FFFFFFILclient!ch;II)V", line = 475)
	@Override
	void method16830(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.aClass21_Sub3_1.method17549();
		@Pc(6) Class31 local6 = this.aClass21_Sub3_1.aClass31_3;
		local6.anInterface20_18 = this.anInterface20_2;
		local6.method8274(1, -1);
		@Pc(21) float local21 = (float) this.aClass21_Sub3_1.method17037().method21390();
		@Pc(28) float local28 = (float) this.aClass21_Sub3_1.method17037().method21391();
		local6.aClass328_51.method26042();
		if (this.aBoolean24) {
			@Pc(42) float local42 = (float) this.anInt100 / (float) this.method16772();
			@Pc(50) float local50 = (float) this.anInt104 / (float) this.method16779();
			local6.aClass328_51.aFloatArray106[0] = (arg2 - arg0) * local42;
			local6.aClass328_51.aFloatArray106[1] = (arg3 - arg1) * local42;
			local6.aClass328_51.aFloatArray106[4] = (arg4 - arg0) * local50;
			local6.aClass328_51.aFloatArray106[5] = (arg5 - arg1) * local50;
			local6.aClass328_51.aFloatArray106[12] = (arg0 + (float) this.anInt103) * local42 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = (arg1 + (float) this.anInt99) * local50 + this.aClass21_Sub3_1.method17577();
		} else {
			local6.aClass328_51.aFloatArray106[0] = arg2 - arg0;
			local6.aClass328_51.aFloatArray106[1] = arg3 - arg1;
			local6.aClass328_51.aFloatArray106[4] = arg4 - arg0;
			local6.aClass328_51.aFloatArray106[5] = arg5 - arg1;
			local6.aClass328_51.aFloatArray106[12] = arg0 + this.aClass21_Sub3_1.method17577();
			local6.aClass328_51.aFloatArray106[13] = arg1 + this.aClass21_Sub3_1.method17577();
		}
		@Pc(179) Class328 local179 = this.aClass21_Sub3_1.aClass328_86;
		local179.method26042();
		local179.aFloatArray106[0] = 2.0F / local21;
		local179.aFloatArray106[5] = 2.0F / local28;
		local179.aFloatArray106[12] = -1.0F;
		local179.aFloatArray106[13] = -1.0F;
		local179.aFloatArray106[14] = -1.0F;
		local6.aClass328_51.method26046(local179);
		local6.aClass328_53.method26050(this.anInterface20_2.method8932((float) this.anInt100), this.anInterface20_2.method8933((float) this.anInt104), 1.0F, 1.0F);
		local6.anInterface21_9 = this.aClass21_Sub3_1.anInterface21_17;
		local6.anInt884 = 0;
		local6.aClass37_10 = this.aClass21_Sub3_1.aClass37_18;
		@Pc(248) Interface20 local248 = ((Class5_Sub1) arg7).anInterface20_1;
		local6.anInterface20_19 = local248;
		local6.aClass328_52.method26042();
		local6.aClass328_52.aFloatArray106[0] = (arg2 - arg0) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[1] = (arg3 - arg1) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[4] = (arg4 - arg0) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[5] = (arg5 - arg1) * local248.method8933(1.0F);
		local6.aClass328_52.aFloatArray106[12] = (arg0 - (float) arg8) * local248.method8932(1.0F);
		local6.aClass328_52.aFloatArray106[13] = (arg1 - (float) arg9) * local248.method8933(1.0F);
		local6.method8272();
	}
}
