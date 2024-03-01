package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public class Class501 {

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
	static final int anInt5241 = 1190717;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
	int anInt5234;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
	public int anInt5237 = 0;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	public int anInt5236 = -533391735;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Z")
	public boolean aBoolean815 = true;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
	public int anInt5235 = -2081588939;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public int anInt5238 = -1275580928;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "Z")
	public boolean aBoolean816 = true;

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
	public int anInt5239 = -1619913800;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Z")
	public boolean aBoolean817 = false;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public int anInt5233 = -609639363;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	public int anInt5243 = -881458880;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public int anInt5242 = -1380883195;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public int anInt5240 = 1744548605;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
	public int anInt5244 = 0;

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
	public int anInt5245 = 204496320;

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 25)
	Class501() {
	}

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "(Lclient!ahb;B)V", line = 29)
	void method29444(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method29445(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "(Lclient!ahb;)V", line = 29)
	void method29449(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method29445(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "(Lclient!ahb;I)V", line = 36)
	void method29443(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5237 = Class286.method25478(arg0.method20273()) * -1468396259;
		} else if (arg1 == 2) {
			this.anInt5236 = arg0.method20269() * 533391735;
		} else if (arg1 == 3) {
			this.anInt5236 = arg0.method20271() * 533391735;
			if (this.anInt5236 * -446644153 == 65535) {
				this.anInt5236 = -533391735;
			}
		} else if (arg1 == 5) {
			this.aBoolean815 = false;
		} else if (arg1 == 7) {
			this.anInt5235 = Class286.method25478(arg0.method20273()) * 2081588939;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5238 = (arg0.method20271() << 2) * -1428554729;
			} else if (arg1 == 10) {
				this.aBoolean816 = false;
			} else if (arg1 == 11) {
				this.anInt5239 = arg0.method20269() * -1813101961;
			} else if (arg1 == 12) {
				this.aBoolean817 = true;
			} else if (arg1 == 13) {
				this.anInt5233 = arg0.method20273() * 147909889;
			} else if (arg1 == 14) {
				this.anInt5243 = (arg0.method20269() << 2) * 1999493125;
			} else if (arg1 == 16) {
				this.anInt5242 = arg0.method20269() * 920950267;
			} else if (arg1 == 20) {
				this.anInt5240 = arg0.method20271() * -722223677;
			} else if (arg1 == 21) {
				this.anInt5244 = arg0.method20269() * 1152777423;
			} else if (arg1 == 22) {
				this.anInt5245 = arg0.method20271() * -1070546569;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ahb;II)V", line = 36)
	void method29445(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5237 = Class286.method25478(arg0.method20273()) * -1468396259;
		} else if (arg1 == 2) {
			this.anInt5236 = arg0.method20269() * 533391735;
		} else if (arg1 == 3) {
			this.anInt5236 = arg0.method20271() * 533391735;
			if (this.anInt5236 * -446644153 == 65535) {
				this.anInt5236 = -533391735;
			}
		} else if (arg1 == 5) {
			this.aBoolean815 = false;
		} else if (arg1 == 7) {
			this.anInt5235 = Class286.method25478(arg0.method20273()) * 2081588939;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5238 = (arg0.method20271() << 2) * -1428554729;
			} else if (arg1 == 10) {
				this.aBoolean816 = false;
			} else if (arg1 == 11) {
				this.anInt5239 = arg0.method20269() * -1813101961;
			} else if (arg1 == 12) {
				this.aBoolean817 = true;
			} else if (arg1 == 13) {
				this.anInt5233 = arg0.method20273() * 147909889;
			} else if (arg1 == 14) {
				this.anInt5243 = (arg0.method20269() << 2) * 1999493125;
			} else if (arg1 == 16) {
				this.anInt5242 = arg0.method20269() * 920950267;
			} else if (arg1 == 20) {
				this.anInt5240 = arg0.method20271() * -722223677;
			} else if (arg1 == 21) {
				this.anInt5244 = arg0.method20269() * 1152777423;
			} else if (arg1 == 22) {
				this.anInt5245 = arg0.method20271() * -1070546569;
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V", line = 59)
	void method29446() {
		this.anInt5239 = (-511953081 * this.anInt5239 << 8 | this.anInt5234 * 1505266619) * -1813101961;
	}

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "()V", line = 59)
	void method29447() {
		this.anInt5239 = (-511953081 * this.anInt5239 << 8 | this.anInt5234 * 1505266619) * -1813101961;
	}

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "()V", line = 59)
	void method29448() {
		this.anInt5239 = (-511953081 * this.anInt5239 << 8 | this.anInt5234 * 1505266619) * -1813101961;
	}

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "()V", line = 59)
	void method29450() {
		this.anInt5239 = (-511953081 * this.anInt5239 << 8 | this.anInt5234 * 1505266619) * -1813101961;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "()V", line = 59)
	void method29451() {
		this.anInt5239 = (-511953081 * this.anInt5239 << 8 | this.anInt5234 * 1505266619) * -1813101961;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I", line = 63)
	static int method29452(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class69_Sub2.method14573(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "ab", descriptor = "(Lclient!mu;Lclient!mq;III)V", line = 1118)
	static void method29455(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class328 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class250.aClass328_97 == null) {
			Class250.aClass328_97 = new Class328(arg1);
		} else {
			Class250.aClass328_97.method26104(arg1);
		}
		Class250.aClass332_53.method26235(arg0);
		Class250.anInt3805 = arg2 * 517374709;
		Class250.anInt3817 = arg3 * -685614099;
	}

	@OriginalMember(owner = "client!ug", name = "wf", descriptor = "(Lclient!vs;I)V", line = 8145)
	static final void method29453(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(26) String local26 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(38) Class574 local38 = Class438.aClass589_1.method33297(local12);
		if (local38.aChar14 != 's') {
			throw new RuntimeException();
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local38.method33084(local26) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ug", name = "agn", descriptor = "(Lclient!vs;I)V", line = 10093)
	static final void method29454(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(15) Class3_Sub1_Sub4 local15 = Class557.method32815();
		if (local15 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			return;
		}
		@Pc(30) boolean local30 = local15.method18903(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class525.anIntArray492);
		if (local30) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class525.anIntArray492[1];
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class525.anIntArray492[2];
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		}
	}
}
