package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public class Class483 {

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "Lclient!sw;")
	public Class468 aClass468_1;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "Lclient!sk;")
	public Interface50 anInterface50_1;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!sk;")
	public Interface50 anInterface50_2;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "Lclient!sk;")
	public Interface50 anInterface50_3;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "Lclient!sk;")
	public Interface50 anInterface50_4;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "Lclient!sw;")
	public Class468 aClass468_2;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Z")
	public boolean aBoolean802;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
	public int anInt5159;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
	public int anInt5160;

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "Lclient!sw;")
	public Class468 aClass468_3;

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "(Lclient!vs;I)V", line = 13)
	static void method29101(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString229;
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!ny;)V", line = 21)
	public Class483(@OriginalArg(0) Class359 arg0) {
		@Pc(9) byte[] local9 = arg0.method26705(Class474.aClass474_7.anInt5121 * 152686723);
		this.method29097(new Class3_Sub41(local9));
	}

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "(Lclient!ahb;)V", line = 28)
	void method29096(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_4 = Class285.method25471(arg0);
			} else if (local3 == 2) {
				this.anInterface50_1 = Class285.method25471(arg0);
			} else if (local3 == 3) {
				this.anInterface50_2 = Class285.method25471(arg0);
			} else if (local3 == 4) {
				this.anInterface50_3 = Class285.method25471(arg0);
			} else if (local3 == 5) {
				this.aClass468_2 = Class377.method27241(arg0);
			} else if (local3 == 6) {
				this.aClass468_1 = Class377.method27241(arg0);
			} else if (local3 == 7) {
				this.aClass468_3 = Class377.method27241(arg0);
			} else if (local3 == 8) {
				Class285.method25471(arg0);
			} else if (local3 == 9) {
				Class285.method25471(arg0);
			} else if (local3 == 10) {
				Class285.method25471(arg0);
			} else if (local3 == 11) {
				this.aBoolean802 = true;
			} else if (local3 == 12) {
				this.anInt5159 = arg0.method20275() * -660966609;
			} else if (local3 == 13) {
				this.anInt5160 = arg0.method20275() * 33147637;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "(Lclient!ahb;I)V", line = 28)
	void method29097(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_4 = Class285.method25471(arg0);
			} else if (local3 == 2) {
				this.anInterface50_1 = Class285.method25471(arg0);
			} else if (local3 == 3) {
				this.anInterface50_2 = Class285.method25471(arg0);
			} else if (local3 == 4) {
				this.anInterface50_3 = Class285.method25471(arg0);
			} else if (local3 == 5) {
				this.aClass468_2 = Class377.method27241(arg0);
			} else if (local3 == 6) {
				this.aClass468_1 = Class377.method27241(arg0);
			} else if (local3 == 7) {
				this.aClass468_3 = Class377.method27241(arg0);
			} else if (local3 == 8) {
				Class285.method25471(arg0);
			} else if (local3 == 9) {
				Class285.method25471(arg0);
			} else if (local3 == 10) {
				Class285.method25471(arg0);
			} else if (local3 == 11) {
				this.aBoolean802 = true;
			} else if (local3 == 12) {
				this.anInt5159 = arg0.method20275() * -660966609;
			} else if (local3 == 13) {
				this.anInt5160 = arg0.method20275() * 33147637;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!ahb;)V", line = 28)
	void method29098(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_4 = Class285.method25471(arg0);
			} else if (local3 == 2) {
				this.anInterface50_1 = Class285.method25471(arg0);
			} else if (local3 == 3) {
				this.anInterface50_2 = Class285.method25471(arg0);
			} else if (local3 == 4) {
				this.anInterface50_3 = Class285.method25471(arg0);
			} else if (local3 == 5) {
				this.aClass468_2 = Class377.method27241(arg0);
			} else if (local3 == 6) {
				this.aClass468_1 = Class377.method27241(arg0);
			} else if (local3 == 7) {
				this.aClass468_3 = Class377.method27241(arg0);
			} else if (local3 == 8) {
				Class285.method25471(arg0);
			} else if (local3 == 9) {
				Class285.method25471(arg0);
			} else if (local3 == 10) {
				Class285.method25471(arg0);
			} else if (local3 == 11) {
				this.aBoolean802 = true;
			} else if (local3 == 12) {
				this.anInt5159 = arg0.method20275() * -660966609;
			} else if (local3 == 13) {
				this.anInt5160 = arg0.method20275() * 33147637;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(Lclient!ahb;)V", line = 28)
	void method29099(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_4 = Class285.method25471(arg0);
			} else if (local3 == 2) {
				this.anInterface50_1 = Class285.method25471(arg0);
			} else if (local3 == 3) {
				this.anInterface50_2 = Class285.method25471(arg0);
			} else if (local3 == 4) {
				this.anInterface50_3 = Class285.method25471(arg0);
			} else if (local3 == 5) {
				this.aClass468_2 = Class377.method27241(arg0);
			} else if (local3 == 6) {
				this.aClass468_1 = Class377.method27241(arg0);
			} else if (local3 == 7) {
				this.aClass468_3 = Class377.method27241(arg0);
			} else if (local3 == 8) {
				Class285.method25471(arg0);
			} else if (local3 == 9) {
				Class285.method25471(arg0);
			} else if (local3 == 10) {
				Class285.method25471(arg0);
			} else if (local3 == 11) {
				this.aBoolean802 = true;
			} else if (local3 == 12) {
				this.anInt5159 = arg0.method20275() * -660966609;
			} else if (local3 == 13) {
				this.anInt5160 = arg0.method20275() * 33147637;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "(Lclient!ahb;)V", line = 28)
	void method29100(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_4 = Class285.method25471(arg0);
			} else if (local3 == 2) {
				this.anInterface50_1 = Class285.method25471(arg0);
			} else if (local3 == 3) {
				this.anInterface50_2 = Class285.method25471(arg0);
			} else if (local3 == 4) {
				this.anInterface50_3 = Class285.method25471(arg0);
			} else if (local3 == 5) {
				this.aClass468_2 = Class377.method27241(arg0);
			} else if (local3 == 6) {
				this.aClass468_1 = Class377.method27241(arg0);
			} else if (local3 == 7) {
				this.aClass468_3 = Class377.method27241(arg0);
			} else if (local3 == 8) {
				Class285.method25471(arg0);
			} else if (local3 == 9) {
				Class285.method25471(arg0);
			} else if (local3 == 10) {
				Class285.method25471(arg0);
			} else if (local3 == 11) {
				this.aBoolean802 = true;
			} else if (local3 == 12) {
				this.anInt5159 = arg0.method20275() * -660966609;
			} else if (local3 == 13) {
				this.anInt5160 = arg0.method20275() * 33147637;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(Lclient!ahb;I)V", line = 37)
	static void method29107(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method20334();
		Class116.aClass473Array1 = new Class473[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			Class116.aClass473Array1[local8] = new Class473();
			Class116.aClass473Array1[local8].anInt5120 = arg0.method20334() * -22886571;
			Class116.aClass473Array1[local8].aString227 = arg0.method20284();
		}
		Class400.anInt4803 = arg0.method20334() * -223809271;
		Class490.anInt5198 = arg0.method20334() * 70043915;
		Class356.anInt4636 = arg0.method20334() * -1496326813;
		Class410.aClass63_Sub1Array1 = new Class63_Sub1[Class490.anInt5198 * -830555485 - Class400.anInt4803 * -812257991 + 1];
		for (local8 = 0; local8 < Class356.anInt4636 * 1582861387; local8++) {
			@Pc(75) int local75 = arg0.method20334();
			@Pc(83) Class63_Sub1 local83 = Class410.aClass63_Sub1Array1[local75] = new Class63_Sub1();
			local83.anInt1511 = arg0.method20269() * 613174889;
			local83.anInt1515 = arg0.method20275() * 1960297477;
			local83.anInt1519 = arg0.method20334() * 1846169561;
			if (local83.anInt1519 * 99041385 != 0) {
				local83.aString53 = arg0.method20284();
			}
			local83.anInt1518 = (local75 + Class400.anInt4803 * -812257991) * 1475257131;
			local83.aString51 = arg0.method20284();
			local83.aString52 = arg0.method20284();
		}
		Class3_Sub42_Sub1.anInt2712 = arg0.method20275() * -1634930007;
		Class490.aBoolean806 = true;
	}

	@OriginalMember(owner = "client!tk", name = "pr", descriptor = "(Lclient!vs;I)V", line = 6946)
	static final void method29102(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.anInt3517 * -1321366055;
	}

	@OriginalMember(owner = "client!tk", name = "tz", descriptor = "(Lclient!vs;I)V", line = 7610)
	static final void method29105(@OriginalArg(0) Class536 arg0) {
		Class510.aClass183_1.method23595(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
	}

	@OriginalMember(owner = "client!tk", name = "ut", descriptor = "(Lclient!vs;I)V", line = 7799)
	static final void method29103(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class424.aClass165_1.method23324(local12);
	}

	@OriginalMember(owner = "client!tk", name = "vx", descriptor = "(Lclient!vs;I)V", line = 7972)
	static final void method29106(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class452.method28425(local12, false);
	}

	@OriginalMember(owner = "client!tk", name = "ye", descriptor = "(Lclient!vs;I)V", line = 8423)
	static final void method29104(@OriginalArg(0) Class536 arg0) {
		Class462.method28600();
	}
}
