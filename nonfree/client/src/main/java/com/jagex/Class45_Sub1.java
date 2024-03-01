package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aec")
public class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!aec", name = "d", descriptor = "I")
	int anInt2598;

	@OriginalMember(owner = "client!aec", name = "z", descriptor = "[B")
	byte[] aByteArray46;

	@OriginalMember(owner = "client!aec", name = "r", descriptor = "I")
	int anInt2601;

	@OriginalMember(owner = "client!aec", name = "e", descriptor = "I")
	int anInt2602;

	@OriginalMember(owner = "client!aec", name = "n", descriptor = "I")
	int anInt2604;

	@OriginalMember(owner = "client!aec", name = "q", descriptor = "I")
	final int anInt2603;

	@OriginalMember(owner = "client!aec", name = "m", descriptor = "I")
	final int anInt2600;

	@OriginalMember(owner = "client!aec", name = "v", descriptor = "I")
	final int anInt2605;

	@OriginalMember(owner = "client!aec", name = "j", descriptor = "I")
	int anInt2599;

	@OriginalMember(owner = "client!aec", name = "<init>", descriptor = "(IIIIIFFF)V", line = 15)
	Class45_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2603 = (int) (arg7 * 4096.0F);
		this.anInt2600 = (int) (arg6 * 4096.0F);
		this.anInt2599 = this.anInt2605 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!aec", name = "z", descriptor = "()V", line = 22)
	@Override
	void method18258() {
		this.anInt2601 = 0;
		this.anInt2598 = 0;
	}

	@OriginalMember(owner = "client!aec", name = "a", descriptor = "()V", line = 22)
	@Override
	void method18247() {
		this.anInt2601 = 0;
		this.anInt2598 = 0;
	}

	@OriginalMember(owner = "client!aec", name = "e", descriptor = "(II)V", line = 27)
	@Override
	void method18261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2602 = this.anInt2600 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2602 = this.anInt2602 * this.anInt2602 >> 12;
			this.anInt2604 = 4096;
			this.anInt2598 = this.anInt2602;
			return;
		}
		this.anInt2604 = this.anInt2602 * this.anInt2603 >> 12;
		if (this.anInt2604 < 0) {
			this.anInt2604 = 0;
		} else if (this.anInt2604 > 4096) {
			this.anInt2604 = 4096;
		}
		this.anInt2602 = this.anInt2600 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2602 = this.anInt2602 * this.anInt2602 >> 12;
		this.anInt2602 = this.anInt2602 * this.anInt2604 >> 12;
		this.anInt2598 += this.anInt2602 * this.anInt2599 >> 12;
		this.anInt2599 = this.anInt2599 * this.anInt2605 >> 12;
	}

	@OriginalMember(owner = "client!aec", name = "l", descriptor = "(II)V", line = 27)
	@Override
	void method18249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2602 = this.anInt2600 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2602 = this.anInt2602 * this.anInt2602 >> 12;
			this.anInt2604 = 4096;
			this.anInt2598 = this.anInt2602;
			return;
		}
		this.anInt2604 = this.anInt2602 * this.anInt2603 >> 12;
		if (this.anInt2604 < 0) {
			this.anInt2604 = 0;
		} else if (this.anInt2604 > 4096) {
			this.anInt2604 = 4096;
		}
		this.anInt2602 = this.anInt2600 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2602 = this.anInt2602 * this.anInt2602 >> 12;
		this.anInt2602 = this.anInt2602 * this.anInt2604 >> 12;
		this.anInt2598 += this.anInt2602 * this.anInt2599 >> 12;
		this.anInt2599 = this.anInt2599 * this.anInt2605 >> 12;
	}

	@OriginalMember(owner = "client!aec", name = "r", descriptor = "(II)V", line = 27)
	@Override
	void method18262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2602 = this.anInt2600 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2602 = this.anInt2602 * this.anInt2602 >> 12;
			this.anInt2604 = 4096;
			this.anInt2598 = this.anInt2602;
			return;
		}
		this.anInt2604 = this.anInt2602 * this.anInt2603 >> 12;
		if (this.anInt2604 < 0) {
			this.anInt2604 = 0;
		} else if (this.anInt2604 > 4096) {
			this.anInt2604 = 4096;
		}
		this.anInt2602 = this.anInt2600 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2602 = this.anInt2602 * this.anInt2602 >> 12;
		this.anInt2602 = this.anInt2602 * this.anInt2604 >> 12;
		this.anInt2598 += this.anInt2602 * this.anInt2599 >> 12;
		this.anInt2599 = this.anInt2599 * this.anInt2605 >> 12;
	}

	@OriginalMember(owner = "client!aec", name = "j", descriptor = "()V", line = 46)
	@Override
	void method18270() {
		this.anInt2599 = this.anInt2605;
		this.anInt2598 >>= 0x4;
		if (this.anInt2598 < 0) {
			this.anInt2598 = 0;
		} else if (this.anInt2598 > 255) {
			this.anInt2598 = 255;
		}
		this.method18277(this.anInt2601++, (byte) this.anInt2598);
		this.anInt2598 = 0;
	}

	@OriginalMember(owner = "client!aec", name = "g", descriptor = "()V", line = 46)
	@Override
	void method18274() {
		this.anInt2599 = this.anInt2605;
		this.anInt2598 >>= 0x4;
		if (this.anInt2598 < 0) {
			this.anInt2598 = 0;
		} else if (this.anInt2598 > 255) {
			this.anInt2598 = 255;
		}
		this.method18277(this.anInt2601++, (byte) this.anInt2598);
		this.anInt2598 = 0;
	}

	@OriginalMember(owner = "client!aec", name = "n", descriptor = "()V", line = 46)
	@Override
	void method18260() {
		this.anInt2599 = this.anInt2605;
		this.anInt2598 >>= 0x4;
		if (this.anInt2598 < 0) {
			this.anInt2598 = 0;
		} else if (this.anInt2598 > 255) {
			this.anInt2598 = 255;
		}
		this.method18277(this.anInt2601++, (byte) this.anInt2598);
		this.anInt2598 = 0;
	}

	@OriginalMember(owner = "client!aec", name = "ah", descriptor = "(IB)V", line = 55)
	void method18275(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray46[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aec", name = "an", descriptor = "(IB)V", line = 55)
	void method18276(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray46[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aec", name = "aa", descriptor = "(IB)V", line = 55)
	void method18277(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray46[arg0] = arg1;
	}
}
