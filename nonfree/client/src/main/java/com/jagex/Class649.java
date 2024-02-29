package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xn")
public class Class649 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!xn", name = "p", descriptor = "I")
	static final int anInt5736 = 1190717;

	@OriginalMember(owner = "client!xn", name = "c", descriptor = "I")
	int anInt5737;

	@OriginalMember(owner = "client!xn", name = "v", descriptor = "I")
	public int anInt5729 = 0;

	@OriginalMember(owner = "client!xn", name = "l", descriptor = "I")
	public int anInt5730 = 1122033033;

	@OriginalMember(owner = "client!xn", name = "y", descriptor = "Z")
	public boolean aBoolean853 = true;

	@OriginalMember(owner = "client!xn", name = "w", descriptor = "I")
	public int anInt5731 = 1553306891;

	@OriginalMember(owner = "client!xn", name = "t", descriptor = "I")
	public int anInt5732 = -385271296;

	@OriginalMember(owner = "client!xn", name = "q", descriptor = "Z")
	public boolean aBoolean854 = true;

	@OriginalMember(owner = "client!xn", name = "x", descriptor = "I")
	public int anInt5733 = 729422904;

	@OriginalMember(owner = "client!xn", name = "d", descriptor = "Z")
	public boolean aBoolean855 = false;

	@OriginalMember(owner = "client!xn", name = "s", descriptor = "I")
	public int anInt5734 = -1648355787;

	@OriginalMember(owner = "client!xn", name = "r", descriptor = "I")
	public int anInt5735 = -836957504;

	@OriginalMember(owner = "client!xn", name = "g", descriptor = "I")
	public int anInt5728 = 691491585;

	@OriginalMember(owner = "client!xn", name = "z", descriptor = "I")
	public int anInt5727 = -1375953411;

	@OriginalMember(owner = "client!xn", name = "j", descriptor = "I")
	public int anInt5738 = 0;

	@OriginalMember(owner = "client!xn", name = "i", descriptor = "I")
	public int anInt5739 = 238955968;

	@OriginalMember(owner = "client!xn", name = "<init>", descriptor = "()V", line = 28)
	Class649() {
	}

	@OriginalMember(owner = "client!xn", name = "v", descriptor = "(Lclient!akv;)V", line = 32)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32875(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xn", name = "y", descriptor = "(Lclient!akv;)V", line = 32)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32875(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xn", name = "p", descriptor = "(Lclient!akv;B)V", line = 32)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32875(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xn", name = "l", descriptor = "(Lclient!akv;)V", line = 32)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method32875(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!xn", name = "q", descriptor = "(Lclient!akv;II)V", line = 39)
	void method32875(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5729 = Class527.method30681(arg0.method22492()) * -1446740851;
		} else if (arg1 == 2) {
			this.anInt5730 = arg0.method22478() * -1122033033;
		} else if (arg1 == 3) {
			this.anInt5730 = arg0.method22483() * -1122033033;
			if (this.anInt5730 * 1884378951 == 65535) {
				this.anInt5730 = 1122033033;
			}
		} else if (arg1 == 5) {
			this.aBoolean853 = false;
		} else if (arg1 == 7) {
			this.anInt5731 = Class527.method30681(arg0.method22492()) * -1553306891;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5732 = (arg0.method22483() << 2) * -1418427235;
			} else if (arg1 == 10) {
				this.aBoolean854 = false;
			} else if (arg1 == 11) {
				this.anInt5733 = arg0.method22478() * -1519434873;
			} else if (arg1 == 12) {
				this.aBoolean855 = true;
			} else if (arg1 == 13) {
				this.anInt5734 = arg0.method22492() * -648796583;
			} else if (arg1 == 14) {
				this.anInt5735 = (arg0.method22478() << 2) * 54031403;
			} else if (arg1 == 16) {
				this.anInt5728 = arg0.method22478() * 1265937407;
			} else if (arg1 == 20) {
				this.anInt5727 = arg0.method22483() * 1409815235;
			} else if (arg1 == 21) {
				this.anInt5738 = arg0.method22478() * -701138217;
			} else if (arg1 == 22) {
				this.anInt5739 = arg0.method22483() * 1949890743;
			}
		}
	}

	@OriginalMember(owner = "client!xn", name = "s", descriptor = "(Lclient!akv;I)V", line = 39)
	void method32876(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5729 = Class527.method30681(arg0.method22492()) * -1446740851;
		} else if (arg1 == 2) {
			this.anInt5730 = arg0.method22478() * -1122033033;
		} else if (arg1 == 3) {
			this.anInt5730 = arg0.method22483() * -1122033033;
			if (this.anInt5730 * 1884378951 == 65535) {
				this.anInt5730 = 1122033033;
			}
		} else if (arg1 == 5) {
			this.aBoolean853 = false;
		} else if (arg1 == 7) {
			this.anInt5731 = Class527.method30681(arg0.method22492()) * -1553306891;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5732 = (arg0.method22483() << 2) * -1418427235;
			} else if (arg1 == 10) {
				this.aBoolean854 = false;
			} else if (arg1 == 11) {
				this.anInt5733 = arg0.method22478() * -1519434873;
			} else if (arg1 == 12) {
				this.aBoolean855 = true;
			} else if (arg1 == 13) {
				this.anInt5734 = arg0.method22492() * -648796583;
			} else if (arg1 == 14) {
				this.anInt5735 = (arg0.method22478() << 2) * 54031403;
			} else if (arg1 == 16) {
				this.anInt5728 = arg0.method22478() * 1265937407;
			} else if (arg1 == 20) {
				this.anInt5727 = arg0.method22483() * 1409815235;
			} else if (arg1 == 21) {
				this.anInt5738 = arg0.method22478() * -701138217;
			} else if (arg1 == 22) {
				this.anInt5739 = arg0.method22483() * 1949890743;
			}
		}
	}

	@OriginalMember(owner = "client!xn", name = "r", descriptor = "(Lclient!akv;I)V", line = 39)
	void method32877(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5729 = Class527.method30681(arg0.method22492()) * -1446740851;
		} else if (arg1 == 2) {
			this.anInt5730 = arg0.method22478() * -1122033033;
		} else if (arg1 == 3) {
			this.anInt5730 = arg0.method22483() * -1122033033;
			if (this.anInt5730 * 1884378951 == 65535) {
				this.anInt5730 = 1122033033;
			}
		} else if (arg1 == 5) {
			this.aBoolean853 = false;
		} else if (arg1 == 7) {
			this.anInt5731 = Class527.method30681(arg0.method22492()) * -1553306891;
		} else if (arg1 != 8) {
			if (arg1 == 9) {
				this.anInt5732 = (arg0.method22483() << 2) * -1418427235;
			} else if (arg1 == 10) {
				this.aBoolean854 = false;
			} else if (arg1 == 11) {
				this.anInt5733 = arg0.method22478() * -1519434873;
			} else if (arg1 == 12) {
				this.aBoolean855 = true;
			} else if (arg1 == 13) {
				this.anInt5734 = arg0.method22492() * -648796583;
			} else if (arg1 == 14) {
				this.anInt5735 = (arg0.method22478() << 2) * 54031403;
			} else if (arg1 == 16) {
				this.anInt5728 = arg0.method22478() * 1265937407;
			} else if (arg1 == 20) {
				this.anInt5727 = arg0.method22483() * 1409815235;
			} else if (arg1 == 21) {
				this.anInt5738 = arg0.method22478() * -701138217;
			} else if (arg1 == 22) {
				this.anInt5739 = arg0.method22483() * 1949890743;
			}
		}
	}

	@OriginalMember(owner = "client!xn", name = "c", descriptor = "(I)V", line = 62)
	@Override
	public void method36034() {
		this.anInt5733 = (this.anInt5733 * 589238839 << 8 | this.anInt5737 * 620805785) * -1519434873;
	}

	@OriginalMember(owner = "client!xn", name = "w", descriptor = "()V", line = 62)
	@Override
	public void method36035() {
		this.anInt5733 = (this.anInt5733 * 589238839 << 8 | this.anInt5737 * 620805785) * -1519434873;
	}

	@OriginalMember(owner = "client!xn", name = "t", descriptor = "()V", line = 62)
	@Override
	public void method36036() {
		this.anInt5733 = (this.anInt5733 * 589238839 << 8 | this.anInt5737 * 620805785) * -1519434873;
	}

	@OriginalMember(owner = "client!xn", name = "j", descriptor = "(I)I", line = 66)
	static int method32878(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class472.method29635(arg0);
	}

	@OriginalMember(owner = "client!xn", name = "i", descriptor = "(I)I", line = 66)
	static int method32879(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Class472.method29635(arg0);
	}

	@OriginalMember(owner = "client!xn", name = "g", descriptor = "(I)V", line = 71)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
		this.anInt5737 = arg0 * -2118077015;
	}

	@OriginalMember(owner = "client!xn", name = "x", descriptor = "(II)V", line = 71)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
		this.anInt5737 = arg0 * -2118077015;
	}

	@OriginalMember(owner = "client!xn", name = "z", descriptor = "(I)V", line = 71)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
		this.anInt5737 = arg0 * -2118077015;
	}

	@OriginalMember(owner = "client!xn", name = "at", descriptor = "(III)V", line = 233)
	static void method32880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(6, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
	}

	@OriginalMember(owner = "client!xn", name = "as", descriptor = "(Lclient!yf;I)V", line = 4509)
	static final void method32881(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= 1460193483;
	}

	@OriginalMember(owner = "client!xn", name = "anw", descriptor = "(Lclient!yf;I)V", line = 11936)
	static final void method32882(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class242.method26019().method36479();
	}
}
