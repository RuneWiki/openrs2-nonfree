package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apj")
public class Class119_Sub2_Sub2 extends Class119_Sub2 {

	@OriginalMember(owner = "client!apj", name = "i", descriptor = "[B")
	byte[] aByteArray45;

	@OriginalMember(owner = "client!apj", name = "<init>", descriptor = "()V", line = 126)
	Class119_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!apj", name = "m", descriptor = "(III)[B", line = 130)
	byte[] method18627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray45 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray45;
	}

	@OriginalMember(owner = "client!apj", name = "h", descriptor = "(III)[B", line = 130)
	byte[] method18628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray45 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray45;
	}

	@OriginalMember(owner = "client!apj", name = "n", descriptor = "(IB)V", line = 136)
	@Override
	void method18625(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray45[local15] = local12;
		this.aByteArray45[local16] = local12;
	}

	@OriginalMember(owner = "client!apj", name = "a", descriptor = "(IB)V", line = 136)
	@Override
	void method18626(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray45[local15] = local12;
		this.aByteArray45[local16] = local12;
	}
}
