package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeo")
public class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!aeo", name = "n", descriptor = "I")
	int anInt2574;

	@OriginalMember(owner = "client!aeo", name = "j", descriptor = "I")
	int anInt2575;

	@OriginalMember(owner = "client!aeo", name = "z", descriptor = "[B")
	byte[] aByteArray44;

	@OriginalMember(owner = "client!aeo", name = "e", descriptor = "[I")
	final int[] anIntArray256 = new int[this.anInt2592];

	@OriginalMember(owner = "client!aeo", name = "<init>", descriptor = "(IIIIIF)V", line = 10)
	Class45_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < this.anInt2592; local13++) {
			this.anIntArray256[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!aeo", name = "a", descriptor = "()V", line = 18)
	@Override
	void method18247() {
		this.anInt2575 = 0;
		this.anInt2574 = 0;
	}

	@OriginalMember(owner = "client!aeo", name = "z", descriptor = "()V", line = 18)
	@Override
	void method18258() {
		this.anInt2575 = 0;
		this.anInt2574 = 0;
	}

	@OriginalMember(owner = "client!aeo", name = "l", descriptor = "(II)V", line = 23)
	@Override
	void method18249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2574 += arg1 * this.anIntArray256[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aeo", name = "e", descriptor = "(II)V", line = 23)
	@Override
	void method18261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2574 += arg1 * this.anIntArray256[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aeo", name = "r", descriptor = "(II)V", line = 23)
	@Override
	void method18262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2574 += arg1 * this.anIntArray256[arg0] >> 12;
	}

	@OriginalMember(owner = "client!aeo", name = "n", descriptor = "()V", line = 27)
	@Override
	void method18260() {
		this.anInt2574 = Math.abs(this.anInt2574);
		if (this.anInt2574 >= 4096) {
			this.anInt2574 = 4095;
		}
		this.method18157(this.anInt2575++, (byte) (this.anInt2574 >> 4));
		this.anInt2574 = 0;
	}

	@OriginalMember(owner = "client!aeo", name = "g", descriptor = "()V", line = 27)
	@Override
	void method18274() {
		this.anInt2574 = Math.abs(this.anInt2574);
		if (this.anInt2574 >= 4096) {
			this.anInt2574 = 4095;
		}
		this.method18157(this.anInt2575++, (byte) (this.anInt2574 >> 4));
		this.anInt2574 = 0;
	}

	@OriginalMember(owner = "client!aeo", name = "j", descriptor = "()V", line = 27)
	@Override
	void method18270() {
		this.anInt2574 = Math.abs(this.anInt2574);
		if (this.anInt2574 >= 4096) {
			this.anInt2574 = 4095;
		}
		this.method18157(this.anInt2575++, (byte) (this.anInt2574 >> 4));
		this.anInt2574 = 0;
	}

	@OriginalMember(owner = "client!aeo", name = "ah", descriptor = "(IB)V", line = 34)
	void method18155(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray44[this.anInt2575++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!aeo", name = "an", descriptor = "(IB)V", line = 34)
	void method18156(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray44[this.anInt2575++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!aeo", name = "aa", descriptor = "(IB)V", line = 34)
	void method18157(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray44[this.anInt2575++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
