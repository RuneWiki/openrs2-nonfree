package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public class Class564 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!tv", name = "this$0", descriptor = "Lclient!ahe;")
	final Class117_Sub1 this$0;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "Lclient!tz;")
	Class568 aClass568_1;

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "[B")
	byte[] aByteArray94;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "[B")
	byte[] aByteArray95;

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "I")
	int anInt5331;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "F")
	final float aFloat311;

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
	final int anInt5329;

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
	final int anInt5334;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "I")
	int anInt5330;

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
	int anInt5333;

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
	int anInt5332;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "(Lclient!yf;B)V", line = 84)
	static void method31333(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class527.method30683();
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!ahe;Lclient!tz;IFIIZZ)V", line = 524)
	Class564(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) Class568 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7) {
		this.this$0 = arg0;
		this.aClass568_1 = arg1;
		this.aByteArray94 = new byte[arg2];
		this.aByteArray95 = new byte[arg4 / 8];
		this.anInt5331 = this.aByteArray94.length * -1837919625;
		this.aFloat311 = arg3;
		this.anInt5329 = arg4 * -2080613081;
		this.anInt5334 = arg5 * 1147678945;
		this.anInt5330 = 0;
		this.anInt5333 = 0;
		this.anInt5332 = 0;
	}

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "([BIII)V", line = 538)
	void method31334(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg1;
		while (local1 < arg1 + arg2) {
			this.aByteArray94[this.anInt5330 * 2012015317] = arg0[local1];
			this.aByteArray94[this.anInt5330 * 2012015317 + 1] = arg0[local1 + 1];
			local1 += 2;
			this.anInt5330 += -938083078;
			this.anInt5330 = this.anInt5330 * 2012015317 % this.aByteArray94.length * 1678442109;
			this.anInt5331 -= 619128046;
		}
	}

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "([BII)V", line = 538)
	void method31335(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg1;
		while (local1 < arg1 + arg2) {
			this.aByteArray94[this.anInt5330 * 2012015317] = arg0[local1];
			this.aByteArray94[this.anInt5330 * 2012015317 + 1] = arg0[local1 + 1];
			local1 += 2;
			this.anInt5330 += -938083078;
			this.anInt5330 = this.anInt5330 * 2012015317 % this.aByteArray94.length * 1678442109;
			this.anInt5331 -= 619128046;
		}
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)I", line = 550)
	int method31336() {
		return this.anInt5331 * 1052763975;
	}

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "()I", line = 550)
	int method31337() {
		return this.anInt5331 * 1052763975;
	}

	@OriginalMember(owner = "client!tv", name = "l", descriptor = "()I", line = 550)
	int method31338() {
		return this.anInt5331 * 1052763975;
	}

	@OriginalMember(owner = "client!tv", name = "zf", descriptor = "(Lclient!yf;I)V", line = 9189)
	static final void method31339(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26038();
	}

	@OriginalMember(owner = "client!tv", name = "aah", descriptor = "(Lclient!yf;I)V", line = 9303)
	static final void method31340(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1] = arg0.aClass368_3.method28177()[arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1]];
	}

	@OriginalMember(owner = "client!tv", name = "aug", descriptor = "(Lclient!yf;I)V", line = 12970)
	static final void method31341(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class302 local18 = (Class302) Class251.aClass35_Sub10_3.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt4027 * -15128681;
	}
}
