package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public class Class71 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public static final int anInt2764 = 1;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	public static final int anInt2765 = 2;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
	public static final int anInt2769 = 0;

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
	int anInt2763;

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
	int anInt2766;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "Lclient!rs;")
	Class440 aClass440_5;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
	int anInt2767;

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
	int anInt2768;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	int anInt2771;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Z")
	boolean aBoolean486 = false;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "Z")
	boolean aBoolean487 = false;

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
	int anInt2770 = 0;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Z")
	boolean aBoolean488 = false;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Lclient!wr;")
	final Class560 aClass560_10;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Lclient!wr;")
	final Class560 aClass560_9;

	@OriginalMember(owner = "client!wi", name = "ah", descriptor = "(Lclient!rn;)V", line = 26)
	public static void method20050(@OriginalArg(0) Class436 arg0) {
		Class350.aClass436_2 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "an", descriptor = "(Lclient!rn;)V", line = 26)
	public static void method20051(@OriginalArg(0) Class436 arg0) {
		Class350.aClass436_2 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "aj", descriptor = "(Lclient!rn;)V", line = 26)
	public static void method20052(@OriginalArg(0) Class436 arg0) {
		Class350.aClass436_2 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "as", descriptor = "(Lclient!rn;)V", line = 26)
	public static void method20053(@OriginalArg(0) Class436 arg0) {
		Class350.aClass436_2 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Z)V", line = 29)
	Class71(@OriginalArg(0) boolean arg0) {
		this.aBoolean487 = arg0;
		this.aClass560_10 = new Class560();
		if (this.aBoolean487) {
			this.aClass560_9 = new Class560();
		} else {
			this.aClass560_9 = null;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!wi;S)V", line = 37)
	public final void method20022(@OriginalArg(0) Class71 arg0) {
		this.aClass440_5 = arg0.aClass440_5;
		this.aBoolean486 = arg0.aBoolean486;
		this.aBoolean487 = arg0.aBoolean487;
		this.anInt2763 = arg0.anInt2763;
		this.anInt2771 = arg0.anInt2771;
		this.anInt2767 = arg0.anInt2767;
		this.anInt2768 = arg0.anInt2768;
		this.anInt2766 = arg0.anInt2766;
		this.method20036();
	}

	@OriginalMember(owner = "client!wi", name = "aq", descriptor = "(Lclient!wi;)V", line = 37)
	public final void method20055(@OriginalArg(0) Class71 arg0) {
		this.aClass440_5 = arg0.aClass440_5;
		this.aBoolean486 = arg0.aBoolean486;
		this.aBoolean487 = arg0.aBoolean487;
		this.anInt2763 = arg0.anInt2763;
		this.anInt2771 = arg0.anInt2771;
		this.anInt2767 = arg0.anInt2767;
		this.anInt2768 = arg0.anInt2768;
		this.anInt2766 = arg0.anInt2766;
		this.method20036();
	}

	@OriginalMember(owner = "client!wi", name = "ai", descriptor = "(Lclient!wi;)V", line = 37)
	public final void method20097(@OriginalArg(0) Class71 arg0) {
		this.aClass440_5 = arg0.aClass440_5;
		this.aBoolean486 = arg0.aBoolean486;
		this.aBoolean487 = arg0.aBoolean487;
		this.anInt2763 = arg0.anInt2763;
		this.anInt2771 = arg0.anInt2771;
		this.anInt2767 = arg0.anInt2767;
		this.anInt2768 = arg0.anInt2768;
		this.anInt2766 = arg0.anInt2766;
		this.method20036();
	}

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "(I)Z", line = 49)
	public final boolean method20021() {
		return this.aClass440_5 != null;
	}

	@OriginalMember(owner = "client!wi", name = "ax", descriptor = "()Z", line = 49)
	public final boolean method20057() {
		return this.aClass440_5 != null;
	}

	@OriginalMember(owner = "client!wi", name = "az", descriptor = "()Z", line = 49)
	public final boolean method20081() {
		return this.aClass440_5 != null;
	}

	@OriginalMember(owner = "client!wi", name = "av", descriptor = "()Z", line = 49)
	public final boolean method20102() {
		return this.aClass440_5 != null;
	}

	@OriginalMember(owner = "client!wi", name = "al", descriptor = "()Lclient!rs;", line = 53)
	public final Class440 method20059() {
		return this.aClass440_5;
	}

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "(I)Lclient!rs;", line = 53)
	public final Class440 method20069() {
		return this.aClass440_5;
	}

	@OriginalMember(owner = "client!wi", name = "h", descriptor = "(I)I", line = 57)
	public final int method20103() {
		return this.aClass440_5 == null ? -1 : this.aClass440_5.anInt4929 * 766773325;
	}

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "(II)V", line = 61)
	public final void method20038(@OriginalArg(0) int arg0) {
		this.method20030(arg0, 0, 0, false);
	}

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "(IIB)V", line = 65)
	public final void method20027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20030(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!wi", name = "ap", descriptor = "(II)V", line = 65)
	public final void method20044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20030(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!wi", name = "ao", descriptor = "(II)V", line = 65)
	public final void method20060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20030(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!wi", name = "ab", descriptor = "(II)V", line = 65)
	public final void method20075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method20030(arg0, arg1, 0, false);
	}

	@OriginalMember(owner = "client!wi", name = "au", descriptor = "(IZ)V", line = 69)
	public final void method20024(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method20030(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "(IZI)V", line = 69)
	public final void method20028(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method20030(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!wi", name = "ay", descriptor = "(IZ)V", line = 69)
	public final void method20064(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method20030(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!wi", name = "ag", descriptor = "(IZ)V", line = 69)
	public final void method20065(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.method20030(arg0, 0, 0, arg1);
	}

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "(IZZI)V", line = 73)
	public final void method20029(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method20026(arg0, 0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wi", name = "am", descriptor = "(IZZ)V", line = 73)
	public final void method20054(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method20026(arg0, 0, 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(IIIZI)V", line = 77)
	public final void method20030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method20026(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!wi", name = "ar", descriptor = "(IIIZ)V", line = 77)
	public final void method20067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.method20026(arg0, arg1, arg2, arg3, false);
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(IIIZZB)V", line = 81)
	final void method20026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method20103()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass440_5 = null;
		} else {
			if (this.aClass440_5 == null || this.aClass440_5.anInt4929 * 766773325 != arg0) {
				this.aClass440_5 = Class350.aClass436_2.method27999(arg0);
			} else if (this.aClass440_5.anInt4928 * -413041149 == 0) {
				return;
			}
			this.anInt2771 = 0;
			this.anInt2763 = arg1 * -890717311;
			this.anInt2770 = arg2 * -1570801697;
			this.aBoolean488 = arg4;
			if (arg3) {
				this.anInt2767 = (int) (Math.random() * (double) this.aClass440_5.anIntArray441.length) * -819548007;
				this.anInt2766 = (int) (Math.random() * (double) this.aClass440_5.anIntArray440[this.anInt2767 * 866427817]) * -137491617;
			} else {
				this.anInt2767 = 0;
				this.anInt2766 = 0;
			}
			this.anInt2768 = this.anInt2767 * 467407405 + 146001125;
			if (this.anInt2768 * 586748141 < 0 || this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
				this.anInt2768 = -146001125;
			}
			if (this.anInt2763 * 1904968833 == 0) {
				this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
			}
			this.aBoolean486 = false;
		}
		this.method20036();
	}

	@OriginalMember(owner = "client!wi", name = "ae", descriptor = "(IIIZZ)V", line = 81)
	final void method20037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == this.method20103()) {
			return;
		}
		if (arg0 == -1) {
			this.aClass440_5 = null;
		} else {
			if (this.aClass440_5 == null || this.aClass440_5.anInt4929 * 766773325 != arg0) {
				this.aClass440_5 = Class350.aClass436_2.method27999(arg0);
			} else if (this.aClass440_5.anInt4928 * -413041149 == 0) {
				return;
			}
			this.anInt2771 = 0;
			this.anInt2763 = arg1 * -890717311;
			this.anInt2770 = arg2 * -1570801697;
			this.aBoolean488 = arg4;
			if (arg3) {
				this.anInt2767 = (int) (Math.random() * (double) this.aClass440_5.anIntArray441.length) * -819548007;
				this.anInt2766 = (int) (Math.random() * (double) this.aClass440_5.anIntArray440[this.anInt2767 * 866427817]) * -137491617;
			} else {
				this.anInt2767 = 0;
				this.anInt2766 = 0;
			}
			this.anInt2768 = this.anInt2767 * 467407405 + 146001125;
			if (this.anInt2768 * 586748141 < 0 || this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
				this.anInt2768 = -146001125;
			}
			if (this.anInt2763 * 1904968833 == 0) {
				this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
			}
			this.aBoolean486 = false;
		}
		this.method20036();
	}

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "(I)Z", line = 110)
	public final boolean method20032() {
		return this.anInt2763 * 1904968833 != 0;
	}

	@OriginalMember(owner = "client!wi", name = "ad", descriptor = "()Z", line = 110)
	public final boolean method20056() {
		return this.anInt2763 * 1904968833 != 0;
	}

	@OriginalMember(owner = "client!wi", name = "aw", descriptor = "()Z", line = 110)
	public final boolean method20062() {
		return this.anInt2763 * 1904968833 != 0;
	}

	@OriginalMember(owner = "client!wi", name = "ac", descriptor = "()Z", line = 110)
	public final boolean method20071() {
		return this.anInt2763 * 1904968833 != 0;
	}

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "(I)I", line = 114)
	public final int method20033() {
		return this.anInt2763 * 1904968833;
	}

	@OriginalMember(owner = "client!wi", name = "bw", descriptor = "()I", line = 114)
	public final int method20072() {
		return this.anInt2763 * 1904968833;
	}

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "(II)V", line = 118)
	public final void method20025(@OriginalArg(0) int arg0) {
		this.anInt2763 = arg0 * -890717311;
	}

	@OriginalMember(owner = "client!wi", name = "bp", descriptor = "(I)V", line = 118)
	public final void method20031(@OriginalArg(0) int arg0) {
		this.anInt2763 = arg0 * -890717311;
	}

	@OriginalMember(owner = "client!wi", name = "bd", descriptor = "(I)V", line = 118)
	public final void method20074(@OriginalArg(0) int arg0) {
		this.anInt2763 = arg0 * -890717311;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(S)I", line = 122)
	public final int method20035() {
		if (!this.method20046()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method20046()) {
			local5 |= this.aClass560_10.anInt5357 * -1558537725;
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
				local5 |= this.aClass560_9.anInt5357 * -1558537725;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wi", name = "bm", descriptor = "()I", line = 122)
	public final int method20076() {
		if (!this.method20046()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method20046()) {
			local5 |= this.aClass560_10.anInt5357 * -1558537725;
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
				local5 |= this.aClass560_9.anInt5357 * -1558537725;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wi", name = "bs", descriptor = "()I", line = 122)
	public final int method20096() {
		if (!this.method20046()) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		if (this.method20046()) {
			local5 |= this.aClass560_10.anInt5357 * -1558537725;
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
				local5 |= this.aClass560_9.anInt5357 * -1558537725;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!wi", name = "bf", descriptor = "(Lclient!dh;I)V", line = 134)
	public final void method20063(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass440_5 != null && (this.aClass440_5.anIntArray441 != null && this.method20046())) {
			arg0.method5340(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547, this.aClass560_10.aClass3_Sub1_Sub17_2, this.aClass560_10.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, this.aClass440_5.aBoolean764);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5340(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547, this.aClass560_9.aClass3_Sub1_Sub17_2, this.aClass560_9.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, this.aClass440_5.aBoolean764);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "(Lclient!dh;IB)V", line = 134)
	public final void method20066(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass440_5 != null && (this.aClass440_5.anIntArray441 != null && this.method20046())) {
			arg0.method5340(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547, this.aClass560_10.aClass3_Sub1_Sub17_2, this.aClass560_10.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, this.aClass440_5.aBoolean764);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5340(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547, this.aClass560_9.aClass3_Sub1_Sub17_2, this.aClass560_9.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, this.aClass440_5.aBoolean764);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "bt", descriptor = "(Lclient!dh;I)V", line = 134)
	public final void method20078(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass440_5 != null && (this.aClass440_5.anIntArray441 != null && this.method20046())) {
			arg0.method5340(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547, this.aClass560_10.aClass3_Sub1_Sub17_2, this.aClass560_10.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, this.aClass440_5.aBoolean764);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5340(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547, this.aClass560_9.aClass3_Sub1_Sub17_2, this.aClass560_9.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, this.aClass440_5.aBoolean764);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(Lclient!dh;III)V", line = 144)
	public final void method20061(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass440_5.anIntArray441 != null && this.method20046()) {
			arg0.method5491(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547, this.aClass560_10.aClass3_Sub1_Sub17_2, this.aClass560_10.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, arg2, this.aClass440_5.aBoolean764, null);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5491(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547, this.aClass560_9.aClass3_Sub1_Sub17_2, this.aClass560_9.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, arg2, this.aClass440_5.aBoolean764, null);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "bk", descriptor = "(Lclient!dh;II)V", line = 144)
	public final void method20079(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass440_5.anIntArray441 != null && this.method20046()) {
			arg0.method5491(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547, this.aClass560_10.aClass3_Sub1_Sub17_2, this.aClass560_10.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, arg2, this.aClass440_5.aBoolean764, null);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5491(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547, this.aClass560_9.aClass3_Sub1_Sub17_2, this.aClass560_9.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, arg2, this.aClass440_5.aBoolean764, null);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "bg", descriptor = "(Lclient!dh;II)V", line = 144)
	public final void method20080(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass440_5.anIntArray441 != null && this.method20046()) {
			arg0.method5491(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547, this.aClass560_10.aClass3_Sub1_Sub17_2, this.aClass560_10.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, arg2, this.aClass440_5.aBoolean764, null);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5491(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547, this.aClass560_9.aClass3_Sub1_Sub17_2, this.aClass560_9.anInt5358 * 960599807, this.anInt2766 * -867233633, this.aClass440_5.anIntArray440[this.anInt2767 * 866427817], arg1, arg2, this.aClass440_5.aBoolean764, null);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "br", descriptor = "(Lclient!dh;)V", line = 153)
	public final void method20070(@OriginalArg(0) Class20 arg0) {
		if (this.aClass440_5.anIntArray441 != null && this.method20046()) {
			arg0.method5492(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5492(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "(Lclient!dh;B)V", line = 153)
	public final void method20077(@OriginalArg(0) Class20 arg0) {
		if (this.aClass440_5.anIntArray441 != null && this.method20046()) {
			arg0.method5492(this.aClass560_10.aClass3_Sub1_Sub17_1, this.aClass560_10.anInt5359 * -1862388547);
			if (this.aBoolean487 && this.aClass440_5.anIntArray442 != null && this.aClass560_9.aBoolean824) {
				arg0.method5492(this.aClass560_9.aClass3_Sub1_Sub17_1, this.aClass560_9.anInt5359 * -1862388547);
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "bb", descriptor = "(Lclient!dh;Lclient!wi;Lclient!wi;)V", line = 162)
	public static final void method20082(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		if (arg1.method20046() && arg2.method20046()) {
			@Pc(10) Class440 local10 = arg1.aClass440_5;
			@Pc(13) Class440 local13 = arg2.aClass440_5;
			arg0.method5342(arg1.aClass560_10.aClass3_Sub1_Sub17_1, arg1.aClass560_10.anInt5359 * -1862388547, arg1.aClass560_10.aClass3_Sub1_Sub17_2, arg1.aClass560_10.anInt5358 * 960599807, arg1.anInt2766 * -867233633, local10.anIntArray440[arg1.anInt2767 * 866427817], arg2.aClass560_10.aClass3_Sub1_Sub17_1, arg2.aClass560_10.anInt5359 * -1862388547, arg2.aClass560_10.aClass3_Sub1_Sub17_2, arg2.aClass560_10.anInt5358 * 960599807, arg2.anInt2766 * -867233633, local13.anIntArray440[arg2.anInt2767 * 866427817], local10.aClass427_1 == null ? null : local10.aClass427_1.aBooleanArray31, local10.aBoolean764 | local13.aBoolean764);
		}
	}

	@OriginalMember(owner = "client!wi", name = "by", descriptor = "(Lclient!dh;Lclient!wi;Lclient!wi;)V", line = 162)
	public static final void method20083(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		if (arg1.method20046() && arg2.method20046()) {
			@Pc(10) Class440 local10 = arg1.aClass440_5;
			@Pc(13) Class440 local13 = arg2.aClass440_5;
			arg0.method5342(arg1.aClass560_10.aClass3_Sub1_Sub17_1, arg1.aClass560_10.anInt5359 * -1862388547, arg1.aClass560_10.aClass3_Sub1_Sub17_2, arg1.aClass560_10.anInt5358 * 960599807, arg1.anInt2766 * -867233633, local10.anIntArray440[arg1.anInt2767 * 866427817], arg2.aClass560_10.aClass3_Sub1_Sub17_1, arg2.aClass560_10.anInt5359 * -1862388547, arg2.aClass560_10.aClass3_Sub1_Sub17_2, arg2.aClass560_10.anInt5358 * 960599807, arg2.anInt2766 * -867233633, local13.anIntArray440[arg2.anInt2767 * 866427817], local10.aClass427_1 == null ? null : local10.aClass427_1.aBooleanArray31, local10.aBoolean764 | local13.aBoolean764);
		}
	}

	@OriginalMember(owner = "client!wi", name = "bl", descriptor = "(Lclient!dh;Lclient!wi;Lclient!wi;)V", line = 162)
	public static final void method20084(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		if (arg1.method20046() && arg2.method20046()) {
			@Pc(10) Class440 local10 = arg1.aClass440_5;
			@Pc(13) Class440 local13 = arg2.aClass440_5;
			arg0.method5342(arg1.aClass560_10.aClass3_Sub1_Sub17_1, arg1.aClass560_10.anInt5359 * -1862388547, arg1.aClass560_10.aClass3_Sub1_Sub17_2, arg1.aClass560_10.anInt5358 * 960599807, arg1.anInt2766 * -867233633, local10.anIntArray440[arg1.anInt2767 * 866427817], arg2.aClass560_10.aClass3_Sub1_Sub17_1, arg2.aClass560_10.anInt5359 * -1862388547, arg2.aClass560_10.aClass3_Sub1_Sub17_2, arg2.aClass560_10.anInt5358 * 960599807, arg2.anInt2766 * -867233633, local13.anIntArray440[arg2.anInt2767 * 866427817], local10.aClass427_1 == null ? null : local10.aClass427_1.aBooleanArray31, local10.aBoolean764 | local13.aBoolean764);
		}
	}

	@OriginalMember(owner = "client!wi", name = "bi", descriptor = "(Lclient!dh;Lclient!wi;Lclient!wi;)V", line = 162)
	public static final void method20085(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2) {
		if (arg1.method20046() && arg2.method20046()) {
			@Pc(10) Class440 local10 = arg1.aClass440_5;
			@Pc(13) Class440 local13 = arg2.aClass440_5;
			arg0.method5342(arg1.aClass560_10.aClass3_Sub1_Sub17_1, arg1.aClass560_10.anInt5359 * -1862388547, arg1.aClass560_10.aClass3_Sub1_Sub17_2, arg1.aClass560_10.anInt5358 * 960599807, arg1.anInt2766 * -867233633, local10.anIntArray440[arg1.anInt2767 * 866427817], arg2.aClass560_10.aClass3_Sub1_Sub17_1, arg2.aClass560_10.anInt5359 * -1862388547, arg2.aClass560_10.aClass3_Sub1_Sub17_2, arg2.aClass560_10.anInt5358 * 960599807, arg2.anInt2766 * -867233633, local13.anIntArray440[arg2.anInt2767 * 866427817], local10.aClass427_1 == null ? null : local10.aClass427_1.aBooleanArray31, local10.aBoolean764 | local13.aBoolean764);
		}
	}

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "(B)Z", line = 170)
	public final boolean method20039() {
		return this.aBoolean486;
	}

	@OriginalMember(owner = "client!wi", name = "bu", descriptor = "()Z", line = 170)
	public final boolean method20086() {
		return this.aBoolean486;
	}

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "(I)V", line = 174)
	public final void method20040() {
		this.anInt2771 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "ba", descriptor = "()V", line = 174)
	public final void method20047() {
		this.anInt2771 = 0;
	}

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "(I)V", line = 178)
	public final void method20041() {
		this.method20023(0);
	}

	@OriginalMember(owner = "client!wi", name = "bo", descriptor = "()V", line = 178)
	public final void method20088() {
		this.method20023(0);
	}

	@OriginalMember(owner = "client!wi", name = "bc", descriptor = "()V", line = 178)
	public final void method20089() {
		this.method20023(0);
	}

	@OriginalMember(owner = "client!wi", name = "bn", descriptor = "()V", line = 178)
	public final void method20099() {
		this.method20023(0);
	}

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "(IB)V", line = 182)
	public final void method20023(@OriginalArg(0) int arg0) {
		this.anInt2767 = 0;
		this.anInt2768 = (this.aClass440_5.anIntArray441.length > 1 ? 1 : -1) * 146001125;
		this.anInt2766 = 0;
		this.aBoolean486 = false;
		this.anInt2763 = arg0 * -890717311;
		this.anInt2771 = 0;
		if (this.aClass440_5 != null & this.aClass440_5.anIntArray441 != null) {
			this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
			this.method20036();
		}
	}

	@OriginalMember(owner = "client!wi", name = "be", descriptor = "(I)V", line = 182)
	public final void method20091(@OriginalArg(0) int arg0) {
		this.anInt2767 = 0;
		this.anInt2768 = (this.aClass440_5.anIntArray441.length > 1 ? 1 : -1) * 146001125;
		this.anInt2766 = 0;
		this.aBoolean486 = false;
		this.anInt2763 = arg0 * -890717311;
		this.anInt2771 = 0;
		if (this.aClass440_5 != null & this.aClass440_5.anIntArray441 != null) {
			this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
			this.method20036();
		}
	}

	@OriginalMember(owner = "client!wi", name = "bx", descriptor = "(I)V", line = 182)
	public final void method20092(@OriginalArg(0) int arg0) {
		this.anInt2767 = 0;
		this.anInt2768 = (this.aClass440_5.anIntArray441.length > 1 ? 1 : -1) * 146001125;
		this.anInt2766 = 0;
		this.aBoolean486 = false;
		this.anInt2763 = arg0 * -890717311;
		this.anInt2771 = 0;
		if (this.aClass440_5 != null & this.aClass440_5.anIntArray441 != null) {
			this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
			this.method20036();
		}
	}

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "(II)Z", line = 195)
	public final boolean method20042(@OriginalArg(0) int arg0) {
		if (this.aClass440_5 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt2763 * 1904968833 > 0) {
			if (this.anInt2763 * 1904968833 > arg0) {
				this.anInt2763 -= arg0 * -890717311;
				return false;
			}
			arg0 -= this.anInt2763 * 1904968833;
			this.anInt2763 = 0;
			this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
		}
		arg0 += this.anInt2766 * -867233633;
		@Pc(60) boolean local60 = this.aClass440_5.aBoolean766 | Class440.aBoolean765;
		if (arg0 > 100 && this.aClass440_5.anInt4930 * -1953059397 > 0) {
			@Pc(80) int local80 = this.aClass440_5.anIntArray441.length - this.aClass440_5.anInt4930 * -1953059397;
			while (this.anInt2767 * 866427817 < local80 && arg0 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817]) {
				arg0 -= this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
				this.anInt2767 += -819548007;
			}
			if (this.anInt2767 * 866427817 >= local80) {
				@Pc(122) int local122 = 0;
				for (@Pc(124) int local124 = local80; local124 < this.aClass440_5.anIntArray441.length; local124++) {
					local122 += this.aClass440_5.anIntArray440[local124];
				}
				if (this.anInt2770 * 2106524703 == 0) {
					this.anInt2771 += arg0 / local122 * 587838213;
				}
				arg0 %= local122;
			}
			this.anInt2768 = this.anInt2767 * 467407405 + 146001125;
			if (this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
				if (-1953059397 * this.aClass440_5.anInt4930 == -1 && this.aBoolean488) {
					this.anInt2768 = 0;
				} else {
					this.anInt2768 -= this.aClass440_5.anInt4930 * 1106996295;
				}
				if (this.anInt2768 * 586748141 < 0 || this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
					this.anInt2768 = -146001125;
				}
			}
			local60 = true;
		}
		while (arg0 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817]) {
			local60 = true;
			arg0 -= this.aClass440_5.anIntArray440[(this.anInt2767 += -819548007) * 866427817 - 1];
			if (this.anInt2767 * 866427817 >= this.aClass440_5.anIntArray441.length) {
				if (this.aClass440_5.anInt4930 * -1953059397 != -1 && this.anInt2770 * 2106524703 != 2) {
					this.anInt2767 -= this.aClass440_5.anInt4930 * 54551747;
					if (this.anInt2770 * 2106524703 == 0) {
						this.anInt2771 += 587838213;
					}
				}
				if (this.anInt2771 * 84419021 >= this.aClass440_5.anInt4934 * 4875409 || this.anInt2767 * 866427817 < 0 || this.anInt2767 * 866427817 >= this.aClass440_5.anIntArray441.length) {
					this.aBoolean486 = true;
					break;
				}
			}
			this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
			this.anInt2768 = this.anInt2767 * 467407405 + 146001125;
			if (this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
				if (-1953059397 * this.aClass440_5.anInt4930 == -1 && this.aBoolean488) {
					this.anInt2768 = 0;
				} else {
					this.anInt2768 -= this.aClass440_5.anInt4930 * 1106996295;
				}
				if (this.anInt2768 * 586748141 < 0 || this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
					this.anInt2768 = -146001125;
				}
			}
		}
		this.anInt2766 = arg0 * -137491617;
		if (local60) {
			this.method20036();
		}
		return local60;
	}

	@OriginalMember(owner = "client!wi", name = "bh", descriptor = "(I)Z", line = 195)
	public final boolean method20093(@OriginalArg(0) int arg0) {
		if (this.aClass440_5 == null || arg0 == 0) {
			return false;
		}
		if (this.anInt2763 * 1904968833 > 0) {
			if (this.anInt2763 * 1904968833 > arg0) {
				this.anInt2763 -= arg0 * -890717311;
				return false;
			}
			arg0 -= this.anInt2763 * 1904968833;
			this.anInt2763 = 0;
			this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
		}
		arg0 += this.anInt2766 * -867233633;
		@Pc(60) boolean local60 = this.aClass440_5.aBoolean766 | Class440.aBoolean765;
		if (arg0 > 100 && this.aClass440_5.anInt4930 * -1953059397 > 0) {
			@Pc(80) int local80 = this.aClass440_5.anIntArray441.length - this.aClass440_5.anInt4930 * -1953059397;
			while (this.anInt2767 * 866427817 < local80 && arg0 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817]) {
				arg0 -= this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
				this.anInt2767 += -819548007;
			}
			if (this.anInt2767 * 866427817 >= local80) {
				@Pc(122) int local122 = 0;
				for (@Pc(124) int local124 = local80; local124 < this.aClass440_5.anIntArray441.length; local124++) {
					local122 += this.aClass440_5.anIntArray440[local124];
				}
				if (this.anInt2770 * 2106524703 == 0) {
					this.anInt2771 += arg0 / local122 * 587838213;
				}
				arg0 %= local122;
			}
			this.anInt2768 = this.anInt2767 * 467407405 + 146001125;
			if (this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
				if (-1953059397 * this.aClass440_5.anInt4930 == -1 && this.aBoolean488) {
					this.anInt2768 = 0;
				} else {
					this.anInt2768 -= this.aClass440_5.anInt4930 * 1106996295;
				}
				if (this.anInt2768 * 586748141 < 0 || this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
					this.anInt2768 = -146001125;
				}
			}
			local60 = true;
		}
		while (arg0 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817]) {
			local60 = true;
			arg0 -= this.aClass440_5.anIntArray440[(this.anInt2767 += -819548007) * 866427817 - 1];
			if (this.anInt2767 * 866427817 >= this.aClass440_5.anIntArray441.length) {
				if (this.aClass440_5.anInt4930 * -1953059397 != -1 && this.anInt2770 * 2106524703 != 2) {
					this.anInt2767 -= this.aClass440_5.anInt4930 * 54551747;
					if (this.anInt2770 * 2106524703 == 0) {
						this.anInt2771 += 587838213;
					}
				}
				if (this.anInt2771 * 84419021 >= this.aClass440_5.anInt4934 * 4875409 || this.anInt2767 * 866427817 < 0 || this.anInt2767 * 866427817 >= this.aClass440_5.anIntArray441.length) {
					this.aBoolean486 = true;
					break;
				}
			}
			this.method20045(this.aClass440_5, this.anInt2767 * 866427817);
			this.anInt2768 = this.anInt2767 * 467407405 + 146001125;
			if (this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
				if (-1953059397 * this.aClass440_5.anInt4930 == -1 && this.aBoolean488) {
					this.anInt2768 = 0;
				} else {
					this.anInt2768 -= this.aClass440_5.anInt4930 * 1106996295;
				}
				if (this.anInt2768 * 586748141 < 0 || this.anInt2768 * 586748141 >= this.aClass440_5.anIntArray441.length) {
					this.anInt2768 = -146001125;
				}
			}
		}
		this.anInt2766 = arg0 * -137491617;
		if (local60) {
			this.method20036();
		}
		return local60;
	}

	@OriginalMember(owner = "client!wi", name = "bq", descriptor = "(I)Z", line = 254)
	public final boolean method20034(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass440_5 == null | (local13 = arg0 - this.anInt2763 * 1904968833) <= 0 ? false : this.aClass440_5.aBoolean766 | this.anInt2766 * -867233633 + local13 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
	}

	@OriginalMember(owner = "client!wi", name = "bz", descriptor = "(I)Z", line = 254)
	public final boolean method20043(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass440_5 == null | (local13 = arg0 - this.anInt2763 * 1904968833) <= 0 ? false : this.aClass440_5.aBoolean766 | this.anInt2766 * -867233633 + local13 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
	}

	@OriginalMember(owner = "client!wi", name = "ck", descriptor = "(I)Z", line = 254)
	public final boolean method20058(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass440_5 == null | (local13 = arg0 - this.anInt2763 * 1904968833) <= 0 ? false : this.aClass440_5.aBoolean766 | this.anInt2766 * -867233633 + local13 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "(II)Z", line = 254)
	public final boolean method20090(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass440_5 == null | (local13 = arg0 - this.anInt2763 * 1904968833) <= 0 ? false : this.aClass440_5.aBoolean766 | this.anInt2766 * -867233633 + local13 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
	}

	@OriginalMember(owner = "client!wi", name = "bj", descriptor = "(I)Z", line = 254)
	public final boolean method20094(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass440_5 == null | (local13 = arg0 - this.anInt2763 * 1904968833) <= 0 ? false : this.aClass440_5.aBoolean766 | this.anInt2766 * -867233633 + local13 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
	}

	@OriginalMember(owner = "client!wi", name = "bv", descriptor = "(I)Z", line = 254)
	public final boolean method20095(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass440_5 == null | (local13 = arg0 - this.anInt2763 * 1904968833) <= 0 ? false : this.aClass440_5.aBoolean766 | this.anInt2766 * -867233633 + local13 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
	}

	@OriginalMember(owner = "client!wi", name = "cm", descriptor = "(I)Z", line = 254)
	public final boolean method20098(@OriginalArg(0) int arg0) {
		@Pc(13) int local13;
		return this.aClass440_5 == null | (local13 = arg0 - this.anInt2763 * 1904968833) <= 0 ? false : this.aClass440_5.aBoolean766 | this.anInt2766 * -867233633 + local13 > this.aClass440_5.anIntArray440[this.anInt2767 * 866427817];
	}

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "(Lclient!rs;II)V", line = 258)
	void method20045(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wi", name = "ak", descriptor = "(Lclient!rs;I)V", line = 258)
	void method20048(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wi", name = "aa", descriptor = "(Lclient!rs;I)V", line = 258)
	void method20049(@OriginalArg(0) Class440 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wi", name = "at", descriptor = "(B)Z", line = 261)
	final boolean method20046() {
		if (this.aClass440_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass560_10.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray441);
		if (local22 && this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
			this.aClass560_9.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray442);
		}
		return local22;
	}

	@OriginalMember(owner = "client!wi", name = "cl", descriptor = "()Z", line = 261)
	final boolean method20073() {
		if (this.aClass440_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass560_10.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray441);
		if (local22 && this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
			this.aClass560_9.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray442);
		}
		return local22;
	}

	@OriginalMember(owner = "client!wi", name = "cj", descriptor = "()Z", line = 261)
	final boolean method20087() {
		if (this.aClass440_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass560_10.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray441);
		if (local22 && this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
			this.aClass560_9.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray442);
		}
		return local22;
	}

	@OriginalMember(owner = "client!wi", name = "cu", descriptor = "()Z", line = 261)
	final boolean method20100() {
		if (this.aClass440_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass560_10.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray441);
		if (local22 && this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
			this.aClass560_9.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray442);
		}
		return local22;
	}

	@OriginalMember(owner = "client!wi", name = "cv", descriptor = "()Z", line = 261)
	final boolean method20101() {
		if (this.aClass440_5 == null) {
			return false;
		}
		@Pc(22) boolean local22 = this.aClass560_10.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray441);
		if (local22 && this.aBoolean487 && this.aClass440_5.anIntArray442 != null) {
			this.aClass560_9.method32843(Class350.aClass436_2, this.aClass440_5, this.anInt2767 * 866427817, this.anInt2768 * 586748141, this.aClass440_5.anIntArray442);
		}
		return local22;
	}

	@OriginalMember(owner = "client!wi", name = "af", descriptor = "(I)V", line = 270)
	final void method20036() {
		this.aClass560_10.method32844();
		if (this.aBoolean487) {
			this.aClass560_9.method32844();
		}
	}

	@OriginalMember(owner = "client!wi", name = "cq", descriptor = "()V", line = 270)
	final void method20068() {
		this.aClass560_10.method32844();
		if (this.aBoolean487) {
			this.aClass560_9.method32844();
		}
	}
}
