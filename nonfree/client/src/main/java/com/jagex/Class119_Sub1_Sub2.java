package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apz")
public class Class119_Sub1_Sub2 extends Class119_Sub1 {

	@OriginalMember(owner = "client!apz", name = "o", descriptor = "[B")
	byte[] aByteArray49;

	@OriginalMember(owner = "client!apz", name = "<init>", descriptor = "()V", line = 105)
	Class119_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!apz", name = "m", descriptor = "(III)[B", line = 109)
	byte[] method21346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!apz", name = "h", descriptor = "(III)[B", line = 109)
	byte[] method21347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method21322(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!apz", name = "n", descriptor = "(IB)V", line = 115)
	@Override
	void method21345(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = -1;
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!apz", name = "a", descriptor = "(IB)V", line = 115)
	@Override
	void method21344(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = -1;
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}
}
