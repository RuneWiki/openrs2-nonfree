package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public class Class523 {

	@OriginalMember(owner = "client!r", name = "rm", descriptor = "I")
	static int anInt5225;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public int anInt5223;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	int anInt5224;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIB)Z", line = 10)
	public boolean method30362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5224 * 861434827;
		if (this.anInt5223 * -1093332503 == arg0 && this.anInt5224 * 861434827 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(85) int local85;
		if (this.anInt5224 * 861434827 == 0) {
			if (arg0 > this.anInt5223 * -1093332503 && arg0 <= arg1 + this.anInt5223 * -1093332503 || arg0 < this.anInt5223 * -1093332503 && arg0 >= this.anInt5223 * -1093332503 - arg1) {
				this.anInt5223 = arg0 * 1188353625;
				return false;
			}
			local59 = true;
		} else {
			@Pc(92) int local92;
			if (this.anInt5224 * 861434827 > 0 && arg0 > this.anInt5223 * -1093332503) {
				local85 = this.anInt5224 * 861434827 * 861434827 * this.anInt5224 / (arg1 * 2);
				local92 = local85 + this.anInt5223 * -1093332503;
				if (local92 < arg0 && local92 >= this.anInt5223 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt5224 * 861434827 < 0 && arg0 < this.anInt5223 * -1093332503) {
				local85 = this.anInt5224 * 861434827 * 861434827 * this.anInt5224 / (arg1 * 2);
				local92 = this.anInt5223 * -1093332503 - local85;
				if (local92 > arg0 && local92 <= this.anInt5223 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (arg0 > this.anInt5223 * -1093332503) {
				this.anInt5224 += arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5224 * 861434827 > arg2) {
					this.anInt5224 = arg2 * 1484233187;
				}
			} else {
				this.anInt5224 -= arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5224 * 861434827 < -arg2) {
					this.anInt5224 = -arg2 * 1484233187;
				}
			}
			if (local4 != this.anInt5224 * 861434827) {
				local85 = this.anInt5224 * 861434827 * 861434827 * this.anInt5224 / (arg1 * 2);
				if (arg0 > this.anInt5223 * -1093332503) {
					if (this.anInt5223 * -1093332503 + local85 > arg0) {
						this.anInt5224 = local4 * 1484233187;
					}
				} else if (arg0 < this.anInt5223 * -1093332503 && this.anInt5223 * -1093332503 - local85 < arg0) {
					this.anInt5224 = local4 * 1484233187;
				}
			}
		} else if (this.anInt5224 * 861434827 > 0) {
			this.anInt5224 -= arg1 * 1484233187;
			if (this.anInt5224 * 861434827 < 0) {
				this.anInt5224 = 0;
			}
		} else {
			this.anInt5224 += arg1 * 1484233187;
			if (this.anInt5224 * 861434827 > 0) {
				this.anInt5224 = 0;
			}
		}
		this.anInt5223 += (this.anInt5224 * 861434827 + local4 >> 1) * 1188353625;
		return local59;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(III)Z", line = 10)
	public boolean method30365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5224 * 861434827;
		if (this.anInt5223 * -1093332503 == arg0 && this.anInt5224 * 861434827 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(85) int local85;
		if (this.anInt5224 * 861434827 == 0) {
			if (arg0 > this.anInt5223 * -1093332503 && arg0 <= arg1 + this.anInt5223 * -1093332503 || arg0 < this.anInt5223 * -1093332503 && arg0 >= this.anInt5223 * -1093332503 - arg1) {
				this.anInt5223 = arg0 * 1188353625;
				return false;
			}
			local59 = true;
		} else {
			@Pc(92) int local92;
			if (this.anInt5224 * 861434827 > 0 && arg0 > this.anInt5223 * -1093332503) {
				local85 = this.anInt5224 * 861434827 * 861434827 * this.anInt5224 / (arg1 * 2);
				local92 = local85 + this.anInt5223 * -1093332503;
				if (local92 < arg0 && local92 >= this.anInt5223 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt5224 * 861434827 < 0 && arg0 < this.anInt5223 * -1093332503) {
				local85 = this.anInt5224 * 861434827 * 861434827 * this.anInt5224 / (arg1 * 2);
				local92 = this.anInt5223 * -1093332503 - local85;
				if (local92 > arg0 && local92 <= this.anInt5223 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (arg0 > this.anInt5223 * -1093332503) {
				this.anInt5224 += arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5224 * 861434827 > arg2) {
					this.anInt5224 = arg2 * 1484233187;
				}
			} else {
				this.anInt5224 -= arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5224 * 861434827 < -arg2) {
					this.anInt5224 = -arg2 * 1484233187;
				}
			}
			if (local4 != this.anInt5224 * 861434827) {
				local85 = this.anInt5224 * 861434827 * 861434827 * this.anInt5224 / (arg1 * 2);
				if (arg0 > this.anInt5223 * -1093332503) {
					if (this.anInt5223 * -1093332503 + local85 > arg0) {
						this.anInt5224 = local4 * 1484233187;
					}
				} else if (arg0 < this.anInt5223 * -1093332503 && this.anInt5223 * -1093332503 - local85 < arg0) {
					this.anInt5224 = local4 * 1484233187;
				}
			}
		} else if (this.anInt5224 * 861434827 > 0) {
			this.anInt5224 -= arg1 * 1484233187;
			if (this.anInt5224 * 861434827 < 0) {
				this.anInt5224 = 0;
			}
		} else {
			this.anInt5224 += arg1 * 1484233187;
			if (this.anInt5224 * 861434827 > 0) {
				this.anInt5224 = 0;
			}
		}
		this.anInt5223 += (this.anInt5224 * 861434827 + local4 >> 1) * 1188353625;
		return local59;
	}

	@OriginalMember(owner = "client!r", name = "n", descriptor = "(IB)V", line = 67)
	public void method30361(@OriginalArg(0) int arg0) {
		this.anInt5223 = arg0 * 1188353625;
		this.anInt5224 = 0;
	}

	@OriginalMember(owner = "client!r", name = "w", descriptor = "(I)V", line = 67)
	public void method30366(@OriginalArg(0) int arg0) {
		this.anInt5223 = arg0 * 1188353625;
		this.anInt5224 = 0;
	}

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)I", line = 72)
	public int method30363() {
		return this.anInt5223 * -1093332503 & 0x3FFF;
	}

	@OriginalMember(owner = "client!r", name = "k", descriptor = "(I)V", line = 76)
	public void method30364() {
		this.anInt5223 = (this.anInt5223 * -1093332503 & 0x3FFF) * 1188353625;
	}

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()V", line = 76)
	public void method30367() {
		this.anInt5223 = (this.anInt5223 * -1093332503 & 0x3FFF) * 1188353625;
	}

	@OriginalMember(owner = "client!r", name = "v", descriptor = "(I)I", line = 206)
	public static int method30368() {
		return Class166_Sub13.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!r", name = "fq", descriptor = "(I)V", line = 2594)
	static final void method30370() {
		Class682.aClass32_Sub1_3.method17808(5);
		Class692.aClass32_Sub4_3.method17808(5);
		Class343.aClass32_Sub19_1.method17808(5);
		client.aClass532_1.method30466().method17808(5);
		Class162.aClass32_Sub3_2.method17808(5);
		Class277.aClass32_Sub12_1.method17808(5);
		Class32.aClass32_Sub17_23.method17808(5);
		Class501.aClass32_Sub18_1.method17808(5);
		Class30.aClass32_Sub16_1.method17808(5);
		Class21.aClass79_Sub1_Sub1_1.method1423(5);
		Class684.aClass79_Sub1_Sub2_6.method1482(5);
		Class39.aClass79_Sub1_Sub2_1.method1482(5);
		Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3.method1482(5);
		Class429.aClass79_Sub1_Sub2_5.method1482(5);
		Class265.aClass79_Sub1_Sub2_4.method1482(5);
		Class166_Sub6.aClass32_Sub5_1.method17808(5);
		Class542.aClass32_Sub2_3.method17808(5);
		Class466.aClass32_Sub20_3.method17808(5);
		Class124.aClass32_Sub21_7.method17808(5);
		Class123.aClass32_Sub11_2.method17808(5);
		Class51.aClass32_Sub9_1.method17808(5);
		Class668.aClass32_Sub15_1.method17808(5);
		Class311.aClass32_Sub6_1.method17808(5);
		Class366.aClass32_Sub8_1.method17808(5);
		Class534.aClass32_Sub10_1.method17808(5);
		Class673.method33089(5);
		Class558.method31108(50);
		Class157.aClass462_2.method29244(50);
		Class656.method32747(5);
		Class613.method32065(5);
		client.aClass240_66.method25832(5);
		client.aClass240_69.method25832(5);
		Class687.aClass240_96.method25832(5);
		client.aClass240_70.method25832(5);
		Class74.aClass32_1.method17808(5);
		Class276.aClass32_2.method17808(5);
		client.aClass240_67.method25832(5);
	}

	@OriginalMember(owner = "client!r", name = "pn", descriptor = "(Lclient!yf;I)V", line = 7769)
	static final void method30369(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class601.method31850(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!r", name = "azu", descriptor = "(Lclient!yf;I)V", line = 14145)
	static final void method30371(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub17_1.method15711() ? 1 : 0;
	}
}
