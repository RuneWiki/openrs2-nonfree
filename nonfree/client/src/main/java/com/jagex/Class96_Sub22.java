package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agd")
public class Class96_Sub22 extends Class96 {

	@OriginalMember(owner = "client!agd", name = "c", descriptor = "I")
	final int anInt950;

	@OriginalMember(owner = "client!agd", name = "v", descriptor = "I")
	final int anInt949;

	@OriginalMember(owner = "client!agd", name = "l", descriptor = "I")
	final int anInt951;

	@OriginalMember(owner = "client!agd", name = "y", descriptor = "I")
	final int anInt948;

	@OriginalMember(owner = "client!agd", name = "w", descriptor = "Lclient!qs;")
	Class496 aClass496_2;

	@OriginalMember(owner = "client!agd", name = "<init>", descriptor = "(Lclient!akv;)V", line = 18)
	Class96_Sub22(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt950 = arg0.method22483() * -111950207;
		this.anInt949 = arg0.method22478() * 664955521;
		this.anInt951 = arg0.method22478() * 1948837843;
		this.anInt948 = arg0.method22478() * 846474071;
		this.aClass496_2 = Class94_Sub4.aClass261_1.method26331(Class239.aClass239_9, this, this.anInt950 * 83261825, this.anInt948 * 1992814695, this.anInt949 * -787753599, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, this.anInt951 * -443742117, false);
		if (this.aClass496_2 != null) {
			this.aClass496_2.method30093();
		}
	}

	@OriginalMember(owner = "client!agd", name = "w", descriptor = "()V", line = 30)
	@Override
	public void method19913() {
		if (this.aClass496_2 != null) {
			this.aClass496_2.method30099();
		}
	}

	@OriginalMember(owner = "client!agd", name = "y", descriptor = "()V", line = 30)
	@Override
	public void method19912() {
		if (this.aClass496_2 != null) {
			this.aClass496_2.method30099();
		}
	}

	@OriginalMember(owner = "client!agd", name = "c", descriptor = "(I)V", line = 30)
	@Override
	public void method19911() {
		if (this.aClass496_2 != null) {
			this.aClass496_2.method30099();
		}
	}

	@OriginalMember(owner = "client!agd", name = "x", descriptor = "()V", line = 36)
	@Override
	void method19902() {
		if (this.aClass496_2 != null) {
			this.aClass496_2.method30100(50);
			Class94_Sub4.aClass261_1.method26325(this.aClass496_2);
			this.aClass496_2 = null;
		}
	}

	@OriginalMember(owner = "client!agd", name = "v", descriptor = "(B)V", line = 36)
	@Override
	void method19901() {
		if (this.aClass496_2 != null) {
			this.aClass496_2.method30100(50);
			Class94_Sub4.aClass261_1.method26325(this.aClass496_2);
			this.aClass496_2 = null;
		}
	}

	@OriginalMember(owner = "client!agd", name = "act", descriptor = "(Lclient!yf;I)V", line = 9552)
	static final void method7847(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local13 == 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else if (local23 == 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Integer.MAX_VALUE;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) Math.pow((double) local13, 1.0D / (double) local23);
		}
	}

	@OriginalMember(owner = "client!agd", name = "aeu", descriptor = "(Lclient!yf;I)V", line = 9869)
	static final void method7848(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).aString2;
	}
}
