package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public class Class287 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!ny;")
	static Class359 aClass359_53;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	static final int anInt4364 = 0;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Lclient!aml;")
	static Class3_Sub1_Sub7 aClass3_Sub1_Sub7_3;

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "Lclient!ew;")
	static Class161 aClass161_33 = new Class161(64);

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
	public int anInt4360 = -1357788533;

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
	public int anInt4362 = 2108091712;

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
	public int anInt4361 = 1847947456;

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
	public int anInt4359 = 1358411718;

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
	public int anInt4363 = 1818968597;

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "Z")
	public boolean aBoolean710 = false;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "Z")
	public boolean aBoolean709 = false;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "()V", line = 20)
	Class287() {
	}

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "(Lclient!ny;)V", line = 23)
	public static void method25487(@OriginalArg(0) Class359 arg0) {
		aClass359_53 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "s", descriptor = "(Lclient!ny;)V", line = 23)
	public static void method25488(@OriginalArg(0) Class359 arg0) {
		aClass359_53 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "u", descriptor = "(Lclient!ny;)V", line = 23)
	public static void method25490(@OriginalArg(0) Class359 arg0) {
		aClass359_53 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "(Lclient!ny;)V", line = 23)
	public static void method25491(@OriginalArg(0) Class359 arg0) {
		aClass359_53 = arg0;
	}

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "(I)[Lclient!kj;", line = 25)
	static Class279[] method25496() {
		return new Class279[] { Class279.aClass279_6, Class279.aClass279_5, Class279.aClass279_10, Class279.aClass279_9, Class279.aClass279_3, Class279.aClass279_8, Class279.aClass279_11, Class279.aClass279_13, Class279.aClass279_12, Class279.aClass279_2, Class279.aClass279_7, Class279.aClass279_1, Class279.aClass279_4 };
	}

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "(I)Lclient!ks;", line = 27)
	public static Class287 method25493(@OriginalArg(0) int arg0) {
		@Pc(5) Class287 local5 = (Class287) aClass161_33.method23219((long) arg0);
		if (local5 != null) {
			return local5;
		}
		@Pc(15) byte[] local15 = aClass359_53.method26713(0, arg0);
		local5 = new Class287();
		if (local15 != null) {
			local5.method25486(new Class3_Sub41(local15), arg0);
		}
		aClass161_33.method23222(local5, (long) arg0);
		return local5;
	}

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "(Lclient!ahb;II)V", line = 38)
	void method25486(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method25485(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(Lclient!ahb;I)V", line = 38)
	void method25492(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method25485(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "(Lclient!ahb;IIS)V", line = 45)
	void method25485(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt4360 = arg0.method20271() * 1357788533;
			if (this.anInt4360 * 2145333981 == 65535) {
				this.anInt4360 = -1357788533;
			}
		} else if (arg1 == 2) {
			this.anInt4362 = (arg0.method20271() + 1) * -638149707;
			this.anInt4361 = (arg0.method20271() + 1) * -1111976509;
		} else if (arg1 == 3) {
			arg0.method20390();
		} else if (arg1 == 4) {
			this.anInt4359 = arg0.method20269() * -1468277789;
		} else if (arg1 == 5) {
			this.anInt4363 = arg0.method20269() * 1818968597;
		} else if (arg1 == 6) {
			this.aBoolean710 = true;
		} else if (arg1 == 7) {
			this.aBoolean709 = true;
		}
	}

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "(Lclient!ahb;II)V", line = 45)
	void method25489(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4360 = arg0.method20271() * 1357788533;
			if (this.anInt4360 * 2145333981 == 65535) {
				this.anInt4360 = -1357788533;
			}
		} else if (arg1 == 2) {
			this.anInt4362 = (arg0.method20271() + 1) * -638149707;
			this.anInt4361 = (arg0.method20271() + 1) * -1111976509;
		} else if (arg1 == 3) {
			arg0.method20390();
		} else if (arg1 == 4) {
			this.anInt4359 = arg0.method20269() * -1468277789;
		} else if (arg1 == 5) {
			this.anInt4363 = arg0.method20269() * 1818968597;
		} else if (arg1 == 6) {
			this.aBoolean710 = true;
		} else if (arg1 == 7) {
			this.aBoolean709 = true;
		}
	}

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "(Lclient!ahb;II)V", line = 45)
	void method25494(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4360 = arg0.method20271() * 1357788533;
			if (this.anInt4360 * 2145333981 == 65535) {
				this.anInt4360 = -1357788533;
			}
		} else if (arg1 == 2) {
			this.anInt4362 = (arg0.method20271() + 1) * -638149707;
			this.anInt4361 = (arg0.method20271() + 1) * -1111976509;
		} else if (arg1 == 3) {
			arg0.method20390();
		} else if (arg1 == 4) {
			this.anInt4359 = arg0.method20269() * -1468277789;
		} else if (arg1 == 5) {
			this.anInt4363 = arg0.method20269() * 1818968597;
		} else if (arg1 == 6) {
			this.aBoolean710 = true;
		} else if (arg1 == 7) {
			this.aBoolean709 = true;
		}
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(Lclient!ahb;II)V", line = 45)
	void method25495(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4360 = arg0.method20271() * 1357788533;
			if (this.anInt4360 * 2145333981 == 65535) {
				this.anInt4360 = -1357788533;
			}
		} else if (arg1 == 2) {
			this.anInt4362 = (arg0.method20271() + 1) * -638149707;
			this.anInt4361 = (arg0.method20271() + 1) * -1111976509;
		} else if (arg1 == 3) {
			arg0.method20390();
		} else if (arg1 == 4) {
			this.anInt4359 = arg0.method20269() * -1468277789;
		} else if (arg1 == 5) {
			this.anInt4363 = arg0.method20269() * 1818968597;
		} else if (arg1 == 6) {
			this.aBoolean710 = true;
		} else if (arg1 == 7) {
			this.aBoolean709 = true;
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V", line = 71)
	static void method25503() {
		if (!Class239.method24623()) {
			return;
		}
		if (Class67.aStringArray7 == null) {
			Class127.method22879();
		}
		Class67.aBoolean337 = true;
		Class67.anInt1838 = 0;
	}

	@OriginalMember(owner = "client!ks", name = "y", descriptor = "(B)Lclient!ahu;", line = 113)
	public static Class63_Sub1 method25502() {
		return Class200.method24148(FileFilter_Sub1.aClass585_1.anInt5458 * 146668341);
	}

	@OriginalMember(owner = "client!ks", name = "lj", descriptor = "(Lclient!vs;I)V", line = 6183)
	static final void method25497(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class481.method29082(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ks", name = "rl", descriptor = "(Lclient!vs;I)V", line = 7302)
	static final void method25498(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3505 * 247707339;
	}

	@OriginalMember(owner = "client!ks", name = "ud", descriptor = "(Lclient!vs;I)V", line = 7831)
	static final void method25499(@OriginalArg(0) Class536 arg0) {
		@Pc(13) Class3_Sub32 local13 = (Class3_Sub32) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13.anInt1343 * 2061226997;
	}

	@OriginalMember(owner = "client!ks", name = "wt", descriptor = "(Lclient!vs;I)V", line = 8085)
	static final void method25500(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (Class24.aString39 != null && Class24.aString39.equalsIgnoreCase(local13)) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ks", name = "aok", descriptor = "(Lclient!vs;I)V", line = 11591)
	static final void method25501(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub29_1.method13917() == 1 ? 1 : 0;
	}
}
