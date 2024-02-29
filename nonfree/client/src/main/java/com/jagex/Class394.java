package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public class Class394 {

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	static final int anInt4598 = 0;

	@OriginalMember(owner = "client!mb", name = "kc", descriptor = "I")
	public static int anInt4600;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	public int anInt4595 = 1748712647;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt4596 = -422558144;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt4597 = -1751998400;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	public int anInt4594 = -441187986;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public int anInt4599 = -1426481801;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
	public boolean aBoolean731 = false;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Z")
	public boolean aBoolean732 = false;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 16)
	Class394() {
	}

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "(Lclient!akv;II)V", line = 20)
	void method28393(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28397(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "(Lclient!akv;I)V", line = 20)
	void method28394(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28397(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "(Lclient!akv;I)V", line = 20)
	void method28395(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28397(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "(Lclient!akv;I)V", line = 20)
	void method28396(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method28397(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Lclient!akv;IIB)V", line = 27)
	void method28397(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt4595 = arg0.method22483() * -1748712647;
			if (this.anInt4595 * 651115273 == 65535) {
				this.anInt4595 = 1748712647;
			}
		} else if (arg1 == 2) {
			this.anInt4596 = (arg0.method22483() + 1) * 1536901401;
			this.anInt4597 = (arg0.method22483() + 1) * 1046366849;
		} else if (arg1 == 3) {
			arg0.method22481();
		} else if (arg1 == 4) {
			this.anInt4594 = arg0.method22478() * -220593993;
		} else if (arg1 == 5) {
			this.anInt4599 = arg0.method22478() * -1426481801;
		} else if (arg1 == 6) {
			this.aBoolean731 = true;
		} else if (arg1 == 7) {
			this.aBoolean732 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "(Lclient!akv;II)V", line = 27)
	void method28398(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4595 = arg0.method22483() * -1748712647;
			if (this.anInt4595 * 651115273 == 65535) {
				this.anInt4595 = 1748712647;
			}
		} else if (arg1 == 2) {
			this.anInt4596 = (arg0.method22483() + 1) * 1536901401;
			this.anInt4597 = (arg0.method22483() + 1) * 1046366849;
		} else if (arg1 == 3) {
			arg0.method22481();
		} else if (arg1 == 4) {
			this.anInt4594 = arg0.method22478() * -220593993;
		} else if (arg1 == 5) {
			this.anInt4599 = arg0.method22478() * -1426481801;
		} else if (arg1 == 6) {
			this.aBoolean731 = true;
		} else if (arg1 == 7) {
			this.aBoolean732 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "(Lclient!akv;II)V", line = 27)
	void method28399(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4595 = arg0.method22483() * -1748712647;
			if (this.anInt4595 * 651115273 == 65535) {
				this.anInt4595 = 1748712647;
			}
		} else if (arg1 == 2) {
			this.anInt4596 = (arg0.method22483() + 1) * 1536901401;
			this.anInt4597 = (arg0.method22483() + 1) * 1046366849;
		} else if (arg1 == 3) {
			arg0.method22481();
		} else if (arg1 == 4) {
			this.anInt4594 = arg0.method22478() * -220593993;
		} else if (arg1 == 5) {
			this.anInt4599 = arg0.method22478() * -1426481801;
		} else if (arg1 == 6) {
			this.aBoolean731 = true;
		} else if (arg1 == 7) {
			this.aBoolean732 = true;
		}
	}

	@OriginalMember(owner = "client!mb", name = "cm", descriptor = "(Lclient!yf;S)V", line = 4953)
	static final void method28400(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class57.method862(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "mj", descriptor = "(Lclient!yf;B)V", line = 6810)
	static final void method28401(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class223.method25771(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "nj", descriptor = "(Lclient!yf;S)V", line = 6940)
	static final void method28402(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class310.method27286(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mb", name = "tc", descriptor = "(Lclient!yf;B)V", line = 8019)
	static final void method28403(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(29) int local29 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(30) int local30 = local29 - 1;
		if (local16.aStringArray25 == null || local30 >= local16.aStringArray25.length || local16.aStringArray25[local30] == null) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.aStringArray25[local30];
		}
	}
}
