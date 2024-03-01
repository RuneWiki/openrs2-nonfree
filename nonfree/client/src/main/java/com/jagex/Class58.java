package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ach")
public class Class58 {

	@OriginalMember(owner = "client!ach", name = "l", descriptor = "I")
	static final int anInt225 = 32768;

	@OriginalMember(owner = "client!ach", name = "w", descriptor = "I")
	static final int anInt228 = 1;

	@OriginalMember(owner = "client!ach", name = "m", descriptor = "I")
	public int anInt226 = 0;

	@OriginalMember(owner = "client!ach", name = "k", descriptor = "I")
	public int anInt227 = 0;

	@OriginalMember(owner = "client!ach", name = "f", descriptor = "Lclient!eb;")
	final Class240 aClass240_4 = new Class240(64);

	@OriginalMember(owner = "client!ach", name = "u", descriptor = "Lclient!xx;")
	Interface72 anInterface72_1 = null;

	@OriginalMember(owner = "client!ach", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_10;

	@OriginalMember(owner = "client!ach", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_9;

	@OriginalMember(owner = "client!ach", name = "<init>", descriptor = "(Lclient!zt;Lclient!py;Lclient!py;Lclient!xx;)V", line = 19)
	public Class58(@OriginalArg(0) Class717 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Interface72 arg3) {
		this.aClass497_10 = arg1;
		this.aClass497_9 = arg2;
		this.anInterface72_1 = arg3;
		if (this.aClass497_10 != null) {
			this.anInt226 = this.aClass497_10.method30062(1) * -44765849;
		}
		if (this.aClass497_9 != null) {
			this.anInt227 = this.aClass497_9.method30062(1) * -1847166895;
		}
	}

	@OriginalMember(owner = "client!ach", name = "m", descriptor = "(I)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1092(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30044(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass497_10.method30044(1, arg0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22939(new Class93_Sub41(local22));
		}
		if (arg0 >= 32768) {
			local6.method22924();
		}
		this.aClass240_4.method25830(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "k", descriptor = "(I)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1094(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30044(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass497_10.method30044(1, arg0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22939(new Class93_Sub41(local22));
		}
		if (arg0 >= 32768) {
			local6.method22924();
		}
		this.aClass240_4.method25830(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "f", descriptor = "(I)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1095(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30044(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass497_10.method30044(1, arg0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22939(new Class93_Sub41(local22));
		}
		if (arg0 >= 32768) {
			local6.method22924();
		}
		this.aClass240_4.method25830(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "e", descriptor = "(II)Lclient!asq;", line = 28)
	public Class93_Sub1_Sub18 method1097(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub18 local6 = (Class93_Sub1_Sub18) this.aClass240_4.method25839((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_9.method30044(1, arg0 & 0x7FFF);
		} else {
			local22 = this.aClass497_10.method30044(1, arg0);
		}
		local6 = new Class93_Sub1_Sub18();
		local6.aClass58_1 = this;
		if (local22 != null) {
			local6.method22939(new Class93_Sub41(local22));
		}
		if (arg0 >= 32768) {
			local6.method22924();
		}
		this.aClass240_4.method25830(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ach", name = "l", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1091(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "n", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1093(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "w", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1096(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "u", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1098(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "z", descriptor = "(Lclient!xs;[IJ)Ljava/lang/String;", line = 42)
	String method1099(@OriginalArg(0) Class669 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface72_1 != null) {
			@Pc(10) String local10 = this.anInterface72_1.method28957(arg0, arg1, arg2);
			if (local10 != null) {
				return local10;
			}
		}
		return Long.toString(arg2);
	}

	@OriginalMember(owner = "client!ach", name = "d", descriptor = "(Ljava/util/Random;II)I", line = 114)
	public static int method1100(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = Class62.aRandom1;
			if (arg0 == null) {
				@Pc(10) Object local10 = Class62.anObject3;
				synchronized (Class62.anObject3) {
					if (Class62.aRandom1 == null) {
						Class62.aRandom1 = new Random();
					}
					arg0 = Class62.aRandom1;
				}
			}
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Class364.method27900(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(57) int local57 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(60) int local60;
			do {
				local60 = arg0.nextInt();
			} while (local60 >= local57);
			return Class580.method31387(local60, arg1);
		}
	}

	@OriginalMember(owner = "client!ach", name = "hk", descriptor = "(Lclient!ahm;I)V", line = 4262)
	static final void method1103(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class19_Sub3 local2 = arg0.aClass19_Sub3_3;
		if (local2.method23552() && local2.method23573(1) && local2.method23581()) {
			if (local2.aBoolean379) {
				local2.method23558(arg0.method19966().method32134(), false, true);
				local2.aBoolean379 = local2.method23552();
			}
			local2.method23570();
		}
		for (@Pc(38) int local38 = 0; local38 < arg0.aClass554Array3.length; local38++) {
			if (arg0.aClass554Array3[local38].anInt5319 * 601549465 != -1) {
				@Pc(58) Class19 local58 = arg0.aClass554Array3[local38].aClass19_7;
				if (local58.method23561()) {
					@Pc(74) Class697 local74 = (Class697) Class501.aClass32_Sub18_1.method18261(arg0.aClass554Array3[local38].anInt5319 * 601549465);
					@Pc(78) Class263 local78 = local58.method23553();
					if (local74.aBoolean881) {
						if (local78.anInt3867 * -2017474589 == 3) {
							if (arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
								local58.method23568(-1);
								arg0.aClass554Array3[local38].anInt5319 = 1020147287;
								continue;
							}
						} else if (local78.anInt3867 * -2017474589 == 1 && arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
							continue;
						}
					}
				}
				if (local58.method23573(1) && local58.method23581()) {
					local58.method23568(-1);
					arg0.aClass554Array3[local38].anInt5319 = 1020147287;
				}
			}
		}
		@Pc(163) Class19 local163 = arg0.aClass19_3;
		if (local163.method23552()) {
			label84: {
				@Pc(171) Class263 local171 = local163.method23553();
				if (local171.anInt3867 * -2017474589 == 3) {
					if (arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
						arg0.anIntArray236 = null;
						local163.method23568(-1);
						break label84;
					}
				} else if (local171.anInt3867 * -2017474589 == 1) {
					if (arg0.anInt2760 * -215928493 > 0 && arg0.anInt2780 * -2095106181 <= client.anInt3485 && arg0.anInt2762 * -1538623211 < client.anInt3485) {
						local163.method23563(1);
						break label84;
					}
					local163.method23563(0);
				}
				if (local163.method23573(1) && local163.method23581()) {
					arg0.anIntArray236 = null;
					local163.method23568(-1);
				}
			}
		}
		for (@Pc(252) int local252 = 0; local252 < arg0.aClass19_Sub1_Sub1Array3.length; local252++) {
			@Pc(262) Class19_Sub1_Sub1 local262 = arg0.aClass19_Sub1_Sub1Array3[local252];
			if (local262 != null) {
				if (local262.anInt3224 * -1095445777 > 0) {
					local262.anInt3224 -= -754803697;
				} else if (local262.method23573(1) && local262.method23581()) {
					arg0.aClass19_Sub1_Sub1Array3[local252] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ach", name = "ym", descriptor = "(Lclient!yf;B)V", line = 9335)
	static final void method1102(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean594 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ach", name = "auh", descriptor = "(Lclient!yf;B)V", line = 13413)
	static final void method1101(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub35_5.method16223();
	}
}
