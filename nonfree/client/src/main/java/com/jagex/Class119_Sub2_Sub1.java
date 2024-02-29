package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apc")
public class Class119_Sub2_Sub1 extends Class119_Sub2 {

	@OriginalMember(owner = "client!apc", name = "i", descriptor = "[B")
	byte[] aByteArray41;

	@OriginalMember(owner = "client!apc", name = "<init>", descriptor = "()V", line = 102)
	Class119_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!apc", name = "m", descriptor = "(III)[B", line = 106)
	byte[] method18396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray41 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray41;
	}

	@OriginalMember(owner = "client!apc", name = "h", descriptor = "(III)[B", line = 106)
	byte[] method18397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray41 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray41;
	}

	@OriginalMember(owner = "client!apc", name = "aj", descriptor = "(III)[B", line = 106)
	byte[] method18398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray41 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray41;
	}

	@OriginalMember(owner = "client!apc", name = "a", descriptor = "(IB)V", line = 112)
	@Override
	void method18626(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray41[local15] = local12;
		this.aByteArray41[local16] = local12;
	}

	@OriginalMember(owner = "client!apc", name = "n", descriptor = "(IB)V", line = 112)
	@Override
	void method18625(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray41[local15] = local12;
		this.aByteArray41[local16] = local12;
	}
}
