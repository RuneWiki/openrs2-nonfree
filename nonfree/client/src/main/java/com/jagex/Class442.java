package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public class Class442 {

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	static final int anInt4891 = 0;

	@OriginalMember(owner = "client!nm", name = "jb", descriptor = "J")
	static long aLong276;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public int anInt4892 = -1702354679;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public int anInt4888 = -1185510848;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	public int anInt4889 = -1326832448;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public int anInt4890 = -1493536822;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
	public int anInt4887 = 619966023;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "Z")
	public boolean aBoolean768 = false;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Z")
	public boolean aBoolean769 = false;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 16)
	Class442() {
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(Lclient!alw;IB)V", line = 20)
	void method28858(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method28857(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "(Lclient!alw;I)V", line = 20)
	void method28861(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22413();
			if (local3 == 0) {
				return;
			}
			this.method28857(arg0, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "(Lclient!alw;IIB)V", line = 27)
	void method28857(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt4892 = arg0.method22415() * 1702354679;
			if (this.anInt4892 * -153468217 == 65535) {
				this.anInt4892 = -1702354679;
			}
		} else if (arg1 == 2) {
			this.anInt4888 = (arg0.method22415() + 1) * 652565033;
			this.anInt4889 = (arg0.method22415() + 1) * 46377107;
		} else if (arg1 == 3) {
			arg0.method22414();
		} else if (arg1 == 4) {
			this.anInt4890 = arg0.method22413() * 1400715237;
		} else if (arg1 == 5) {
			this.anInt4887 = arg0.method22413() * 619966023;
		} else if (arg1 == 6) {
			this.aBoolean768 = true;
		} else if (arg1 == 7) {
			this.aBoolean769 = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(Lclient!alw;II)V", line = 27)
	void method28859(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4892 = arg0.method22415() * 1702354679;
			if (this.anInt4892 * -153468217 == 65535) {
				this.anInt4892 = -1702354679;
			}
		} else if (arg1 == 2) {
			this.anInt4888 = (arg0.method22415() + 1) * 652565033;
			this.anInt4889 = (arg0.method22415() + 1) * 46377107;
		} else if (arg1 == 3) {
			arg0.method22414();
		} else if (arg1 == 4) {
			this.anInt4890 = arg0.method22413() * 1400715237;
		} else if (arg1 == 5) {
			this.anInt4887 = arg0.method22413() * 619966023;
		} else if (arg1 == 6) {
			this.aBoolean768 = true;
		} else if (arg1 == 7) {
			this.aBoolean769 = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "(Lclient!alw;II)V", line = 27)
	void method28860(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4892 = arg0.method22415() * 1702354679;
			if (this.anInt4892 * -153468217 == 65535) {
				this.anInt4892 = -1702354679;
			}
		} else if (arg1 == 2) {
			this.anInt4888 = (arg0.method22415() + 1) * 652565033;
			this.anInt4889 = (arg0.method22415() + 1) * 46377107;
		} else if (arg1 == 3) {
			arg0.method22414();
		} else if (arg1 == 4) {
			this.anInt4890 = arg0.method22413() * 1400715237;
		} else if (arg1 == 5) {
			this.anInt4887 = arg0.method22413() * 619966023;
		} else if (arg1 == 6) {
			this.aBoolean768 = true;
		} else if (arg1 == 7) {
			this.aBoolean769 = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "awm", descriptor = "(Lclient!yf;I)V", line = 13600)
	static final void method28862(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Date local16 = Class285.method26495(local12);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class285.method26493(local16, Class687.aTimeZone1);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class285.method26488(local16, Class687.aTimeZone1) - 1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class285.method26492(local16, Class687.aTimeZone1);
	}
}
