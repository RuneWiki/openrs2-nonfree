package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public class Class395 {

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	static final int anInt4602 = 0;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
	public static final int anInt4603 = 1;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
	public static final int anInt4604 = 2;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "I")
	public static final int anInt4605 = 0;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	static final int anInt4606 = 1;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
	public static final int anInt4607 = 0;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
	static final int anInt4608 = 1;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	public static final int anInt4611 = 1;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static final int anInt4612 = 2;

	@OriginalMember(owner = "client!mc", name = "fe", descriptor = "Lclient!pw;")
	public static Class478 aClass478_111;

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "J")
	public long aLong266;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	public int anInt4601;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public int anInt4609;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
	public int anInt4610;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
	public int anInt4613;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	public int anInt4614;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	public int anInt4616;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public int anInt4619;

	@OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
	public int anInt4620;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
	public int anInt4621;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public int anInt4617 = 0;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	public int anInt4618 = 0;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "Z")
	boolean aBoolean733 = false;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "(I)[Lclient!vj;", line = 14)
	public static Class597[] method28404() {
		return new Class597[] { Class597.aClass597_3, Class597.aClass597_5, Class597.aClass597_4 };
	}

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "()V", line = 32)
	Class395() {
	}

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "(Lclient!akv;I)V", line = 36)
	void method28405(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28409(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "(Lclient!akv;)V", line = 36)
	void method28406(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28409(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "(Lclient!akv;)V", line = 36)
	void method28407(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28409(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "(Lclient!akv;)V", line = 36)
	void method28408(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28409(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lclient!akv;IB)V", line = 43)
	void method28409(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4614 = arg0.method22483() * -653046319;
		} else if (arg1 == 2) {
			arg0.method22478();
		} else if (arg1 == 3) {
			this.anInt4601 = arg0.method22500() * -694031627;
			this.anInt4613 = arg0.method22500() * 322125821;
			this.anInt4609 = arg0.method22500() * -150535579;
		} else if (arg1 == 4) {
			this.anInt4615 = arg0.method22478() * -1160704569;
			this.anInt4616 = arg0.method22500() * -857000041;
		} else if (arg1 == 6) {
			this.anInt4610 = arg0.method22478() * -1433207405;
		} else if (arg1 == 8) {
			this.anInt4617 = -1840829347;
		} else if (arg1 == 9) {
			this.anInt4618 = 31584171;
		} else if (arg1 == 10) {
			this.aBoolean733 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "(Lclient!akv;I)V", line = 43)
	void method28410(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4614 = arg0.method22483() * -653046319;
		} else if (arg1 == 2) {
			arg0.method22478();
		} else if (arg1 == 3) {
			this.anInt4601 = arg0.method22500() * -694031627;
			this.anInt4613 = arg0.method22500() * 322125821;
			this.anInt4609 = arg0.method22500() * -150535579;
		} else if (arg1 == 4) {
			this.anInt4615 = arg0.method22478() * -1160704569;
			this.anInt4616 = arg0.method22500() * -857000041;
		} else if (arg1 == 6) {
			this.anInt4610 = arg0.method22478() * -1433207405;
		} else if (arg1 == 8) {
			this.anInt4617 = -1840829347;
		} else if (arg1 == 9) {
			this.anInt4618 = 31584171;
		} else if (arg1 == 10) {
			this.aBoolean733 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "(Lclient!akv;I)V", line = 43)
	void method28411(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4614 = arg0.method22483() * -653046319;
		} else if (arg1 == 2) {
			arg0.method22478();
		} else if (arg1 == 3) {
			this.anInt4601 = arg0.method22500() * -694031627;
			this.anInt4613 = arg0.method22500() * 322125821;
			this.anInt4609 = arg0.method22500() * -150535579;
		} else if (arg1 == 4) {
			this.anInt4615 = arg0.method22478() * -1160704569;
			this.anInt4616 = arg0.method22500() * -857000041;
		} else if (arg1 == 6) {
			this.anInt4610 = arg0.method22478() * -1433207405;
		} else if (arg1 == 8) {
			this.anInt4617 = -1840829347;
		} else if (arg1 == 9) {
			this.anInt4618 = 31584171;
		} else if (arg1 == 10) {
			this.aBoolean733 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "()V", line = 66)
	void method28412() {
		this.anInt4620 = Class436.anIntArray463[this.anInt4614 * 1148988209 << 3] * 1563207367;
		@Pc(17) long local17 = (long) (this.anInt4601 * -1058410147);
		@Pc(23) long local23 = (long) (this.anInt4613 * 829166933);
		@Pc(29) long local29 = (long) (this.anInt4609 * 894885741);
		this.anInt4619 = (int) Math.sqrt((double) (local29 * local29 + local23 * local23 + local17 * local17)) * 1327430267;
		if (this.anInt4616 * -533022681 == 0) {
			this.anInt4616 = -857000041;
		}
		if (this.anInt4615 * 256549879 == 0) {
			this.aLong266 = 1600628302371635205L;
		} else if (this.anInt4615 * 256549879 == 1) {
			this.aLong266 = (long) (this.anInt4619 * -1352751720 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
			this.aLong266 *= this.aLong266 * -2285738288332836045L;
		} else if (this.anInt4615 * 256549879 == 2) {
			this.aLong266 = (long) (-1352751720 * this.anInt4619 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
		}
		if (this.aBoolean733) {
			this.anInt4619 *= -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "()V", line = 66)
	void method28413() {
		this.anInt4620 = Class436.anIntArray463[this.anInt4614 * 1148988209 << 3] * 1563207367;
		@Pc(17) long local17 = (long) (this.anInt4601 * -1058410147);
		@Pc(23) long local23 = (long) (this.anInt4613 * 829166933);
		@Pc(29) long local29 = (long) (this.anInt4609 * 894885741);
		this.anInt4619 = (int) Math.sqrt((double) (local29 * local29 + local23 * local23 + local17 * local17)) * 1327430267;
		if (this.anInt4616 * -533022681 == 0) {
			this.anInt4616 = -857000041;
		}
		if (this.anInt4615 * 256549879 == 0) {
			this.aLong266 = 1600628302371635205L;
		} else if (this.anInt4615 * 256549879 == 1) {
			this.aLong266 = (long) (this.anInt4619 * -1352751720 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
			this.aLong266 *= this.aLong266 * -2285738288332836045L;
		} else if (this.anInt4615 * 256549879 == 2) {
			this.aLong266 = (long) (-1352751720 * this.anInt4619 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
		}
		if (this.aBoolean733) {
			this.anInt4619 *= -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "(B)V", line = 66)
	void method28414() {
		this.anInt4620 = Class436.anIntArray463[this.anInt4614 * 1148988209 << 3] * 1563207367;
		@Pc(17) long local17 = (long) (this.anInt4601 * -1058410147);
		@Pc(23) long local23 = (long) (this.anInt4613 * 829166933);
		@Pc(29) long local29 = (long) (this.anInt4609 * 894885741);
		this.anInt4619 = (int) Math.sqrt((double) (local29 * local29 + local23 * local23 + local17 * local17)) * 1327430267;
		if (this.anInt4616 * -533022681 == 0) {
			this.anInt4616 = -857000041;
		}
		if (this.anInt4615 * 256549879 == 0) {
			this.aLong266 = 1600628302371635205L;
		} else if (this.anInt4615 * 256549879 == 1) {
			this.aLong266 = (long) (this.anInt4619 * -1352751720 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
			this.aLong266 *= this.aLong266 * -2285738288332836045L;
		} else if (this.anInt4615 * 256549879 == 2) {
			this.aLong266 = (long) (-1352751720 * this.anInt4619 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
		}
		if (this.aBoolean733) {
			this.anInt4619 *= -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "()V", line = 66)
	void method28415() {
		this.anInt4620 = Class436.anIntArray463[this.anInt4614 * 1148988209 << 3] * 1563207367;
		@Pc(17) long local17 = (long) (this.anInt4601 * -1058410147);
		@Pc(23) long local23 = (long) (this.anInt4613 * 829166933);
		@Pc(29) long local29 = (long) (this.anInt4609 * 894885741);
		this.anInt4619 = (int) Math.sqrt((double) (local29 * local29 + local23 * local23 + local17 * local17)) * 1327430267;
		if (this.anInt4616 * -533022681 == 0) {
			this.anInt4616 = -857000041;
		}
		if (this.anInt4615 * 256549879 == 0) {
			this.aLong266 = 1600628302371635205L;
		} else if (this.anInt4615 * 256549879 == 1) {
			this.aLong266 = (long) (this.anInt4619 * -1352751720 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
			this.aLong266 *= this.aLong266 * -2285738288332836045L;
		} else if (this.anInt4615 * 256549879 == 2) {
			this.aLong266 = (long) (-1352751720 * this.anInt4619 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
		}
		if (this.aBoolean733) {
			this.anInt4619 *= -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "()V", line = 66)
	void method28416() {
		this.anInt4620 = Class436.anIntArray463[this.anInt4614 * 1148988209 << 3] * 1563207367;
		@Pc(17) long local17 = (long) (this.anInt4601 * -1058410147);
		@Pc(23) long local23 = (long) (this.anInt4613 * 829166933);
		@Pc(29) long local29 = (long) (this.anInt4609 * 894885741);
		this.anInt4619 = (int) Math.sqrt((double) (local29 * local29 + local23 * local23 + local17 * local17)) * 1327430267;
		if (this.anInt4616 * -533022681 == 0) {
			this.anInt4616 = -857000041;
		}
		if (this.anInt4615 * 256549879 == 0) {
			this.aLong266 = 1600628302371635205L;
		} else if (this.anInt4615 * 256549879 == 1) {
			this.aLong266 = (long) (this.anInt4619 * -1352751720 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
			this.aLong266 *= this.aLong266 * -2285738288332836045L;
		} else if (this.anInt4615 * 256549879 == 2) {
			this.aLong266 = (long) (-1352751720 * this.anInt4619 / (this.anInt4616 * -533022681)) * -5214239248492544005L;
		}
		if (this.aBoolean733) {
			this.anInt4619 *= -1;
		}
	}

	@OriginalMember(owner = "client!mc", name = "ms", descriptor = "(Lclient!yf;I)V", line = 6877)
	static final void method28417(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class298.method27065(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mc", name = "uj", descriptor = "(Lclient!yf;B)V", line = 8287)
	static final void method28418(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1544997815;
	}

	@OriginalMember(owner = "client!mc", name = "xj", descriptor = "(Lclient!yf;I)V", line = 8658)
	static final void method28419(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.anInt3389 * -643758853;
	}

	@OriginalMember(owner = "client!mc", name = "ki", descriptor = "(Lclient!gm;I)V", line = 11635)
	static void method28420(@OriginalArg(0) Class277 arg0) {
		if (arg0.anInt3857 * -1960530827 == 5 && arg0.anInt3936 * 403396513 != -1) {
			Class449.method29226(Class284.aClass86_9, arg0);
		}
	}
}
