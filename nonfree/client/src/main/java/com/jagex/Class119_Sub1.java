package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ahj")
public class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!ahj", name = "k", descriptor = "I")
	int anInt2942;

	@OriginalMember(owner = "client!ahj", name = "j", descriptor = "I")
	int anInt2943;

	@OriginalMember(owner = "client!ahj", name = "z", descriptor = "I")
	int anInt2944;

	@OriginalMember(owner = "client!ahj", name = "i", descriptor = "I")
	int anInt2946;

	@OriginalMember(owner = "client!ahj", name = "r", descriptor = "[B")
	byte[] aByteArray48;

	@OriginalMember(owner = "client!ahj", name = "u", descriptor = "I")
	final int anInt2948;

	@OriginalMember(owner = "client!ahj", name = "e", descriptor = "I")
	final int anInt2949;

	@OriginalMember(owner = "client!ahj", name = "f", descriptor = "I")
	final int anInt2945;

	@OriginalMember(owner = "client!ahj", name = "g", descriptor = "I")
	int anInt2947;

	@OriginalMember(owner = "client!ahj", name = "<init>", descriptor = "(IIIIIFFF)V", line = 15)
	Class119_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2948 = (int) (arg7 * 4096.0F);
		this.anInt2949 = (int) (arg6 * 4096.0F);
		this.anInt2947 = this.anInt2945 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ahj", name = "c", descriptor = "()V", line = 22)
	@Override
	void method21338() {
		this.anInt2946 = 0;
		this.anInt2942 = 0;
	}

	@OriginalMember(owner = "client!ahj", name = "s", descriptor = "()V", line = 22)
	@Override
	void method21340() {
		this.anInt2946 = 0;
		this.anInt2942 = 0;
	}

	@OriginalMember(owner = "client!ahj", name = "l", descriptor = "(II)V", line = 27)
	@Override
	void method21337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2943 = this.anInt2949 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2943 = this.anInt2943 * this.anInt2943 >> 12;
			this.anInt2944 = 4096;
			this.anInt2942 = this.anInt2943;
			return;
		}
		this.anInt2944 = this.anInt2943 * this.anInt2948 >> 12;
		if (this.anInt2944 < 0) {
			this.anInt2944 = 0;
		} else if (this.anInt2944 > 4096) {
			this.anInt2944 = 4096;
		}
		this.anInt2943 = this.anInt2949 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2943 = this.anInt2943 * this.anInt2943 >> 12;
		this.anInt2943 = this.anInt2943 * this.anInt2944 >> 12;
		this.anInt2942 += this.anInt2943 * this.anInt2947 >> 12;
		this.anInt2947 = this.anInt2947 * this.anInt2945 >> 12;
	}

	@OriginalMember(owner = "client!ahj", name = "z", descriptor = "(II)V", line = 27)
	@Override
	void method21343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2943 = this.anInt2949 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2943 = this.anInt2943 * this.anInt2943 >> 12;
			this.anInt2944 = 4096;
			this.anInt2942 = this.anInt2943;
			return;
		}
		this.anInt2944 = this.anInt2943 * this.anInt2948 >> 12;
		if (this.anInt2944 < 0) {
			this.anInt2944 = 0;
		} else if (this.anInt2944 > 4096) {
			this.anInt2944 = 4096;
		}
		this.anInt2943 = this.anInt2949 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2943 = this.anInt2943 * this.anInt2943 >> 12;
		this.anInt2943 = this.anInt2943 * this.anInt2944 >> 12;
		this.anInt2942 += this.anInt2943 * this.anInt2947 >> 12;
		this.anInt2947 = this.anInt2947 * this.anInt2945 >> 12;
	}

	@OriginalMember(owner = "client!ahj", name = "g", descriptor = "(II)V", line = 27)
	@Override
	void method21342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2943 = this.anInt2949 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt2943 = this.anInt2943 * this.anInt2943 >> 12;
			this.anInt2944 = 4096;
			this.anInt2942 = this.anInt2943;
			return;
		}
		this.anInt2944 = this.anInt2943 * this.anInt2948 >> 12;
		if (this.anInt2944 < 0) {
			this.anInt2944 = 0;
		} else if (this.anInt2944 > 4096) {
			this.anInt2944 = 4096;
		}
		this.anInt2943 = this.anInt2949 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt2943 = this.anInt2943 * this.anInt2943 >> 12;
		this.anInt2943 = this.anInt2943 * this.anInt2944 >> 12;
		this.anInt2942 += this.anInt2943 * this.anInt2947 >> 12;
		this.anInt2947 = this.anInt2947 * this.anInt2945 >> 12;
	}

	@OriginalMember(owner = "client!ahj", name = "r", descriptor = "()V", line = 46)
	@Override
	void method21341() {
		this.anInt2947 = this.anInt2945;
		this.anInt2942 >>= 0x4;
		if (this.anInt2942 < 0) {
			this.anInt2942 = 0;
		} else if (this.anInt2942 > 255) {
			this.anInt2942 = 255;
		}
		this.method21345(this.anInt2946++, (byte) this.anInt2942);
		this.anInt2942 = 0;
	}

	@OriginalMember(owner = "client!ahj", name = "v", descriptor = "()V", line = 46)
	@Override
	void method21339() {
		this.anInt2947 = this.anInt2945;
		this.anInt2942 >>= 0x4;
		if (this.anInt2942 < 0) {
			this.anInt2942 = 0;
		} else if (this.anInt2942 > 255) {
			this.anInt2942 = 255;
		}
		this.method21345(this.anInt2946++, (byte) this.anInt2942);
		this.anInt2942 = 0;
	}

	@OriginalMember(owner = "client!ahj", name = "a", descriptor = "(IB)V", line = 55)
	void method21344(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray48[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ahj", name = "n", descriptor = "(IB)V", line = 55)
	void method21345(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray48[arg0] = arg1;
	}
}
