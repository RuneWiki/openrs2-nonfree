package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public class Class414 {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
	static final int anInt4825 = 70;

	@OriginalMember(owner = "client!qp", name = "mi", descriptor = "[S")
	public static short[] aShortArray109;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "Lclient!qq;")
	Class415 aClass415_1;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
	public int anInt4826 = -454584595;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
	public int anInt4830 = 1130194433;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
	public int anInt4828 = -1453857369;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "I")
	public int anInt4833 = -1015570665;

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
	public int anInt4827 = -1658720634;

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
	int anInt4824 = 1060397599;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
	int anInt4831 = -328139393;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
	int anInt4832 = 1882504255;

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
	int anInt4829 = 2116043545;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "(I)[Lclient!gr;", line = 12)
	static Class207[] method27752() {
		return new Class207[] { Class207.aClass207_1, Class207.aClass207_3, Class207.aClass207_2 };
	}

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "(B)[Lclient!ga;", line = 14)
	static Class191[] method27751() {
		return new Class191[] { Class191.aClass191_4, Class191.aClass191_2, Class191.aClass191_1, Class191.aClass191_5, Class191.aClass191_3 };
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V", line = 20)
	Class414() {
	}

	@OriginalMember(owner = "client!qp", name = "u", descriptor = "(Lclient!ahb;)V", line = 24)
	void method27735(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method27728(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "(Lclient!ahb;I)V", line = 24)
	void method27738(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method27728(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ahb;II)V", line = 31)
	void method27728(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method20271();
		} else if (arg1 == 2) {
			this.anInt4826 = arg0.method20269() * -1349223405;
		} else if (arg1 == 3) {
			this.anInt4830 = arg0.method20269() * -130311937;
		} else if (arg1 == 4) {
			this.anInt4828 = 0;
		} else if (arg1 == 5) {
			this.anInt4827 = arg0.method20271() * -391836063;
		} else if (arg1 == 6) {
			arg0.method20269();
		} else if (arg1 == 7) {
			this.anInt4824 = arg0.method20375() * -1060397599;
		} else if (arg1 == 8) {
			this.anInt4831 = arg0.method20375() * 328139393;
		} else if (arg1 == 9) {
			this.anInt4832 = arg0.method20375() * -1882504255;
		} else if (arg1 == 10) {
			this.anInt4829 = arg0.method20375() * -2116043545;
		} else if (arg1 == 11) {
			this.anInt4828 = arg0.method20271() * 1453857369;
		}
	}

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "(Lclient!de;I)Lclient!co;", line = 50)
	public Class6 method27731(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4824 * 368666145 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "(Lclient!de;)Lclient!co;", line = 50)
	public Class6 method27733(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4824 * 368666145 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(Lclient!de;)Lclient!co;", line = 50)
	public Class6 method27737(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4824 * 368666145 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(Lclient!de;)Lclient!co;", line = 50)
	public Class6 method27742(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4824 * 368666145 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "(Lclient!de;I)Lclient!co;", line = 60)
	public Class6 method27732(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4831 * 2010594689 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "z", descriptor = "(Lclient!de;)Lclient!co;", line = 60)
	public Class6 method27739(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4831 * 2010594689 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "(Lclient!de;)Lclient!co;", line = 60)
	public Class6 method27740(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4831 * 2010594689 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "(Lclient!de;)Lclient!co;", line = 60)
	public Class6 method27741(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4831 * 2010594689 < 0) {
			return null;
		}
		@Pc(17) Class6 local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		if (local17 == null) {
			this.method27734(arg0);
			local17 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689));
		}
		return local17;
	}

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "(Lclient!de;I)Lclient!co;", line = 70)
	public Class6 method27730(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4832 * -1528378303 < 0) {
			return this.method27731(arg0);
		}
		@Pc(20) Class6 local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4832 * -1528378303));
		if (local20 == null) {
			this.method27734(arg0);
			local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4832 * -1528378303));
		}
		return local20;
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(Lclient!de;)Lclient!co;", line = 80)
	public Class6 method27729(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4829 * -365979945 < 0) {
			return this.method27732(arg0);
		}
		@Pc(20) Class6 local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		if (local20 == null) {
			this.method27734(arg0);
			local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		}
		return local20;
	}

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "(Lclient!de;I)Lclient!co;", line = 80)
	public Class6 method27736(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4829 * -365979945 < 0) {
			return this.method27732(arg0);
		}
		@Pc(20) Class6 local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		if (local20 == null) {
			this.method27734(arg0);
			local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		}
		return local20;
	}

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "(Lclient!de;)Lclient!co;", line = 80)
	public Class6 method27743(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4829 * -365979945 < 0) {
			return this.method27732(arg0);
		}
		@Pc(20) Class6 local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		if (local20 == null) {
			this.method27734(arg0);
			local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		}
		return local20;
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(Lclient!de;)Lclient!co;", line = 80)
	public Class6 method27744(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4829 * -365979945 < 0) {
			return this.method27732(arg0);
		}
		@Pc(20) Class6 local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		if (local20 == null) {
			this.method27734(arg0);
			local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		}
		return local20;
	}

	@OriginalMember(owner = "client!qp", name = "q", descriptor = "(Lclient!de;)Lclient!co;", line = 80)
	public Class6 method27745(@OriginalArg(0) Class21 arg0) {
		if (this.anInt4829 * -365979945 < 0) {
			return this.method27732(arg0);
		}
		@Pc(20) Class6 local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		if (local20 == null) {
			this.method27734(arg0);
			local20 = (Class6) this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945));
		}
		return local20;
	}

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "(Lclient!de;I)V", line = 90)
	void method27734(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class359 local3 = this.aClass415_1.aClass359_68;
		@Pc(33) Class15 local33;
		if (this.anInt4824 * 368666145 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145)) == null && local3.method26674(this.anInt4824 * 368666145)) {
			local33 = Class137.method22937(local3, this.anInt4824 * 368666145);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4824 * 368666145));
		}
		if (this.anInt4831 * 2010594689 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689)) == null && local3.method26674(this.anInt4831 * 2010594689)) {
			local33 = Class137.method22937(local3, this.anInt4831 * 2010594689);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4831 * 2010594689));
		}
		if (this.anInt4832 * -1528378303 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4832 * -1528378303)) == null && local3.method26674(this.anInt4832 * -1528378303)) {
			local33 = Class137.method22937(local3, this.anInt4832 * -1528378303);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4832 * -1528378303));
		}
		if (this.anInt4829 * -365979945 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945)) == null && local3.method26674(this.anInt4829 * -365979945)) {
			local33 = Class137.method22937(local3, this.anInt4829 * -365979945);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4829 * -365979945));
		}
	}

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "(Lclient!de;)V", line = 90)
	void method27746(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class359 local3 = this.aClass415_1.aClass359_68;
		@Pc(33) Class15 local33;
		if (this.anInt4824 * 368666145 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145)) == null && local3.method26674(this.anInt4824 * 368666145)) {
			local33 = Class137.method22937(local3, this.anInt4824 * 368666145);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4824 * 368666145));
		}
		if (this.anInt4831 * 2010594689 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689)) == null && local3.method26674(this.anInt4831 * 2010594689)) {
			local33 = Class137.method22937(local3, this.anInt4831 * 2010594689);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4831 * 2010594689));
		}
		if (this.anInt4832 * -1528378303 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4832 * -1528378303)) == null && local3.method26674(this.anInt4832 * -1528378303)) {
			local33 = Class137.method22937(local3, this.anInt4832 * -1528378303);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4832 * -1528378303));
		}
		if (this.anInt4829 * -365979945 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945)) == null && local3.method26674(this.anInt4829 * -365979945)) {
			local33 = Class137.method22937(local3, this.anInt4829 * -365979945);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4829 * -365979945));
		}
	}

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "(Lclient!de;)V", line = 90)
	void method27747(@OriginalArg(0) Class21 arg0) {
		@Pc(3) Class359 local3 = this.aClass415_1.aClass359_68;
		@Pc(33) Class15 local33;
		if (this.anInt4824 * 368666145 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4824 * 368666145)) == null && local3.method26674(this.anInt4824 * 368666145)) {
			local33 = Class137.method22937(local3, this.anInt4824 * 368666145);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4824 * 368666145));
		}
		if (this.anInt4831 * 2010594689 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4831 * 2010594689)) == null && local3.method26674(this.anInt4831 * 2010594689)) {
			local33 = Class137.method22937(local3, this.anInt4831 * 2010594689);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4831 * 2010594689));
		}
		if (this.anInt4832 * -1528378303 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4832 * -1528378303)) == null && local3.method26674(this.anInt4832 * -1528378303)) {
			local33 = Class137.method22937(local3, this.anInt4832 * -1528378303);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4832 * -1528378303));
		}
		if (this.anInt4829 * -365979945 >= 0 && this.aClass415_1.aClass161_37.method23219((long) (this.anInt4829 * -365979945)) == null && local3.method26674(this.anInt4829 * -365979945)) {
			local33 = Class137.method22937(local3, this.anInt4829 * -365979945);
			this.aClass415_1.aClass161_37.method23222(arg0.method17089(local33, true), (long) (this.anInt4829 * -365979945));
		}
	}

	@OriginalMember(owner = "client!qp", name = "ap", descriptor = "(III)V", line = 194)
	static void method27750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class290 local4 = Class308.aClass70_Sub2_3.method33886(arg0);
		@Pc(13) Class3_Sub1_Sub11 local13 = Class60_Sub34.method14470(1, (long) (local4.aClass11_1.anInt130 * -112096509));
		try {
			if (Class3_Sub1_Sub11.aBoolean471) {
				local13.anInt2693 = Class302.aClass10_Sub1_1.method32385(local4.aClass11_1) * 1666161167;
			}
			local13.anInt2693 = local4.method25524(local13.anInt2693 * -2097539857, arg1) * 1666161167;
			local13.method19155();
		} catch (@Pc(41) Exception_Sub5 local41) {
			Class27_Sub1.method7214("" + arg0, local41);
		}
	}

	@OriginalMember(owner = "client!qp", name = "wa", descriptor = "(Lclient!vs;I)V", line = 8061)
	static final void method27748(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class3_Sub1_Sub7 local2 = Class3_Sub45.method13020();
		if (Class215.method24288(local2) == 7) {
			@Pc(12) int local12 = (int) local2.method19006();
			if (local12 >= 0 && local12 <= Class52.anInt1127 * 701602229) {
				@Pc(23) Class26_Sub1_Sub1_Sub1_Sub2 local23 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local12];
				if (local23 != null) {
					arg0.aClass26_Sub1_Sub1_Sub1_4 = local23;
					arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
					return;
				}
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}

	@OriginalMember(owner = "client!qp", name = "ati", descriptor = "(Lclient!vs;B)V", line = 12472)
	static final void method27749(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub5_1.method14599(local12);
	}
}
