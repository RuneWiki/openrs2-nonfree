package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public class Class489 {

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	public static final int anInt5191 = 0;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
	static final int anInt5192 = 2;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public static final int anInt5193 = 1;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "[I")
	public int[] anIntArray476;

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	public int anInt5190 = -1357943211;

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
	public int anInt5194 = -268178693;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lclient!ny;)V", line = 16)
	public Class489(@OriginalArg(0) Class359 arg0) {
		@Pc(15) byte[] local15 = arg0.method26705(Class474.aClass474_5.anInt5121 * 152686723);
		this.method29229(new Class3_Sub41(local15));
		if (this.anIntArray475 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "(Lclient!ahb;I)V", line = 24)
	void method29229(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method20269();
				this.anIntArray475 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray475.length; local19++) {
					this.anIntArray475[local19] = arg0.method20269();
					if (this.anIntArray475[local19] != 0 && this.anIntArray475[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5190 = arg0.method20269() * 1357943211;
			} else if (local3 == 4) {
				this.anInt5194 = arg0.method20269() * 268178693;
			} else if (local3 == 5) {
				this.anIntArray476 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray476.length; local13++) {
					this.anIntArray476[local13] = arg0.method20269();
				}
			} else if (local3 == 6) {
				this.anIntArray477 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray477.length; local13++) {
					this.anIntArray477[local13] = arg0.method20269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ahb;)V", line = 24)
	void method29230(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method20269();
				this.anIntArray475 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray475.length; local19++) {
					this.anIntArray475[local19] = arg0.method20269();
					if (this.anIntArray475[local19] != 0 && this.anIntArray475[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5190 = arg0.method20269() * 1357943211;
			} else if (local3 == 4) {
				this.anInt5194 = arg0.method20269() * 268178693;
			} else if (local3 == 5) {
				this.anIntArray476 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray476.length; local13++) {
					this.anIntArray476[local13] = arg0.method20269();
				}
			} else if (local3 == 6) {
				this.anIntArray477 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray477.length; local13++) {
					this.anIntArray477[local13] = arg0.method20269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "(Lclient!ahb;)V", line = 24)
	void method29231(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method20269();
				this.anIntArray475 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray475.length; local19++) {
					this.anIntArray475[local19] = arg0.method20269();
					if (this.anIntArray475[local19] != 0 && this.anIntArray475[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5190 = arg0.method20269() * 1357943211;
			} else if (local3 == 4) {
				this.anInt5194 = arg0.method20269() * 268178693;
			} else if (local3 == 5) {
				this.anIntArray476 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray476.length; local13++) {
					this.anIntArray476[local13] = arg0.method20269();
				}
			} else if (local3 == 6) {
				this.anIntArray477 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray477.length; local13++) {
					this.anIntArray477[local13] = arg0.method20269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "(Lclient!ahb;)V", line = 24)
	void method29232(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			@Pc(13) int local13;
			if (local3 == 1) {
				local13 = arg0.method20269();
				this.anIntArray475 = new int[local13];
				for (@Pc(19) int local19 = 0; local19 < this.anIntArray475.length; local19++) {
					this.anIntArray475[local19] = arg0.method20269();
					if (this.anIntArray475[local19] != 0 && this.anIntArray475[local19] == 2) {
					}
				}
			} else if (local3 == 3) {
				this.anInt5190 = arg0.method20269() * 1357943211;
			} else if (local3 == 4) {
				this.anInt5194 = arg0.method20269() * 268178693;
			} else if (local3 == 5) {
				this.anIntArray476 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray476.length; local13++) {
					this.anIntArray476[local13] = arg0.method20269();
				}
			} else if (local3 == 6) {
				this.anIntArray477 = new int[arg0.method20269()];
				for (local13 = 0; local13 < this.anIntArray477.length; local13++) {
					this.anIntArray477[local13] = arg0.method20269();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "(Lclient!ahb;I)Lclient!sf;", line = 27)
	static Class453 method29234(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20269();
		@Pc(7) int local7 = arg0.method20269();
		return new Class453(local3, local7);
	}

	@OriginalMember(owner = "client!tr", name = "kf", descriptor = "(Lclient!vs;B)V", line = 5871)
	static final void method29235(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		Class284.method25467(local16, arg0);
	}

	@OriginalMember(owner = "client!tr", name = "aeo", descriptor = "(Lclient!vs;I)V", line = 9694)
	static final void method29233(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_21, local2.aClass577_2);
		local8.aClass3_Sub41_Sub1_1.method20250(0);
		@Pc(19) int local19 = local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local8.aClass3_Sub41_Sub1_1.method20250(0);
		local8.aClass3_Sub41_Sub1_1.method20251(arg0.aClass283_1.anInt4351 * 189047461);
		arg0.aClass283_1.aClass3_Sub1_Sub13_1.method19276(local8.aClass3_Sub41_Sub1_1, arg0.aClass283_1.anIntArray410);
		local8.aClass3_Sub41_Sub1_1.method20266(local8.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local19);
		local2.method21601(local8);
	}
}
