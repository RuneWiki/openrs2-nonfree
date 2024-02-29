package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public class Class623 {

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	static final int anInt5640 = 2000000000;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	int anInt5641 = 0;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
	int anInt5639 = 105141151;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
	int anInt5642 = 492907033;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "Lclient!wt;")
	final Class630 aClass630_1;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "Z")
	final boolean aBoolean840;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!wt;Z)V", line = 14)
	public Class623(@OriginalArg(0) Class630 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass630_1 = arg0;
		this.aBoolean840 = arg1;
	}

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "(I)I", line = 20)
	public int method32439() {
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "()I", line = 20)
	public int method32440() {
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "()I", line = 20)
	public int method32441() {
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "()I", line = 20)
	public int method32442() {
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "(Lclient!yt;)I", line = 24)
	public int method32443(@OriginalArg(0) Class676 arg0) {
		if (Class676.aClass676_1 == arg0 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32586();
			if (!this.aBoolean840) {
				local17 /= 10;
			}
			if (this.anInt5641 * -452422487 > local17) {
				return local17;
			}
		}
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(Lclient!yt;)I", line = 24)
	public int method32444(@OriginalArg(0) Class676 arg0) {
		if (Class676.aClass676_1 == arg0 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32586();
			if (!this.aBoolean840) {
				local17 /= 10;
			}
			if (this.anInt5641 * -452422487 > local17) {
				return local17;
			}
		}
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "(Lclient!yt;)I", line = 24)
	public int method32445(@OriginalArg(0) Class676 arg0) {
		if (Class676.aClass676_1 == arg0 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32586();
			if (!this.aBoolean840) {
				local17 /= 10;
			}
			if (this.anInt5641 * -452422487 > local17) {
				return local17;
			}
		}
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(Lclient!yt;I)I", line = 24)
	public int method32446(@OriginalArg(0) Class676 arg0) {
		if (Class676.aClass676_1 == arg0 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32586();
			if (!this.aBoolean840) {
				local17 /= 10;
			}
			if (this.anInt5641 * -452422487 > local17) {
				return local17;
			}
		}
		return this.anInt5641 * -452422487;
	}

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "(II)V", line = 33)
	public void method32447(@OriginalArg(0) int arg0) {
		this.anInt5641 = arg0 * 1751601049;
		if (this.anInt5641 * -452422487 < 0) {
			this.anInt5641 = 0;
		} else if (this.aBoolean840 && this.anInt5641 * -452422487 > 2000000000) {
			this.anInt5641 = 1404138496;
		} else if (!this.aBoolean840 && this.anInt5641 * -452422487 > 200000000) {
			this.anInt5641 = -289082880;
		}
		this.method32468();
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(I)V", line = 33)
	public void method32448(@OriginalArg(0) int arg0) {
		this.anInt5641 = arg0 * 1751601049;
		if (this.anInt5641 * -452422487 < 0) {
			this.anInt5641 = 0;
		} else if (this.aBoolean840 && this.anInt5641 * -452422487 > 2000000000) {
			this.anInt5641 = 1404138496;
		} else if (!this.aBoolean840 && this.anInt5641 * -452422487 > 200000000) {
			this.anInt5641 = -289082880;
		}
		this.method32468();
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)V", line = 33)
	public void method32449(@OriginalArg(0) int arg0) {
		this.anInt5641 = arg0 * 1751601049;
		if (this.anInt5641 * -452422487 < 0) {
			this.anInt5641 = 0;
		} else if (this.aBoolean840 && this.anInt5641 * -452422487 > 2000000000) {
			this.anInt5641 = 1404138496;
		} else if (!this.aBoolean840 && this.anInt5641 * -452422487 > 200000000) {
			this.anInt5641 = -289082880;
		}
		this.method32468();
	}

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "(I)V", line = 33)
	public void method32450(@OriginalArg(0) int arg0) {
		this.anInt5641 = arg0 * 1751601049;
		if (this.anInt5641 * -452422487 < 0) {
			this.anInt5641 = 0;
		} else if (this.aBoolean840 && this.anInt5641 * -452422487 > 2000000000) {
			this.anInt5641 = 1404138496;
		} else if (!this.aBoolean840 && this.anInt5641 * -452422487 > 200000000) {
			this.anInt5641 = -289082880;
		}
		this.method32468();
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(I)V", line = 33)
	public void method32451(@OriginalArg(0) int arg0) {
		this.anInt5641 = arg0 * 1751601049;
		if (this.anInt5641 * -452422487 < 0) {
			this.anInt5641 = 0;
		} else if (this.aBoolean840 && this.anInt5641 * -452422487 > 2000000000) {
			this.anInt5641 = 1404138496;
		} else if (!this.aBoolean840 && this.anInt5641 * -452422487 > 200000000) {
			this.anInt5641 = -289082880;
		}
		this.method32468();
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "(I)I", line = 41)
	public int method32452() {
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "()I", line = 41)
	public int method32453() {
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "()I", line = 41)
	public int method32454() {
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "()I", line = 41)
	public int method32455() {
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "(Lclient!yt;B)I", line = 45)
	public int method32456(@OriginalArg(0) Class676 arg0) {
		if (arg0 == Class676.aClass676_1 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32587();
			if (this.anInt5639 * 2029520991 > local17) {
				return local17;
			}
		}
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Lclient!yt;)I", line = 45)
	public int method32457(@OriginalArg(0) Class676 arg0) {
		if (arg0 == Class676.aClass676_1 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32587();
			if (this.anInt5639 * 2029520991 > local17) {
				return local17;
			}
		}
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "(Lclient!yt;)I", line = 45)
	public int method32458(@OriginalArg(0) Class676 arg0) {
		if (arg0 == Class676.aClass676_1 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32587();
			if (this.anInt5639 * 2029520991 > local17) {
				return local17;
			}
		}
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!yt;)I", line = 45)
	public int method32459(@OriginalArg(0) Class676 arg0) {
		if (arg0 == Class676.aClass676_1 && this.aClass630_1.method32583() && this.aClass630_1.method32590()) {
			@Pc(17) int local17 = this.aClass630_1.method32587();
			if (this.anInt5639 * 2029520991 > local17) {
				return local17;
			}
		}
		return this.anInt5639 * 2029520991;
	}

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "(I)I", line = 53)
	public int method32460() {
		return this.anInt5642 * -694250967;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "()I", line = 53)
	public int method32461() {
		return this.anInt5642 * -694250967;
	}

	@OriginalMember(owner = "client!wm", name = "aj", descriptor = "()I", line = 53)
	public int method32462() {
		return this.anInt5642 * -694250967;
	}

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "()I", line = 53)
	public int method32463() {
		return this.anInt5642 * -694250967;
	}

	@OriginalMember(owner = "client!wm", name = "al", descriptor = "(I)V", line = 57)
	public void method32464(@OriginalArg(0) int arg0) {
		this.anInt5642 = arg0 * 492907033;
	}

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "(II)V", line = 57)
	public void method32465(@OriginalArg(0) int arg0) {
		this.anInt5642 = arg0 * 492907033;
	}

	@OriginalMember(owner = "client!wm", name = "ag", descriptor = "(I)V", line = 57)
	public void method32466(@OriginalArg(0) int arg0) {
		this.anInt5642 = arg0 * 492907033;
	}

	@OriginalMember(owner = "client!wm", name = "ai", descriptor = "(I)V", line = 57)
	public void method32467(@OriginalArg(0) int arg0) {
		this.anInt5642 = arg0 * 492907033;
	}

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "(I)V", line = 61)
	void method32468() {
		if (this.aBoolean840) {
			this.anInt5639 = this.aClass630_1.method32597(this.anInt5641 * -452422487) * 105141151;
		} else {
			this.anInt5639 = this.aClass630_1.method32593(this.anInt5641 * -452422487) * 105141151;
		}
	}

	@OriginalMember(owner = "client!wm", name = "ak", descriptor = "()V", line = 61)
	void method32469() {
		if (this.aBoolean840) {
			this.anInt5639 = this.aClass630_1.method32597(this.anInt5641 * -452422487) * 105141151;
		} else {
			this.anInt5639 = this.aClass630_1.method32593(this.anInt5641 * -452422487) * 105141151;
		}
	}

	@OriginalMember(owner = "client!wm", name = "au", descriptor = "()V", line = 61)
	void method32470() {
		if (this.aBoolean840) {
			this.anInt5639 = this.aClass630_1.method32597(this.anInt5641 * -452422487) * 105141151;
		} else {
			this.anInt5639 = this.aClass630_1.method32593(this.anInt5641 * -452422487) * 105141151;
		}
	}

	@OriginalMember(owner = "client!wm", name = "ao", descriptor = "()V", line = 61)
	void method32471() {
		if (this.aBoolean840) {
			this.anInt5639 = this.aClass630_1.method32597(this.anInt5641 * -452422487) * 105141151;
		} else {
			this.anInt5639 = this.aClass630_1.method32593(this.anInt5641 * -452422487) * 105141151;
		}
	}

	@OriginalMember(owner = "client!wm", name = "ax", descriptor = "()V", line = 61)
	void method32472() {
		if (this.aBoolean840) {
			this.anInt5639 = this.aClass630_1.method32597(this.anInt5641 * -452422487) * 105141151;
		} else {
			this.anInt5639 = this.aClass630_1.method32593(this.anInt5641 * -452422487) * 105141151;
		}
	}

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "(II)V", line = 102)
	public static void method32473(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(4, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!wm", name = "aqh", descriptor = "(Lclient!yf;B)V", line = 12423)
	static final void method32474(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1.method15668() == 1 ? 1 : 0;
	}
}
