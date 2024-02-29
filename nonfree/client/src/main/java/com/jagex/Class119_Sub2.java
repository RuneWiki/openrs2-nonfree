package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahv")
public class Class119_Sub2 extends Class119 {

	@OriginalMember(owner = "client!ahv", name = "g", descriptor = "I")
	int anInt2612;

	@OriginalMember(owner = "client!ahv", name = "z", descriptor = "I")
	int anInt2613;

	@OriginalMember(owner = "client!ahv", name = "r", descriptor = "[B")
	byte[] aByteArray44;

	@OriginalMember(owner = "client!ahv", name = "j", descriptor = "[I")
	final int[] anIntArray243 = new int[this.anInt2940];

	@OriginalMember(owner = "client!ahv", name = "<init>", descriptor = "(IIIIIF)V", line = 10)
	Class119_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < this.anInt2940; local13++) {
			this.anIntArray243[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ahv", name = "c", descriptor = "()V", line = 18)
	@Override
	void method21338() {
		this.anInt2612 = 0;
		this.anInt2613 = 0;
	}

	@OriginalMember(owner = "client!ahv", name = "s", descriptor = "()V", line = 18)
	@Override
	void method21340() {
		this.anInt2612 = 0;
		this.anInt2613 = 0;
	}

	@OriginalMember(owner = "client!ahv", name = "l", descriptor = "(II)V", line = 23)
	@Override
	void method21337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2613 += arg1 * this.anIntArray243[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ahv", name = "g", descriptor = "(II)V", line = 23)
	@Override
	void method21342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2613 += arg1 * this.anIntArray243[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ahv", name = "z", descriptor = "(II)V", line = 23)
	@Override
	void method21343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2613 += arg1 * this.anIntArray243[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ahv", name = "v", descriptor = "()V", line = 27)
	@Override
	void method21339() {
		this.anInt2613 = Math.abs(this.anInt2613);
		if (this.anInt2613 >= 4096) {
			this.anInt2613 = 4095;
		}
		this.method18625(this.anInt2612++, (byte) (this.anInt2613 >> 4));
		this.anInt2613 = 0;
	}

	@OriginalMember(owner = "client!ahv", name = "r", descriptor = "()V", line = 27)
	@Override
	void method21341() {
		this.anInt2613 = Math.abs(this.anInt2613);
		if (this.anInt2613 >= 4096) {
			this.anInt2613 = 4095;
		}
		this.method18625(this.anInt2612++, (byte) (this.anInt2613 >> 4));
		this.anInt2613 = 0;
	}

	@OriginalMember(owner = "client!ahv", name = "n", descriptor = "(IB)V", line = 34)
	void method18625(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray44[this.anInt2612++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ahv", name = "a", descriptor = "(IB)V", line = 34)
	void method18626(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray44[this.anInt2612++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
